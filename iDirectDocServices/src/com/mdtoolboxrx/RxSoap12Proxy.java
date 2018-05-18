package com.mdtoolboxrx;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;
import java.util.Calendar;
import javax.xml.ws.Holder;

public class RxSoap12Proxy{

    protected Descriptor _descriptor;

    public class Descriptor {
        private com.mdtoolboxrx.Rx _service = null;
        private com.mdtoolboxrx.RxSoap _proxy = null;
        private Dispatch<Source> _dispatch = null;
        private boolean _useJNDIOnly = false;

        public Descriptor() {
            init();
        }

        public Descriptor(URL wsdlLocation, QName serviceName) {
            _service = new com.mdtoolboxrx.Rx(wsdlLocation, serviceName);
            initCommon();
        }

        public void init() {
            _service = null;
            _proxy = null;
            _dispatch = null;
            try
            {
                InitialContext ctx = new InitialContext();
                _service = (com.mdtoolboxrx.Rx)ctx.lookup("java:comp/env/service/rx");
            }
            catch (NamingException e)
            {
                if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
                    System.out.println("JNDI lookup failure: javax.naming.NamingException: " + e.getMessage());
                    e.printStackTrace(System.out);
                }
            }

            if (_service == null && !_useJNDIOnly)
                _service = new com.mdtoolboxrx.Rx();
            initCommon();
        }

        private void initCommon() {
            _proxy = _service.getRxSoap12();
        }

        public com.mdtoolboxrx.RxSoap getProxy() {
            return _proxy;
        }

        public void useJNDIOnly(boolean useJNDIOnly) {
            _useJNDIOnly = useJNDIOnly;
            init();
        }

