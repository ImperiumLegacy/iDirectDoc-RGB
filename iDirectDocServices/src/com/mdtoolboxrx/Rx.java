
package com.mdtoolboxrx;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "rx", targetNamespace = "http://mdtoolboxrx.com/", wsdlLocation = "WEB-INF/wsdl/mdtoolbox_x.wsdl")
public class Rx
    extends Service
{

    private final static URL RX_WSDL_LOCATION;
    private final static WebServiceException RX_EXCEPTION;
    private final static QName RX_QNAME = new QName("http://mdtoolboxrx.com/", "rx");

    static {
            RX_WSDL_LOCATION = com.mdtoolboxrx.Rx.class.getResource("/WEB-INF/wsdl/mdtoolbox_x.wsdl");
        WebServiceException e = null;
        if (RX_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'WEB-INF/wsdl/mdtoolbox_x.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        RX_EXCEPTION = e;
    }

    public Rx() {
        super(__getWsdlLocation(), RX_QNAME);
    }

    public Rx(WebServiceFeature... features) {
        super(__getWsdlLocation(), RX_QNAME, features);
    }

    public Rx(URL wsdlLocation) {
        super(wsdlLocation, RX_QNAME);
    }

    public Rx(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RX_QNAME, features);
    }

    public Rx(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Rx(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RxSoap
     */
    @WebEndpoint(name = "rxSoap")
    public RxSoap getRxSoap() {
        return super.getPort(new QName("http://mdtoolboxrx.com/", "rxSoap"), RxSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RxSoap
     */
    @WebEndpoint(name = "rxSoap")
    public RxSoap getRxSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://mdtoolboxrx.com/", "rxSoap"), RxSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns RxSoap
     */
    @WebEndpoint(name = "rxSoap12")
    public RxSoap getRxSoap12() {
        return super.getPort(new QName("http://mdtoolboxrx.com/", "rxSoap12"), RxSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RxSoap
     */
    @WebEndpoint(name = "rxSoap12")
    public RxSoap getRxSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://mdtoolboxrx.com/", "rxSoap12"), RxSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RX_EXCEPTION!= null) {
            throw RX_EXCEPTION;
        }
        return RX_WSDL_LOCATION;
    }

}
