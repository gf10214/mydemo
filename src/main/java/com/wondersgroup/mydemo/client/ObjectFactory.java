
package com.wondersgroup.mydemo.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wondersgroup.mydemo.client package. 
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

    private final static QName _Tcmci_QNAME = new QName("http://service.webService.tcm.wondersgroup.com/", "Tcmci");
    private final static QName _TcmciSaveInfo_QNAME = new QName("http://service.webService.tcm.wondersgroup.com/", "TcmciSaveInfo");
    private final static QName _SaveTcmciInfomation_QNAME = new QName("http://service.webService.tcm.wondersgroup.com/", "saveTcmciInfomation");
    private final static QName _SaveTcmciInfomationResponse_QNAME = new QName("http://service.webService.tcm.wondersgroup.com/", "saveTcmciInfomationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wondersgroup.mydemo.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveTcmciInfomationResponse }
     * 
     */
    public SaveTcmciInfomationResponse createSaveTcmciInfomationResponse() {
        return new SaveTcmciInfomationResponse();
    }

    /**
     * Create an instance of {@link SaveTcmciInfomation }
     * 
     */
    public SaveTcmciInfomation createSaveTcmciInfomation() {
        return new SaveTcmciInfomation();
    }

    /**
     * Create an instance of {@link Tcmci }
     * 
     */
    public Tcmci createTcmci() {
        return new Tcmci();
    }

    /**
     * Create an instance of {@link TcmciSaveInfo }
     * 
     */
    public TcmciSaveInfo createTcmciSaveInfo() {
        return new TcmciSaveInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tcmci }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webService.tcm.wondersgroup.com/", name = "Tcmci")
    public JAXBElement<Tcmci> createTcmci(Tcmci value) {
        return new JAXBElement<Tcmci>(_Tcmci_QNAME, Tcmci.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TcmciSaveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webService.tcm.wondersgroup.com/", name = "TcmciSaveInfo")
    public JAXBElement<TcmciSaveInfo> createTcmciSaveInfo(TcmciSaveInfo value) {
        return new JAXBElement<TcmciSaveInfo>(_TcmciSaveInfo_QNAME, TcmciSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTcmciInfomation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webService.tcm.wondersgroup.com/", name = "saveTcmciInfomation")
    public JAXBElement<SaveTcmciInfomation> createSaveTcmciInfomation(SaveTcmciInfomation value) {
        return new JAXBElement<SaveTcmciInfomation>(_SaveTcmciInfomation_QNAME, SaveTcmciInfomation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTcmciInfomationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webService.tcm.wondersgroup.com/", name = "saveTcmciInfomationResponse")
    public JAXBElement<SaveTcmciInfomationResponse> createSaveTcmciInfomationResponse(SaveTcmciInfomationResponse value) {
        return new JAXBElement<SaveTcmciInfomationResponse>(_SaveTcmciInfomationResponse_QNAME, SaveTcmciInfomationResponse.class, null, value);
    }

}
