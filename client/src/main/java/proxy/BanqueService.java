
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://imadev.io/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://imadev.io/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://imadev.io/", className = "proxy.GetCompteResponse")
    @Action(input = "http://imadev.io/BanqueService/getCompteRequest", output = "http://imadev.io/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://imadev.io/", className = "proxy.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://imadev.io/", className = "proxy.ListComptesResponse")
    @Action(input = "http://imadev.io/BanqueService/listComptesRequest", output = "http://imadev.io/BanqueService/listComptesResponse")
    public List<Compte> listComptes();

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversion", targetNamespace = "http://imadev.io/", className = "proxy.Conversion")
    @ResponseWrapper(localName = "conversionResponse", targetNamespace = "http://imadev.io/", className = "proxy.ConversionResponse")
    @Action(input = "http://imadev.io/BanqueService/conversionRequest", output = "http://imadev.io/BanqueService/conversionResponse")
    public double conversion(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

}