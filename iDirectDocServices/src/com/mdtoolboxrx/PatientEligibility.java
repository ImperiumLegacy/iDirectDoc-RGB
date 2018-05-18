
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PatientEligibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatientEligibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PatientEligId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EligCheckDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PBMSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PBMUniqueMemberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientDataDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CardHolderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveMailOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveRetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveLTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveSpecialty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlanCoverageDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoverageListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DrugFormularyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsPolicyCopayId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlanNetworkIdBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlanNetworkIdPcn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatientEligibility", propOrder = {
    "patientEligId",
    "eligCheckDate",
    "payerId",
    "pbmSource",
    "pbmUniqueMemberId",
    "patientData",
    "patientDataDiff",
    "cardHolderId",
    "activeCoverage",
    "activeMailOrder",
    "activeRetail",
    "activeLTC",
    "activeSpecialty",
    "planCoverageDesc",
    "cardHolderName",
    "planId",
    "groupNumber",
    "groupName",
    "alternateListId",
    "coverageListId",
    "drugFormularyId",
    "insPolicyCopayId",
    "planNetworkIdBin",
    "planNetworkIdPcn"
})
public class PatientEligibility
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PatientEligId")
    protected int patientEligId;
    @XmlElement(name = "EligCheckDate")
    protected String eligCheckDate;
    @XmlElement(name = "PayerId")
    protected String payerId;
    @XmlElement(name = "PBMSource")
    protected String pbmSource;
    @XmlElement(name = "PBMUniqueMemberId")
    protected String pbmUniqueMemberId;
    @XmlElement(name = "PatientData")
    protected String patientData;
    @XmlElement(name = "PatientDataDiff")
    protected int patientDataDiff;
    @XmlElement(name = "CardHolderId")
    protected String cardHolderId;
    @XmlElement(name = "ActiveCoverage")
    protected String activeCoverage;
    @XmlElement(name = "ActiveMailOrder")
    protected String activeMailOrder;
    @XmlElement(name = "ActiveRetail")
    protected String activeRetail;
    @XmlElement(name = "ActiveLTC")
    protected String activeLTC;
    @XmlElement(name = "ActiveSpecialty")
    protected String activeSpecialty;
    @XmlElement(name = "PlanCoverageDesc")
    protected String planCoverageDesc;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "PlanId")
    protected String planId;
    @XmlElement(name = "GroupNumber")
    protected String groupNumber;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "AlternateListId")
    protected String alternateListId;
    @XmlElement(name = "CoverageListId")
    protected String coverageListId;
    @XmlElement(name = "DrugFormularyId")
    protected String drugFormularyId;
    @XmlElement(name = "InsPolicyCopayId")
    protected String insPolicyCopayId;
    @XmlElement(name = "PlanNetworkIdBin")
    protected String planNetworkIdBin;
    @XmlElement(name = "PlanNetworkIdPcn")
    protected String planNetworkIdPcn;

    /**
     * Gets the value of the patientEligId property.
     * 
     */
    public int getPatientEligId() {
        return patientEligId;
    }

    /**
     * Sets the value of the patientEligId property.
     * 
     */
    public void setPatientEligId(int value) {
        this.patientEligId = value;
    }

    /**
     * Gets the value of the eligCheckDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligCheckDate() {
        return eligCheckDate;
    }

    /**
     * Sets the value of the eligCheckDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligCheckDate(String value) {
        this.eligCheckDate = value;
    }

    /**
     * Gets the value of the payerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerId() {
        return payerId;
    }

    /**
     * Sets the value of the payerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerId(String value) {
        this.payerId = value;
    }

    /**
     * Gets the value of the pbmSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBMSource() {
        return pbmSource;
    }

    /**
     * Sets the value of the pbmSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBMSource(String value) {
        this.pbmSource = value;
    }

    /**
     * Gets the value of the pbmUniqueMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBMUniqueMemberId() {
        return pbmUniqueMemberId;
    }

    /**
     * Sets the value of the pbmUniqueMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBMUniqueMemberId(String value) {
        this.pbmUniqueMemberId = value;
    }

    /**
     * Gets the value of the patientData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientData() {
        return patientData;
    }

    /**
     * Sets the value of the patientData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientData(String value) {
        this.patientData = value;
    }

    /**
     * Gets the value of the patientDataDiff property.
     * 
     */
    public int getPatientDataDiff() {
        return patientDataDiff;
    }

    /**
     * Sets the value of the patientDataDiff property.
     * 
     */
    public void setPatientDataDiff(int value) {
        this.patientDataDiff = value;
    }

    /**
     * Gets the value of the cardHolderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderId() {
        return cardHolderId;
    }

    /**
     * Sets the value of the cardHolderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderId(String value) {
        this.cardHolderId = value;
    }

    /**
     * Gets the value of the activeCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveCoverage() {
        return activeCoverage;
    }

    /**
     * Sets the value of the activeCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveCoverage(String value) {
        this.activeCoverage = value;
    }

    /**
     * Gets the value of the activeMailOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveMailOrder() {
        return activeMailOrder;
    }

    /**
     * Sets the value of the activeMailOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveMailOrder(String value) {
        this.activeMailOrder = value;
    }

    /**
     * Gets the value of the activeRetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveRetail() {
        return activeRetail;
    }

    /**
     * Sets the value of the activeRetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveRetail(String value) {
        this.activeRetail = value;
    }

    /**
     * Gets the value of the activeLTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveLTC() {
        return activeLTC;
    }

    /**
     * Sets the value of the activeLTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveLTC(String value) {
        this.activeLTC = value;
    }

    /**
     * Gets the value of the activeSpecialty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveSpecialty() {
        return activeSpecialty;
    }

    /**
     * Sets the value of the activeSpecialty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveSpecialty(String value) {
        this.activeSpecialty = value;
    }

    /**
     * Gets the value of the planCoverageDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanCoverageDesc() {
        return planCoverageDesc;
    }

    /**
     * Sets the value of the planCoverageDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanCoverageDesc(String value) {
        this.planCoverageDesc = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the planId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * Sets the value of the planId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanId(String value) {
        this.planId = value;
    }

    /**
     * Gets the value of the groupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupNumber() {
        return groupNumber;
    }

    /**
     * Sets the value of the groupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupNumber(String value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the alternateListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateListId() {
        return alternateListId;
    }

    /**
     * Sets the value of the alternateListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateListId(String value) {
        this.alternateListId = value;
    }

    /**
     * Gets the value of the coverageListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageListId() {
        return coverageListId;
    }

    /**
     * Sets the value of the coverageListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageListId(String value) {
        this.coverageListId = value;
    }

    /**
     * Gets the value of the drugFormularyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugFormularyId() {
        return drugFormularyId;
    }

    /**
     * Sets the value of the drugFormularyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugFormularyId(String value) {
        this.drugFormularyId = value;
    }

    /**
     * Gets the value of the insPolicyCopayId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsPolicyCopayId() {
        return insPolicyCopayId;
    }

    /**
     * Sets the value of the insPolicyCopayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsPolicyCopayId(String value) {
        this.insPolicyCopayId = value;
    }

    /**
     * Gets the value of the planNetworkIdBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanNetworkIdBin() {
        return planNetworkIdBin;
    }

    /**
     * Sets the value of the planNetworkIdBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanNetworkIdBin(String value) {
        this.planNetworkIdBin = value;
    }

    /**
     * Gets the value of the planNetworkIdPcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanNetworkIdPcn() {
        return planNetworkIdPcn;
    }

    /**
     * Sets the value of the planNetworkIdPcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanNetworkIdPcn(String value) {
        this.planNetworkIdPcn = value;
    }

}
