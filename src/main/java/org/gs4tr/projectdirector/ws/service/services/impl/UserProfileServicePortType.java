package org.gs4tr.projectdirector.ws.service.services.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2016-05-24T18:53:11.371+03:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", name = "UserProfileServicePortType")
@XmlSeeAlso({ObjectFactory.class, org.gs4tr.projectdirector.model.dto.ObjectFactory.class, org.w3._2005._05.xmlmime.ObjectFactory.class})
public interface UserProfileServicePortType {

    @WebMethod(action = "urn:getSubmitters")
    @Action(input = "urn:getSubmitters", output = "urn:getSubmittersResponse")
    @RequestWrapper(localName = "getSubmitters", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.GetSubmitters")
    @ResponseWrapper(localName = "getSubmittersResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.GetSubmittersResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.util.List<org.gs4tr.projectdirector.model.dto.UserProfile> getSubmitters(
        @WebParam(name = "projectShortCode", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String projectShortCode
    );

    @WebMethod(action = "urn:getUserLanguages")
    @Action(input = "urn:getUserLanguages", output = "urn:getUserLanguagesResponse")
    @RequestWrapper(localName = "getUserLanguages", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.GetUserLanguages")
    @ResponseWrapper(localName = "getUserLanguagesResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.GetUserLanguagesResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.util.List<org.gs4tr.projectdirector.model.dto.Language> getUserLanguages(
        @WebParam(name = "userTicket", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String userTicket
    );

    @WebMethod(action = "urn:findByTicket")
    @Action(input = "urn:findByTicket", output = "urn:findByTicketResponse")
    @RequestWrapper(localName = "findByTicket", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindUserByTicket")
    @ResponseWrapper(localName = "findByTicketResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindUserByTicketResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public org.gs4tr.projectdirector.model.dto.UserProfile findByTicket(
        @WebParam(name = "ticket", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String ticket
    );

    @WebMethod(action = "urn:getCurrentUserLanguages")
    @Action(input = "urn:getCurrentUserLanguages", output = "urn:getCurrentUserLanguagesResponse")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "getCurrentUserLanguagesResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", partName = "parameters")
    public GetCurrentUserLanguagesResponse getCurrentUserLanguages();

    /**
     * Deprecated since 4.5.0
     */
    @WebMethod(action = "urn:createUser")
    @Action(input = "urn:createUser", output = "urn:createUserResponse")
    @RequestWrapper(localName = "createUser", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.CreateUserResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.util.List<java.lang.String> createUser(
        @WebParam(name = "userInfo", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        org.gs4tr.projectdirector.model.dto.UserInfo userInfo,
        @WebParam(name = "tiUserInfo", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        org.gs4tr.projectdirector.model.dto.TiUserInfo tiUserInfo
    );
}
