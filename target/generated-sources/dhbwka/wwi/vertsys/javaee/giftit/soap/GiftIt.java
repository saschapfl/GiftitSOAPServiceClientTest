package dhbwka.wwi.vertsys.javaee.giftit.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-04-05T11:34:45.174+02:00
 * Generated source version: 3.3.0
 *
 */
@WebService(targetNamespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", name = "GiftIt")
@XmlSeeAlso({ObjectFactory.class})
public interface GiftIt {

    @WebMethod
    @RequestWrapper(localName = "findallgifts", targetNamespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", className = "dhbwka.wwi.vertsys.javaee.giftit.soap.Findallgifts")
    @ResponseWrapper(localName = "findallgiftsResponse", targetNamespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", className = "dhbwka.wwi.vertsys.javaee.giftit.soap.FindallgiftsResponse")
    @WebResult(name = "gifts", targetNamespace = "")
    public java.util.List<dhbwka.wwi.vertsys.javaee.giftit.soap.GiftGiftit> findallgifts(
        @WebParam(name = "username", targetNamespace = "")
        java.lang.String username,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    ) throws InvalidCredentialsException_Exception;

    @WebMethod
    @RequestWrapper(localName = "search", targetNamespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", className = "dhbwka.wwi.vertsys.javaee.giftit.soap.Search")
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", className = "dhbwka.wwi.vertsys.javaee.giftit.soap.SearchResponse")
    @WebResult(name = "gifts", targetNamespace = "")
    public java.util.List<dhbwka.wwi.vertsys.javaee.giftit.soap.GiftGiftit> search(
        @WebParam(name = "username", targetNamespace = "")
        java.lang.String username,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "search", targetNamespace = "")
        java.lang.String search,
        @WebParam(name = "category", targetNamespace = "")
        java.lang.String category,
        @WebParam(name = "status", targetNamespace = "")
        dhbwka.wwi.vertsys.javaee.giftit.soap.GiftStatus status
    ) throws InvalidCredentialsException_Exception;

    @WebMethod
    @RequestWrapper(localName = "signup", targetNamespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", className = "dhbwka.wwi.vertsys.javaee.giftit.soap.Signup")
    @ResponseWrapper(localName = "signupResponse", targetNamespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", className = "dhbwka.wwi.vertsys.javaee.giftit.soap.SignupResponse")
    @WebResult(name = "status", targetNamespace = "")
    public java.lang.String signup(
        @WebParam(name = "username", targetNamespace = "")
        java.lang.String username,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "firstname", targetNamespace = "")
        java.lang.String firstname,
        @WebParam(name = "lastname", targetNamespace = "")
        java.lang.String lastname
    ) throws UserAlreadyExistsException_Exception;

    @WebMethod
    @RequestWrapper(localName = "findByUsername", targetNamespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", className = "dhbwka.wwi.vertsys.javaee.giftit.soap.FindByUsername")
    @ResponseWrapper(localName = "findByUsernameResponse", targetNamespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", className = "dhbwka.wwi.vertsys.javaee.giftit.soap.FindByUsernameResponse")
    @WebResult(name = "gifts", targetNamespace = "")
    public java.util.List<dhbwka.wwi.vertsys.javaee.giftit.soap.GiftGiftit> findByUsername(
        @WebParam(name = "username", targetNamespace = "")
        java.lang.String username,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "username_search", targetNamespace = "")
        java.lang.String usernameSearch
    ) throws InvalidCredentialsException_Exception;
}
