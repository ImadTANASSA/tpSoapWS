package io.imadev;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub= new BanqueWS().getBanqueServicePort();
        System.out.println(stub.conversion(100));
        System.out.println("---------------------");
        Compte cp=stub.getCompte(3);
        System.out.println( cp.getCode());
        System.out.println( cp.getSolde());
        System.out.println( cp.getDateCreation());
        System.out.println("---------------------");
        stub.listComptes().forEach(c->{
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println(c.getDateCreation());
        });
    }
}