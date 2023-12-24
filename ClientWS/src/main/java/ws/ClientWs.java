package ws;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.test());
        System.out.println(proxy.conversionEuroToDh(55));
        Compte c1=proxy.getCompte(1);
        System.out.println("Code :" + c1.getCode());
        System.out.println("Solde :" + c1.getSolde());
        System.out.println("-------------------------------------");
        List<Compte> cptes = proxy.getComptes();
        for (Compte c : cptes){
            System.out.println("Code " + c.getCode() + " Solde "+c.getSolde());
        }
    }
}
