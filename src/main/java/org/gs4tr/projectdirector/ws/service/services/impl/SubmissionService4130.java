
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
@WebServiceClient(name = "SubmissionService_4130", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
public class SubmissionService4130
    extends Service
{

    private static URL SUBMISSIONSERVICE4130_WSDL_LOCATION;
    private static WebServiceException SUBMISSIONSERVICE4130_EXCEPTION;
    private final static QName SUBMISSIONSERVICE4130_QNAME = new QName("http://impl.services.service.ws.projectdirector.gs4tr.org", "SubmissionService_4130");

    public SubmissionService4130() {
        super(__getWsdlLocation(), SUBMISSIONSERVICE4130_QNAME);
    }

    public SubmissionService4130(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUBMISSIONSERVICE4130_QNAME, features);
    }

    public SubmissionService4130(URL wsdlLocation) {
        super(wsdlLocation, SUBMISSIONSERVICE4130_QNAME);
        SUBMISSIONSERVICE4130_WSDL_LOCATION = wsdlLocation;
        SUBMISSIONSERVICE4130_EXCEPTION = null;
    }

    public SubmissionService4130(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUBMISSIONSERVICE4130_QNAME, features);
        SUBMISSIONSERVICE4130_WSDL_LOCATION = wsdlLocation;
        SUBMISSIONSERVICE4130_EXCEPTION = null;
    }

    public SubmissionService4130(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
        SUBMISSIONSERVICE4130_WSDL_LOCATION = wsdlLocation;
        SUBMISSIONSERVICE4130_EXCEPTION = null;
    }

    public SubmissionService4130(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
        SUBMISSIONSERVICE4130_WSDL_LOCATION = wsdlLocation;
        SUBMISSIONSERVICE4130_EXCEPTION = null;
    }

    /**
     * 
     * @return
     *     returns SubmissionServicePortType
     */
    @WebEndpoint(name = "SubmissionServiceHttpSoap11Endpoint")
    public SubmissionServicePortType getSubmissionServiceHttpSoap11Endpoint() {
        return super.getPort(new QName("http://impl.services.service.ws.projectdirector.gs4tr.org", "SubmissionServiceHttpSoap11Endpoint"), SubmissionServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SubmissionServicePortType
     */
    @WebEndpoint(name = "SubmissionServiceHttpSoap11Endpoint")
    public SubmissionServicePortType getSubmissionServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.services.service.ws.projectdirector.gs4tr.org", "SubmissionServiceHttpSoap11Endpoint"), SubmissionServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUBMISSIONSERVICE4130_EXCEPTION!= null) {
            throw SUBMISSIONSERVICE4130_EXCEPTION;
        }
        return SUBMISSIONSERVICE4130_WSDL_LOCATION;
    }

}
