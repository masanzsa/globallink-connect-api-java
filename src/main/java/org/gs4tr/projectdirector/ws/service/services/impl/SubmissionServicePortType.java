package org.gs4tr.projectdirector.ws.service.services.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2016-05-25T10:46:04.165+03:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", name = "SubmissionServicePortType")
@XmlSeeAlso({ObjectFactory.class, org.gs4tr.projectdirector.model.dto.ObjectFactory.class, org.w3._2005._05.xmlmime.ObjectFactory.class})
public interface SubmissionServicePortType {

    @WebMethod(action = "urn:checkDownloadDeliverableCollateral")
    @Action(input = "urn:checkDownloadDeliverableCollateral", output = "urn:checkDownloadDeliverableCollateralResponse")
    @RequestWrapper(localName = "checkDownloadDeliverableCollateral", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.CheckDownloadDeliverableCollateral")
    @ResponseWrapper(localName = "checkDownloadDeliverableCollateralResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.CheckDownloadDeliverableCollateralResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public org.gs4tr.projectdirector.model.dto.DownloadCollateralResult checkDownloadDeliverableCollateral(
        @WebParam(name = "uuid", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String uuid
    );

    @WebMethod(action = "urn:addOwner")
    @Action(input = "urn:addOwner", output = "urn:addOwnerResponse")
    @RequestWrapper(localName = "addOwner", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.AddOwner")
    @ResponseWrapper(localName = "addOwnerResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.AddOwnerResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.lang.String addOwner(
        @WebParam(name = "submissionTicket", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String submissionTicket,
        @WebParam(name = "username", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String username
    );

    @WebMethod(action = "urn:startSingleBatchSubmission")
    @Action(input = "urn:startSingleBatchSubmission", output = "urn:startSingleBatchSubmissionResponse")
    @RequestWrapper(localName = "startSingleBatchSubmission", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.StartSingleBatchSubmission")
    @ResponseWrapper(localName = "startSingleBatchSubmissionResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.StartSingleBatchSubmissionResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.lang.String startSingleBatchSubmission(
        @WebParam(name = "submissionId", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String submissionId,
        @WebParam(name = "submissionInfo", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        org.gs4tr.projectdirector.model.dto.SubmissionInfo submissionInfo
    );

    @WebMethod(action = "urn:findCreatingSubmissionsByProjectShortCode")
    @Action(input = "urn:findCreatingSubmissionsByProjectShortCode", output = "urn:findCreatingSubmissionsByProjectShortCodeResponse")
    @RequestWrapper(localName = "findCreatingSubmissionsByProjectShortCode", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindCreatingSubmissionsByProjectShortCode")
    @ResponseWrapper(localName = "findCreatingSubmissionsByProjectShortCodeResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindCreatingSubmissionsByProjectShortCodeResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.util.List<org.gs4tr.projectdirector.model.dto.Submission> findCreatingSubmissionsByProjectShortCode(
        @WebParam(name = "projectShortCode", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String projectShortCode
    );

    /**
     * Deprecated since 4.5.0
     */
    @WebMethod(action = "urn:searchSubmissions")
    @Action(input = "urn:searchSubmissions", output = "urn:searchSubmissionsResponse")
    @RequestWrapper(localName = "searchSubmissions", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.SearchSubmissions")
    @ResponseWrapper(localName = "searchSubmissionsResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.SearchSubmissionsResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public org.gs4tr.projectdirector.model.dto.SubmissionSearchModelPagedList searchSubmissions(
        @WebParam(name = "submissionSearchRequest", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        org.gs4tr.projectdirector.model.dto.SubmissionSearchRequest submissionSearchRequest,
        @WebParam(name = "info", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        org.gs4tr.projectdirector.model.dto.PagedListInfo info
    );

    @WebMethod(action = "urn:downloadDeliverableCollateralBySubmissionTicket")
    @Action(input = "urn:downloadDeliverableCollateralBySubmissionTicket", output = "urn:downloadDeliverableCollateralBySubmissionTicketResponse")
    @RequestWrapper(localName = "downloadDeliverableCollateralBySubmissionTicket", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.DownloadDeliverableCollateralBySubmissionTicket")
    @ResponseWrapper(localName = "downloadDeliverableCollateralBySubmissionTicketResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.DownloadDeliverableCollateralBySubmissionTicketResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.lang.String downloadDeliverableCollateralBySubmissionTicket(
        @WebParam(name = "submissionTicket", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String submissionTicket
    );

    @WebMethod(action = "urn:uploadReference")
    @Action(input = "urn:uploadReference", output = "urn:uploadReferenceResponse")
    @RequestWrapper(localName = "uploadReference", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.UploadReference")
    @ResponseWrapper(localName = "uploadReferenceResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.UploadReferenceResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.lang.String uploadReference(
        @WebParam(name = "submissionId", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String submissionId,
        @WebParam(name = "resourceInfo", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        org.gs4tr.projectdirector.model.dto.ResourceInfo resourceInfo,
        @WebParam(name = "data", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        org.w3._2005._05.xmlmime.Base64Binary data
    );

    @WebMethod(action = "urn:startSubmission")
    @Action(input = "urn:startSubmission", output = "urn:startSubmissionResponse")
    @RequestWrapper(localName = "startSubmission", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.StartSubmission")
    @ResponseWrapper(localName = "startSubmissionResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.StartSubmissionResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.lang.String startSubmission(
        @WebParam(name = "submissionId", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String submissionId,
        @WebParam(name = "submissionInfo", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        org.gs4tr.projectdirector.model.dto.SubmissionInfo submissionInfo
    );

    @WebMethod(action = "urn:cancelSubmissionWithComment")
    @Action(input = "urn:cancelSubmissionWithComment", output = "urn:cancelSubmissionWithCommentResponse")
    @RequestWrapper(localName = "cancelSubmissionWithComment", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.CancelSubmissionWithComment")
    @ResponseWrapper(localName = "cancelSubmissionWithCommentResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.CancelSubmissionWithCommentResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.lang.String cancelSubmissionWithComment(
        @WebParam(name = "submissionId", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String submissionId,
        @WebParam(name = "comment", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String comment
    );

    @WebMethod(action = "urn:addReferenceAsText")
    @Action(input = "urn:addReferenceAsText", output = "urn:addReferenceAsTextResponse")
    @RequestWrapper(localName = "addReferenceAsText", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.AddReferenceAsText")
    @ResponseWrapper(localName = "addReferenceAsTextResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.AddReferenceAsTextResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.lang.String addReferenceAsText(
        @WebParam(name = "referenceText", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String referenceText,
        @WebParam(name = "referenceDocumentName", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String referenceDocumentName,
        @WebParam(name = "encoding", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String encoding,
        @WebParam(name = "submissionTicket", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String submissionTicket
    );

    @WebMethod(action = "urn:findByTicket")
    @Action(input = "urn:findByTicket", output = "urn:findByTicketResponse")
    @RequestWrapper(localName = "findByTicket", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindSubmissionByTicket")
    @ResponseWrapper(localName = "findByTicketResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindSubmissionByTicketResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public org.gs4tr.projectdirector.model.dto.Submission findByTicket(
        @WebParam(name = "ticket", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String ticket
    );

    /**
     * Deprecated since 4.5.0
     */
    @WebMethod(action = "urn:search")
    @Action(input = "urn:search", output = "urn:searchResponse")
    @RequestWrapper(localName = "search", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.SearchSubmission")
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.SearchSubmissionResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public org.gs4tr.projectdirector.model.dto.SubmissionPagedList search(
        @WebParam(name = "command", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        org.gs4tr.projectdirector.model.dto.SubmissionSearchRequest command,
        @WebParam(name = "info", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        org.gs4tr.projectdirector.model.dto.PagedListInfo info
    );

    @WebMethod(action = "urn:addSubmitter")
    @Action(input = "urn:addSubmitter", output = "urn:addSubmitterResponse")
    @RequestWrapper(localName = "addSubmitter", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.AddSubmitter")
    @ResponseWrapper(localName = "addSubmitterResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.AddSubmitterResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.lang.String addSubmitter(
        @WebParam(name = "submissionTicket", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String submissionTicket,
        @WebParam(name = "username", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String username
    );

    @WebMethod(action = "urn:cancelSubmission")
    @Action(input = "urn:cancelSubmission", output = "urn:cancelSubmissionResponse")
    @RequestWrapper(localName = "cancelSubmission", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.CancelSubmission")
    @ResponseWrapper(localName = "cancelSubmissionResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.CancelSubmissionResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.lang.String cancelSubmission(
        @WebParam(name = "submissionId", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String submissionId
    );

    @WebMethod(action = "urn:downloadDeliverableCollateralBySubmissionTicketAndTargetLanguages")
    @Action(input = "urn:downloadDeliverableCollateralBySubmissionTicketAndTargetLanguages", output = "urn:downloadDeliverableCollateralBySubmissionTicketAndTargetLanguagesResponse")
    @RequestWrapper(localName = "downloadDeliverableCollateralBySubmissionTicketAndTargetLanguages", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.DownloadDeliverableCollateralBySubmissionTicketAndTargetLanguages")
    @ResponseWrapper(localName = "downloadDeliverableCollateralBySubmissionTicketAndTargetLanguagesResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.DownloadDeliverableCollateralBySubmissionTicketAndTargetLanguagesResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.lang.String downloadDeliverableCollateralBySubmissionTicketAndTargetLanguages(
        @WebParam(name = "submissionTicket", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String submissionTicket,
        @WebParam(name = "targetLanguages", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.util.List<java.lang.String> targetLanguages
    );
}
