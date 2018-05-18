
package com.mdtoolboxrx;

import java.util.Calendar;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "rxSoap", targetNamespace = "http://mdtoolboxrx.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RxSoap {


    /**
     * HIEPartners: Register an organization/group direct message account
     * 
     * @param organizationObj
     * @param statusMsg
     * @param accountObj
     * @param hieServiceLevel
     * @param hieRegisterOrganizationResult
     * @param statusFlag
     */
    @WebMethod(operationName = "HIERegisterOrganization", action = "http://mdtoolboxrx.com/HIERegisterOrganization")
    @RequestWrapper(localName = "HIERegisterOrganization", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIERegisterOrganization")
    @ResponseWrapper(localName = "HIERegisterOrganizationResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIERegisterOrganizationResponse")
    public void hieRegisterOrganization(
        @WebParam(name = "OrganizationObj", targetNamespace = "http://mdtoolboxrx.com/")
        Organization organizationObj,
        @WebParam(name = "HIEServiceLevel", targetNamespace = "http://mdtoolboxrx.com/")
        int hieServiceLevel,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "HIERegisterOrganizationResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> hieRegisterOrganizationResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * HIEPartners: Register provider for Clinical Messaging
     * 
     * @param statusMsg
     * @param providerObj
     * @param accountObj
     * @param registerForRx
     * @param hieRegisterProviderResult
     * @param regDirectMailUserName
     * @param statusFlag
     */
    @WebMethod(operationName = "HIERegisterProvider", action = "http://mdtoolboxrx.com/HIERegisterProvider")
    @RequestWrapper(localName = "HIERegisterProvider", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIERegisterProvider")
    @ResponseWrapper(localName = "HIERegisterProviderResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIERegisterProviderResponse")
    public void hieRegisterProvider(
        @WebParam(name = "ProviderObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescriber providerObj,
        @WebParam(name = "RegDirectMailUserName", targetNamespace = "http://mdtoolboxrx.com/")
        String regDirectMailUserName,
        @WebParam(name = "RegisterForRx", targetNamespace = "http://mdtoolboxrx.com/")
        SurescriptsServices registerForRx,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "HIERegisterProviderResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> hieRegisterProviderResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns dataset of providers/organizations in the HIE directory.
     * 
     * @param statusMsg
     * @param accountObj
     * @param hieGetDirectoryDSResult
     * @param includeOrganizations
     * @param searchOrgFields
     * @param includeProviders
     * @param includePharmacies
     * @param statusFlag
     */
    @WebMethod(operationName = "HIEGetDirectoryDS", action = "http://mdtoolboxrx.com/HIEGetDirectoryDS")
    @RequestWrapper(localName = "HIEGetDirectoryDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetDirectoryDS")
    @ResponseWrapper(localName = "HIEGetDirectoryDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetDirectoryDSResponse")
    public void hieGetDirectoryDS(
        @WebParam(name = "SearchOrgFields", targetNamespace = "http://mdtoolboxrx.com/")
        Organization searchOrgFields,
        @WebParam(name = "IncludeProviders", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeProviders,
        @WebParam(name = "IncludeOrganizations", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeOrganizations,
        @WebParam(name = "IncludePharmacies", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includePharmacies,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "HIEGetDirectoryDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.HIEGetDirectoryDSResponse.HIEGetDirectoryDSResult> hieGetDirectoryDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns obj array of providers/organizations in the HIE directory.
     * 
     * @param hieGetDirectoryObjResult
     * @param statusMsg
     * @param accountObj
     * @param includeOrganizations
     * @param searchOrgFields
     * @param includeProviders
     * @param includePharmacies
     * @param statusFlag
     */
    @WebMethod(operationName = "HIEGetDirectoryObj", action = "http://mdtoolboxrx.com/HIEGetDirectoryObj")
    @RequestWrapper(localName = "HIEGetDirectoryObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetDirectoryObj")
    @ResponseWrapper(localName = "HIEGetDirectoryObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetDirectoryObjResponse")
    public void hieGetDirectoryObj(
        @WebParam(name = "SearchOrgFields", targetNamespace = "http://mdtoolboxrx.com/")
        Organization searchOrgFields,
        @WebParam(name = "IncludeProviders", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeProviders,
        @WebParam(name = "IncludeOrganizations", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeOrganizations,
        @WebParam(name = "IncludePharmacies", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includePharmacies,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "HIEGetDirectoryObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfOrganization> hieGetDirectoryObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns dataset of HIE messages for given Direct Message recipient.
     * 
     * @param inboxOrOutbox
     * @param statusMsg
     * @param endDate
     * @param directAddress
     * @param accountObj
     * @param hieGetMessagesDSResult
     * @param startDate
     * @param statusFlag
     */
    @WebMethod(operationName = "HIEGetMessagesDS", action = "http://mdtoolboxrx.com/HIEGetMessagesDS")
    @RequestWrapper(localName = "HIEGetMessagesDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetMessagesDS")
    @ResponseWrapper(localName = "HIEGetMessagesDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetMessagesDSResponse")
    public void hieGetMessagesDS(
        @WebParam(name = "DirectAddress", targetNamespace = "http://mdtoolboxrx.com/")
        String directAddress,
        @WebParam(name = "InboxOrOutbox", targetNamespace = "http://mdtoolboxrx.com/")
        int inboxOrOutbox,
        @WebParam(name = "StartDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar endDate,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "HIEGetMessagesDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.HIEGetMessagesDSResponse.HIEGetMessagesDSResult> hieGetMessagesDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns dataset of HIE messages for given Direct Message recipient array (pass 1 to N addresses).
     * 
     * @param inboxOrOutbox
     * @param statusMsg
     * @param endDate
     * @param hieGetMessagesArrayDSResult
     * @param directAddress
     * @param accountObj
     * @param startDate
     * @param statusFlag
     */
    @WebMethod(operationName = "HIEGetMessagesArrayDS", action = "http://mdtoolboxrx.com/HIEGetMessagesArrayDS")
    @RequestWrapper(localName = "HIEGetMessagesArrayDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetMessagesArrayDS")
    @ResponseWrapper(localName = "HIEGetMessagesArrayDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetMessagesArrayDSResponse")
    public void hieGetMessagesArrayDS(
        @WebParam(name = "DirectAddress", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfString directAddress,
        @WebParam(name = "InboxOrOutbox", targetNamespace = "http://mdtoolboxrx.com/")
        int inboxOrOutbox,
        @WebParam(name = "StartDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar endDate,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "HIEGetMessagesArrayDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.HIEGetMessagesArrayDSResponse.HIEGetMessagesArrayDSResult> hieGetMessagesArrayDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Mark message as read or complete (HIE Messages).
     * 
     * @param statusMsg
     * @param accountObj
     * @param messageId
     * @param complete
     * @param statusFlag
     */
    @WebMethod(operationName = "HIEUpdateMsgStatus", action = "http://mdtoolboxrx.com/HIEUpdateMsgStatus")
    @RequestWrapper(localName = "HIEUpdateMsgStatus", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEUpdateMsgStatus")
    @ResponseWrapper(localName = "HIEUpdateMsgStatusResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEUpdateMsgStatusResponse")
    public void hieUpdateMsgStatus(
        @WebParam(name = "MessageId", targetNamespace = "http://mdtoolboxrx.com/")
        int messageId,
        @WebParam(name = "Complete", targetNamespace = "http://mdtoolboxrx.com/")
        boolean complete,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns obj array of HIE messages for given Direct Message recipient.
     * 
     * @param inboxOrOutbox
     * @param hieGetMessagesObjResult
     * @param statusMsg
     * @param endDate
     * @param directAddress
     * @param accountObj
     * @param startDate
     * @param statusFlag
     */
    @WebMethod(operationName = "HIEGetMessagesObj", action = "http://mdtoolboxrx.com/HIEGetMessagesObj")
    @RequestWrapper(localName = "HIEGetMessagesObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetMessagesObj")
    @ResponseWrapper(localName = "HIEGetMessagesObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetMessagesObjResponse")
    public void hieGetMessagesObj(
        @WebParam(name = "DirectAddress", targetNamespace = "http://mdtoolboxrx.com/")
        String directAddress,
        @WebParam(name = "InboxOrOutbox", targetNamespace = "http://mdtoolboxrx.com/")
        int inboxOrOutbox,
        @WebParam(name = "StartDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar endDate,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "HIEGetMessagesObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfHIEMessage> hieGetMessagesObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns obj array of HIE messages for given Direct Message recipient.
     * 
     * @param inboxOrOutbox
     * @param statusMsg
     * @param endDate
     * @param hieGetMessagesUTCObjResult
     * @param directAddress
     * @param accountObj
     * @param startDate
     * @param statusFlag
     */
    @WebMethod(operationName = "HIEGetMessagesUTCObj", action = "http://mdtoolboxrx.com/HIEGetMessagesUTCObj")
    @RequestWrapper(localName = "HIEGetMessagesUTCObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetMessagesUTCObj")
    @ResponseWrapper(localName = "HIEGetMessagesUTCObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetMessagesUTCObjResponse")
    public void hieGetMessagesUTCObj(
        @WebParam(name = "DirectAddress", targetNamespace = "http://mdtoolboxrx.com/")
        String directAddress,
        @WebParam(name = "InboxOrOutbox", targetNamespace = "http://mdtoolboxrx.com/")
        int inboxOrOutbox,
        @WebParam(name = "StartDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar endDate,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "HIEGetMessagesUTCObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfHIEMessage> hieGetMessagesUTCObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns obj array of HIE messages for given Direct Message recipient.
     * 
     * @param statusMsg
     * @param accountObj
     * @param hieGetMessageDetailResult
     * @param messageId
     * @param statusFlag
     */
    @WebMethod(operationName = "HIEGetMessageDetail", action = "http://mdtoolboxrx.com/HIEGetMessageDetail")
    @RequestWrapper(localName = "HIEGetMessageDetail", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetMessageDetail")
    @ResponseWrapper(localName = "HIEGetMessageDetailResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEGetMessageDetailResponse")
    public void hieGetMessageDetail(
        @WebParam(name = "MessageId", targetNamespace = "http://mdtoolboxrx.com/")
        int messageId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "HIEGetMessageDetailResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<HIEMessage> hieGetMessageDetailResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * HIEPartners:Electronically Send a secure clinical message.)
     * 
     * @param statusMsg
     * @param clinicalMessage
     * @param accountObj
     * @param routeStatusFlag
     * @param hiEeSendMessageResult
     * @param statusFlag
     */
    @WebMethod(operationName = "HIEeSendMessage", action = "http://mdtoolboxrx.com/HIEeSendMessage")
    @RequestWrapper(localName = "HIEeSendMessage", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEeSendMessage")
    @ResponseWrapper(localName = "HIEeSendMessageResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.HIEeSendMessageResponse")
    public void hiEeSendMessage(
        @WebParam(name = "ClinicalMessage", targetNamespace = "http://mdtoolboxrx.com/")
        HIEMessage clinicalMessage,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "HIEeSendMessageResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> hiEeSendMessageResult,
        @WebParam(name = "RouteStatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<HIERouteStatus> routeStatusFlag,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Test Method-Will validate and return Success or Fail for connect status.
     * 
     * @param accountObj
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "WebServiceTest", action = "http://mdtoolboxrx.com/WebServiceTest")
    @WebResult(name = "WebServiceTestResult", targetNamespace = "http://mdtoolboxrx.com/")
    @RequestWrapper(localName = "WebServiceTest", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.WebServiceTest")
    @ResponseWrapper(localName = "WebServiceTestResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.WebServiceTestResponse")
    public String webServiceTest(
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj);

    /**
     * Search the drug lookup list-returns dataset of found drugs.
     * 
     * @param activeOnly
     * @param prescriberId
     * @param optionalPbmId
     * @param optionalCoverageListId
     * @param searchNameFields
     * @param getDrugListDSResult
     * @param searchFlag
     * @param statusMsg
     * @param rxFlag
     * @param searchName
     * @param accountObj
     * @param nameFlag
     * @param beginsContains
     * @param optionalFormularyId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugListDS", action = "http://mdtoolboxrx.com/GetDrugListDS")
    @RequestWrapper(localName = "GetDrugListDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugListDS")
    @ResponseWrapper(localName = "GetDrugListDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugListDSResponse")
    public void getDrugListDS(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "BeginsContains", targetNamespace = "http://mdtoolboxrx.com/")
        SearchLike beginsContains,
        @WebParam(name = "SearchFlag", targetNamespace = "http://mdtoolboxrx.com/")
        SearchType searchFlag,
        @WebParam(name = "NameFlag", targetNamespace = "http://mdtoolboxrx.com/")
        NameType nameFlag,
        @WebParam(name = "RxFlag", targetNamespace = "http://mdtoolboxrx.com/")
        RXType rxFlag,
        @WebParam(name = "SearchNameFields", targetNamespace = "http://mdtoolboxrx.com/")
        SearchName searchNameFields,
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        int prescriberId,
        @WebParam(name = "ActiveOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean activeOnly,
        @WebParam(name = "OptionalPbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalPbmId,
        @WebParam(name = "OptionalFormularyId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalFormularyId,
        @WebParam(name = "OptionalCoverageListId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalCoverageListId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugListDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugListDSResponse.GetDrugListDSResult> getDrugListDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Search the drug lookup list-returns dataset of found drugs including dea class codes at the state level.
     * 
     * @param activeOnly
     * @param prescriber2LetterState
     * @param prescriberId
     * @param optionalPbmId
     * @param getDrugListWithStateDeaCodesDSResult
     * @param optionalCoverageListId
     * @param searchNameFields
     * @param searchFlag
     * @param statusMsg
     * @param rxFlag
     * @param searchName
     * @param accountObj
     * @param nameFlag
     * @param beginsContains
     * @param optionalFormularyId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugListWithStateDeaCodesDS", action = "http://mdtoolboxrx.com/GetDrugListWithStateDeaCodesDS")
    @RequestWrapper(localName = "GetDrugListWithStateDeaCodesDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugListWithStateDeaCodesDS")
    @ResponseWrapper(localName = "GetDrugListWithStateDeaCodesDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugListWithStateDeaCodesDSResponse")
    public void getDrugListWithStateDeaCodesDS(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "BeginsContains", targetNamespace = "http://mdtoolboxrx.com/")
        SearchLike beginsContains,
        @WebParam(name = "SearchFlag", targetNamespace = "http://mdtoolboxrx.com/")
        SearchType searchFlag,
        @WebParam(name = "NameFlag", targetNamespace = "http://mdtoolboxrx.com/")
        NameType nameFlag,
        @WebParam(name = "RxFlag", targetNamespace = "http://mdtoolboxrx.com/")
        RXType rxFlag,
        @WebParam(name = "SearchNameFields", targetNamespace = "http://mdtoolboxrx.com/")
        SearchName searchNameFields,
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        String prescriberId,
        @WebParam(name = "Prescriber2LetterState", targetNamespace = "http://mdtoolboxrx.com/")
        String prescriber2LetterState,
        @WebParam(name = "ActiveOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean activeOnly,
        @WebParam(name = "OptionalPbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalPbmId,
        @WebParam(name = "OptionalFormularyId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalFormularyId,
        @WebParam(name = "OptionalCoverageListId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalCoverageListId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugListWithStateDeaCodesDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugListWithStateDeaCodesDSResponse.GetDrugListWithStateDeaCodesDSResult> getDrugListWithStateDeaCodesDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Search the drug lookup list-returns dataset of found drugs including dea class codes at the state level and any vouchers that might be on file per subaccount and patient.
     * 
     * @param activeOnly
     * @param prescriber2LetterState
     * @param prescriberId
     * @param optionalPbmId
     * @param patientId
     * @param optionalCoverageListId
     * @param searchNameFields
     * @param voucherAuth
     * @param searchFlag
     * @param vouchersOnly
     * @param statusMsg
     * @param rxFlag
     * @param searchName
     * @param accountObj
     * @param getDrugListwStateDeaPlusVoucherDSResult
     * @param nameFlag
     * @param beginsContains
     * @param optionalFormularyId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugListwStateDeaPlusVoucherDS", action = "http://mdtoolboxrx.com/GetDrugListwStateDeaPlusVoucherDS")
    @RequestWrapper(localName = "GetDrugListwStateDeaPlusVoucherDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugListwStateDeaPlusVoucherDS")
    @ResponseWrapper(localName = "GetDrugListwStateDeaPlusVoucherDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugListwStateDeaPlusVoucherDSResponse")
    public void getDrugListwStateDeaPlusVoucherDS(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "BeginsContains", targetNamespace = "http://mdtoolboxrx.com/")
        SearchLike beginsContains,
        @WebParam(name = "SearchFlag", targetNamespace = "http://mdtoolboxrx.com/")
        SearchType searchFlag,
        @WebParam(name = "NameFlag", targetNamespace = "http://mdtoolboxrx.com/")
        NameType nameFlag,
        @WebParam(name = "RxFlag", targetNamespace = "http://mdtoolboxrx.com/")
        RXType rxFlag,
        @WebParam(name = "SearchNameFields", targetNamespace = "http://mdtoolboxrx.com/")
        SearchName searchNameFields,
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        String prescriberId,
        @WebParam(name = "Prescriber2LetterState", targetNamespace = "http://mdtoolboxrx.com/")
        String prescriber2LetterState,
        @WebParam(name = "ActiveOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean activeOnly,
        @WebParam(name = "OptionalPbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalPbmId,
        @WebParam(name = "OptionalFormularyId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalFormularyId,
        @WebParam(name = "OptionalCoverageListId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalCoverageListId,
        @WebParam(name = "PatientId", targetNamespace = "http://mdtoolboxrx.com/")
        String patientId,
        @WebParam(name = "VoucherAuth", targetNamespace = "http://mdtoolboxrx.com/")
        String voucherAuth,
        @WebParam(name = "VouchersOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean vouchersOnly,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugListwStateDeaPlusVoucherDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugListwStateDeaPlusVoucherDSResponse.GetDrugListwStateDeaPlusVoucherDSResult> getDrugListwStateDeaPlusVoucherDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Search the drug lookup list-returns dataset of found drugs - with paging - pass in pagesize and page number to return.
     * 
     * @param activeOnly
     * @param prescriberId
     * @param pageSize
     * @param totalRecordsAvailable
     * @param searchNameFields
     * @param statusMsg
     * @param rxFlag
     * @param searchName
     * @param accountObj
     * @param nameFlag
     * @param beginsContains
     * @param returnPageNumber
     * @param getDrugListWithPagingDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugListWithPagingDS", action = "http://mdtoolboxrx.com/GetDrugListWithPagingDS")
    @RequestWrapper(localName = "GetDrugListWithPagingDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugListWithPagingDS")
    @ResponseWrapper(localName = "GetDrugListWithPagingDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugListWithPagingDSResponse")
    public void getDrugListWithPagingDS(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "BeginsContains", targetNamespace = "http://mdtoolboxrx.com/")
        SearchLike beginsContains,
        @WebParam(name = "NameFlag", targetNamespace = "http://mdtoolboxrx.com/")
        NameType nameFlag,
        @WebParam(name = "RxFlag", targetNamespace = "http://mdtoolboxrx.com/")
        RXType rxFlag,
        @WebParam(name = "SearchNameFields", targetNamespace = "http://mdtoolboxrx.com/")
        SearchName searchNameFields,
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        int prescriberId,
        @WebParam(name = "ActiveOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean activeOnly,
        @WebParam(name = "PageSize", targetNamespace = "http://mdtoolboxrx.com/")
        int pageSize,
        @WebParam(name = "ReturnPageNumber", targetNamespace = "http://mdtoolboxrx.com/")
        int returnPageNumber,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugListWithPagingDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugListWithPagingDSResponse.GetDrugListWithPagingDSResult> getDrugListWithPagingDSResult,
        @WebParam(name = "TotalRecordsAvailable", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Integer> totalRecordsAvailable,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Search the drug lookup list-returns obj array of found drugs - with paging - pass in pagesize and page number to return.
     * 
     * @param activeOnly
     * @param prescriberId
     * @param pageSize
     * @param getDrugListWithPagingObjResult
     * @param totalRecordsAvailable
     * @param searchNameFields
     * @param statusMsg
     * @param rxFlag
     * @param searchName
     * @param accountObj
     * @param nameFlag
     * @param beginsContains
     * @param returnPageNumber
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugListWithPagingObj", action = "http://mdtoolboxrx.com/GetDrugListWithPagingObj")
    @RequestWrapper(localName = "GetDrugListWithPagingObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugListWithPagingObj")
    @ResponseWrapper(localName = "GetDrugListWithPagingObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugListWithPagingObjResponse")
    public void getDrugListWithPagingObj(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "BeginsContains", targetNamespace = "http://mdtoolboxrx.com/")
        SearchLike beginsContains,
        @WebParam(name = "NameFlag", targetNamespace = "http://mdtoolboxrx.com/")
        NameType nameFlag,
        @WebParam(name = "RxFlag", targetNamespace = "http://mdtoolboxrx.com/")
        RXType rxFlag,
        @WebParam(name = "SearchNameFields", targetNamespace = "http://mdtoolboxrx.com/")
        SearchName searchNameFields,
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        int prescriberId,
        @WebParam(name = "ActiveOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean activeOnly,
        @WebParam(name = "PageSize", targetNamespace = "http://mdtoolboxrx.com/")
        int pageSize,
        @WebParam(name = "ReturnPageNumber", targetNamespace = "http://mdtoolboxrx.com/")
        int returnPageNumber,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugListWithPagingObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfDrug> getDrugListWithPagingObjResult,
        @WebParam(name = "TotalRecordsAvailable", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Integer> totalRecordsAvailable,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Get an HTML Formatted string that includes Coverage,Copay and Alternative details for a given drug and formulary.
     * 
     * @param reportingDisplayFlags
     * @param coverId
     * @param getFormularyDetailDisplayHTMLResult
     * @param statusMsg
     * @param accountObj
     * @param formularyId
     * @param copayId
     * @param unqDrugId
     * @param altId
     * @param pbmId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetFormularyDetailDisplayHTML", action = "http://mdtoolboxrx.com/GetFormularyDetailDisplayHTML")
    @RequestWrapper(localName = "GetFormularyDetailDisplayHTML", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyDetailDisplayHTML")
    @ResponseWrapper(localName = "GetFormularyDetailDisplayHTMLResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyDetailDisplayHTMLResponse")
    public void getFormularyDetailDisplayHTML(
        @WebParam(name = "UnqDrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int unqDrugId,
        @WebParam(name = "PbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String pbmId,
        @WebParam(name = "CopayId", targetNamespace = "http://mdtoolboxrx.com/")
        String copayId,
        @WebParam(name = "FormularyId", targetNamespace = "http://mdtoolboxrx.com/")
        String formularyId,
        @WebParam(name = "CoverId", targetNamespace = "http://mdtoolboxrx.com/")
        String coverId,
        @WebParam(name = "AltId", targetNamespace = "http://mdtoolboxrx.com/")
        String altId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetFormularyDetailDisplayHTMLResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getFormularyDetailDisplayHTMLResult,
        @WebParam(name = "ReportingDisplayFlags", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> reportingDisplayFlags,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Get a set of Arrays that includes Coverage,Copay and Alternative details for a given drug and formulary.
     * 
     * @param reportingDisplayFlags
     * @param therAlts
     * @param formularyId
     * @param altId
     * @param pbmId
     * @param getFormularyDetailDisplayArrResult
     * @param copayInfo
     * @param pbmAlts
     * @param coverId
     * @param statusMsg
     * @param accountObj
     * @param coverageInfo
     * @param copayId
     * @param unqDrugId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetFormularyDetailDisplayArr", action = "http://mdtoolboxrx.com/GetFormularyDetailDisplayArr")
    @RequestWrapper(localName = "GetFormularyDetailDisplayArr", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyDetailDisplayArr")
    @ResponseWrapper(localName = "GetFormularyDetailDisplayArrResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyDetailDisplayArrResponse")
    public void getFormularyDetailDisplayArr(
        @WebParam(name = "UnqDrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int unqDrugId,
        @WebParam(name = "PbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String pbmId,
        @WebParam(name = "CopayId", targetNamespace = "http://mdtoolboxrx.com/")
        String copayId,
        @WebParam(name = "FormularyId", targetNamespace = "http://mdtoolboxrx.com/")
        String formularyId,
        @WebParam(name = "CoverId", targetNamespace = "http://mdtoolboxrx.com/")
        String coverId,
        @WebParam(name = "AltId", targetNamespace = "http://mdtoolboxrx.com/")
        String altId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetFormularyDetailDisplayArrResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getFormularyDetailDisplayArrResult,
        @WebParam(name = "CoverageInfo", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfString> coverageInfo,
        @WebParam(name = "CopayInfo", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfString> copayInfo,
        @WebParam(name = "PbmAlts", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfString> pbmAlts,
        @WebParam(name = "TherAlts", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfString> therAlts,
        @WebParam(name = "ReportingDisplayFlags", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> reportingDisplayFlags,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Get a set of 2 dim arrays that includes Coverage,Copay and Alternative details for a given drug and formulary.
     * 
     * @param reportingDisplayFlags
     * @param therAlts
     * @param formularyId
     * @param rxNorm
     * @param getFormularyDetailDisplayArrDetailResult
     * @param altId
     * @param pbmId
     * @param copayInfo
     * @param pbmAlts
     * @param coverId
     * @param statusMsg
     * @param accountObj
     * @param coverageInfo
     * @param copayId
     * @param unqDrugId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetFormularyDetailDisplayArrDetail", action = "http://mdtoolboxrx.com/GetFormularyDetailDisplayArrDetail")
    @RequestWrapper(localName = "GetFormularyDetailDisplayArrDetail", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyDetailDisplayArrDetail")
    @ResponseWrapper(localName = "GetFormularyDetailDisplayArrDetailResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyDetailDisplayArrDetailResponse")
    public void getFormularyDetailDisplayArrDetail(
        @WebParam(name = "UnqDrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int unqDrugId,
        @WebParam(name = "RxNorm", targetNamespace = "http://mdtoolboxrx.com/")
        String rxNorm,
        @WebParam(name = "PbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String pbmId,
        @WebParam(name = "CopayId", targetNamespace = "http://mdtoolboxrx.com/")
        String copayId,
        @WebParam(name = "FormularyId", targetNamespace = "http://mdtoolboxrx.com/")
        String formularyId,
        @WebParam(name = "CoverId", targetNamespace = "http://mdtoolboxrx.com/")
        String coverId,
        @WebParam(name = "AltId", targetNamespace = "http://mdtoolboxrx.com/")
        String altId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetFormularyDetailDisplayArrDetailResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getFormularyDetailDisplayArrDetailResult,
        @WebParam(name = "CoverageInfo", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfString> coverageInfo,
        @WebParam(name = "CopayInfo", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfString> copayInfo,
        @WebParam(name = "PbmAlts", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfDrugAlt> pbmAlts,
        @WebParam(name = "TherAlts", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfDrugAlt> therAlts,
        @WebParam(name = "ReportingDisplayFlags", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> reportingDisplayFlags,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Get an HTML Formatted string that includes Coverage,Copay and Alternative details for a given supply and formulary.
     * 
     * @param reportingDisplayFlags
     * @param coverId
     * @param supplyNDC
     * @param statusMsg
     * @param getFormularyDetailDisplaySupplyHTMLResult
     * @param accountObj
     * @param formularyId
     * @param copayId
     * @param altId
     * @param pbmId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetFormularyDetailDisplaySupplyHTML", action = "http://mdtoolboxrx.com/GetFormularyDetailDisplaySupplyHTML")
    @RequestWrapper(localName = "GetFormularyDetailDisplaySupplyHTML", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyDetailDisplaySupplyHTML")
    @ResponseWrapper(localName = "GetFormularyDetailDisplaySupplyHTMLResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyDetailDisplaySupplyHTMLResponse")
    public void getFormularyDetailDisplaySupplyHTML(
        @WebParam(name = "SupplyNDC", targetNamespace = "http://mdtoolboxrx.com/")
        String supplyNDC,
        @WebParam(name = "PbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String pbmId,
        @WebParam(name = "CopayId", targetNamespace = "http://mdtoolboxrx.com/")
        String copayId,
        @WebParam(name = "FormularyId", targetNamespace = "http://mdtoolboxrx.com/")
        String formularyId,
        @WebParam(name = "CoverId", targetNamespace = "http://mdtoolboxrx.com/")
        String coverId,
        @WebParam(name = "AltId", targetNamespace = "http://mdtoolboxrx.com/")
        String altId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetFormularyDetailDisplaySupplyHTMLResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getFormularyDetailDisplaySupplyHTMLResult,
        @WebParam(name = "ReportingDisplayFlags", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> reportingDisplayFlags,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Get a set of string arrays that includes Coverage,Copay and Alternative details for a given supply and formulary.
     * 
     * @param getFormularyDetailDisplaySupplyArrResult
     * @param reportingDisplayFlags
     * @param therAlts
     * @param formularyId
     * @param altId
     * @param pbmId
     * @param copayInfo
     * @param pbmAlts
     * @param coverId
     * @param supplyNDC
     * @param statusMsg
     * @param accountObj
     * @param coverageInfo
     * @param copayId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetFormularyDetailDisplaySupplyArr", action = "http://mdtoolboxrx.com/GetFormularyDetailDisplaySupplyArr")
    @RequestWrapper(localName = "GetFormularyDetailDisplaySupplyArr", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyDetailDisplaySupplyArr")
    @ResponseWrapper(localName = "GetFormularyDetailDisplaySupplyArrResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyDetailDisplaySupplyArrResponse")
    public void getFormularyDetailDisplaySupplyArr(
        @WebParam(name = "SupplyNDC", targetNamespace = "http://mdtoolboxrx.com/")
        String supplyNDC,
        @WebParam(name = "PbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String pbmId,
        @WebParam(name = "CopayId", targetNamespace = "http://mdtoolboxrx.com/")
        String copayId,
        @WebParam(name = "FormularyId", targetNamespace = "http://mdtoolboxrx.com/")
        String formularyId,
        @WebParam(name = "CoverId", targetNamespace = "http://mdtoolboxrx.com/")
        String coverId,
        @WebParam(name = "AltId", targetNamespace = "http://mdtoolboxrx.com/")
        String altId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetFormularyDetailDisplaySupplyArrResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getFormularyDetailDisplaySupplyArrResult,
        @WebParam(name = "CoverageInfo", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfString> coverageInfo,
        @WebParam(name = "CopayInfo", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfString> copayInfo,
        @WebParam(name = "PbmAlts", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfString> pbmAlts,
        @WebParam(name = "TherAlts", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfString> therAlts,
        @WebParam(name = "ReportingDisplayFlags", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> reportingDisplayFlags,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Get the PBM formulary coverage extra details for certain drug and formulary. Pass in either DrugId (for drug products) or NDC (for supplies).  If both are passed DrugId will be used.
     * 
     * @param coverageId
     * @param statusMsg
     * @param accountObj
     * @param getFormularyCoverageInfoDSResult
     * @param ndc
     * @param unqDrugId
     * @param pbmId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetFormularyCoverageInfoDS", action = "http://mdtoolboxrx.com/GetFormularyCoverageInfoDS")
    @RequestWrapper(localName = "GetFormularyCoverageInfoDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyCoverageInfoDS")
    @ResponseWrapper(localName = "GetFormularyCoverageInfoDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyCoverageInfoDSResponse")
    public void getFormularyCoverageInfoDS(
        @WebParam(name = "UnqDrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int unqDrugId,
        @WebParam(name = "NDC", targetNamespace = "http://mdtoolboxrx.com/")
        String ndc,
        @WebParam(name = "PbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String pbmId,
        @WebParam(name = "CoverageId", targetNamespace = "http://mdtoolboxrx.com/")
        String coverageId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetFormularyCoverageInfoDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetFormularyCoverageInfoDSResponse.GetFormularyCoverageInfoDSResult> getFormularyCoverageInfoDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Get the PBM formulary copay info for certain drug and formulary. Pass in either DrugId or NDC.  If both are passed DrugId will be used.
     * 
     * @param statusMsg
     * @param accountObj
     * @param formularyCoverage
     * @param ndc
     * @param copayId
     * @param unqDrugId
     * @param pbmId
     * @param getFormularyCopayInfoDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetFormularyCopayInfoDS", action = "http://mdtoolboxrx.com/GetFormularyCopayInfoDS")
    @RequestWrapper(localName = "GetFormularyCopayInfoDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyCopayInfoDS")
    @ResponseWrapper(localName = "GetFormularyCopayInfoDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyCopayInfoDSResponse")
    public void getFormularyCopayInfoDS(
        @WebParam(name = "UnqDrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int unqDrugId,
        @WebParam(name = "NDC", targetNamespace = "http://mdtoolboxrx.com/")
        String ndc,
        @WebParam(name = "PbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String pbmId,
        @WebParam(name = "CopayId", targetNamespace = "http://mdtoolboxrx.com/")
        String copayId,
        @WebParam(name = "FormularyCoverage", targetNamespace = "http://mdtoolboxrx.com/")
        String formularyCoverage,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetFormularyCopayInfoDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetFormularyCopayInfoDSResponse.GetFormularyCopayInfoDSResult> getFormularyCopayInfoDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Get the PBM formulary alternative drugs for certain drug and formulary - this returns a list of drugs that  are PBM suggested alternates per the non-covered passed in drug (not all pbms/drugs will have alts). Pass in Drug Id or Supply NDC for supply alts - if both are passed function will use Drug Id
     * 
     * @param alternateId
     * @param coverageId
     * @param supplyNDC
     * @param statusMsg
     * @param accountObj
     * @param formularyId
     * @param copayId
     * @param unqDrugId
     * @param pbmId
     * @param getFormularyDrugAltsDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetFormularyDrugAltsDS", action = "http://mdtoolboxrx.com/GetFormularyDrugAltsDS")
    @RequestWrapper(localName = "GetFormularyDrugAltsDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyDrugAltsDS")
    @ResponseWrapper(localName = "GetFormularyDrugAltsDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFormularyDrugAltsDSResponse")
    public void getFormularyDrugAltsDS(
        @WebParam(name = "UnqDrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int unqDrugId,
        @WebParam(name = "SupplyNDC", targetNamespace = "http://mdtoolboxrx.com/")
        String supplyNDC,
        @WebParam(name = "PbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String pbmId,
        @WebParam(name = "AlternateId", targetNamespace = "http://mdtoolboxrx.com/")
        String alternateId,
        @WebParam(name = "FormularyId", targetNamespace = "http://mdtoolboxrx.com/")
        String formularyId,
        @WebParam(name = "CoverageId", targetNamespace = "http://mdtoolboxrx.com/")
        String coverageId,
        @WebParam(name = "CopayId", targetNamespace = "http://mdtoolboxrx.com/")
        String copayId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetFormularyDrugAltsDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetFormularyDrugAltsDSResponse.GetFormularyDrugAltsDSResult> getFormularyDrugAltsDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Get a list of alternate drugs (same drug product) per the given drug.  Return list will be sorted by formulary status - most preferred first.
     * 
     * @param coverageId
     * @param supplyNDC
     * @param statusMsg
     * @param accountObj
     * @param formularyId
     * @param copayId
     * @param getDrugAltsDSResult
     * @param unqDrugId
     * @param pbmId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugAltsDS", action = "http://mdtoolboxrx.com/GetDrugAltsDS")
    @RequestWrapper(localName = "GetDrugAltsDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugAltsDS")
    @ResponseWrapper(localName = "GetDrugAltsDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugAltsDSResponse")
    public void getDrugAltsDS(
        @WebParam(name = "UnqDrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int unqDrugId,
        @WebParam(name = "SupplyNDC", targetNamespace = "http://mdtoolboxrx.com/")
        String supplyNDC,
        @WebParam(name = "PbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String pbmId,
        @WebParam(name = "FormularyId", targetNamespace = "http://mdtoolboxrx.com/")
        String formularyId,
        @WebParam(name = "CoverageId", targetNamespace = "http://mdtoolboxrx.com/")
        String coverageId,
        @WebParam(name = "CopayId", targetNamespace = "http://mdtoolboxrx.com/")
        String copayId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugAltsDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugAltsDSResponse.GetDrugAltsDSResult> getDrugAltsDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Get a list of alternate drugs in the same drug class per the given drug.  Return list will be sorted by formulary status - most preferred first.
     * 
     * @param coverageId
     * @param statusMsg
     * @param accountObj
     * @param getDrugAltsPerDrugClassDSResult
     * @param formularyId
     * @param copayId
     * @param unqDrugId
     * @param pbmId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugAltsPerDrugClassDS", action = "http://mdtoolboxrx.com/GetDrugAltsPerDrugClassDS")
    @RequestWrapper(localName = "GetDrugAltsPerDrugClassDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugAltsPerDrugClassDS")
    @ResponseWrapper(localName = "GetDrugAltsPerDrugClassDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugAltsPerDrugClassDSResponse")
    public void getDrugAltsPerDrugClassDS(
        @WebParam(name = "UnqDrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int unqDrugId,
        @WebParam(name = "PbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String pbmId,
        @WebParam(name = "FormularyId", targetNamespace = "http://mdtoolboxrx.com/")
        String formularyId,
        @WebParam(name = "CoverageId", targetNamespace = "http://mdtoolboxrx.com/")
        String coverageId,
        @WebParam(name = "CopayId", targetNamespace = "http://mdtoolboxrx.com/")
        String copayId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugAltsPerDrugClassDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugAltsPerDrugClassDSResponse.GetDrugAltsPerDrugClassDSResult> getDrugAltsPerDrugClassDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns dataset of drug classes a particular generic drug belongs to.
     * 
     * @param statusMsg
     * @param accountObj
     * @param genDrugId
     * @param getDrugClassesDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugClassesDS", action = "http://mdtoolboxrx.com/GetDrugClassesDS")
    @RequestWrapper(localName = "GetDrugClassesDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugClassesDS")
    @ResponseWrapper(localName = "GetDrugClassesDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugClassesDSResponse")
    public void getDrugClassesDS(
        @WebParam(name = "GenDrugId", targetNamespace = "http://mdtoolboxrx.com/")
        String genDrugId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugClassesDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugClassesDSResponse.GetDrugClassesDSResult> getDrugClassesDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns dataset of conditions drug product treats
     * 
     * @param statusMsg
     * @param drugProductId
     * @param accountObj
     * @param getDrugConditionsDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugConditionsDS", action = "http://mdtoolboxrx.com/GetDrugConditionsDS")
    @RequestWrapper(localName = "GetDrugConditionsDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugConditionsDS")
    @ResponseWrapper(localName = "GetDrugConditionsDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugConditionsDSResponse")
    public void getDrugConditionsDS(
        @WebParam(name = "DrugProductId", targetNamespace = "http://mdtoolboxrx.com/")
        String drugProductId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugConditionsDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugConditionsDSResponse.GetDrugConditionsDSResult> getDrugConditionsDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return general drug warnings for generic drug id
     * 
     * @param statusMsg
     * @param accountObj
     * @param getDrugWarningsDSResult
     * @param drugId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugWarningsDS", action = "http://mdtoolboxrx.com/GetDrugWarningsDS")
    @RequestWrapper(localName = "GetDrugWarningsDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugWarningsDS")
    @ResponseWrapper(localName = "GetDrugWarningsDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugWarningsDSResponse")
    public void getDrugWarningsDS(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        String drugId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugWarningsDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugWarningsDSResponse.GetDrugWarningsDSResult> getDrugWarningsDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * 
     * @param getDrugWarnPregLactDSResult
     * @param statusMsg
     * @param accountObj
     * @param drugId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugWarnPregLactDS", action = "http://mdtoolboxrx.com/GetDrugWarnPregLactDS")
    @RequestWrapper(localName = "GetDrugWarnPregLactDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugWarnPregLactDS")
    @ResponseWrapper(localName = "GetDrugWarnPregLactDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugWarnPregLactDSResponse")
    public void getDrugWarnPregLactDS(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        String drugId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugWarnPregLactDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugWarnPregLactDSResponse.GetDrugWarnPregLactDSResult> getDrugWarnPregLactDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * 
     * @param statusMsg
     * @param drugProductId
     * @param accountObj
     * @param getDrugWarningLabelsDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugWarningLabelsDS", action = "http://mdtoolboxrx.com/GetDrugWarningLabelsDS")
    @RequestWrapper(localName = "GetDrugWarningLabelsDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugWarningLabelsDS")
    @ResponseWrapper(localName = "GetDrugWarningLabelsDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugWarningLabelsDSResponse")
    public void getDrugWarningLabelsDS(
        @WebParam(name = "DrugProductId", targetNamespace = "http://mdtoolboxrx.com/")
        String drugProductId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugWarningLabelsDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugWarningLabelsDSResponse.GetDrugWarningLabelsDSResult> getDrugWarningLabelsDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * For given drug product id and language will return URL to patient leaflet
     * 
     * @param statusMsg
     * @param drugProductId
     * @param accountObj
     * @param getDrugPatLeafletURLByProductResult
     * @param lang
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugPatLeafletURLByProduct", action = "http://mdtoolboxrx.com/GetDrugPatLeafletURLByProduct")
    @RequestWrapper(localName = "GetDrugPatLeafletURLByProduct", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugPatLeafletURLByProduct")
    @ResponseWrapper(localName = "GetDrugPatLeafletURLByProductResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugPatLeafletURLByProductResponse")
    public void getDrugPatLeafletURLByProduct(
        @WebParam(name = "DrugProductId", targetNamespace = "http://mdtoolboxrx.com/")
        String drugProductId,
        @WebParam(name = "Lang", targetNamespace = "http://mdtoolboxrx.com/")
        Language lang,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugPatLeafletURLByProductResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getDrugPatLeafletURLByProductResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * For given unqiue drug id and language/type will return URL to patient leaflet
     * 
     * @param statusMsg
     * @param accountObj
     * @param drugId
     * @param getDrugPatLeafletURLResult
     * @param lang
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugPatLeafletURL", action = "http://mdtoolboxrx.com/GetDrugPatLeafletURL")
    @RequestWrapper(localName = "GetDrugPatLeafletURL", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugPatLeafletURL")
    @ResponseWrapper(localName = "GetDrugPatLeafletURLResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugPatLeafletURLResponse")
    public void getDrugPatLeafletURL(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int drugId,
        @WebParam(name = "Lang", targetNamespace = "http://mdtoolboxrx.com/")
        Language lang,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugPatLeafletURLResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getDrugPatLeafletURLResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * For given generic id and language/type will return URL to patient leaflet
     * 
     * @param statusMsg
     * @param accountObj
     * @param drugId
     * @param lang
     * @param getDrugPatLeafletURLByGenericResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugPatLeafletURLByGeneric", action = "http://mdtoolboxrx.com/GetDrugPatLeafletURLByGeneric")
    @RequestWrapper(localName = "GetDrugPatLeafletURLByGeneric", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugPatLeafletURLByGeneric")
    @ResponseWrapper(localName = "GetDrugPatLeafletURLByGenericResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugPatLeafletURLByGenericResponse")
    public void getDrugPatLeafletURLByGeneric(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        String drugId,
        @WebParam(name = "Lang", targetNamespace = "http://mdtoolboxrx.com/")
        Language lang,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugPatLeafletURLByGenericResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getDrugPatLeafletURLByGenericResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns a dataset of drug dosing reference text per given generic drug id.
     * 
     * @param statusMsg
     * @param accountObj
     * @param drugGenId
     * @param getDrugDosingRefDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugDosingRefDS", action = "http://mdtoolboxrx.com/GetDrugDosingRefDS")
    @RequestWrapper(localName = "GetDrugDosingRefDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugDosingRefDS")
    @ResponseWrapper(localName = "GetDrugDosingRefDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugDosingRefDSResponse")
    public void getDrugDosingRefDS(
        @WebParam(name = "DrugGenId", targetNamespace = "http://mdtoolboxrx.com/")
        String drugGenId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugDosingRefDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugDosingRefDSResponse.GetDrugDosingRefDSResult> getDrugDosingRefDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns a list of potential allergy interactions for the given drug combo id
     * 
     * @param getDrugAllergyInterDSResult
     * @param statusMsg
     * @param accountObj
     * @param drugId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugAllergyInterDS", action = "http://mdtoolboxrx.com/GetDrugAllergyInterDS")
    @RequestWrapper(localName = "GetDrugAllergyInterDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugAllergyInterDS")
    @ResponseWrapper(localName = "GetDrugAllergyInterDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugAllergyInterDSResponse")
    public void getDrugAllergyInterDS(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int drugId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugAllergyInterDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugAllergyInterDSResponse.GetDrugAllergyInterDSResult> getDrugAllergyInterDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Get Drug Dosing Data - returns max and min recommended dosing including age, gender, weight for both daily dosing and per dose
     * 
     * @param getDrugDosingDataDSResult
     * @param statusMsg
     * @param accountObj
     * @param drugId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugDosingDataDS", action = "http://mdtoolboxrx.com/GetDrugDosingDataDS")
    @RequestWrapper(localName = "GetDrugDosingDataDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugDosingDataDS")
    @ResponseWrapper(localName = "GetDrugDosingDataDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugDosingDataDSResponse")
    public void getDrugDosingDataDS(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int drugId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugDosingDataDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugDosingDataDSResponse.GetDrugDosingDataDSResult> getDrugDosingDataDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Get Drug Dosing Data rows per patient age, weight, gender and or condition
     * 
     * @param patientGenderCode
     * @param patientAgeInDays
     * @param getDrugDosingDataPerDSResult
     * @param statusMsg
     * @param optionalConditionId
     * @param accountObj
     * @param drugId
     * @param patientWeightinKG
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugDosingDataPerDS", action = "http://mdtoolboxrx.com/GetDrugDosingDataPerDS")
    @RequestWrapper(localName = "GetDrugDosingDataPerDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugDosingDataPerDS")
    @ResponseWrapper(localName = "GetDrugDosingDataPerDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugDosingDataPerDSResponse")
    public void getDrugDosingDataPerDS(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int drugId,
        @WebParam(name = "PatientAgeInDays", targetNamespace = "http://mdtoolboxrx.com/")
        int patientAgeInDays,
        @WebParam(name = "PatientWeightinKG", targetNamespace = "http://mdtoolboxrx.com/")
        int patientWeightinKG,
        @WebParam(name = "PatientGenderCode", targetNamespace = "http://mdtoolboxrx.com/")
        String patientGenderCode,
        @WebParam(name = "OptionalConditionId", targetNamespace = "http://mdtoolboxrx.com/")
        int optionalConditionId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugDosingDataPerDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugDosingDataPerDSResponse.GetDrugDosingDataPerDSResult> getDrugDosingDataPerDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns all potential condition/disease interactions per given drug
     * 
     * @param statusMsg
     * @param accountObj
     * @param getDrugConditionInterDSResult
     * @param drugId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugConditionInterDS", action = "http://mdtoolboxrx.com/GetDrugConditionInterDS")
    @RequestWrapper(localName = "GetDrugConditionInterDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugConditionInterDS")
    @ResponseWrapper(localName = "GetDrugConditionInterDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugConditionInterDSResponse")
    public void getDrugConditionInterDS(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int drugId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugConditionInterDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugConditionInterDSResponse.GetDrugConditionInterDSResult> getDrugConditionInterDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns all potential drug drug interactions per given drug
     * 
     * @param getDrugDrugInterDSResult
     * @param statusMsg
     * @param accountObj
     * @param drugId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugDrugInterDS", action = "http://mdtoolboxrx.com/GetDrugDrugInterDS")
    @RequestWrapper(localName = "GetDrugDrugInterDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugDrugInterDS")
    @ResponseWrapper(localName = "GetDrugDrugInterDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugDrugInterDSResponse")
    public void getDrugDrugInterDS(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int drugId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugDrugInterDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugDrugInterDSResponse.GetDrugDrugInterDSResult> getDrugDrugInterDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns dataset of potential drug food interactions and general drug food related warnings for given generic drug id.
     * 
     * @param statusMsg
     * @param accountObj
     * @param getDrugFoodInterDSResult
     * @param genDrugId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugFoodInterDS", action = "http://mdtoolboxrx.com/GetDrugFoodInterDS")
    @RequestWrapper(localName = "GetDrugFoodInterDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugFoodInterDS")
    @ResponseWrapper(localName = "GetDrugFoodInterDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugFoodInterDSResponse")
    public void getDrugFoodInterDS(
        @WebParam(name = "GenDrugId", targetNamespace = "http://mdtoolboxrx.com/")
        String genDrugId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugFoodInterDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugFoodInterDSResponse.GetDrugFoodInterDSResult> getDrugFoodInterDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Get Drug Duplicate Therapy class for given unique combo drug id (allowing to give warnings if patient is already taking something similar)
     * 
     * @param statusMsg
     * @param accountObj
     * @param drugId
     * @param getDrugDupTherClassDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugDupTherClassDS", action = "http://mdtoolboxrx.com/GetDrugDupTherClassDS")
    @RequestWrapper(localName = "GetDrugDupTherClassDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugDupTherClassDS")
    @ResponseWrapper(localName = "GetDrugDupTherClassDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugDupTherClassDSResponse")
    public void getDrugDupTherClassDS(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int drugId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugDupTherClassDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugDupTherClassDSResponse.GetDrugDupTherClassDSResult> getDrugDupTherClassDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Get general side effects dataset for the given generic drug id
     * 
     * @param statusMsg
     * @param accountObj
     * @param getDrugSideEffectsDSResult
     * @param drugId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugSideEffectsDS", action = "http://mdtoolboxrx.com/GetDrugSideEffectsDS")
    @RequestWrapper(localName = "GetDrugSideEffectsDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugSideEffectsDS")
    @ResponseWrapper(localName = "GetDrugSideEffectsDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugSideEffectsDSResponse")
    public void getDrugSideEffectsDS(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        String drugId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugSideEffectsDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugSideEffectsDSResponse.GetDrugSideEffectsDSResult> getDrugSideEffectsDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * For given duplicate therapy class get list of drugs (unique drug combos) in the same class
     * 
     * @param statusMsg
     * @param accountObj
     * @param getDrugIdListbyDupTherClassDSResult
     * @param dupTherClassId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugIdListbyDupTherClassDS", action = "http://mdtoolboxrx.com/GetDrugIdListbyDupTherClassDS")
    @RequestWrapper(localName = "GetDrugIdListbyDupTherClassDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugIdListbyDupTherClassDS")
    @ResponseWrapper(localName = "GetDrugIdListbyDupTherClassDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugIdListbyDupTherClassDSResponse")
    public void getDrugIdListbyDupTherClassDS(
        @WebParam(name = "DupTherClassId", targetNamespace = "http://mdtoolboxrx.com/")
        int dupTherClassId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugIdListbyDupTherClassDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugIdListbyDupTherClassDSResponse.GetDrugIdListbyDupTherClassDSResult> getDrugIdListbyDupTherClassDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * For given duplicate therapy class get list of drugs (generic drugs) in the same class
     * 
     * @param statusMsg
     * @param accountObj
     * @param dupTherClassId
     * @param getDrugGenListbyDupTherClassDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugGenListbyDupTherClassDS", action = "http://mdtoolboxrx.com/GetDrugGenListbyDupTherClassDS")
    @RequestWrapper(localName = "GetDrugGenListbyDupTherClassDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugGenListbyDupTherClassDS")
    @ResponseWrapper(localName = "GetDrugGenListbyDupTherClassDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugGenListbyDupTherClassDSResponse")
    public void getDrugGenListbyDupTherClassDS(
        @WebParam(name = "DupTherClassId", targetNamespace = "http://mdtoolboxrx.com/")
        int dupTherClassId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugGenListbyDupTherClassDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugGenListbyDupTherClassDSResponse.GetDrugGenListbyDupTherClassDSResult> getDrugGenListbyDupTherClassDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Immunization Partners: For given vaccine search name and optional manufacturer, return list of vaccines,manufacturers and packaging available for the drug (returns active only)
     * 
     * @param statusMsg
     * @param optionalMVX
     * @param searchName
     * @param accountObj
     * @param getVaccineNDCPackagingDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetVaccineNDCPackagingDS", action = "http://mdtoolboxrx.com/GetVaccineNDCPackagingDS")
    @RequestWrapper(localName = "GetVaccineNDCPackagingDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetVaccineNDCPackagingDS")
    @ResponseWrapper(localName = "GetVaccineNDCPackagingDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetVaccineNDCPackagingDSResponse")
    public void getVaccineNDCPackagingDS(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "OptionalMVX", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalMVX,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetVaccineNDCPackagingDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetVaccineNDCPackagingDSResponse.GetVaccineNDCPackagingDSResult> getVaccineNDCPackagingDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * For given drug product id, return dataset of NDC codes, manufacturers and packaging available for the drug
     * 
     * @param getDrugNDCPackagingDSResult
     * @param statusMsg
     * @param drugProductId
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugNDCPackagingDS", action = "http://mdtoolboxrx.com/GetDrugNDCPackagingDS")
    @RequestWrapper(localName = "GetDrugNDCPackagingDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugNDCPackagingDS")
    @ResponseWrapper(localName = "GetDrugNDCPackagingDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugNDCPackagingDSResponse")
    public void getDrugNDCPackagingDS(
        @WebParam(name = "DrugProductId", targetNamespace = "http://mdtoolboxrx.com/")
        String drugProductId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugNDCPackagingDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugNDCPackagingDSResponse.GetDrugNDCPackagingDSResult> getDrugNDCPackagingDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * For given drug product id, return dataset of  packaging sizes available for the drug. Returns distinct packaging sizes.
     * 
     * @param getDrugNDCPackagingSummaryDSResult
     * @param statusMsg
     * @param drugProductId
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugNDCPackagingSummaryDS", action = "http://mdtoolboxrx.com/GetDrugNDCPackagingSummaryDS")
    @RequestWrapper(localName = "GetDrugNDCPackagingSummaryDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugNDCPackagingSummaryDS")
    @ResponseWrapper(localName = "GetDrugNDCPackagingSummaryDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugNDCPackagingSummaryDSResponse")
    public void getDrugNDCPackagingSummaryDS(
        @WebParam(name = "DrugProductId", targetNamespace = "http://mdtoolboxrx.com/")
        String drugProductId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugNDCPackagingSummaryDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugNDCPackagingSummaryDSResponse.GetDrugNDCPackagingSummaryDSResult> getDrugNDCPackagingSummaryDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * For given drug product id, return dataset of packaging sizes available for the drug. Returns distinct packaging sizes.
     * 
     * @param statusMsg
     * @param accountObj
     * @param getDrugNDCPackagingSummaryByUnqIdDSResult
     * @param drugUnqId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugNDCPackagingSummaryByUnqIdDS", action = "http://mdtoolboxrx.com/GetDrugNDCPackagingSummaryByUnqIdDS")
    @RequestWrapper(localName = "GetDrugNDCPackagingSummaryByUnqIdDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugNDCPackagingSummaryByUnqIdDS")
    @ResponseWrapper(localName = "GetDrugNDCPackagingSummaryByUnqIdDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugNDCPackagingSummaryByUnqIdDSResponse")
    public void getDrugNDCPackagingSummaryByUnqIdDS(
        @WebParam(name = "DrugUnqId", targetNamespace = "http://mdtoolboxrx.com/")
        int drugUnqId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugNDCPackagingSummaryByUnqIdDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugNDCPackagingSummaryByUnqIdDSResponse.GetDrugNDCPackagingSummaryByUnqIdDSResult> getDrugNDCPackagingSummaryByUnqIdDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Get drug information for given drug id - can pass in either Generic Drug Id, Product Drug Id or a Unique Combination Id or the RXNorm CUI code for the drug
     * 
     * @param activeOnly
     * @param unqProductId
     * @param statusMsg
     * @param drugProductId
     * @param accountObj
     * @param drugId
     * @param rxNormCUI
     * @param getDrugDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugDS", action = "http://mdtoolboxrx.com/GetDrugDS")
    @RequestWrapper(localName = "GetDrugDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugDS")
    @ResponseWrapper(localName = "GetDrugDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugDSResponse")
    public void getDrugDS(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        String drugId,
        @WebParam(name = "DrugProductId", targetNamespace = "http://mdtoolboxrx.com/")
        int drugProductId,
        @WebParam(name = "UnqProductId", targetNamespace = "http://mdtoolboxrx.com/")
        int unqProductId,
        @WebParam(name = "RxNorm_CUI", targetNamespace = "http://mdtoolboxrx.com/")
        String rxNormCUI,
        @WebParam(name = "ActiveOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean activeOnly,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugDSResponse.GetDrugDSResult> getDrugDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Get drug information and csa schedule/dea class code for given drug id and doctor/pharm state - can pass in either Generic Drug Id, Product Drug Id or a Unique Combination Id or the RXNorm CUI code for the drug
     * 
     * @param activeOnly
     * @param prescriber2LetterState
     * @param unqProductId
     * @param statusMsg
     * @param drugProductId
     * @param accountObj
     * @param pharmacy2LetterState
     * @param drugId
     * @param getDrugInfoCSADSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugInfoCSADS", action = "http://mdtoolboxrx.com/GetDrugInfoCSADS")
    @RequestWrapper(localName = "GetDrugInfoCSADS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugInfoCSADS")
    @ResponseWrapper(localName = "GetDrugInfoCSADSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugInfoCSADSResponse")
    public void getDrugInfoCSADS(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        String drugId,
        @WebParam(name = "DrugProductId", targetNamespace = "http://mdtoolboxrx.com/")
        int drugProductId,
        @WebParam(name = "UnqProductId", targetNamespace = "http://mdtoolboxrx.com/")
        int unqProductId,
        @WebParam(name = "ActiveOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean activeOnly,
        @WebParam(name = "Prescriber2LetterState", targetNamespace = "http://mdtoolboxrx.com/")
        String prescriber2LetterState,
        @WebParam(name = "Pharmacy2LetterState", targetNamespace = "http://mdtoolboxrx.com/")
        String pharmacy2LetterState,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugInfoCSADSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugInfoCSADSResponse.GetDrugInfoCSADSResult> getDrugInfoCSADSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Get basic drug information for drug based on NDC code
     * 
     * @param activeOnly
     * @param statusMsg
     * @param accountObj
     * @param getDrugByNDCDSResult
     * @param ndc11Code
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugByNDCDS", action = "http://mdtoolboxrx.com/GetDrugByNDCDS")
    @RequestWrapper(localName = "GetDrugByNDCDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugByNDCDS")
    @ResponseWrapper(localName = "GetDrugByNDCDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugByNDCDSResponse")
    public void getDrugByNDCDS(
        @WebParam(name = "NDC11Code", targetNamespace = "http://mdtoolboxrx.com/")
        String ndc11Code,
        @WebParam(name = "ActiveOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean activeOnly,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugByNDCDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugByNDCDSResponse.GetDrugByNDCDSResult> getDrugByNDCDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Get drug information including formulary for given drug id - can pass in either Generic Drug Id, Product Drug Id or a Unique Combination Id or the RXNorm CUI code for the drug
     * 
     * @param activeOnly
     * @param unqProductId
     * @param statusMsg
     * @param optionalPbmId
     * @param drugProductId
     * @param accountObj
     * @param drugId
     * @param rxNormCUI
     * @param optionalFormularyId
     * @param optionalCoverageListId
     * @param getDrugAndFormularyDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugAndFormularyDS", action = "http://mdtoolboxrx.com/GetDrugAndFormularyDS")
    @RequestWrapper(localName = "GetDrugAndFormularyDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugAndFormularyDS")
    @ResponseWrapper(localName = "GetDrugAndFormularyDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugAndFormularyDSResponse")
    public void getDrugAndFormularyDS(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        String drugId,
        @WebParam(name = "DrugProductId", targetNamespace = "http://mdtoolboxrx.com/")
        int drugProductId,
        @WebParam(name = "UnqProductId", targetNamespace = "http://mdtoolboxrx.com/")
        int unqProductId,
        @WebParam(name = "RxNorm_CUI", targetNamespace = "http://mdtoolboxrx.com/")
        String rxNormCUI,
        @WebParam(name = "ActiveOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean activeOnly,
        @WebParam(name = "OptionalPbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalPbmId,
        @WebParam(name = "OptionalFormularyId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalFormularyId,
        @WebParam(name = "OptionalCoverageListId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalCoverageListId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugAndFormularyDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugAndFormularyDSResponse.GetDrugAndFormularyDSResult> getDrugAndFormularyDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners: Get drug supply information including formulary for given supply ndc
     * 
     * @param ndc11
     * @param statusMsg
     * @param optionalPbmId
     * @param getDrugAndFormularySupplyDSResult
     * @param accountObj
     * @param optionalFormularyId
     * @param optionalCoverageListId
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugAndFormularySupplyDS", action = "http://mdtoolboxrx.com/GetDrugAndFormularySupplyDS")
    @RequestWrapper(localName = "GetDrugAndFormularySupplyDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugAndFormularySupplyDS")
    @ResponseWrapper(localName = "GetDrugAndFormularySupplyDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugAndFormularySupplyDSResponse")
    public void getDrugAndFormularySupplyDS(
        @WebParam(name = "NDC11", targetNamespace = "http://mdtoolboxrx.com/")
        String ndc11,
        @WebParam(name = "OptionalPbmId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalPbmId,
        @WebParam(name = "OptionalFormularyId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalFormularyId,
        @WebParam(name = "OptionalCoverageListId", targetNamespace = "http://mdtoolboxrx.com/")
        String optionalCoverageListId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugAndFormularySupplyDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugAndFormularySupplyDSResponse.GetDrugAndFormularySupplyDSResult> getDrugAndFormularySupplyDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return dataset of common prescription frequencies/sigs, e.g. Once a Day.  Returns both abbreviated (BID) and full (Twice a day)
     * 
     * @param getFrequencyDSResult
     * @param statusMsg
     * @param searchName
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "GetFrequencyDS", action = "http://mdtoolboxrx.com/GetFrequencyDS")
    @RequestWrapper(localName = "GetFrequencyDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFrequencyDS")
    @ResponseWrapper(localName = "GetFrequencyDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetFrequencyDSResponse")
    public void getFrequencyDS(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetFrequencyDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetFrequencyDSResponse.GetFrequencyDSResult> getFrequencyDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return dataset of common prescription full directions including dosage and frequency
     * 
     * @param uom
     * @param statusMsg
     * @param searchName
     * @param accountObj
     * @param getDirectionsDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDirectionsDS", action = "http://mdtoolboxrx.com/GetDirectionsDS")
    @RequestWrapper(localName = "GetDirectionsDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDirectionsDS")
    @ResponseWrapper(localName = "GetDirectionsDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDirectionsDSResponse")
    public void getDirectionsDS(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "uom", targetNamespace = "http://mdtoolboxrx.com/")
        String uom,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDirectionsDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDirectionsDSResponse.GetDirectionsDSResult> getDirectionsDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns dataset of medication dispense number quantity unit of measure. EG. Caplets - each is associated with a 2 character code used for Disp# qualifier when routing prescriptions.
     * 
     * @param statusMsg
     * @param accountObj
     * @param getDrugQtyUofMDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetDrugQtyUofMDS", action = "http://mdtoolboxrx.com/GetDrugQtyUofMDS")
    @RequestWrapper(localName = "GetDrugQtyUofMDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugQtyUofMDS")
    @ResponseWrapper(localName = "GetDrugQtyUofMDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetDrugQtyUofMDSResponse")
    public void getDrugQtyUofMDS(
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetDrugQtyUofMDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetDrugQtyUofMDSResponse.GetDrugQtyUofMDSResult> getDrugQtyUofMDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * This routine will return an xml dataset of drugs for the passed in array of ids. The return data should contain one row per passed in ID in the array, if an id is not found it will return a row  that includes MDTB Ids: 000 and a drug description of 'not found'. Drug Id Source should be the source of the drug id - use the source code as found in RxNorm (NDDF, RXNorm, MMX, etc).
     * 
     * @param statusMsg
     * @param convertDrugIdsResult
     * @param accountObj
     * @param drugIdsToConvert
     * @param drugIdSource
     * @param statusFlag
     */
    @WebMethod(operationName = "ConvertDrugIds", action = "http://mdtoolboxrx.com/ConvertDrugIds")
    @RequestWrapper(localName = "ConvertDrugIds", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ConvertDrugIds")
    @ResponseWrapper(localName = "ConvertDrugIdsResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ConvertDrugIdsResponse")
    public void convertDrugIds(
        @WebParam(name = "DrugIdsToConvert", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfString drugIdsToConvert,
        @WebParam(name = "DrugIdSource", targetNamespace = "http://mdtoolboxrx.com/")
        String drugIdSource,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "ConvertDrugIdsResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.ConvertDrugIdsResponse.ConvertDrugIdsResult> convertDrugIdsResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * This routine will return all potential interactions for given Unique Drug Id  and passed in array of patients allergies (allergy ids), current medications (generic med id)  and conditions (condition ids and/or icd9 codes).  Boolean Parameters allow for setting which alerts to return (for turning on and off only  showing certain kinds of alerts.)  The dataset returned will include requested Drug-Drug, Drug-Allergy, Drug-Condition and DupTherapy all  in one table formatted for display to the end-user.
     * 
     * @param allergyIdArray
     * @param icd9CodeArray
     * @param conditionIdArray
     * @param includeDupTherapy
     * @param curMedGenericIdArray
     * @param includeDrugDrug
     * @param getAlertsAllDSResult
     * @param includeDrugCondition
     * @param statusMsg
     * @param accountObj
     * @param drugId
     * @param includeDrugAllergy
     * @param statusFlag
     */
    @WebMethod(operationName = "GetAlertsAllDS", action = "http://mdtoolboxrx.com/GetAlertsAllDS")
    @RequestWrapper(localName = "GetAlertsAllDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAlertsAllDS")
    @ResponseWrapper(localName = "GetAlertsAllDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAlertsAllDSResponse")
    public void getAlertsAllDS(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int drugId,
        @WebParam(name = "AllergyIdArray", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfInt allergyIdArray,
        @WebParam(name = "CurMedGenericIdArray", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfString curMedGenericIdArray,
        @WebParam(name = "ConditionIdArray", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfInt conditionIdArray,
        @WebParam(name = "ICD9CodeArray", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfString icd9CodeArray,
        @WebParam(name = "IncludeDrugAllergy", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeDrugAllergy,
        @WebParam(name = "IncludeDrugDrug", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeDrugDrug,
        @WebParam(name = "IncludeDrugCondition", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeDrugCondition,
        @WebParam(name = "IncludeDupTherapy", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeDupTherapy,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetAlertsAllDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetAlertsAllDSResponse.GetAlertsAllDSResult> getAlertsAllDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return a simple array (xml formatted) list of potiential interaction alerts(all types)
     * 
     * @param allergyIdArray
     * @param icd9CodeArray
     * @param conditionIdArray
     * @param includeDupTherapy
     * @param curMedGenericIdArray
     * @param includeDrugDrug
     * @param getInterAlrtsAllArrResult
     * @param includeDrugCondition
     * @param statusMsg
     * @param accountObj
     * @param drugId
     * @param includeDrugAllergy
     * @param statusFlag
     */
    @WebMethod(operationName = "GetInterAlrtsAllArr", action = "http://mdtoolboxrx.com/GetInterAlrtsAllArr")
    @RequestWrapper(localName = "GetInterAlrtsAllArr", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetInterAlrtsAllArr")
    @ResponseWrapper(localName = "GetInterAlrtsAllArrResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetInterAlrtsAllArrResponse")
    public void getInterAlrtsAllArr(
        @WebParam(name = "DrugId", targetNamespace = "http://mdtoolboxrx.com/")
        int drugId,
        @WebParam(name = "AllergyIdArray", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfInt allergyIdArray,
        @WebParam(name = "CurMedGenericIdArray", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfString curMedGenericIdArray,
        @WebParam(name = "ConditionIdArray", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfInt conditionIdArray,
        @WebParam(name = "ICD9CodeArray", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfString icd9CodeArray,
        @WebParam(name = "IncludeDrugAllergy", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeDrugAllergy,
        @WebParam(name = "IncludeDrugDrug", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeDrugDrug,
        @WebParam(name = "IncludeDrugCondition", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeDrugCondition,
        @WebParam(name = "IncludeDupTherapy", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeDupTherapy,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetInterAlrtsAllArrResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getInterAlrtsAllArrResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return a dataset of pharmacies available for routing to  Pass in pharmacy object with search details and boolean variables for which type of pharmacies to include.
     * 
     * @param activeOnly
     * @param includeTwentyFourHour
     * @param includeSpecialty
     * @param includeLongTerm
     * @param pharmacyObj
     * @param getPharmacyDSResult
     * @param statusMsg
     * @param includeFax
     * @param accountObj
     * @param includeMailOrder
     * @param includeRetail
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPharmacyDS", action = "http://mdtoolboxrx.com/GetPharmacyDS")
    @RequestWrapper(localName = "GetPharmacyDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPharmacyDS")
    @ResponseWrapper(localName = "GetPharmacyDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPharmacyDSResponse")
    public void getPharmacyDS(
        @WebParam(name = "PharmacyObj", targetNamespace = "http://mdtoolboxrx.com/")
        Pharmacy pharmacyObj,
        @WebParam(name = "ActiveOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean activeOnly,
        @WebParam(name = "IncludeRetail", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeRetail,
        @WebParam(name = "IncludeMailOrder", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeMailOrder,
        @WebParam(name = "IncludeFax", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeFax,
        @WebParam(name = "IncludeSpecialty", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeSpecialty,
        @WebParam(name = "IncludeLongTerm", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeLongTerm,
        @WebParam(name = "IncludeTwentyFourHour", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeTwentyFourHour,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPharmacyDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetPharmacyDSResponse.GetPharmacyDSResult> getPharmacyDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return an xml string of pharmacies available for routing to  Pass in pharmacy object with search details and boolean variables for which type of pharmacies to include.
     * 
     * @param activeOnly
     * @param includeTwentyFourHour
     * @param includeSpecialty
     * @param includeLongTerm
     * @param pharmacyObj
     * @param statusMsg
     * @param includeFax
     * @param accountObj
     * @param getPharmacyXMLResult
     * @param includeMailOrder
     * @param includeRetail
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPharmacyXML", action = "http://mdtoolboxrx.com/GetPharmacyXML")
    @RequestWrapper(localName = "GetPharmacyXML", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPharmacyXML")
    @ResponseWrapper(localName = "GetPharmacyXMLResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPharmacyXMLResponse")
    public void getPharmacyXML(
        @WebParam(name = "PharmacyObj", targetNamespace = "http://mdtoolboxrx.com/")
        Pharmacy pharmacyObj,
        @WebParam(name = "ActiveOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean activeOnly,
        @WebParam(name = "IncludeRetail", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeRetail,
        @WebParam(name = "IncludeMailOrder", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeMailOrder,
        @WebParam(name = "IncludeFax", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeFax,
        @WebParam(name = "IncludeSpecialty", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeSpecialty,
        @WebParam(name = "IncludeLongTerm", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeLongTerm,
        @WebParam(name = "IncludeTwentyFourHour", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeTwentyFourHour,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPharmacyXMLResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getPharmacyXMLResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return pharmacy object array of pharmacies available for routing to  Pass in pharmacy object with search details and boolean variables for which type of pharmacies to include.
     * 
     * @param activeOnly
     * @param includeTwentyFourHour
     * @param includeSpecialty
     * @param includeLongTerm
     * @param getPharmacyObjResult
     * @param pharmacyObj
     * @param statusMsg
     * @param includeFax
     * @param accountObj
     * @param includeMailOrder
     * @param includeRetail
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPharmacyObj", action = "http://mdtoolboxrx.com/GetPharmacyObj")
    @RequestWrapper(localName = "GetPharmacyObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPharmacyObj")
    @ResponseWrapper(localName = "GetPharmacyObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPharmacyObjResponse")
    public void getPharmacyObj(
        @WebParam(name = "PharmacyObj", targetNamespace = "http://mdtoolboxrx.com/")
        Pharmacy pharmacyObj,
        @WebParam(name = "ActiveOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean activeOnly,
        @WebParam(name = "IncludeRetail", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeRetail,
        @WebParam(name = "IncludeMailOrder", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeMailOrder,
        @WebParam(name = "IncludeFax", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeFax,
        @WebParam(name = "IncludeSpecialty", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeSpecialty,
        @WebParam(name = "IncludeLongTerm", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeLongTerm,
        @WebParam(name = "IncludeTwentyFourHour", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeTwentyFourHour,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPharmacyObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfPharmacy> getPharmacyObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns obj array of pharmacies including geo info.
     * 
     * @param getPharmacyGeoObjResult
     * @param statusMsg
     * @param accountObj
     * @param searchOrgFields
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPharmacyGeoObj", action = "http://mdtoolboxrx.com/GetPharmacyGeoObj")
    @RequestWrapper(localName = "GetPharmacyGeoObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPharmacyGeoObj")
    @ResponseWrapper(localName = "GetPharmacyGeoObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPharmacyGeoObjResponse")
    public void getPharmacyGeoObj(
        @WebParam(name = "SearchOrgFields", targetNamespace = "http://mdtoolboxrx.com/")
        Organization searchOrgFields,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPharmacyGeoObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfOrganization> getPharmacyGeoObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns obj array of pharmacies including geo info - include type.
     * 
     * @param statusMsg
     * @param getPharmacyGeoWTypeObjResult
     * @param accountObj
     * @param searchOrgFields
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPharmacyGeoWTypeObj", action = "http://mdtoolboxrx.com/GetPharmacyGeoWTypeObj")
    @RequestWrapper(localName = "GetPharmacyGeoWTypeObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPharmacyGeoWTypeObj")
    @ResponseWrapper(localName = "GetPharmacyGeoWTypeObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPharmacyGeoWTypeObjResponse")
    public void getPharmacyGeoWTypeObj(
        @WebParam(name = "SearchOrgFields", targetNamespace = "http://mdtoolboxrx.com/")
        Organization searchOrgFields,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPharmacyGeoWTypeObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfOrganization2> getPharmacyGeoWTypeObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return pharmacy detail object array of pharmacies available for routing to  Pass in pharmacy object with search details and boolean variables for which type of pharmacies to include.
     * 
     * @param activeOnly
     * @param includeTwentyFourHour
     * @param getPharmacyDetailObjResult
     * @param includeSpecialty
     * @param includeLongTerm
     * @param pharmacyObj
     * @param statusMsg
     * @param includeFax
     * @param accountObj
     * @param includeMailOrder
     * @param includeRetail
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPharmacyDetailObj", action = "http://mdtoolboxrx.com/GetPharmacyDetailObj")
    @RequestWrapper(localName = "GetPharmacyDetailObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPharmacyDetailObj")
    @ResponseWrapper(localName = "GetPharmacyDetailObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPharmacyDetailObjResponse")
    public void getPharmacyDetailObj(
        @WebParam(name = "PharmacyObj", targetNamespace = "http://mdtoolboxrx.com/")
        Pharmacy pharmacyObj,
        @WebParam(name = "ActiveOnly", targetNamespace = "http://mdtoolboxrx.com/")
        boolean activeOnly,
        @WebParam(name = "IncludeRetail", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeRetail,
        @WebParam(name = "IncludeMailOrder", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeMailOrder,
        @WebParam(name = "IncludeFax", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeFax,
        @WebParam(name = "IncludeSpecialty", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeSpecialty,
        @WebParam(name = "IncludeLongTerm", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeLongTerm,
        @WebParam(name = "IncludeTwentyFourHour", targetNamespace = "http://mdtoolboxrx.com/")
        boolean includeTwentyFourHour,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPharmacyDetailObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfPharmacyDetail> getPharmacyDetailObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return allergy dataset for given search term.
     * 
     * @param getAllergyDSResult
     * @param statusMsg
     * @param searchName
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "GetAllergyDS", action = "http://mdtoolboxrx.com/GetAllergyDS")
    @RequestWrapper(localName = "GetAllergyDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergyDS")
    @ResponseWrapper(localName = "GetAllergyDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergyDSResponse")
    public void getAllergyDS(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetAllergyDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetAllergyDSResponse.GetAllergyDSResult> getAllergyDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return allergy dataset for given search term.
     * 
     * @param getAllergywPagingResult
     * @param statusMsg
     * @param searchName
     * @param accountObj
     * @param pageSize
     * @param returnPageNumber
     * @param statusFlag
     */
    @WebMethod(operationName = "GetAllergywPaging", action = "http://mdtoolboxrx.com/GetAllergywPaging")
    @RequestWrapper(localName = "GetAllergywPaging", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergywPaging")
    @ResponseWrapper(localName = "GetAllergywPagingResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergywPagingResponse")
    public void getAllergywPaging(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "PageSize", targetNamespace = "http://mdtoolboxrx.com/")
        int pageSize,
        @WebParam(name = "ReturnPageNumber", targetNamespace = "http://mdtoolboxrx.com/")
        int returnPageNumber,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetAllergywPagingResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetAllergywPagingResponse.GetAllergywPagingResult> getAllergywPagingResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return allergy dataset for given search term.
     * 
     * @param statusMsg
     * @param getAllergyObjResult
     * @param searchName
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "GetAllergyObj", action = "http://mdtoolboxrx.com/GetAllergyObj")
    @RequestWrapper(localName = "GetAllergyObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergyObj")
    @ResponseWrapper(localName = "GetAllergyObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergyObjResponse")
    public void getAllergyObj(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetAllergyObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfAllergyRecord> getAllergyObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return allergy rxnorm code for allergyid.
     * 
     * @param statusMsg
     * @param allergyid
     * @param accountObj
     * @param getAllergyRxNormResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetAllergyRxNorm", action = "http://mdtoolboxrx.com/GetAllergyRxNorm")
    @RequestWrapper(localName = "GetAllergyRxNorm", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergyRxNorm")
    @ResponseWrapper(localName = "GetAllergyRxNormResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergyRxNormResponse")
    public void getAllergyRxNorm(
        @WebParam(name = "allergyid", targetNamespace = "http://mdtoolboxrx.com/")
        int allergyid,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetAllergyRxNormResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getAllergyRxNormResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return allergy rxnorm code for allergyid.
     * 
     * @param statusMsg
     * @param getAllergyIdResult
     * @param accountObj
     * @param rxNorm
     * @param allergyName
     * @param statusFlag
     */
    @WebMethod(operationName = "GetAllergyId", action = "http://mdtoolboxrx.com/GetAllergyId")
    @RequestWrapper(localName = "GetAllergyId", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergyId")
    @ResponseWrapper(localName = "GetAllergyIdResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergyIdResponse")
    public void getAllergyId(
        @WebParam(name = "RxNorm", targetNamespace = "http://mdtoolboxrx.com/")
        String rxNorm,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetAllergyIdResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Integer> getAllergyIdResult,
        @WebParam(name = "AllergyName", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> allergyName,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return dataset of conditions/diseases and matching condition ids and  icd9 codes for given search term (search can be conditional name/desc or an ICD9 code/partial code/SnoMed code)
     * 
     * @param getConditionDSResult
     * @param statusMsg
     * @param searchName
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "GetConditionDS", action = "http://mdtoolboxrx.com/GetConditionDS")
    @RequestWrapper(localName = "GetConditionDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetConditionDS")
    @ResponseWrapper(localName = "GetConditionDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetConditionDSResponse")
    public void getConditionDS(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetConditionDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetConditionDSResponse.GetConditionDSResult> getConditionDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return object array of conditions/diseases and matching condition ids and  icd9 codes for given search term (search can be conditional name/desc or an ICD9 code/partial code/SnoMed code)
     * 
     * @param statusMsg
     * @param searchName
     * @param accountObj
     * @param getConditionObjResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetConditionObj", action = "http://mdtoolboxrx.com/GetConditionObj")
    @RequestWrapper(localName = "GetConditionObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetConditionObj")
    @ResponseWrapper(localName = "GetConditionObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetConditionObjResponse")
    public void getConditionObj(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetConditionObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfConditionRecord> getConditionObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return dataset of conditions/diseases and matching condition ids and  SnoMed codes for given search term (search can be conditional name/desc or an SnoMed code/partial code)
     * 
     * @param getConditionSnoMedDSResult
     * @param statusMsg
     * @param searchName
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "GetConditionSnoMedDS", action = "http://mdtoolboxrx.com/GetConditionSnoMedDS")
    @RequestWrapper(localName = "GetConditionSnoMedDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetConditionSnoMedDS")
    @ResponseWrapper(localName = "GetConditionSnoMedDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetConditionSnoMedDSResponse")
    public void getConditionSnoMedDS(
        @WebParam(name = "SearchName", targetNamespace = "http://mdtoolboxrx.com/")
        String searchName,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetConditionSnoMedDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetConditionSnoMedDSResponse.GetConditionSnoMedDSResult> getConditionSnoMedDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * RETIRED-DO NOT USE-Used to Return a snomed code and term for given passed in ICD code
     * 
     * @param getConditionSnoMedCodeResult
     * @param statusMsg
     * @param accountObj
     * @param icdCode
     * @param snoMedTerm
     * @param statusFlag
     */
    @WebMethod(operationName = "GetConditionSnoMedCode", action = "http://mdtoolboxrx.com/GetConditionSnoMedCode")
    @RequestWrapper(localName = "GetConditionSnoMedCode", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetConditionSnoMedCode")
    @ResponseWrapper(localName = "GetConditionSnoMedCodeResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetConditionSnoMedCodeResponse")
    public void getConditionSnoMedCode(
        @WebParam(name = "ICDCode", targetNamespace = "http://mdtoolboxrx.com/")
        String icdCode,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetConditionSnoMedCodeResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getConditionSnoMedCodeResult,
        @WebParam(name = "SnoMedTerm", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> snoMedTerm,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WS Partners: Return dataset of new/unanswered Pharmacy Refill Requests to display to users.
     * 
     * @param prescriberId
     * @param getRefillRequestsDSResult
     * @param statusMsg
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "GetRefillRequestsDS", action = "http://mdtoolboxrx.com/GetRefillRequestsDS")
    @RequestWrapper(localName = "GetRefillRequestsDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillRequestsDS")
    @ResponseWrapper(localName = "GetRefillRequestsDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillRequestsDSResponse")
    public void getRefillRequestsDS(
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfString prescriberId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetRefillRequestsDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetRefillRequestsDSResponse.GetRefillRequestsDSResult> getRefillRequestsDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WS Partners: Return dataset of new/unanswered Pharmacy Change Requests to display to users.
     * 
     * @param prescriberId
     * @param statusMsg
     * @param accountObj
     * @param getRxChangeRequestsDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetRxChangeRequestsDS", action = "http://mdtoolboxrx.com/GetRxChangeRequestsDS")
    @RequestWrapper(localName = "GetRxChangeRequestsDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRxChangeRequestsDS")
    @ResponseWrapper(localName = "GetRxChangeRequestsDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRxChangeRequestsDSResponse")
    public void getRxChangeRequestsDS(
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfString prescriberId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetRxChangeRequestsDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetRxChangeRequestsDSResponse.GetRxChangeRequestsDSResult> getRxChangeRequestsDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return dataset of Pharmacy Refill Requests per date and status (answered/not answered).
     * 
     * @param prescriberId
     * @param reqStatus
     * @param getRefillRequestsAllDSResult
     * @param statusMsg
     * @param endDate
     * @param accountObj
     * @param startDate
     * @param statusFlag
     */
    @WebMethod(operationName = "GetRefillRequestsAllDS", action = "http://mdtoolboxrx.com/GetRefillRequestsAllDS")
    @RequestWrapper(localName = "GetRefillRequestsAllDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillRequestsAllDS")
    @ResponseWrapper(localName = "GetRefillRequestsAllDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillRequestsAllDSResponse")
    public void getRefillRequestsAllDS(
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfString prescriberId,
        @WebParam(name = "ReqStatus", targetNamespace = "http://mdtoolboxrx.com/")
        RXRefillReqStatus reqStatus,
        @WebParam(name = "StartDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar endDate,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetRefillRequestsAllDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetRefillRequestsAllDSResponse.GetRefillRequestsAllDSResult> getRefillRequestsAllDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return object array of Pharmacy Refill Requests per date and status (answered/not answered).
     * 
     * @param prescriberId
     * @param reqStatus
     * @param statusMsg
     * @param endDate
     * @param getRefillRequestsAllObjResult
     * @param accountObj
     * @param startDate
     * @param statusFlag
     */
    @WebMethod(operationName = "GetRefillRequestsAllObj", action = "http://mdtoolboxrx.com/GetRefillRequestsAllObj")
    @RequestWrapper(localName = "GetRefillRequestsAllObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillRequestsAllObj")
    @ResponseWrapper(localName = "GetRefillRequestsAllObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillRequestsAllObjResponse")
    public void getRefillRequestsAllObj(
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfString prescriberId,
        @WebParam(name = "ReqStatus", targetNamespace = "http://mdtoolboxrx.com/")
        RXRefillReqStatus reqStatus,
        @WebParam(name = "StartDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar endDate,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetRefillRequestsAllObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfRefillRequestRecord> getRefillRequestsAllObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return a count of new/unanswered Pharmacy Refill Requests to display to users.
     * 
     * @param prescriberId
     * @param statusMsg
     * @param accountObj
     * @param getRefillRequestsCountResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetRefillRequestsCount", action = "http://mdtoolboxrx.com/GetRefillRequestsCount")
    @RequestWrapper(localName = "GetRefillRequestsCount", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillRequestsCount")
    @ResponseWrapper(localName = "GetRefillRequestsCountResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillRequestsCountResponse")
    public void getRefillRequestsCount(
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfString prescriberId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetRefillRequestsCountResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Integer> getRefillRequestsCountResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WS Partners: Return dataset with refill details including XML of requested refill
     * 
     * @param statusMsg
     * @param accountObj
     * @param refillRequestId
     * @param getRefillRequestDetailDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetRefillRequestDetailDS", action = "http://mdtoolboxrx.com/GetRefillRequestDetailDS")
    @RequestWrapper(localName = "GetRefillRequestDetailDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillRequestDetailDS")
    @ResponseWrapper(localName = "GetRefillRequestDetailDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillRequestDetailDSResponse")
    public void getRefillRequestDetailDS(
        @WebParam(name = "RefillRequestId", targetNamespace = "http://mdtoolboxrx.com/")
        int refillRequestId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetRefillRequestDetailDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetRefillRequestDetailDSResponse.GetRefillRequestDetailDSResult> getRefillRequestDetailDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WS Partners: Return dataset with Change details including XML of requested Change
     * 
     * @param changeRequestId
     * @param statusMsg
     * @param accountObj
     * @param getChangeRequestDetailDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetChangeRequestDetailDS", action = "http://mdtoolboxrx.com/GetChangeRequestDetailDS")
    @RequestWrapper(localName = "GetChangeRequestDetailDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetChangeRequestDetailDS")
    @ResponseWrapper(localName = "GetChangeRequestDetailDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetChangeRequestDetailDSResponse")
    public void getChangeRequestDetailDS(
        @WebParam(name = "ChangeRequestId", targetNamespace = "http://mdtoolboxrx.com/")
        int changeRequestId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetChangeRequestDetailDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetChangeRequestDetailDSResponse.GetChangeRequestDetailDSResult> getChangeRequestDetailDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return dataset with refill details per given message id from pharmacy
     * 
     * @param refReqMessageId
     * @param statusMsg
     * @param accountObj
     * @param getRefillRequestbyMsgIdResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetRefillRequestbyMsgId", action = "http://mdtoolboxrx.com/GetRefillRequestbyMsgId")
    @RequestWrapper(localName = "GetRefillRequestbyMsgId", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillRequestbyMsgId")
    @ResponseWrapper(localName = "GetRefillRequestbyMsgIdResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillRequestbyMsgIdResponse")
    public void getRefillRequestbyMsgId(
        @WebParam(name = "RefReqMessageId", targetNamespace = "http://mdtoolboxrx.com/")
        String refReqMessageId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetRefillRequestbyMsgIdResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetRefillRequestbyMsgIdResponse.GetRefillRequestbyMsgIdResult> getRefillRequestbyMsgIdResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WS Partners: Return dataset of Refill Response Denial Reason Codes for responding to refill requests from your screens.
     * 
     * @param statusMsg
     * @param getRefillResponseDenialCodesDSResult
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "GetRefillResponseDenialCodesDS", action = "http://mdtoolboxrx.com/GetRefillResponseDenialCodesDS")
    @RequestWrapper(localName = "GetRefillResponseDenialCodesDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillResponseDenialCodesDS")
    @ResponseWrapper(localName = "GetRefillResponseDenialCodesDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRefillResponseDenialCodesDSResponse")
    public void getRefillResponseDenialCodesDS(
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetRefillResponseDenialCodesDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetRefillResponseDenialCodesDSResponse.GetRefillResponseDenialCodesDSResult> getRefillResponseDenialCodesDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WS Partners:Return dataset of Patient Prescription Benefit Eligibility - For Web Service Backend Partners.  Pass in Patient to check and prescriber who is doing the check.  Note: Eligibility can only be checked once per Patient Encounter and not more than 3 days before the encounter.
     * 
     * @param patientObj
     * @param getPatientEligibilityDSResult
     * @param prescriberObj
     * @param statusMsg
     * @param accountObj
     * @param dateOfService
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPatientEligibilityDS", action = "http://mdtoolboxrx.com/GetPatientEligibilityDS")
    @RequestWrapper(localName = "GetPatientEligibilityDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientEligibilityDS")
    @ResponseWrapper(localName = "GetPatientEligibilityDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientEligibilityDSResponse")
    public void getPatientEligibilityDS(
        @WebParam(name = "PatientObj", targetNamespace = "http://mdtoolboxrx.com/")
        Patient patientObj,
        @WebParam(name = "PrescriberObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescriber prescriberObj,
        @WebParam(name = "DateOfService", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar dateOfService,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPatientEligibilityDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetPatientEligibilityDSResponse.GetPatientEligibilityDSResult> getPatientEligibilityDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WS Partners:Return xml string of Patient Prescription Benefit Eligibility - For Web Service Backend Partners.  Pass in Patient to check and prescriber who is doing the check.  Note: Eligibility can only be checked once per Patient Encounter and not more than 3 days before the encounter.
     * 
     * @param patientObj
     * @param prescriberObj
     * @param statusMsg
     * @param accountObj
     * @param getPatientEligibilityXMLResult
     * @param dateOfService
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPatientEligibilityXML", action = "http://mdtoolboxrx.com/GetPatientEligibilityXML")
    @RequestWrapper(localName = "GetPatientEligibilityXML", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientEligibilityXML")
    @ResponseWrapper(localName = "GetPatientEligibilityXMLResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientEligibilityXMLResponse")
    public void getPatientEligibilityXML(
        @WebParam(name = "PatientObj", targetNamespace = "http://mdtoolboxrx.com/")
        Patient patientObj,
        @WebParam(name = "PrescriberObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescriber prescriberObj,
        @WebParam(name = "DateOfService", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar dateOfService,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPatientEligibilityXMLResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getPatientEligibilityXMLResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WS Partners:Return object array of Patient Prescription Benefit Eligibility - For Web Service Backend Partners.  Pass in Patient to check and prescriber who is doing the check.  Note: Eligibility can only be checked once per Patient Encounter and not more than 3 days before the encounter.
     * 
     * @param patientObj
     * @param prescriberObj
     * @param statusMsg
     * @param accountObj
     * @param getPatientEligibilityObjResult
     * @param dateOfService
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPatientEligibilityObj", action = "http://mdtoolboxrx.com/GetPatientEligibilityObj")
    @RequestWrapper(localName = "GetPatientEligibilityObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientEligibilityObj")
    @ResponseWrapper(localName = "GetPatientEligibilityObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientEligibilityObjResponse")
    public void getPatientEligibilityObj(
        @WebParam(name = "PatientObj", targetNamespace = "http://mdtoolboxrx.com/")
        Patient patientObj,
        @WebParam(name = "PrescriberObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescriber prescriberObj,
        @WebParam(name = "DateOfService", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar dateOfService,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPatientEligibilityObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfPatientEligibility> getPatientEligibilityObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return dataset of Patient Prescription Benefit Eligibility on file from any previous Eligibility Checks (within 3 days).This method will not send a new Eligibility Request to the PBMs, it will only return any valid eligibility data from previous checks (data is only good for 3 days).
     * 
     * @param patientObj
     * @param statusMsg
     * @param accountObj
     * @param getPatientEligibilityOnFileDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPatientEligibilityOnFileDS", action = "http://mdtoolboxrx.com/GetPatientEligibilityOnFileDS")
    @RequestWrapper(localName = "GetPatientEligibilityOnFileDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientEligibilityOnFileDS")
    @ResponseWrapper(localName = "GetPatientEligibilityOnFileDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientEligibilityOnFileDSResponse")
    public void getPatientEligibilityOnFileDS(
        @WebParam(name = "PatientObj", targetNamespace = "http://mdtoolboxrx.com/")
        Patient patientObj,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPatientEligibilityOnFileDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetPatientEligibilityOnFileDSResponse.GetPatientEligibilityOnFileDSResult> getPatientEligibilityOnFileDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return XML String of Patient Prescription Benefit Eligibility on file from any previous Eligibility Checks (within 3 days).This method will not send a new Eligibility Request to the PBMs, it will only return any valid eligibility data from previous checks (data is only good for 3 days).
     * 
     * @param patientObj
     * @param statusMsg
     * @param accountObj
     * @param getPatientEligibilityOnFileXMLResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPatientEligibilityOnFileXML", action = "http://mdtoolboxrx.com/GetPatientEligibilityOnFileXML")
    @RequestWrapper(localName = "GetPatientEligibilityOnFileXML", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientEligibilityOnFileXML")
    @ResponseWrapper(localName = "GetPatientEligibilityOnFileXMLResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientEligibilityOnFileXMLResponse")
    public void getPatientEligibilityOnFileXML(
        @WebParam(name = "PatientObj", targetNamespace = "http://mdtoolboxrx.com/")
        Patient patientObj,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPatientEligibilityOnFileXMLResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getPatientEligibilityOnFileXMLResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Return dataset of Patient RX History per passed in Eligibity or Pharmacy info.  Pass date range (optional) to get history for that date otherwise will return all hx avail.  WhichElig param should be 0=All Types (Fill & PBMs), 1=Pharmacy fill data only, or specific #### for just one elig id to use.  This data comes from Pharmacies and/or PBM payers per which elig parameter.
     * 
     * @param whichElig
     * @param patientObj
     * @param beginDate
     * @param prescriberObj
     * @param statusMsg
     * @param accountObj
     * @param getPatientRxHistoryRequestDSResult
     * @param consent
     * @param thruDate
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPatientRxHistoryRequestDS", action = "http://mdtoolboxrx.com/GetPatientRxHistoryRequestDS")
    @RequestWrapper(localName = "GetPatientRxHistoryRequestDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientRxHistoryRequestDS")
    @ResponseWrapper(localName = "GetPatientRxHistoryRequestDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientRxHistoryRequestDSResponse")
    public void getPatientRxHistoryRequestDS(
        @WebParam(name = "PatientObj", targetNamespace = "http://mdtoolboxrx.com/")
        Patient patientObj,
        @WebParam(name = "PrescriberObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescriber prescriberObj,
        @WebParam(name = "Consent", targetNamespace = "http://mdtoolboxrx.com/")
        String consent,
        @WebParam(name = "BeginDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar beginDate,
        @WebParam(name = "ThruDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar thruDate,
        @WebParam(name = "WhichElig", targetNamespace = "http://mdtoolboxrx.com/")
        int whichElig,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPatientRxHistoryRequestDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetPatientRxHistoryRequestDSResponse.GetPatientRxHistoryRequestDSResult> getPatientRxHistoryRequestDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Return object array of Patient RX History per passed in Eligibity or Pharmacy info.  Pass date range (optional) to get history for that date otherwise will return all hx avail.  WhichElig param should be 0=All Types (Fill & PBMs), 1=Pharmacy fill data only, or specific #### for just one elig id to use.  This data comes from Pharmacies and/or PBM payers per which elig parameter.
     * 
     * @param whichElig
     * @param patientObj
     * @param beginDate
     * @param prescriberObj
     * @param getPatientRxHistoryRequestObjResult
     * @param statusMsg
     * @param accountObj
     * @param consent
     * @param thruDate
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPatientRxHistoryRequestObj", action = "http://mdtoolboxrx.com/GetPatientRxHistoryRequestObj")
    @RequestWrapper(localName = "GetPatientRxHistoryRequestObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientRxHistoryRequestObj")
    @ResponseWrapper(localName = "GetPatientRxHistoryRequestObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientRxHistoryRequestObjResponse")
    public void getPatientRxHistoryRequestObj(
        @WebParam(name = "PatientObj", targetNamespace = "http://mdtoolboxrx.com/")
        Patient patientObj,
        @WebParam(name = "PrescriberObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescriber prescriberObj,
        @WebParam(name = "Consent", targetNamespace = "http://mdtoolboxrx.com/")
        String consent,
        @WebParam(name = "BeginDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar beginDate,
        @WebParam(name = "ThruDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar thruDate,
        @WebParam(name = "WhichElig", targetNamespace = "http://mdtoolboxrx.com/")
        int whichElig,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPatientRxHistoryRequestObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfHistoryQuery> getPatientRxHistoryRequestObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners: Check Provider For Surescripts Services:  Per given SPI (unique prescriber-location-id)
     * 
     * @param checkPrescriberRegistrationResult
     * @param uniqueSPI
     * @param statusMsg
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "CheckPrescriberRegistration", action = "http://mdtoolboxrx.com/CheckPrescriberRegistration")
    @RequestWrapper(localName = "CheckPrescriberRegistration", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.CheckPrescriberRegistration")
    @ResponseWrapper(localName = "CheckPrescriberRegistrationResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.CheckPrescriberRegistrationResponse")
    public void checkPrescriberRegistration(
        @WebParam(name = "UniqueSPI", targetNamespace = "http://mdtoolboxrx.com/")
        String uniqueSPI,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "CheckPrescriberRegistrationResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> checkPrescriberRegistrationResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners: Check Provider For Surescripts Services: Pass in unique id for prescriber and location
     * 
     * @param prescriberId
     * @param statusMsg
     * @param locationId
     * @param accountObj
     * @param checkPrescriberRegistrationPerIdResult
     * @param statusFlag
     */
    @WebMethod(operationName = "CheckPrescriberRegistrationPerId", action = "http://mdtoolboxrx.com/CheckPrescriberRegistrationPerId")
    @RequestWrapper(localName = "CheckPrescriberRegistrationPerId", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.CheckPrescriberRegistrationPerId")
    @ResponseWrapper(localName = "CheckPrescriberRegistrationPerIdResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.CheckPrescriberRegistrationPerIdResponse")
    public void checkPrescriberRegistrationPerId(
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        String prescriberId,
        @WebParam(name = "LocationId", targetNamespace = "http://mdtoolboxrx.com/")
        String locationId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "CheckPrescriberRegistrationPerIdResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> checkPrescriberRegistrationPerIdResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Check if user is active, has token or access control permissions for give username/practice
     * 
     * @param userPermissionLevel
     * @param canSignSend
     * @param canApprove
     * @param statusMsg
     * @param hasActiveToken
     * @param accountObj
     * @param isAccessControlManager
     * @param userName
     * @param loginStatus
     * @param statusFlag
     */
    @WebMethod(operationName = "CheckUserRegistration", action = "http://mdtoolboxrx.com/CheckUserRegistration")
    @RequestWrapper(localName = "CheckUserRegistration", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.CheckUserRegistration")
    @ResponseWrapper(localName = "CheckUserRegistrationResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.CheckUserRegistrationResponse")
    public void checkUserRegistration(
        @WebParam(name = "UserName", targetNamespace = "http://mdtoolboxrx.com/")
        String userName,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "LoginStatus", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Integer> loginStatus,
        @WebParam(name = "UserPermissionLevel", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Integer> userPermissionLevel,
        @WebParam(name = "HasActiveToken", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Boolean> hasActiveToken,
        @WebParam(name = "CanApprove", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Boolean> canApprove,
        @WebParam(name = "CanSignSend", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Boolean> canSignSend,
        @WebParam(name = "IsAccessControlManager", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Boolean> isAccessControlManager,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners: Register a Doctor for Surescripts Services (not needed if using screens or using auto registration)
     * 
     * @param prescriberObj
     * @param statusMsg
     * @param accountObj
     * @param registerFor
     * @param registerPrescriberResult
     * @param statusFlag
     */
    @WebMethod(operationName = "RegisterPrescriber", action = "http://mdtoolboxrx.com/RegisterPrescriber")
    @RequestWrapper(localName = "RegisterPrescriber", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.RegisterPrescriber")
    @ResponseWrapper(localName = "RegisterPrescriberResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.RegisterPrescriberResponse")
    public void registerPrescriber(
        @WebParam(name = "PrescriberObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescriber prescriberObj,
        @WebParam(name = "RegisterFor", targetNamespace = "http://mdtoolboxrx.com/")
        SurescriptsServices registerFor,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "RegisterPrescriberResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Boolean> registerPrescriberResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Electronical Send a Response to Pharmacy for a received Refill Request (for Web Service Back end partners only). Pass the RefillRequestId of the Request being responded to (as received from GetRefillRequestsDS Method call)
     * 
     * @param denyReasonCode
     * @param numRefillsAppr
     * @param statusMsg
     * @param refResp
     * @param accountObj
     * @param refillRequestId
     * @param optRefNote
     * @param eSendRefillReqResponseResult
     * @param statusFlag
     */
    @WebMethod(action = "http://mdtoolboxrx.com/eSendRefillReqResponse")
    @RequestWrapper(localName = "eSendRefillReqResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendRefillReqResponse")
    @ResponseWrapper(localName = "eSendRefillReqResponseResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendRefillReqResponseResponse")
    public void eSendRefillReqResponse(
        @WebParam(name = "RefillRequestId", targetNamespace = "http://mdtoolboxrx.com/")
        int refillRequestId,
        @WebParam(name = "RefResp", targetNamespace = "http://mdtoolboxrx.com/")
        RXRefillResponse refResp,
        @WebParam(name = "OptRefNote", targetNamespace = "http://mdtoolboxrx.com/")
        String optRefNote,
        @WebParam(name = "NumRefillsAppr", targetNamespace = "http://mdtoolboxrx.com/")
        int numRefillsAppr,
        @WebParam(name = "DenyReasonCode", targetNamespace = "http://mdtoolboxrx.com/")
        String denyReasonCode,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "eSendRefillReqResponseResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> eSendRefillReqResponseResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Electronical Send a Response to Pharmacy for a received Change Request (for Web Service Back end partners only). Pass the ChangeRequestId of the Request being responded to (as received from GetChangeRequestsDS Method call)
     * 
     * @param changeRequestId
     * @param denyCode
     * @param sig
     * @param note
     * @param paNum
     * @param eSendRxChangeResponseResult
     * @param statusMsg
     * @param resp
     * @param accountObj
     * @param approvedMed
     * @param statusFlag
     */
    @WebMethod(action = "http://mdtoolboxrx.com/eSendRxChangeResponse")
    @RequestWrapper(localName = "eSendRxChangeResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendRxChangeResponse")
    @ResponseWrapper(localName = "eSendRxChangeResponseResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendRxChangeResponseResponse")
    public void eSendRxChangeResponse(
        @WebParam(name = "ChangeRequestId", targetNamespace = "http://mdtoolboxrx.com/")
        int changeRequestId,
        @WebParam(name = "Resp", targetNamespace = "http://mdtoolboxrx.com/")
        RXChangeResponse resp,
        @WebParam(name = "Note", targetNamespace = "http://mdtoolboxrx.com/")
        String note,
        @WebParam(name = "DenyCode", targetNamespace = "http://mdtoolboxrx.com/")
        String denyCode,
        @WebParam(name = "PANum", targetNamespace = "http://mdtoolboxrx.com/")
        String paNum,
        @WebParam(name = "ApprovedMed", targetNamespace = "http://mdtoolboxrx.com/")
        Prescription approvedMed,
        @WebParam(name = "Sig", targetNamespace = "http://mdtoolboxrx.com/")
        String sig,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "eSendRxChangeResponseResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> eSendRxChangeResponseResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Electronical Send a Response to Pharmacy for a received Change Request (include primarydiag) (for Web Service Back end partners only). Pass the ChangeRequestId of the Request being responded to (as received from GetChangeRequestsDS Method call)
     * 
     * @param changeRequestId
     * @param denyCode
     * @param sig
     * @param note
     * @param paNum
     * @param diag
     * @param statusMsg
     * @param resp
     * @param accountObj
     * @param approvedMed
     * @param eSendRxChangeResponseWDiagResult
     * @param statusFlag
     */
    @WebMethod(action = "http://mdtoolboxrx.com/eSendRxChangeResponseWDiag")
    @RequestWrapper(localName = "eSendRxChangeResponseWDiag", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendRxChangeResponseWDiag")
    @ResponseWrapper(localName = "eSendRxChangeResponseWDiagResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendRxChangeResponseWDiagResponse")
    public void eSendRxChangeResponseWDiag(
        @WebParam(name = "ChangeRequestId", targetNamespace = "http://mdtoolboxrx.com/")
        int changeRequestId,
        @WebParam(name = "Resp", targetNamespace = "http://mdtoolboxrx.com/")
        RXChangeResponse resp,
        @WebParam(name = "Note", targetNamespace = "http://mdtoolboxrx.com/")
        String note,
        @WebParam(name = "DenyCode", targetNamespace = "http://mdtoolboxrx.com/")
        String denyCode,
        @WebParam(name = "PANum", targetNamespace = "http://mdtoolboxrx.com/")
        String paNum,
        @WebParam(name = "ApprovedMed", targetNamespace = "http://mdtoolboxrx.com/")
        Prescription approvedMed,
        @WebParam(name = "Sig", targetNamespace = "http://mdtoolboxrx.com/")
        String sig,
        @WebParam(name = "Diag", targetNamespace = "http://mdtoolboxrx.com/")
        String diag,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "eSendRxChangeResponseWDiagResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> eSendRxChangeResponseWDiagResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns count of esend and refill request reponse message alerts (errors) that have occurred since the last request for alerts
     * 
     * @param statusMsg
     * @param accountObj
     * @param getNewMessageAlertsCountResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetNewMessageAlertsCount", action = "http://mdtoolboxrx.com/GetNewMessageAlertsCount")
    @RequestWrapper(localName = "GetNewMessageAlertsCount", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetNewMessageAlertsCount")
    @ResponseWrapper(localName = "GetNewMessageAlertsCountResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetNewMessageAlertsCountResponse")
    public void getNewMessageAlertsCount(
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetNewMessageAlertsCountResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Integer> getNewMessageAlertsCountResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns an xml dataset of esend and refill request reponse message alerts (errors) that have occurred since the last request for alerts  Method will return alerts on file and then mark all alerts as complete/recieved so next call will not get the same alert.
     * 
     * @param statusMsg
     * @param accountObj
     * @param getNewMessageAlertsResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetNewMessageAlerts", action = "http://mdtoolboxrx.com/GetNewMessageAlerts")
    @RequestWrapper(localName = "GetNewMessageAlerts", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetNewMessageAlerts")
    @ResponseWrapper(localName = "GetNewMessageAlertsResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetNewMessageAlertsResponse")
    public void getNewMessageAlerts(
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetNewMessageAlertsResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetNewMessageAlertsResponse.GetNewMessageAlertsResult> getNewMessageAlertsResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns an xml string of esend and refill request reponse message alerts (errors) that have occurred since the last request for alerts  Method will return alerts on file and then mark all alerts as complete/recieved (if flag set) so next call will not get the same alert.
     * 
     * @param statusMsg
     * @param accountObj
     * @param markNewComplete
     * @param getNewMessageAlertsXMLResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetNewMessageAlertsXML", action = "http://mdtoolboxrx.com/GetNewMessageAlertsXML")
    @RequestWrapper(localName = "GetNewMessageAlertsXML", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetNewMessageAlertsXML")
    @ResponseWrapper(localName = "GetNewMessageAlertsXMLResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetNewMessageAlertsXMLResponse")
    public void getNewMessageAlertsXML(
        @WebParam(name = "MarkNewComplete", targetNamespace = "http://mdtoolboxrx.com/")
        boolean markNewComplete,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetNewMessageAlertsXMLResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getNewMessageAlertsXMLResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns an array of Alerts of esend and refill request reponse message alerts (errors) that have occurred since the last request for alerts  Method will return alerts on file and then mark all alerts as complete/recieved (if flag set) so next call will not get the same alert.
     * 
     * @param statusMsg
     * @param accountObj
     * @param getNewMessageAlertsObjResult
     * @param markNewComplete
     * @param statusFlag
     */
    @WebMethod(operationName = "GetNewMessageAlertsObj", action = "http://mdtoolboxrx.com/GetNewMessageAlertsObj")
    @RequestWrapper(localName = "GetNewMessageAlertsObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetNewMessageAlertsObj")
    @ResponseWrapper(localName = "GetNewMessageAlertsObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetNewMessageAlertsObjResponse")
    public void getNewMessageAlertsObj(
        @WebParam(name = "MarkNewComplete", targetNamespace = "http://mdtoolboxrx.com/")
        boolean markNewComplete,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetNewMessageAlertsObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfAlert> getNewMessageAlertsObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Update the given error alert as complete/received
     * 
     * @param statusMsg
     * @param accountObj
     * @param alertId
     * @param updateErrorMessageAlertCompleteResult
     * @param statusFlag
     */
    @WebMethod(operationName = "UpdateErrorMessageAlertComplete", action = "http://mdtoolboxrx.com/UpdateErrorMessageAlertComplete")
    @RequestWrapper(localName = "UpdateErrorMessageAlertComplete", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.UpdateErrorMessageAlertComplete")
    @ResponseWrapper(localName = "UpdateErrorMessageAlertCompleteResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.UpdateErrorMessageAlertCompleteResponse")
    public void updateErrorMessageAlertComplete(
        @WebParam(name = "AlertId", targetNamespace = "http://mdtoolboxrx.com/")
        String alertId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "UpdateErrorMessageAlertCompleteResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> updateErrorMessageAlertCompleteResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns an xml dataset of esend and refill request reponse message alerts (errors) that have not been marked completed/recieved yet
     * 
     * @param getErrorMessageAlertsDSResult
     * @param statusMsg
     * @param providerId
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "GetErrorMessageAlertsDS", action = "http://mdtoolboxrx.com/GetErrorMessageAlertsDS")
    @RequestWrapper(localName = "GetErrorMessageAlertsDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetErrorMessageAlertsDS")
    @ResponseWrapper(localName = "GetErrorMessageAlertsDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetErrorMessageAlertsDSResponse")
    public void getErrorMessageAlertsDS(
        @WebParam(name = "ProviderId", targetNamespace = "http://mdtoolboxrx.com/")
        String providerId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetErrorMessageAlertsDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetErrorMessageAlertsDSResponse.GetErrorMessageAlertsDSResult> getErrorMessageAlertsDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Returns number of esend and refill request reponse message alerts (errors) that have not been marked completed/recieved yet
     * 
     * @param statusMsg
     * @param providerId
     * @param accountObj
     * @param getErrorMessageAlertsCountResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetErrorMessageAlertsCount", action = "http://mdtoolboxrx.com/GetErrorMessageAlertsCount")
    @RequestWrapper(localName = "GetErrorMessageAlertsCount", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetErrorMessageAlertsCount")
    @ResponseWrapper(localName = "GetErrorMessageAlertsCountResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetErrorMessageAlertsCountResponse")
    public void getErrorMessageAlertsCount(
        @WebParam(name = "ProviderId", targetNamespace = "http://mdtoolboxrx.com/")
        String providerId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetErrorMessageAlertsCountResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Integer> getErrorMessageAlertsCountResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Check the status of a e-send newrx message that was previously sent to a Pharmacy
     * 
     * @param statusMsg
     * @param accountObj
     * @param messageId
     * @param geteSendMessageStatusResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GeteSendMessageStatus", action = "http://mdtoolboxrx.com/GeteSendMessageStatus")
    @RequestWrapper(localName = "GeteSendMessageStatus", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GeteSendMessageStatus")
    @ResponseWrapper(localName = "GeteSendMessageStatusResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GeteSendMessageStatusResponse")
    public void geteSendMessageStatus(
        @WebParam(name = "MessageId", targetNamespace = "http://mdtoolboxrx.com/")
        String messageId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GeteSendMessageStatusResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> geteSendMessageStatusResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Check the status of a e-send refill response message that was previously sent to a Pharmacy
     * 
     * @param statusMsg
     * @param accountObj
     * @param messageId
     * @param geteSendRefillMessageStatusResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GeteSendRefillMessageStatus", action = "http://mdtoolboxrx.com/GeteSendRefillMessageStatus")
    @RequestWrapper(localName = "GeteSendRefillMessageStatus", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GeteSendRefillMessageStatus")
    @ResponseWrapper(localName = "GeteSendRefillMessageStatusResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GeteSendRefillMessageStatusResponse")
    public void geteSendRefillMessageStatus(
        @WebParam(name = "MessageId", targetNamespace = "http://mdtoolboxrx.com/")
        String messageId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GeteSendRefillMessageStatusResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> geteSendRefillMessageStatusResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Electronically Send/Route a Prescription to a Pharmacy.  For use from WebService Backend Integration Partners (not available to screen integration partners who use MDToolbox screens to write and send rxs.)
     * 
     * @param patientObj
     * @param wentByFax
     * @param prescriberObj
     * @param statusMsg
     * @param prescriptionObj
     * @param accountObj
     * @param routeStatusFlag
     * @param autoRegisterPrescriber
     * @param eSendNewRxResult
     * @param statusFlag
     */
    @WebMethod(action = "http://mdtoolboxrx.com/eSendNewRx")
    @RequestWrapper(localName = "eSendNewRx", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendNewRx")
    @ResponseWrapper(localName = "eSendNewRxResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendNewRxResponse")
    public void eSendNewRx(
        @WebParam(name = "PrescriberObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescriber prescriberObj,
        @WebParam(name = "PatientObj", targetNamespace = "http://mdtoolboxrx.com/")
        Patient patientObj,
        @WebParam(name = "PrescriptionObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescription prescriptionObj,
        @WebParam(name = "AutoRegisterPrescriber", targetNamespace = "http://mdtoolboxrx.com/")
        boolean autoRegisterPrescriber,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "eSendNewRxResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> eSendNewRxResult,
        @WebParam(name = "RouteStatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<RXRouteStatus> routeStatusFlag,
        @WebParam(name = "WentByFax", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Boolean> wentByFax,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Electronically Send/Route a Prescription to a Pharmacy (including Primary Diagnosis ICD).  For use from WebService Backend Integration Partners (not available to screen integration partners who use MDToolbox screens to write and send rxs.)
     * 
     * @param patientObj
     * @param wentByFax
     * @param prescriberObj
     * @param statusMsg
     * @param prescriptionObj
     * @param accountObj
     * @param routeStatusFlag
     * @param primaryDiagICD
     * @param eSendNewRxWDiagResult
     * @param autoRegisterPrescriber
     * @param statusFlag
     */
    @WebMethod(action = "http://mdtoolboxrx.com/eSendNewRxWDiag")
    @RequestWrapper(localName = "eSendNewRxWDiag", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendNewRxWDiag")
    @ResponseWrapper(localName = "eSendNewRxWDiagResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendNewRxWDiagResponse")
    public void eSendNewRxWDiag(
        @WebParam(name = "PrescriberObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescriber prescriberObj,
        @WebParam(name = "PatientObj", targetNamespace = "http://mdtoolboxrx.com/")
        Patient patientObj,
        @WebParam(name = "PrescriptionObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescription prescriptionObj,
        @WebParam(name = "PrimaryDiagICD", targetNamespace = "http://mdtoolboxrx.com/")
        String primaryDiagICD,
        @WebParam(name = "AutoRegisterPrescriber", targetNamespace = "http://mdtoolboxrx.com/")
        boolean autoRegisterPrescriber,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "eSendNewRxWDiagResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> eSendNewRxWDiagResult,
        @WebParam(name = "RouteStatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<RXRouteStatus> routeStatusFlag,
        @WebParam(name = "WentByFax", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Boolean> wentByFax,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Electronically Send/Route a Prescription to a Pharmacy (include Supervisor).  For use from WebService Backend Integration Partners (not available to screen integration partners who use MDToolbox screens to write and send rxs.)
     * 
     * @param patientObj
     * @param wentByFax
     * @param prescriberObj
     * @param statusMsg
     * @param prescriptionObj
     * @param accountObj
     * @param routeStatusFlag
     * @param supervisorObj
     * @param autoRegisterPrescriber
     * @param eSendNewRxWSpvResult
     * @param statusFlag
     */
    @WebMethod(action = "http://mdtoolboxrx.com/eSendNewRxWSpv")
    @RequestWrapper(localName = "eSendNewRxWSpv", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendNewRxWSpv")
    @ResponseWrapper(localName = "eSendNewRxWSpvResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendNewRxWSpvResponse")
    public void eSendNewRxWSpv(
        @WebParam(name = "PrescriberObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescriber prescriberObj,
        @WebParam(name = "SupervisorObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescriber supervisorObj,
        @WebParam(name = "PatientObj", targetNamespace = "http://mdtoolboxrx.com/")
        Patient patientObj,
        @WebParam(name = "PrescriptionObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescription prescriptionObj,
        @WebParam(name = "AutoRegisterPrescriber", targetNamespace = "http://mdtoolboxrx.com/")
        boolean autoRegisterPrescriber,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "eSendNewRxWSpvResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> eSendNewRxWSpvResult,
        @WebParam(name = "RouteStatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<RXRouteStatus> routeStatusFlag,
        @WebParam(name = "WentByFax", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Boolean> wentByFax,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WSPartners:Electronically Send a CANCEL Message to the pharmacy for a previously e-Sent NewRx)
     * 
     * @param newRxMessageId
     * @param eSendCancelRxResult
     * @param statusMsg
     * @param accountObj
     * @param routeStatusFlag
     * @param statusFlag
     */
    @WebMethod(action = "http://mdtoolboxrx.com/eSendCancelRx")
    @RequestWrapper(localName = "eSendCancelRx", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendCancelRx")
    @ResponseWrapper(localName = "eSendCancelRxResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.ESendCancelRxResponse")
    public void eSendCancelRx(
        @WebParam(name = "NewRxMessageId", targetNamespace = "http://mdtoolboxrx.com/")
        String newRxMessageId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "eSendCancelRxResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> eSendCancelRxResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "RouteStatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<RXRouteStatus> routeStatusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * WS Partners: For back end integration partners (not using MDToolbox screens) - If using PBM formulary information both eSends and Print numbers must be reported to the PBMs for statistics. Use this routine each time a prescription is manually printed out of your system so the statistics are correct.
     * 
     * @param patientObj
     * @param updatePrintedResult
     * @param prescriberObj
     * @param statusMsg
     * @param prescriptionObj
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "UpdatePrinted", action = "http://mdtoolboxrx.com/UpdatePrinted")
    @RequestWrapper(localName = "UpdatePrinted", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.UpdatePrinted")
    @ResponseWrapper(localName = "UpdatePrintedResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.UpdatePrintedResponse")
    public void updatePrinted(
        @WebParam(name = "PrescriberObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescriber prescriberObj,
        @WebParam(name = "PatientObj", targetNamespace = "http://mdtoolboxrx.com/")
        Patient patientObj,
        @WebParam(name = "PrescriptionObj", targetNamespace = "http://mdtoolboxrx.com/")
        Prescription prescriptionObj,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "UpdatePrintedResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> updatePrintedResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing: Upload data for screen sharing.  Returns authentication key to be able to open the MDToolbox screens bypassing login.
     * 
     * @param patientConditions
     * @param patientCurrentVitals
     * @param patientMedications
     * @param patientObj
     * @param eligCheckPrescriber
     * @param eligCheckEncounterDate
     * @param statusMsg
     * @param accountObj
     * @param updateDataForScreensResult
     * @param checkPatEligibility
     * @param locations
     * @param patientAllergies
     * @param prescribers
     * @param statusFlag
     */
    @WebMethod(operationName = "UpdateDataForScreens", action = "http://mdtoolboxrx.com/UpdateDataForScreens")
    @RequestWrapper(localName = "UpdateDataForScreens", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.UpdateDataForScreens")
    @ResponseWrapper(localName = "UpdateDataForScreensResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.UpdateDataForScreensResponse")
    public void updateDataForScreens(
        @WebParam(name = "Prescribers", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfPrescriber prescribers,
        @WebParam(name = "Locations", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfLocation locations,
        @WebParam(name = "PatientObj", targetNamespace = "http://mdtoolboxrx.com/")
        Patient patientObj,
        @WebParam(name = "PatientMedications", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfMedicationRecord patientMedications,
        @WebParam(name = "PatientAllergies", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfAllergyRecord patientAllergies,
        @WebParam(name = "PatientConditions", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfConditionRecord patientConditions,
        @WebParam(name = "PatientCurrentVitals", targetNamespace = "http://mdtoolboxrx.com/")
        VitalRecord patientCurrentVitals,
        @WebParam(name = "CheckPatEligibility", targetNamespace = "http://mdtoolboxrx.com/")
        boolean checkPatEligibility,
        @WebParam(name = "EligCheckEncounterDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar eligCheckEncounterDate,
        @WebParam(name = "EligCheckPrescriber", targetNamespace = "http://mdtoolboxrx.com/")
        Prescriber eligCheckPrescriber,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "UpdateDataForScreensResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> updateDataForScreensResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing:Return dataset of Patients Prescriptions on file at MDTB-RX (used when doing screen integration-for keeping rx local copy in sync)
     * 
     * @param statusMsg
     * @param patientId
     * @param accountObj
     * @param getPrescriptionsForPatientResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPrescriptionsForPatient", action = "http://mdtoolboxrx.com/GetPrescriptionsForPatient")
    @RequestWrapper(localName = "GetPrescriptionsForPatient", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionsForPatient")
    @ResponseWrapper(localName = "GetPrescriptionsForPatientResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionsForPatientResponse")
    public void getPrescriptionsForPatient(
        @WebParam(name = "PatientId", targetNamespace = "http://mdtoolboxrx.com/")
        String patientId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPrescriptionsForPatientResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetPrescriptionsForPatientResponse.GetPrescriptionsForPatientResult> getPrescriptionsForPatientResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return string formatted XML of Patients Prescriptions on file at MDTB-RX (used when doing screen integration-for keeping rx local copy in sync)
     * 
     * @param statusMsg
     * @param patientId
     * @param accountObj
     * @param getPrescriptionsForPatientXMLResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPrescriptionsForPatientXML", action = "http://mdtoolboxrx.com/GetPrescriptionsForPatientXML")
    @RequestWrapper(localName = "GetPrescriptionsForPatientXML", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionsForPatientXML")
    @ResponseWrapper(localName = "GetPrescriptionsForPatientXMLResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionsForPatientXMLResponse")
    public void getPrescriptionsForPatientXML(
        @WebParam(name = "PatientId", targetNamespace = "http://mdtoolboxrx.com/")
        String patientId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPrescriptionsForPatientXMLResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getPrescriptionsForPatientXMLResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return array of Medication Record Object - Patients Prescriptions on file at MDTB-RX (used when doing screen integration-for keeping rx local copy in sync)
     * 
     * @param getPrescriptionsForPatientObjResult
     * @param statusMsg
     * @param patientId
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPrescriptionsForPatientObj", action = "http://mdtoolboxrx.com/GetPrescriptionsForPatientObj")
    @RequestWrapper(localName = "GetPrescriptionsForPatientObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionsForPatientObj")
    @ResponseWrapper(localName = "GetPrescriptionsForPatientObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionsForPatientObjResponse")
    public void getPrescriptionsForPatientObj(
        @WebParam(name = "PatientId", targetNamespace = "http://mdtoolboxrx.com/")
        String patientId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPrescriptionsForPatientObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfMedicationRecord> getPrescriptionsForPatientObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return pharmacy(s) that are saved as patients favorites/preferred
     * 
     * @param getPatientPharmFavsResult
     * @param statusMsg
     * @param patientId
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPatientPharmFavs", action = "http://mdtoolboxrx.com/GetPatientPharmFavs")
    @RequestWrapper(localName = "GetPatientPharmFavs", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientPharmFavs")
    @ResponseWrapper(localName = "GetPatientPharmFavsResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPatientPharmFavsResponse")
    public void getPatientPharmFavs(
        @WebParam(name = "PatientId", targetNamespace = "http://mdtoolboxrx.com/")
        String patientId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPatientPharmFavsResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfPharmacy> getPatientPharmFavsResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing:Return dataset of Patients Allergies on file at MDTB-RX
     * 
     * @param statusMsg
     * @param patientId
     * @param accountObj
     * @param getAllergiesForPatientResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetAllergiesForPatient", action = "http://mdtoolboxrx.com/GetAllergiesForPatient")
    @RequestWrapper(localName = "GetAllergiesForPatient", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergiesForPatient")
    @ResponseWrapper(localName = "GetAllergiesForPatientResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergiesForPatientResponse")
    public void getAllergiesForPatient(
        @WebParam(name = "PatientId", targetNamespace = "http://mdtoolboxrx.com/")
        String patientId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetAllergiesForPatientResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetAllergiesForPatientResponse.GetAllergiesForPatientResult> getAllergiesForPatientResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing:Return object array of Patients Allergies on file at MDTB-RX
     * 
     * @param statusMsg
     * @param patientId
     * @param accountObj
     * @param getAllergiesForPatientObjResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetAllergiesForPatientObj", action = "http://mdtoolboxrx.com/GetAllergiesForPatientObj")
    @RequestWrapper(localName = "GetAllergiesForPatientObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergiesForPatientObj")
    @ResponseWrapper(localName = "GetAllergiesForPatientObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetAllergiesForPatientObjResponse")
    public void getAllergiesForPatientObj(
        @WebParam(name = "PatientId", targetNamespace = "http://mdtoolboxrx.com/")
        String patientId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetAllergiesForPatientObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfAllergyRecord> getAllergiesForPatientObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing:Return dataset of Patients Conditions on file at MDTB-RX
     * 
     * @param statusMsg
     * @param patientId
     * @param accountObj
     * @param getConditionsForPatientDSResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetConditionsForPatientDS", action = "http://mdtoolboxrx.com/GetConditionsForPatientDS")
    @RequestWrapper(localName = "GetConditionsForPatientDS", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetConditionsForPatientDS")
    @ResponseWrapper(localName = "GetConditionsForPatientDSResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetConditionsForPatientDSResponse")
    public void getConditionsForPatientDS(
        @WebParam(name = "PatientId", targetNamespace = "http://mdtoolboxrx.com/")
        String patientId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetConditionsForPatientDSResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetConditionsForPatientDSResponse.GetConditionsForPatientDSResult> getConditionsForPatientDSResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing:Return object array of Patients Conditions on file at MDTB-RX
     * 
     * @param statusMsg
     * @param patientId
     * @param accountObj
     * @param getConditionsForPatientObjResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetConditionsForPatientObj", action = "http://mdtoolboxrx.com/GetConditionsForPatientObj")
    @RequestWrapper(localName = "GetConditionsForPatientObj", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetConditionsForPatientObj")
    @ResponseWrapper(localName = "GetConditionsForPatientObjResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetConditionsForPatientObjResponse")
    public void getConditionsForPatientObj(
        @WebParam(name = "PatientId", targetNamespace = "http://mdtoolboxrx.com/")
        String patientId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetConditionsForPatientObjResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfConditionRecord> getConditionsForPatientObjResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Get a list of allowed suffix/credentials that can be sent for prescriber
     * 
     * @param statusMsg
     * @param accountObj
     * @param getPrescriberAllowedSuffixStrResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPrescriberAllowedSuffixStr", action = "http://mdtoolboxrx.com/GetPrescriberAllowedSuffixStr")
    @RequestWrapper(localName = "GetPrescriberAllowedSuffixStr", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriberAllowedSuffixStr")
    @ResponseWrapper(localName = "GetPrescriberAllowedSuffixStrResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriberAllowedSuffixStrResponse")
    public void getPrescriberAllowedSuffixStr(
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPrescriberAllowedSuffixStrResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getPrescriberAllowedSuffixStrResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing:Return dataset of Prescriptions on file at MDTB-RX for a particular prescriber and date range (used when doing screen integration-for keeping rx local copy in sync)
     * 
     * @param prescriberId
     * @param statusMsg
     * @param endDate
     * @param accountObj
     * @param startDate
     * @param getPrescriptionsByPrescriberResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPrescriptionsByPrescriber", action = "http://mdtoolboxrx.com/GetPrescriptionsByPrescriber")
    @RequestWrapper(localName = "GetPrescriptionsByPrescriber", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionsByPrescriber")
    @ResponseWrapper(localName = "GetPrescriptionsByPrescriberResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionsByPrescriberResponse")
    public void getPrescriptionsByPrescriber(
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        String prescriberId,
        @WebParam(name = "StartDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar endDate,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPrescriptionsByPrescriberResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetPrescriptionsByPrescriberResponse.GetPrescriptionsByPrescriberResult> getPrescriptionsByPrescriberResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing:Return dataset of Prescriptions on file at MDTB-RX for a particular prescriber and date range (detail version)
     * 
     * @param prescriberId
     * @param statusMsg
     * @param endDate
     * @param accountObj
     * @param getPrescriptionsByPrescriberDetailResult
     * @param startDate
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPrescriptionsByPrescriberDetail", action = "http://mdtoolboxrx.com/GetPrescriptionsByPrescriberDetail")
    @RequestWrapper(localName = "GetPrescriptionsByPrescriberDetail", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionsByPrescriberDetail")
    @ResponseWrapper(localName = "GetPrescriptionsByPrescriberDetailResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionsByPrescriberDetailResponse")
    public void getPrescriptionsByPrescriberDetail(
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        String prescriberId,
        @WebParam(name = "StartDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar endDate,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPrescriptionsByPrescriberDetailResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetPrescriptionsByPrescriberDetailResponse.GetPrescriptionsByPrescriberDetailResult> getPrescriptionsByPrescriberDetailResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing:Return dataset of all vitals recorded in date range
     * 
     * @param getVitalListingReportResult
     * @param statusMsg
     * @param endDate
     * @param accountObj
     * @param startDate
     * @param statusFlag
     */
    @WebMethod(operationName = "GetVitalListingReport", action = "http://mdtoolboxrx.com/GetVitalListingReport")
    @RequestWrapper(localName = "GetVitalListingReport", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetVitalListingReport")
    @ResponseWrapper(localName = "GetVitalListingReportResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetVitalListingReportResponse")
    public void getVitalListingReport(
        @WebParam(name = "StartDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar endDate,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetVitalListingReportResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetVitalListingReportResponse.GetVitalListingReportResult> getVitalListingReportResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing:Return dataset of patients who have pending prescriptions (not esent or printed yet) per given prescriber id
     * 
     * @param prescriberId
     * @param statusMsg
     * @param accountObj
     * @param getRxPendingSummaryResult
     * @param statusFlag
     */
    @WebMethod(operationName = "GetRxPendingSummary", action = "http://mdtoolboxrx.com/GetRxPendingSummary")
    @RequestWrapper(localName = "GetRxPendingSummary", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRxPendingSummary")
    @ResponseWrapper(localName = "GetRxPendingSummaryResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetRxPendingSummaryResponse")
    public void getRxPendingSummary(
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        String prescriberId,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetRxPendingSummaryResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetRxPendingSummaryResponse.GetRxPendingSummaryResult> getRxPendingSummaryResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return dataset of route history.  Transtype=0 All, 1 NewRx, 2 RefReq.   TransStatus=0 All, 1 Success, 2 Error
     * 
     * @param prescriberId
     * @param transType
     * @param statusMsg
     * @param endDate
     * @param accountObj
     * @param getPrescriptionRouteHistoryResult
     * @param startDate
     * @param transStatus
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPrescriptionRouteHistory", action = "http://mdtoolboxrx.com/GetPrescriptionRouteHistory")
    @RequestWrapper(localName = "GetPrescriptionRouteHistory", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionRouteHistory")
    @ResponseWrapper(localName = "GetPrescriptionRouteHistoryResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionRouteHistoryResponse")
    public void getPrescriptionRouteHistory(
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        String prescriberId,
        @WebParam(name = "StartDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar endDate,
        @WebParam(name = "TransType", targetNamespace = "http://mdtoolboxrx.com/")
        String transType,
        @WebParam(name = "TransStatus", targetNamespace = "http://mdtoolboxrx.com/")
        String transStatus,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPrescriptionRouteHistoryResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetPrescriptionRouteHistoryResponse.GetPrescriptionRouteHistoryResult> getPrescriptionRouteHistoryResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * Return dataset of route history.  Transtype=0 All, 1 NewRx, 2 RefReq.   TransStatus=0 All, 1 Success, 2 Error
     * 
     * @param prescriberId
     * @param transType
     * @param statusMsg
     * @param endDate
     * @param accountObj
     * @param getPrescriptionRouteHistoryXMLResult
     * @param startDate
     * @param transStatus
     * @param statusFlag
     */
    @WebMethod(operationName = "GetPrescriptionRouteHistoryXML", action = "http://mdtoolboxrx.com/GetPrescriptionRouteHistoryXML")
    @RequestWrapper(localName = "GetPrescriptionRouteHistoryXML", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionRouteHistoryXML")
    @ResponseWrapper(localName = "GetPrescriptionRouteHistoryXMLResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetPrescriptionRouteHistoryXMLResponse")
    public void getPrescriptionRouteHistoryXML(
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        String prescriberId,
        @WebParam(name = "StartDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar endDate,
        @WebParam(name = "TransType", targetNamespace = "http://mdtoolboxrx.com/")
        String transType,
        @WebParam(name = "TransStatus", targetNamespace = "http://mdtoolboxrx.com/")
        String transStatus,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetPrescriptionRouteHistoryXMLResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> getPrescriptionRouteHistoryXMLResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing:Return dataset of rx totals/meaningful use numerator data
     * 
     * @param prescriberId
     * @param statusMsg
     * @param endDate
     * @param accountObj
     * @param getMUDataResult
     * @param startDate
     * @param statusFlag
     */
    @WebMethod(operationName = "GetMUData", action = "http://mdtoolboxrx.com/GetMUData")
    @RequestWrapper(localName = "GetMUData", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetMUData")
    @ResponseWrapper(localName = "GetMUDataResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.GetMUDataResponse")
    public void getMUData(
        @WebParam(name = "PrescriberId", targetNamespace = "http://mdtoolboxrx.com/")
        String prescriberId,
        @WebParam(name = "StartDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://mdtoolboxrx.com/")
        Calendar endDate,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "GetMUDataResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<com.mdtoolboxrx.GetMUDataResponse.GetMUDataResult> getMUDataResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing: Upload patient vital history for your patient.
     * 
     * @param statusMsg
     * @param patientId
     * @param updateDataPatientVitalsResult
     * @param accountObj
     * @param patientVitals
     * @param statusFlag
     */
    @WebMethod(operationName = "UpdateDataPatientVitals", action = "http://mdtoolboxrx.com/UpdateDataPatientVitals")
    @RequestWrapper(localName = "UpdateDataPatientVitals", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.UpdateDataPatientVitals")
    @ResponseWrapper(localName = "UpdateDataPatientVitalsResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.UpdateDataPatientVitalsResponse")
    public void updateDataPatientVitals(
        @WebParam(name = "PatientId", targetNamespace = "http://mdtoolboxrx.com/")
        String patientId,
        @WebParam(name = "PatientVitals", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfVitalRecord patientVitals,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "UpdateDataPatientVitalsResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> updateDataPatientVitalsResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing: Upload prescriber favorite list.
     * 
     * @param statusMsg
     * @param updatePrescriberFavsResult
     * @param favs
     * @param accountObj
     * @param statusFlag
     */
    @WebMethod(operationName = "UpdatePrescriberFavs", action = "http://mdtoolboxrx.com/UpdatePrescriberFavs")
    @RequestWrapper(localName = "UpdatePrescriberFavs", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.UpdatePrescriberFavs")
    @ResponseWrapper(localName = "UpdatePrescriberFavsResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.UpdatePrescriberFavsResponse")
    public void updatePrescriberFavs(
        @WebParam(name = "Favs", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfMedicationRecord favs,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "UpdatePrescriberFavsResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Integer> updatePrescriberFavsResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

    /**
     * ScreenSharing: Upload prescriber favorite list - return array of ids.
     * 
     * @param statusMsg
     * @param favs
     * @param accountObj
     * @param updatePrescriberFavRetIdsResult
     * @param statusFlag
     */
    @WebMethod(operationName = "UpdatePrescriberFavRetIds", action = "http://mdtoolboxrx.com/UpdatePrescriberFavRetIds")
    @RequestWrapper(localName = "UpdatePrescriberFavRetIds", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.UpdatePrescriberFavRetIds")
    @ResponseWrapper(localName = "UpdatePrescriberFavRetIdsResponse", targetNamespace = "http://mdtoolboxrx.com/", className = "com.mdtoolboxrx.UpdatePrescriberFavRetIdsResponse")
    public void updatePrescriberFavRetIds(
        @WebParam(name = "Favs", targetNamespace = "http://mdtoolboxrx.com/")
        ArrayOfMedicationRecord favs,
        @WebParam(name = "AccountObj", targetNamespace = "http://mdtoolboxrx.com/")
        Account accountObj,
        @WebParam(name = "UpdatePrescriberFavRetIdsResult", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfInt> updatePrescriberFavRetIdsResult,
        @WebParam(name = "StatusFlag", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<Status> statusFlag,
        @WebParam(name = "StatusMsg", targetNamespace = "http://mdtoolboxrx.com/", mode = WebParam.Mode.OUT)
        Holder<String> statusMsg);

}
