
package dhbwka.wwi.vertsys.javaee.giftit.soap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-04-01T13:50:14.099+02:00
 * Generated source version: 3.3.0
 */

@WebFault(name = "InvalidCredentialsException", targetNamespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/")
public class InvalidCredentialsException_Exception extends Exception {

    private dhbwka.wwi.vertsys.javaee.giftit.soap.InvalidCredentialsException invalidCredentialsException;

    public InvalidCredentialsException_Exception() {
        super();
    }

    public InvalidCredentialsException_Exception(String message) {
        super(message);
    }

    public InvalidCredentialsException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public InvalidCredentialsException_Exception(String message, dhbwka.wwi.vertsys.javaee.giftit.soap.InvalidCredentialsException invalidCredentialsException) {
        super(message);
        this.invalidCredentialsException = invalidCredentialsException;
    }

    public InvalidCredentialsException_Exception(String message, dhbwka.wwi.vertsys.javaee.giftit.soap.InvalidCredentialsException invalidCredentialsException, java.lang.Throwable cause) {
        super(message, cause);
        this.invalidCredentialsException = invalidCredentialsException;
    }

    public dhbwka.wwi.vertsys.javaee.giftit.soap.InvalidCredentialsException getFaultInfo() {
        return this.invalidCredentialsException;
    }
}
