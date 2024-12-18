package io.imadev;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;


import java.util.Date;
import java.util.List;
// POJO class

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "conversion")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 10.54;
    }


    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name="code") int code) {
        Compte compte = new Compte();
        compte.setCode(code);
        compte.setSolde(Math.random() * 10000);
        compte.setDateCreation(new Date());
        return compte;
    }

    @WebMethod
    public List<Compte> listComptes() {
        return List.of(
                new Compte(1, Math.random() * 10000, new Date()),
                new Compte(2, Math.random() * 10000, new Date()),
                new Compte(3, Math.random() * 10000, new Date())
        );
    }
}
