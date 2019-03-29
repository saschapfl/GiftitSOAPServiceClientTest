
package dhbwka.wwi.vertsys.javaee.giftit.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dhbwka.wwi.vertsys.javaee.giftit.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindByUsername_QNAME = new QName("http://soap.giftit.javaee.vertsys.wwi.dhbwka/", "findByUsername");
    private final static QName _FindByUsernameResponse_QNAME = new QName("http://soap.giftit.javaee.vertsys.wwi.dhbwka/", "findByUsernameResponse");
    private final static QName _Findallgifts_QNAME = new QName("http://soap.giftit.javaee.vertsys.wwi.dhbwka/", "findallgifts");
    private final static QName _FindallgiftsResponse_QNAME = new QName("http://soap.giftit.javaee.vertsys.wwi.dhbwka/", "findallgiftsResponse");
    private final static QName _Search_QNAME = new QName("http://soap.giftit.javaee.vertsys.wwi.dhbwka/", "search");
    private final static QName _SearchResponse_QNAME = new QName("http://soap.giftit.javaee.vertsys.wwi.dhbwka/", "searchResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dhbwka.wwi.vertsys.javaee.giftit.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindByUsername }
     * 
     */
    public FindByUsername createFindByUsername() {
        return new FindByUsername();
    }

    /**
     * Create an instance of {@link FindByUsernameResponse }
     * 
     */
    public FindByUsernameResponse createFindByUsernameResponse() {
        return new FindByUsernameResponse();
    }

    /**
     * Create an instance of {@link Findallgifts }
     * 
     */
    public Findallgifts createFindallgifts() {
        return new Findallgifts();
    }

    /**
     * Create an instance of {@link FindallgiftsResponse }
     * 
     */
    public FindallgiftsResponse createFindallgiftsResponse() {
        return new FindallgiftsResponse();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link GiftGiftit }
     * 
     */
    public GiftGiftit createGiftGiftit() {
        return new GiftGiftit();
    }

    /**
     * Create an instance of {@link CategoryGiftit }
     * 
     */
    public CategoryGiftit createCategoryGiftit() {
        return new CategoryGiftit();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByUsername }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByUsername }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", name = "findByUsername")
    public JAXBElement<FindByUsername> createFindByUsername(FindByUsername value) {
        return new JAXBElement<FindByUsername>(_FindByUsername_QNAME, FindByUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByUsernameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByUsernameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", name = "findByUsernameResponse")
    public JAXBElement<FindByUsernameResponse> createFindByUsernameResponse(FindByUsernameResponse value) {
        return new JAXBElement<FindByUsernameResponse>(_FindByUsernameResponse_QNAME, FindByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findallgifts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Findallgifts }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", name = "findallgifts")
    public JAXBElement<Findallgifts> createFindallgifts(Findallgifts value) {
        return new JAXBElement<Findallgifts>(_Findallgifts_QNAME, Findallgifts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindallgiftsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindallgiftsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", name = "findallgiftsResponse")
    public JAXBElement<FindallgiftsResponse> createFindallgiftsResponse(FindallgiftsResponse value) {
        return new JAXBElement<FindallgiftsResponse>(_FindallgiftsResponse_QNAME, FindallgiftsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Search }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Search }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", name = "search")
    public JAXBElement<Search> createSearch(Search value) {
        return new JAXBElement<Search>(_Search_QNAME, Search.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.giftit.javaee.vertsys.wwi.dhbwka/", name = "searchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

}
