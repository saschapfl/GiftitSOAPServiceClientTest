
package dhbwka.wwi.vertsys.javaee.giftit.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für giftStatus.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="giftStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IDEA"/&gt;
 *     &lt;enumeration value="IN_ORDER"/&gt;
 *     &lt;enumeration value="DELIVERD"/&gt;
 *     &lt;enumeration value="CANCELED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "giftStatus")
@XmlEnum
public enum GiftStatus {

    IDEA,
    IN_ORDER,
    DELIVERD,
    CANCELED;

    public String value() {
        return name();
    }

    public static GiftStatus fromValue(String v) {
        return valueOf(v);
    }

}