        public Dispatch<Source> getDispatch() {
            if (_dispatch == null ) {
                QName portQName = new QName("", "rxSoap12");
                _dispatch = _service.createDispatch(portQName, Source.class, Service.Mode.MESSAGE);

                String proxyEndpointUrl = getEndpoint();
                BindingProvider bp = (BindingProvider) _dispatch;
                String dispatchEndpointUrl = (String) bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
                if (!dispatchEndpointUrl.equals(proxyEndpointUrl))
                    bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, proxyEndpointUrl);
            }
            return _dispatch;
        }

        public String getEndpoint() {
            BindingProvider bp = (BindingProvider) _proxy;
            return (String) bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
        }

        public void setEndpoint(String endpointUrl) {
            BindingProvider bp = (BindingProvider) _proxy;
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);

            if (_dispatch != null ) {
                bp = (BindingProvider) _dispatch;
                bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);
            }
        }

        public void setMTOMEnabled(boolean enable) {
            SOAPBinding binding = (SOAPBinding) ((BindingProvider) _proxy).getBinding();
            binding.setMTOMEnabled(enable);
        }
    }

    public RxSoap12Proxy() {
        _descriptor = new Descriptor();
        _descriptor.setMTOMEnabled(false);
    }

    public RxSoap12Proxy(URL wsdlLocation, QName serviceName) {
        _descriptor = new Descriptor(wsdlLocation, serviceName);
        _descriptor.setMTOMEnabled(false);
    }

    public Descriptor _getDescriptor() {
        return _descriptor;
    }

    public void hieRegisterOrganization(Organization organizationObj, int hieServiceLevel, Account accountObj, Holder<String> hieRegisterOrganizationResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().hieRegisterOrganization(organizationObj,hieServiceLevel,accountObj,hieRegisterOrganizationResult,statusFlag,statusMsg);
    }

    public void hieRegisterProvider(Prescriber providerObj, String regDirectMailUserName, SurescriptsServices registerForRx, Account accountObj, Holder<String> hieRegisterProviderResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().hieRegisterProvider(providerObj,regDirectMailUserName,registerForRx,accountObj,hieRegisterProviderResult,statusFlag,statusMsg);
    }

    public void hieGetDirectoryDS(Organization searchOrgFields, boolean includeProviders, boolean includeOrganizations, boolean includePharmacies, Account accountObj, Holder<com.mdtoolboxrx.HIEGetDirectoryDSResponse.HIEGetDirectoryDSResult> hieGetDirectoryDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().hieGetDirectoryDS(searchOrgFields,includeProviders,includeOrganizations,includePharmacies,accountObj,hieGetDirectoryDSResult,statusFlag,statusMsg);
    }

    public void hieGetDirectoryObj(Organization searchOrgFields, boolean includeProviders, boolean includeOrganizations, boolean includePharmacies, Account accountObj, Holder<ArrayOfOrganization> hieGetDirectoryObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().hieGetDirectoryObj(searchOrgFields,includeProviders,includeOrganizations,includePharmacies,accountObj,hieGetDirectoryObjResult,statusFlag,statusMsg);
    }

    public void hieGetMessagesDS(String directAddress, int inboxOrOutbox, Calendar startDate, Calendar endDate, Account accountObj, Holder<com.mdtoolboxrx.HIEGetMessagesDSResponse.HIEGetMessagesDSResult> hieGetMessagesDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().hieGetMessagesDS(directAddress,inboxOrOutbox,startDate,endDate,accountObj,hieGetMessagesDSResult,statusFlag,statusMsg);
    }

    public void hieGetMessagesArrayDS(ArrayOfString directAddress, int inboxOrOutbox, Calendar startDate, Calendar endDate, Account accountObj, Holder<com.mdtoolboxrx.HIEGetMessagesArrayDSResponse.HIEGetMessagesArrayDSResult> hieGetMessagesArrayDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().hieGetMessagesArrayDS(directAddress,inboxOrOutbox,startDate,endDate,accountObj,hieGetMessagesArrayDSResult,statusFlag,statusMsg);
    }

    public void hieUpdateMsgStatus(int messageId, boolean complete, Account accountObj, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().hieUpdateMsgStatus(messageId,complete,accountObj,statusFlag,statusMsg);
    }

    public void hieGetMessagesObj(String directAddress, int inboxOrOutbox, Calendar startDate, Calendar endDate, Account accountObj, Holder<ArrayOfHIEMessage> hieGetMessagesObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().hieGetMessagesObj(directAddress,inboxOrOutbox,startDate,endDate,accountObj,hieGetMessagesObjResult,statusFlag,statusMsg);
    }

    public void hieGetMessagesUTCObj(String directAddress, int inboxOrOutbox, Calendar startDate, Calendar endDate, Account accountObj, Holder<ArrayOfHIEMessage> hieGetMessagesUTCObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().hieGetMessagesUTCObj(directAddress,inboxOrOutbox,startDate,endDate,accountObj,hieGetMessagesUTCObjResult,statusFlag,statusMsg);
    }

    public void hieGetMessageDetail(int messageId, Account accountObj, Holder<HIEMessage> hieGetMessageDetailResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().hieGetMessageDetail(messageId,accountObj,hieGetMessageDetailResult,statusFlag,statusMsg);
    }

    public void hiEeSendMessage(HIEMessage clinicalMessage, Account accountObj, Holder<String> hiEeSendMessageResult, Holder<HIERouteStatus> routeStatusFlag, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().hiEeSendMessage(clinicalMessage,accountObj,hiEeSendMessageResult,routeStatusFlag,statusFlag,statusMsg);
    }

    public String webServiceTest(Account accountObj) {
        return _getDescriptor().getProxy().webServiceTest(accountObj);
    }

    public void getDrugListDS(String searchName, SearchLike beginsContains, SearchType searchFlag, NameType nameFlag, RXType rxFlag, SearchName searchNameFields, int prescriberId, boolean activeOnly, String optionalPbmId, String optionalFormularyId, String optionalCoverageListId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugListDSResponse.GetDrugListDSResult> getDrugListDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugListDS(searchName,beginsContains,searchFlag,nameFlag,rxFlag,searchNameFields,prescriberId,activeOnly,optionalPbmId,optionalFormularyId,optionalCoverageListId,accountObj,getDrugListDSResult,statusFlag,statusMsg);
    }

    public void getDrugListWithStateDeaCodesDS(String searchName, SearchLike beginsContains, SearchType searchFlag, NameType nameFlag, RXType rxFlag, SearchName searchNameFields, String prescriberId, String prescriber2LetterState, boolean activeOnly, String optionalPbmId, String optionalFormularyId, String optionalCoverageListId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugListWithStateDeaCodesDSResponse.GetDrugListWithStateDeaCodesDSResult> getDrugListWithStateDeaCodesDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugListWithStateDeaCodesDS(searchName,beginsContains,searchFlag,nameFlag,rxFlag,searchNameFields,prescriberId,prescriber2LetterState,activeOnly,optionalPbmId,optionalFormularyId,optionalCoverageListId,accountObj,getDrugListWithStateDeaCodesDSResult,statusFlag,statusMsg);
    }

    public void getDrugListwStateDeaPlusVoucherDS(String searchName, SearchLike beginsContains, SearchType searchFlag, NameType nameFlag, RXType rxFlag, SearchName searchNameFields, String prescriberId, String prescriber2LetterState, boolean activeOnly, String optionalPbmId, String optionalFormularyId, String optionalCoverageListId, String patientId, String voucherAuth, boolean vouchersOnly, Account accountObj, Holder<com.mdtoolboxrx.GetDrugListwStateDeaPlusVoucherDSResponse.GetDrugListwStateDeaPlusVoucherDSResult> getDrugListwStateDeaPlusVoucherDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugListwStateDeaPlusVoucherDS(searchName,beginsContains,searchFlag,nameFlag,rxFlag,searchNameFields,prescriberId,prescriber2LetterState,activeOnly,optionalPbmId,optionalFormularyId,optionalCoverageListId,patientId,voucherAuth,vouchersOnly,accountObj,getDrugListwStateDeaPlusVoucherDSResult,statusFlag,statusMsg);
    }

    public void getDrugListWithPagingDS(String searchName, SearchLike beginsContains, NameType nameFlag, RXType rxFlag, SearchName searchNameFields, int prescriberId, boolean activeOnly, int pageSize, int returnPageNumber, Account accountObj, Holder<com.mdtoolboxrx.GetDrugListWithPagingDSResponse.GetDrugListWithPagingDSResult> getDrugListWithPagingDSResult, Holder<Integer> totalRecordsAvailable, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugListWithPagingDS(searchName,beginsContains,nameFlag,rxFlag,searchNameFields,prescriberId,activeOnly,pageSize,returnPageNumber,accountObj,getDrugListWithPagingDSResult,totalRecordsAvailable,statusFlag,statusMsg);
    }

    public void getDrugListWithPagingObj(String searchName, SearchLike beginsContains, NameType nameFlag, RXType rxFlag, SearchName searchNameFields, int prescriberId, boolean activeOnly, int pageSize, int returnPageNumber, Account accountObj, Holder<ArrayOfDrug> getDrugListWithPagingObjResult, Holder<Integer> totalRecordsAvailable, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugListWithPagingObj(searchName,beginsContains,nameFlag,rxFlag,searchNameFields,prescriberId,activeOnly,pageSize,returnPageNumber,accountObj,getDrugListWithPagingObjResult,totalRecordsAvailable,statusFlag,statusMsg);
    }

    public void getFormularyDetailDisplayHTML(int unqDrugId, String pbmId, String copayId, String formularyId, String coverId, String altId, Account accountObj, Holder<String> getFormularyDetailDisplayHTMLResult, Holder<String> reportingDisplayFlags, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getFormularyDetailDisplayHTML(unqDrugId,pbmId,copayId,formularyId,coverId,altId,accountObj,getFormularyDetailDisplayHTMLResult,reportingDisplayFlags,statusFlag,statusMsg);
    }

    public void getFormularyDetailDisplayArr(int unqDrugId, String pbmId, String copayId, String formularyId, String coverId, String altId, Account accountObj, Holder<String> getFormularyDetailDisplayArrResult, Holder<ArrayOfString> coverageInfo, Holder<ArrayOfString> copayInfo, Holder<ArrayOfString> pbmAlts, Holder<ArrayOfString> therAlts, Holder<String> reportingDisplayFlags, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getFormularyDetailDisplayArr(unqDrugId,pbmId,copayId,formularyId,coverId,altId,accountObj,getFormularyDetailDisplayArrResult,coverageInfo,copayInfo,pbmAlts,therAlts,reportingDisplayFlags,statusFlag,statusMsg);
    }

    public void getFormularyDetailDisplayArrDetail(int unqDrugId, String rxNorm, String pbmId, String copayId, String formularyId, String coverId, String altId, Account accountObj, Holder<String> getFormularyDetailDisplayArrDetailResult, Holder<ArrayOfString> coverageInfo, Holder<ArrayOfString> copayInfo, Holder<ArrayOfDrugAlt> pbmAlts, Holder<ArrayOfDrugAlt> therAlts, Holder<String> reportingDisplayFlags, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getFormularyDetailDisplayArrDetail(unqDrugId,rxNorm,pbmId,copayId,formularyId,coverId,altId,accountObj,getFormularyDetailDisplayArrDetailResult,coverageInfo,copayInfo,pbmAlts,therAlts,reportingDisplayFlags,statusFlag,statusMsg);
    }

    public void getFormularyDetailDisplaySupplyHTML(String supplyNDC, String pbmId, String copayId, String formularyId, String coverId, String altId, Account accountObj, Holder<String> getFormularyDetailDisplaySupplyHTMLResult, Holder<String> reportingDisplayFlags, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getFormularyDetailDisplaySupplyHTML(supplyNDC,pbmId,copayId,formularyId,coverId,altId,accountObj,getFormularyDetailDisplaySupplyHTMLResult,reportingDisplayFlags,statusFlag,statusMsg);
    }

    public void getFormularyDetailDisplaySupplyArr(String supplyNDC, String pbmId, String copayId, String formularyId, String coverId, String altId, Account accountObj, Holder<String> getFormularyDetailDisplaySupplyArrResult, Holder<ArrayOfString> coverageInfo, Holder<ArrayOfString> copayInfo, Holder<ArrayOfString> pbmAlts, Holder<ArrayOfString> therAlts, Holder<String> reportingDisplayFlags, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getFormularyDetailDisplaySupplyArr(supplyNDC,pbmId,copayId,formularyId,coverId,altId,accountObj,getFormularyDetailDisplaySupplyArrResult,coverageInfo,copayInfo,pbmAlts,therAlts,reportingDisplayFlags,statusFlag,statusMsg);
    }

    public void getFormularyCoverageInfoDS(int unqDrugId, String ndc, String pbmId, String coverageId, Account accountObj, Holder<com.mdtoolboxrx.GetFormularyCoverageInfoDSResponse.GetFormularyCoverageInfoDSResult> getFormularyCoverageInfoDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getFormularyCoverageInfoDS(unqDrugId,ndc,pbmId,coverageId,accountObj,getFormularyCoverageInfoDSResult,statusFlag,statusMsg);
    }

    public void getFormularyCopayInfoDS(int unqDrugId, String ndc, String pbmId, String copayId, String formularyCoverage, Account accountObj, Holder<com.mdtoolboxrx.GetFormularyCopayInfoDSResponse.GetFormularyCopayInfoDSResult> getFormularyCopayInfoDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getFormularyCopayInfoDS(unqDrugId,ndc,pbmId,copayId,formularyCoverage,accountObj,getFormularyCopayInfoDSResult,statusFlag,statusMsg);
    }

    public void getFormularyDrugAltsDS(int unqDrugId, String supplyNDC, String pbmId, String alternateId, String formularyId, String coverageId, String copayId, Account accountObj, Holder<com.mdtoolboxrx.GetFormularyDrugAltsDSResponse.GetFormularyDrugAltsDSResult> getFormularyDrugAltsDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getFormularyDrugAltsDS(unqDrugId,supplyNDC,pbmId,alternateId,formularyId,coverageId,copayId,accountObj,getFormularyDrugAltsDSResult,statusFlag,statusMsg);
    }

    public void getDrugAltsDS(int unqDrugId, String supplyNDC, String pbmId, String formularyId, String coverageId, String copayId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugAltsDSResponse.GetDrugAltsDSResult> getDrugAltsDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugAltsDS(unqDrugId,supplyNDC,pbmId,formularyId,coverageId,copayId,accountObj,getDrugAltsDSResult,statusFlag,statusMsg);
    }

    public void getDrugAltsPerDrugClassDS(int unqDrugId, String pbmId, String formularyId, String coverageId, String copayId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugAltsPerDrugClassDSResponse.GetDrugAltsPerDrugClassDSResult> getDrugAltsPerDrugClassDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugAltsPerDrugClassDS(unqDrugId,pbmId,formularyId,coverageId,copayId,accountObj,getDrugAltsPerDrugClassDSResult,statusFlag,statusMsg);
    }

    public void getDrugClassesDS(String genDrugId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugClassesDSResponse.GetDrugClassesDSResult> getDrugClassesDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugClassesDS(genDrugId,accountObj,getDrugClassesDSResult,statusFlag,statusMsg);
    }

    public void getDrugConditionsDS(String drugProductId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugConditionsDSResponse.GetDrugConditionsDSResult> getDrugConditionsDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugConditionsDS(drugProductId,accountObj,getDrugConditionsDSResult,statusFlag,statusMsg);
    }

    public void getDrugWarningsDS(String drugId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugWarningsDSResponse.GetDrugWarningsDSResult> getDrugWarningsDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugWarningsDS(drugId,accountObj,getDrugWarningsDSResult,statusFlag,statusMsg);
    }

    public void getDrugWarnPregLactDS(String drugId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugWarnPregLactDSResponse.GetDrugWarnPregLactDSResult> getDrugWarnPregLactDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugWarnPregLactDS(drugId,accountObj,getDrugWarnPregLactDSResult,statusFlag,statusMsg);
    }

    public void getDrugWarningLabelsDS(String drugProductId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugWarningLabelsDSResponse.GetDrugWarningLabelsDSResult> getDrugWarningLabelsDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugWarningLabelsDS(drugProductId,accountObj,getDrugWarningLabelsDSResult,statusFlag,statusMsg);
    }

    public void getDrugPatLeafletURLByProduct(String drugProductId, Language lang, Account accountObj, Holder<String> getDrugPatLeafletURLByProductResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugPatLeafletURLByProduct(drugProductId,lang,accountObj,getDrugPatLeafletURLByProductResult,statusFlag,statusMsg);
    }

    public void getDrugPatLeafletURL(int drugId, Language lang, Account accountObj, Holder<String> getDrugPatLeafletURLResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugPatLeafletURL(drugId,lang,accountObj,getDrugPatLeafletURLResult,statusFlag,statusMsg);
    }

    public void getDrugPatLeafletURLByGeneric(String drugId, Language lang, Account accountObj, Holder<String> getDrugPatLeafletURLByGenericResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugPatLeafletURLByGeneric(drugId,lang,accountObj,getDrugPatLeafletURLByGenericResult,statusFlag,statusMsg);
    }

    public void getDrugDosingRefDS(String drugGenId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugDosingRefDSResponse.GetDrugDosingRefDSResult> getDrugDosingRefDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugDosingRefDS(drugGenId,accountObj,getDrugDosingRefDSResult,statusFlag,statusMsg);
    }

    public void getDrugAllergyInterDS(int drugId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugAllergyInterDSResponse.GetDrugAllergyInterDSResult> getDrugAllergyInterDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugAllergyInterDS(drugId,accountObj,getDrugAllergyInterDSResult,statusFlag,statusMsg);
    }

    public void getDrugDosingDataDS(int drugId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugDosingDataDSResponse.GetDrugDosingDataDSResult> getDrugDosingDataDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugDosingDataDS(drugId,accountObj,getDrugDosingDataDSResult,statusFlag,statusMsg);
    }

    public void getDrugDosingDataPerDS(int drugId, int patientAgeInDays, int patientWeightinKG, String patientGenderCode, int optionalConditionId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugDosingDataPerDSResponse.GetDrugDosingDataPerDSResult> getDrugDosingDataPerDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugDosingDataPerDS(drugId,patientAgeInDays,patientWeightinKG,patientGenderCode,optionalConditionId,accountObj,getDrugDosingDataPerDSResult,statusFlag,statusMsg);
    }

    public void getDrugConditionInterDS(int drugId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugConditionInterDSResponse.GetDrugConditionInterDSResult> getDrugConditionInterDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugConditionInterDS(drugId,accountObj,getDrugConditionInterDSResult,statusFlag,statusMsg);
    }

    public void getDrugDrugInterDS(int drugId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugDrugInterDSResponse.GetDrugDrugInterDSResult> getDrugDrugInterDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugDrugInterDS(drugId,accountObj,getDrugDrugInterDSResult,statusFlag,statusMsg);
    }

    public void getDrugFoodInterDS(String genDrugId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugFoodInterDSResponse.GetDrugFoodInterDSResult> getDrugFoodInterDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugFoodInterDS(genDrugId,accountObj,getDrugFoodInterDSResult,statusFlag,statusMsg);
    }

    public void getDrugDupTherClassDS(int drugId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugDupTherClassDSResponse.GetDrugDupTherClassDSResult> getDrugDupTherClassDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugDupTherClassDS(drugId,accountObj,getDrugDupTherClassDSResult,statusFlag,statusMsg);
    }

    public void getDrugSideEffectsDS(String drugId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugSideEffectsDSResponse.GetDrugSideEffectsDSResult> getDrugSideEffectsDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugSideEffectsDS(drugId,accountObj,getDrugSideEffectsDSResult,statusFlag,statusMsg);
    }

    public void getDrugIdListbyDupTherClassDS(int dupTherClassId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugIdListbyDupTherClassDSResponse.GetDrugIdListbyDupTherClassDSResult> getDrugIdListbyDupTherClassDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugIdListbyDupTherClassDS(dupTherClassId,accountObj,getDrugIdListbyDupTherClassDSResult,statusFlag,statusMsg);
    }

    public void getDrugGenListbyDupTherClassDS(int dupTherClassId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugGenListbyDupTherClassDSResponse.GetDrugGenListbyDupTherClassDSResult> getDrugGenListbyDupTherClassDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugGenListbyDupTherClassDS(dupTherClassId,accountObj,getDrugGenListbyDupTherClassDSResult,statusFlag,statusMsg);
    }

    public void getVaccineNDCPackagingDS(String searchName, String optionalMVX, Account accountObj, Holder<com.mdtoolboxrx.GetVaccineNDCPackagingDSResponse.GetVaccineNDCPackagingDSResult> getVaccineNDCPackagingDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getVaccineNDCPackagingDS(searchName,optionalMVX,accountObj,getVaccineNDCPackagingDSResult,statusFlag,statusMsg);
    }

    public void getDrugNDCPackagingDS(String drugProductId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugNDCPackagingDSResponse.GetDrugNDCPackagingDSResult> getDrugNDCPackagingDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugNDCPackagingDS(drugProductId,accountObj,getDrugNDCPackagingDSResult,statusFlag,statusMsg);
    }

    public void getDrugNDCPackagingSummaryDS(String drugProductId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugNDCPackagingSummaryDSResponse.GetDrugNDCPackagingSummaryDSResult> getDrugNDCPackagingSummaryDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugNDCPackagingSummaryDS(drugProductId,accountObj,getDrugNDCPackagingSummaryDSResult,statusFlag,statusMsg);
    }

    public void getDrugNDCPackagingSummaryByUnqIdDS(int drugUnqId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugNDCPackagingSummaryByUnqIdDSResponse.GetDrugNDCPackagingSummaryByUnqIdDSResult> getDrugNDCPackagingSummaryByUnqIdDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugNDCPackagingSummaryByUnqIdDS(drugUnqId,accountObj,getDrugNDCPackagingSummaryByUnqIdDSResult,statusFlag,statusMsg);
    }

    public void getDrugDS(String drugId, int drugProductId, int unqProductId, String rxNormCUI, boolean activeOnly, Account accountObj, Holder<com.mdtoolboxrx.GetDrugDSResponse.GetDrugDSResult> getDrugDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugDS(drugId,drugProductId,unqProductId,rxNormCUI,activeOnly,accountObj,getDrugDSResult,statusFlag,statusMsg);
    }

    public void getDrugInfoCSADS(String drugId, int drugProductId, int unqProductId, boolean activeOnly, String prescriber2LetterState, String pharmacy2LetterState, Account accountObj, Holder<com.mdtoolboxrx.GetDrugInfoCSADSResponse.GetDrugInfoCSADSResult> getDrugInfoCSADSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugInfoCSADS(drugId,drugProductId,unqProductId,activeOnly,prescriber2LetterState,pharmacy2LetterState,accountObj,getDrugInfoCSADSResult,statusFlag,statusMsg);
    }

    public void getDrugByNDCDS(String ndc11Code, boolean activeOnly, Account accountObj, Holder<com.mdtoolboxrx.GetDrugByNDCDSResponse.GetDrugByNDCDSResult> getDrugByNDCDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugByNDCDS(ndc11Code,activeOnly,accountObj,getDrugByNDCDSResult,statusFlag,statusMsg);
    }

    public void getDrugAndFormularyDS(String drugId, int drugProductId, int unqProductId, String rxNormCUI, boolean activeOnly, String optionalPbmId, String optionalFormularyId, String optionalCoverageListId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugAndFormularyDSResponse.GetDrugAndFormularyDSResult> getDrugAndFormularyDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugAndFormularyDS(drugId,drugProductId,unqProductId,rxNormCUI,activeOnly,optionalPbmId,optionalFormularyId,optionalCoverageListId,accountObj,getDrugAndFormularyDSResult,statusFlag,statusMsg);
    }

    public void getDrugAndFormularySupplyDS(String ndc11, String optionalPbmId, String optionalFormularyId, String optionalCoverageListId, Account accountObj, Holder<com.mdtoolboxrx.GetDrugAndFormularySupplyDSResponse.GetDrugAndFormularySupplyDSResult> getDrugAndFormularySupplyDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugAndFormularySupplyDS(ndc11,optionalPbmId,optionalFormularyId,optionalCoverageListId,accountObj,getDrugAndFormularySupplyDSResult,statusFlag,statusMsg);
    }

    public void getFrequencyDS(String searchName, Account accountObj, Holder<com.mdtoolboxrx.GetFrequencyDSResponse.GetFrequencyDSResult> getFrequencyDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getFrequencyDS(searchName,accountObj,getFrequencyDSResult,statusFlag,statusMsg);
    }

    public void getDirectionsDS(String searchName, String uom, Account accountObj, Holder<com.mdtoolboxrx.GetDirectionsDSResponse.GetDirectionsDSResult> getDirectionsDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDirectionsDS(searchName,uom,accountObj,getDirectionsDSResult,statusFlag,statusMsg);
    }

    public void getDrugQtyUofMDS(Account accountObj, Holder<com.mdtoolboxrx.GetDrugQtyUofMDSResponse.GetDrugQtyUofMDSResult> getDrugQtyUofMDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getDrugQtyUofMDS(accountObj,getDrugQtyUofMDSResult,statusFlag,statusMsg);
    }

    public void convertDrugIds(ArrayOfString drugIdsToConvert, String drugIdSource, Account accountObj, Holder<com.mdtoolboxrx.ConvertDrugIdsResponse.ConvertDrugIdsResult> convertDrugIdsResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().convertDrugIds(drugIdsToConvert,drugIdSource,accountObj,convertDrugIdsResult,statusFlag,statusMsg);
    }

    public void getAlertsAllDS(int drugId, ArrayOfInt allergyIdArray, ArrayOfString curMedGenericIdArray, ArrayOfInt conditionIdArray, ArrayOfString icd9CodeArray, boolean includeDrugAllergy, boolean includeDrugDrug, boolean includeDrugCondition, boolean includeDupTherapy, Account accountObj, Holder<com.mdtoolboxrx.GetAlertsAllDSResponse.GetAlertsAllDSResult> getAlertsAllDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getAlertsAllDS(drugId,allergyIdArray,curMedGenericIdArray,conditionIdArray,icd9CodeArray,includeDrugAllergy,includeDrugDrug,includeDrugCondition,includeDupTherapy,accountObj,getAlertsAllDSResult,statusFlag,statusMsg);
    }

    public void getInterAlrtsAllArr(int drugId, ArrayOfInt allergyIdArray, ArrayOfString curMedGenericIdArray, ArrayOfInt conditionIdArray, ArrayOfString icd9CodeArray, boolean includeDrugAllergy, boolean includeDrugDrug, boolean includeDrugCondition, boolean includeDupTherapy, Account accountObj, Holder<String> getInterAlrtsAllArrResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getInterAlrtsAllArr(drugId,allergyIdArray,curMedGenericIdArray,conditionIdArray,icd9CodeArray,includeDrugAllergy,includeDrugDrug,includeDrugCondition,includeDupTherapy,accountObj,getInterAlrtsAllArrResult,statusFlag,statusMsg);
    }

    public void getPharmacyDS(Pharmacy pharmacyObj, boolean activeOnly, boolean includeRetail, boolean includeMailOrder, boolean includeFax, boolean includeSpecialty, boolean includeLongTerm, boolean includeTwentyFourHour, Account accountObj, Holder<com.mdtoolboxrx.GetPharmacyDSResponse.GetPharmacyDSResult> getPharmacyDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPharmacyDS(pharmacyObj,activeOnly,includeRetail,includeMailOrder,includeFax,includeSpecialty,includeLongTerm,includeTwentyFourHour,accountObj,getPharmacyDSResult,statusFlag,statusMsg);
    }

    public void getPharmacyXML(Pharmacy pharmacyObj, boolean activeOnly, boolean includeRetail, boolean includeMailOrder, boolean includeFax, boolean includeSpecialty, boolean includeLongTerm, boolean includeTwentyFourHour, Account accountObj, Holder<String> getPharmacyXMLResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPharmacyXML(pharmacyObj,activeOnly,includeRetail,includeMailOrder,includeFax,includeSpecialty,includeLongTerm,includeTwentyFourHour,accountObj,getPharmacyXMLResult,statusFlag,statusMsg);
    }

    public void getPharmacyObj(Pharmacy pharmacyObj, boolean activeOnly, boolean includeRetail, boolean includeMailOrder, boolean includeFax, boolean includeSpecialty, boolean includeLongTerm, boolean includeTwentyFourHour, Account accountObj, Holder<ArrayOfPharmacy> getPharmacyObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPharmacyObj(pharmacyObj,activeOnly,includeRetail,includeMailOrder,includeFax,includeSpecialty,includeLongTerm,includeTwentyFourHour,accountObj,getPharmacyObjResult,statusFlag,statusMsg);
    }

    public void getPharmacyGeoObj(Organization searchOrgFields, Account accountObj, Holder<ArrayOfOrganization> getPharmacyGeoObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPharmacyGeoObj(searchOrgFields,accountObj,getPharmacyGeoObjResult,statusFlag,statusMsg);
    }

    public void getPharmacyGeoWTypeObj(Organization searchOrgFields, Account accountObj, Holder<ArrayOfOrganization2> getPharmacyGeoWTypeObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPharmacyGeoWTypeObj(searchOrgFields,accountObj,getPharmacyGeoWTypeObjResult,statusFlag,statusMsg);
    }

    public void getPharmacyDetailObj(Pharmacy pharmacyObj, boolean activeOnly, boolean includeRetail, boolean includeMailOrder, boolean includeFax, boolean includeSpecialty, boolean includeLongTerm, boolean includeTwentyFourHour, Account accountObj, Holder<ArrayOfPharmacyDetail> getPharmacyDetailObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPharmacyDetailObj(pharmacyObj,activeOnly,includeRetail,includeMailOrder,includeFax,includeSpecialty,includeLongTerm,includeTwentyFourHour,accountObj,getPharmacyDetailObjResult,statusFlag,statusMsg);
    }

    public void getAllergyDS(String searchName, Account accountObj, Holder<com.mdtoolboxrx.GetAllergyDSResponse.GetAllergyDSResult> getAllergyDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getAllergyDS(searchName,accountObj,getAllergyDSResult,statusFlag,statusMsg);
    }

    public void getAllergywPaging(String searchName, int pageSize, int returnPageNumber, Account accountObj, Holder<com.mdtoolboxrx.GetAllergywPagingResponse.GetAllergywPagingResult> getAllergywPagingResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getAllergywPaging(searchName,pageSize,returnPageNumber,accountObj,getAllergywPagingResult,statusFlag,statusMsg);
    }

    public void getAllergyObj(String searchName, Account accountObj, Holder<ArrayOfAllergyRecord> getAllergyObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getAllergyObj(searchName,accountObj,getAllergyObjResult,statusFlag,statusMsg);
    }

    public void getAllergyRxNorm(int allergyid, Account accountObj, Holder<String> getAllergyRxNormResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getAllergyRxNorm(allergyid,accountObj,getAllergyRxNormResult,statusFlag,statusMsg);
    }

    public void getAllergyId(String rxNorm, Account accountObj, Holder<Integer> getAllergyIdResult, Holder<String> allergyName, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getAllergyId(rxNorm,accountObj,getAllergyIdResult,allergyName,statusFlag,statusMsg);
    }

    public void getConditionDS(String searchName, Account accountObj, Holder<com.mdtoolboxrx.GetConditionDSResponse.GetConditionDSResult> getConditionDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getConditionDS(searchName,accountObj,getConditionDSResult,statusFlag,statusMsg);
    }

    public void getConditionObj(String searchName, Account accountObj, Holder<ArrayOfConditionRecord> getConditionObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getConditionObj(searchName,accountObj,getConditionObjResult,statusFlag,statusMsg);
    }

    public void getConditionSnoMedDS(String searchName, Account accountObj, Holder<com.mdtoolboxrx.GetConditionSnoMedDSResponse.GetConditionSnoMedDSResult> getConditionSnoMedDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getConditionSnoMedDS(searchName,accountObj,getConditionSnoMedDSResult,statusFlag,statusMsg);
    }

    public void getConditionSnoMedCode(String icdCode, Account accountObj, Holder<String> getConditionSnoMedCodeResult, Holder<String> snoMedTerm, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getConditionSnoMedCode(icdCode,accountObj,getConditionSnoMedCodeResult,snoMedTerm,statusFlag,statusMsg);
    }

    public void getRefillRequestsDS(ArrayOfString prescriberId, Account accountObj, Holder<com.mdtoolboxrx.GetRefillRequestsDSResponse.GetRefillRequestsDSResult> getRefillRequestsDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getRefillRequestsDS(prescriberId,accountObj,getRefillRequestsDSResult,statusFlag,statusMsg);
    }

    public void getRxChangeRequestsDS(ArrayOfString prescriberId, Account accountObj, Holder<com.mdtoolboxrx.GetRxChangeRequestsDSResponse.GetRxChangeRequestsDSResult> getRxChangeRequestsDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getRxChangeRequestsDS(prescriberId,accountObj,getRxChangeRequestsDSResult,statusFlag,statusMsg);
    }

    public void getRefillRequestsAllDS(ArrayOfString prescriberId, RXRefillReqStatus reqStatus, Calendar startDate, Calendar endDate, Account accountObj, Holder<com.mdtoolboxrx.GetRefillRequestsAllDSResponse.GetRefillRequestsAllDSResult> getRefillRequestsAllDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getRefillRequestsAllDS(prescriberId,reqStatus,startDate,endDate,accountObj,getRefillRequestsAllDSResult,statusFlag,statusMsg);
    }

    public void getRefillRequestsAllObj(ArrayOfString prescriberId, RXRefillReqStatus reqStatus, Calendar startDate, Calendar endDate, Account accountObj, Holder<ArrayOfRefillRequestRecord> getRefillRequestsAllObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getRefillRequestsAllObj(prescriberId,reqStatus,startDate,endDate,accountObj,getRefillRequestsAllObjResult,statusFlag,statusMsg);
    }

    public void getRefillRequestsCount(ArrayOfString prescriberId, Account accountObj, Holder<Integer> getRefillRequestsCountResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getRefillRequestsCount(prescriberId,accountObj,getRefillRequestsCountResult,statusFlag,statusMsg);
    }

    public void getRefillRequestDetailDS(int refillRequestId, Account accountObj, Holder<com.mdtoolboxrx.GetRefillRequestDetailDSResponse.GetRefillRequestDetailDSResult> getRefillRequestDetailDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getRefillRequestDetailDS(refillRequestId,accountObj,getRefillRequestDetailDSResult,statusFlag,statusMsg);
    }

    public void getChangeRequestDetailDS(int changeRequestId, Account accountObj, Holder<com.mdtoolboxrx.GetChangeRequestDetailDSResponse.GetChangeRequestDetailDSResult> getChangeRequestDetailDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getChangeRequestDetailDS(changeRequestId,accountObj,getChangeRequestDetailDSResult,statusFlag,statusMsg);
    }

    public void getRefillRequestbyMsgId(String refReqMessageId, Account accountObj, Holder<com.mdtoolboxrx.GetRefillRequestbyMsgIdResponse.GetRefillRequestbyMsgIdResult> getRefillRequestbyMsgIdResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getRefillRequestbyMsgId(refReqMessageId,accountObj,getRefillRequestbyMsgIdResult,statusFlag,statusMsg);
    }

    public void getRefillResponseDenialCodesDS(Account accountObj, Holder<com.mdtoolboxrx.GetRefillResponseDenialCodesDSResponse.GetRefillResponseDenialCodesDSResult> getRefillResponseDenialCodesDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getRefillResponseDenialCodesDS(accountObj,getRefillResponseDenialCodesDSResult,statusFlag,statusMsg);
    }

    public void getPatientEligibilityDS(Patient patientObj, Prescriber prescriberObj, Calendar dateOfService, Account accountObj, Holder<com.mdtoolboxrx.GetPatientEligibilityDSResponse.GetPatientEligibilityDSResult> getPatientEligibilityDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPatientEligibilityDS(patientObj,prescriberObj,dateOfService,accountObj,getPatientEligibilityDSResult,statusFlag,statusMsg);
    }

    public void getPatientEligibilityXML(Patient patientObj, Prescriber prescriberObj, Calendar dateOfService, Account accountObj, Holder<String> getPatientEligibilityXMLResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPatientEligibilityXML(patientObj,prescriberObj,dateOfService,accountObj,getPatientEligibilityXMLResult,statusFlag,statusMsg);
    }

    public void getPatientEligibilityObj(Patient patientObj, Prescriber prescriberObj, Calendar dateOfService, Account accountObj, Holder<ArrayOfPatientEligibility> getPatientEligibilityObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPatientEligibilityObj(patientObj,prescriberObj,dateOfService,accountObj,getPatientEligibilityObjResult,statusFlag,statusMsg);
    }

    public void getPatientEligibilityOnFileDS(Patient patientObj, Account accountObj, Holder<com.mdtoolboxrx.GetPatientEligibilityOnFileDSResponse.GetPatientEligibilityOnFileDSResult> getPatientEligibilityOnFileDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPatientEligibilityOnFileDS(patientObj,accountObj,getPatientEligibilityOnFileDSResult,statusFlag,statusMsg);
    }

    public void getPatientEligibilityOnFileXML(Patient patientObj, Account accountObj, Holder<String> getPatientEligibilityOnFileXMLResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPatientEligibilityOnFileXML(patientObj,accountObj,getPatientEligibilityOnFileXMLResult,statusFlag,statusMsg);
    }

    public void getPatientRxHistoryRequestDS(Patient patientObj, Prescriber prescriberObj, String consent, Calendar beginDate, Calendar thruDate, int whichElig, Account accountObj, Holder<com.mdtoolboxrx.GetPatientRxHistoryRequestDSResponse.GetPatientRxHistoryRequestDSResult> getPatientRxHistoryRequestDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPatientRxHistoryRequestDS(patientObj,prescriberObj,consent,beginDate,thruDate,whichElig,accountObj,getPatientRxHistoryRequestDSResult,statusFlag,statusMsg);
    }

    public void getPatientRxHistoryRequestObj(Patient patientObj, Prescriber prescriberObj, String consent, Calendar beginDate, Calendar thruDate, int whichElig, Account accountObj, Holder<ArrayOfHistoryQuery> getPatientRxHistoryRequestObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPatientRxHistoryRequestObj(patientObj,prescriberObj,consent,beginDate,thruDate,whichElig,accountObj,getPatientRxHistoryRequestObjResult,statusFlag,statusMsg);
    }

    public void checkPrescriberRegistration(String uniqueSPI, Account accountObj, Holder<String> checkPrescriberRegistrationResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().checkPrescriberRegistration(uniqueSPI,accountObj,checkPrescriberRegistrationResult,statusFlag,statusMsg);
    }

    public void checkPrescriberRegistrationPerId(String prescriberId, String locationId, Account accountObj, Holder<String> checkPrescriberRegistrationPerIdResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().checkPrescriberRegistrationPerId(prescriberId,locationId,accountObj,checkPrescriberRegistrationPerIdResult,statusFlag,statusMsg);
    }

    public void checkUserRegistration(String userName, Account accountObj, Holder<Integer> loginStatus, Holder<Integer> userPermissionLevel, Holder<Boolean> hasActiveToken, Holder<Boolean> canApprove, Holder<Boolean> canSignSend, Holder<Boolean> isAccessControlManager, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().checkUserRegistration(userName,accountObj,loginStatus,userPermissionLevel,hasActiveToken,canApprove,canSignSend,isAccessControlManager,statusFlag,statusMsg);
    }

    public void registerPrescriber(Prescriber prescriberObj, SurescriptsServices registerFor, Account accountObj, Holder<Boolean> registerPrescriberResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().registerPrescriber(prescriberObj,registerFor,accountObj,registerPrescriberResult,statusFlag,statusMsg);
    }

    public void eSendRefillReqResponse(int refillRequestId, RXRefillResponse refResp, String optRefNote, int numRefillsAppr, String denyReasonCode, Account accountObj, Holder<String> eSendRefillReqResponseResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().eSendRefillReqResponse(refillRequestId,refResp,optRefNote,numRefillsAppr,denyReasonCode,accountObj,eSendRefillReqResponseResult,statusFlag,statusMsg);
    }

    public void eSendRxChangeResponse(int changeRequestId, RXChangeResponse resp, String note, String denyCode, String paNum, Prescription approvedMed, String sig, Account accountObj, Holder<String> eSendRxChangeResponseResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().eSendRxChangeResponse(changeRequestId,resp,note,denyCode,paNum,approvedMed,sig,accountObj,eSendRxChangeResponseResult,statusFlag,statusMsg);
    }

    public void eSendRxChangeResponseWDiag(int changeRequestId, RXChangeResponse resp, String note, String denyCode, String paNum, Prescription approvedMed, String sig, String diag, Account accountObj, Holder<String> eSendRxChangeResponseWDiagResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().eSendRxChangeResponseWDiag(changeRequestId,resp,note,denyCode,paNum,approvedMed,sig,diag,accountObj,eSendRxChangeResponseWDiagResult,statusFlag,statusMsg);
    }

    public void getNewMessageAlertsCount(Account accountObj, Holder<Integer> getNewMessageAlertsCountResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getNewMessageAlertsCount(accountObj,getNewMessageAlertsCountResult,statusFlag,statusMsg);
    }

    public void getNewMessageAlerts(Account accountObj, Holder<com.mdtoolboxrx.GetNewMessageAlertsResponse.GetNewMessageAlertsResult> getNewMessageAlertsResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getNewMessageAlerts(accountObj,getNewMessageAlertsResult,statusFlag,statusMsg);
    }

    public void getNewMessageAlertsXML(boolean markNewComplete, Account accountObj, Holder<String> getNewMessageAlertsXMLResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getNewMessageAlertsXML(markNewComplete,accountObj,getNewMessageAlertsXMLResult,statusFlag,statusMsg);
    }

    public void getNewMessageAlertsObj(boolean markNewComplete, Account accountObj, Holder<ArrayOfAlert> getNewMessageAlertsObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getNewMessageAlertsObj(markNewComplete,accountObj,getNewMessageAlertsObjResult,statusFlag,statusMsg);
    }

    public void updateErrorMessageAlertComplete(String alertId, Account accountObj, Holder<String> updateErrorMessageAlertCompleteResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().updateErrorMessageAlertComplete(alertId,accountObj,updateErrorMessageAlertCompleteResult,statusFlag,statusMsg);
    }

    public void getErrorMessageAlertsDS(String providerId, Account accountObj, Holder<com.mdtoolboxrx.GetErrorMessageAlertsDSResponse.GetErrorMessageAlertsDSResult> getErrorMessageAlertsDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getErrorMessageAlertsDS(providerId,accountObj,getErrorMessageAlertsDSResult,statusFlag,statusMsg);
    }

    public void getErrorMessageAlertsCount(String providerId, Account accountObj, Holder<Integer> getErrorMessageAlertsCountResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getErrorMessageAlertsCount(providerId,accountObj,getErrorMessageAlertsCountResult,statusFlag,statusMsg);
    }

    public void geteSendMessageStatus(String messageId, Account accountObj, Holder<String> geteSendMessageStatusResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().geteSendMessageStatus(messageId,accountObj,geteSendMessageStatusResult,statusFlag,statusMsg);
    }

    public void geteSendRefillMessageStatus(String messageId, Account accountObj, Holder<String> geteSendRefillMessageStatusResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().geteSendRefillMessageStatus(messageId,accountObj,geteSendRefillMessageStatusResult,statusFlag,statusMsg);
    }

    public void eSendNewRx(Prescriber prescriberObj, Patient patientObj, Prescription prescriptionObj, boolean autoRegisterPrescriber, Account accountObj, Holder<String> eSendNewRxResult, Holder<RXRouteStatus> routeStatusFlag, Holder<Boolean> wentByFax, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().eSendNewRx(prescriberObj,patientObj,prescriptionObj,autoRegisterPrescriber,accountObj,eSendNewRxResult,routeStatusFlag,wentByFax,statusFlag,statusMsg);
    }

    public void eSendNewRxWDiag(Prescriber prescriberObj, Patient patientObj, Prescription prescriptionObj, String primaryDiagICD, boolean autoRegisterPrescriber, Account accountObj, Holder<String> eSendNewRxWDiagResult, Holder<RXRouteStatus> routeStatusFlag, Holder<Boolean> wentByFax, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().eSendNewRxWDiag(prescriberObj,patientObj,prescriptionObj,primaryDiagICD,autoRegisterPrescriber,accountObj,eSendNewRxWDiagResult,routeStatusFlag,wentByFax,statusFlag,statusMsg);
    }

    public void eSendNewRxWSpv(Prescriber prescriberObj, Prescriber supervisorObj, Patient patientObj, Prescription prescriptionObj, boolean autoRegisterPrescriber, Account accountObj, Holder<String> eSendNewRxWSpvResult, Holder<RXRouteStatus> routeStatusFlag, Holder<Boolean> wentByFax, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().eSendNewRxWSpv(prescriberObj,supervisorObj,patientObj,prescriptionObj,autoRegisterPrescriber,accountObj,eSendNewRxWSpvResult,routeStatusFlag,wentByFax,statusFlag,statusMsg);
    }

    public void eSendCancelRx(String newRxMessageId, Account accountObj, Holder<String> eSendCancelRxResult, Holder<Status> statusFlag, Holder<RXRouteStatus> routeStatusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().eSendCancelRx(newRxMessageId,accountObj,eSendCancelRxResult,statusFlag,routeStatusFlag,statusMsg);
    }

    public void updatePrinted(Prescriber prescriberObj, Patient patientObj, Prescription prescriptionObj, Account accountObj, Holder<String> updatePrintedResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().updatePrinted(prescriberObj,patientObj,prescriptionObj,accountObj,updatePrintedResult,statusFlag,statusMsg);
    }

    public void updateDataForScreens(ArrayOfPrescriber prescribers, ArrayOfLocation locations, Patient patientObj, ArrayOfMedicationRecord patientMedications, ArrayOfAllergyRecord patientAllergies, ArrayOfConditionRecord patientConditions, VitalRecord patientCurrentVitals, boolean checkPatEligibility, Calendar eligCheckEncounterDate, Prescriber eligCheckPrescriber, Account accountObj, Holder<String> updateDataForScreensResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().updateDataForScreens(prescribers,locations,patientObj,patientMedications,patientAllergies,patientConditions,patientCurrentVitals,checkPatEligibility,eligCheckEncounterDate,eligCheckPrescriber,accountObj,updateDataForScreensResult,statusFlag,statusMsg);
    }

    public void getPrescriptionsForPatient(String patientId, Account accountObj, Holder<com.mdtoolboxrx.GetPrescriptionsForPatientResponse.GetPrescriptionsForPatientResult> getPrescriptionsForPatientResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPrescriptionsForPatient(patientId,accountObj,getPrescriptionsForPatientResult,statusFlag,statusMsg);
    }

    public void getPrescriptionsForPatientXML(String patientId, Account accountObj, Holder<String> getPrescriptionsForPatientXMLResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPrescriptionsForPatientXML(patientId,accountObj,getPrescriptionsForPatientXMLResult,statusFlag,statusMsg);
    }

    public void getPrescriptionsForPatientObj(String patientId, Account accountObj, Holder<ArrayOfMedicationRecord> getPrescriptionsForPatientObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPrescriptionsForPatientObj(patientId,accountObj,getPrescriptionsForPatientObjResult,statusFlag,statusMsg);
    }

    public void getPatientPharmFavs(String patientId, Account accountObj, Holder<ArrayOfPharmacy> getPatientPharmFavsResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPatientPharmFavs(patientId,accountObj,getPatientPharmFavsResult,statusFlag,statusMsg);
    }

    public void getAllergiesForPatient(String patientId, Account accountObj, Holder<com.mdtoolboxrx.GetAllergiesForPatientResponse.GetAllergiesForPatientResult> getAllergiesForPatientResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getAllergiesForPatient(patientId,accountObj,getAllergiesForPatientResult,statusFlag,statusMsg);
    }

    public void getAllergiesForPatientObj(String patientId, Account accountObj, Holder<ArrayOfAllergyRecord> getAllergiesForPatientObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getAllergiesForPatientObj(patientId,accountObj,getAllergiesForPatientObjResult,statusFlag,statusMsg);
    }

    public void getConditionsForPatientDS(String patientId, Account accountObj, Holder<com.mdtoolboxrx.GetConditionsForPatientDSResponse.GetConditionsForPatientDSResult> getConditionsForPatientDSResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getConditionsForPatientDS(patientId,accountObj,getConditionsForPatientDSResult,statusFlag,statusMsg);
    }

    public void getConditionsForPatientObj(String patientId, Account accountObj, Holder<ArrayOfConditionRecord> getConditionsForPatientObjResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getConditionsForPatientObj(patientId,accountObj,getConditionsForPatientObjResult,statusFlag,statusMsg);
    }

    public void getPrescriberAllowedSuffixStr(Account accountObj, Holder<String> getPrescriberAllowedSuffixStrResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPrescriberAllowedSuffixStr(accountObj,getPrescriberAllowedSuffixStrResult,statusFlag,statusMsg);
    }

    public void getPrescriptionsByPrescriber(String prescriberId, Calendar startDate, Calendar endDate, Account accountObj, Holder<com.mdtoolboxrx.GetPrescriptionsByPrescriberResponse.GetPrescriptionsByPrescriberResult> getPrescriptionsByPrescriberResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPrescriptionsByPrescriber(prescriberId,startDate,endDate,accountObj,getPrescriptionsByPrescriberResult,statusFlag,statusMsg);
    }

    public void getPrescriptionsByPrescriberDetail(String prescriberId, Calendar startDate, Calendar endDate, Account accountObj, Holder<com.mdtoolboxrx.GetPrescriptionsByPrescriberDetailResponse.GetPrescriptionsByPrescriberDetailResult> getPrescriptionsByPrescriberDetailResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPrescriptionsByPrescriberDetail(prescriberId,startDate,endDate,accountObj,getPrescriptionsByPrescriberDetailResult,statusFlag,statusMsg);
    }

    public void getVitalListingReport(Calendar startDate, Calendar endDate, Account accountObj, Holder<com.mdtoolboxrx.GetVitalListingReportResponse.GetVitalListingReportResult> getVitalListingReportResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getVitalListingReport(startDate,endDate,accountObj,getVitalListingReportResult,statusFlag,statusMsg);
    }

    public void getRxPendingSummary(String prescriberId, Account accountObj, Holder<com.mdtoolboxrx.GetRxPendingSummaryResponse.GetRxPendingSummaryResult> getRxPendingSummaryResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getRxPendingSummary(prescriberId,accountObj,getRxPendingSummaryResult,statusFlag,statusMsg);
    }

    public void getPrescriptionRouteHistory(String prescriberId, Calendar startDate, Calendar endDate, String transType, String transStatus, Account accountObj, Holder<com.mdtoolboxrx.GetPrescriptionRouteHistoryResponse.GetPrescriptionRouteHistoryResult> getPrescriptionRouteHistoryResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPrescriptionRouteHistory(prescriberId,startDate,endDate,transType,transStatus,accountObj,getPrescriptionRouteHistoryResult,statusFlag,statusMsg);
    }

    public void getPrescriptionRouteHistoryXML(String prescriberId, Calendar startDate, Calendar endDate, String transType, String transStatus, Account accountObj, Holder<String> getPrescriptionRouteHistoryXMLResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getPrescriptionRouteHistoryXML(prescriberId,startDate,endDate,transType,transStatus,accountObj,getPrescriptionRouteHistoryXMLResult,statusFlag,statusMsg);
    }

    public void getMUData(String prescriberId, Calendar startDate, Calendar endDate, Account accountObj, Holder<com.mdtoolboxrx.GetMUDataResponse.GetMUDataResult> getMUDataResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().getMUData(prescriberId,startDate,endDate,accountObj,getMUDataResult,statusFlag,statusMsg);
    }

    public void updateDataPatientVitals(String patientId, ArrayOfVitalRecord patientVitals, Account accountObj, Holder<String> updateDataPatientVitalsResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().updateDataPatientVitals(patientId,patientVitals,accountObj,updateDataPatientVitalsResult,statusFlag,statusMsg);
    }

    public void updatePrescriberFavs(ArrayOfMedicationRecord favs, Account accountObj, Holder<Integer> updatePrescriberFavsResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().updatePrescriberFavs(favs,accountObj,updatePrescriberFavsResult,statusFlag,statusMsg);
    }

    public void updatePrescriberFavRetIds(ArrayOfMedicationRecord favs, Account accountObj, Holder<ArrayOfInt> updatePrescriberFavRetIdsResult, Holder<Status> statusFlag, Holder<String> statusMsg) {
        _getDescriptor().getProxy().updatePrescriberFavRetIds(favs,accountObj,updatePrescriberFavRetIdsResult,statusFlag,statusMsg);
    }

}