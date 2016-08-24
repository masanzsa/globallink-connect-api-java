
package org.gs4tr.projectdirector.ws.service.services.impl;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DocumentService_4130", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
public class DocumentService4130
    extends Service
{

    private static URL DOCUMENTSERVICE4130_WSDL_LOCATION;
    private static WebServiceException DOCUMENTSERVICE4130_EXCEPTION;
    private final static QName DOCUMENTSERVICE4130_QNAME = new QName("http://impl.services.service.ws.projectdirector.gs4tr.org", "DocumentService_4130");

	public DocumentService4130() {
		super(__getWsdlLocation(), DOCUMENTSERVICE4130_QNAME);
	}

    public DocumentService4130(WebServiceFeature... features) {
        super(__getWsdlLocation(), DOCUMENTSERVICE4130_QNAME, features);
    }

    public DocumentService4130(URL wsdlLocation) {
        super(wsdlLocation, DOCUMENTSERVICE4130_QNAME);
        DOCUMENTSERVICE4130_WSDL_LOCATION = wsdlLocation;
        DOCUMENTSERVICE4130_EXCEPTION = null;
    }

    public DocumentService4130(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DOCUMENTSERVICE4130_QNAME, features);
        DOCUMENTSERVICE4130_WSDL_LOCATION = wsdlLocation;
        DOCUMENTSERVICE4130_EXCEPTION = null;
    }

    public DocumentService4130(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
        DOCUMENTSERVICE4130_WSDL_LOCATION = wsdlLocation;
        DOCUMENTSERVICE4130_EXCEPTION = null;
    }

    public DocumentService4130(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
        DOCUMENTSERVICE4130_WSDL_LOCATION = wsdlLocation;
        DOCUMENTSERVICE4130_EXCEPTION = null;
    }

    /**
     * 
     * @return
     *     returns DocumentServicePortType
     */
    @WebEndpoint(name = "DocumentServiceHttpSoap11Endpoint")
    public DocumentServicePortType getDocumentServiceHttpSoap11Endpoint() {
        return super.getPort(new QName("http://impl.services.service.ws.projectdirector.gs4tr.org", "DocumentServiceHttpSoap11Endpoint"), DocumentServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DocumentServicePortType
     */
    @WebEndpoint(name = "DocumentServiceHttpSoap11Endpoint")
    public DocumentServicePortType getDocumentServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.services.service.ws.projectdirector.gs4tr.org", "DocumentServiceHttpSoap11Endpoint"), DocumentServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DOCUMENTSERVICE4130_EXCEPTION!= null) {
            throw DOCUMENTSERVICE4130_EXCEPTION;
        }
        return DOCUMENTSERVICE4130_WSDL_LOCATION;
    }

}
