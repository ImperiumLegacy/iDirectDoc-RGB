
package com.mdtoolboxrx;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for RefillRequestRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefillRequestRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefillReqId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PatientLastReq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientFirstReq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Drug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Directions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefillRequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PharmacyNCPDP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pharmacy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefillResponseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PatientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientLast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientFirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefillResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumRefillsApproved" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RefillResponseNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefilledRxId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NewRxId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefillRequestRecord", propOrder = {
    "refillReqId",
    "patientLastReq",
    "patientFirstReq",
    "drug",
    "directions",
    "refillRequestDate",
    "pharmacyNCPDP",
    "pharmacy",
    "providerId",
    "providerName",
    "refillResponseDate",
    "patientId",
    "patientLast",
    "patientFirst",
    "refillResponse",
    "numRefillsApproved",
    "refillResponseNote",
    "refilledRxId",
    "newRxId"
})
public class RefillRequestRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RefillReqId")
    protected int refillReqId;
    @XmlElement(name = "PatientLastReq")
    protected String patientLastReq;
    @XmlElement(name = "PatientFirstReq")
    protected String patientFirstReq;
    @XmlElement(name = "Drug")
    protected String drug;
    @XmlElement(name = "Directions")
    protected String directions;
    @XmlElement(name = "RefillRequestDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar refillRequestDate;
    @XmlElement(name = "PharmacyNCPDP")
    protected String pharmacyNCPDP;
    @XmlElement(name = "Pharmacy")
    protected String pharmacy;
    @XmlElement(name = "ProviderId")
    protected String providerId;
    @XmlElement(name = "ProviderName")
    protected String providerName;
    @XmlElement(name = "RefillResponseDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar refillResponseDate;
    @XmlElement(name = "PatientId")
    protected String patientId;
    @XmlElement(name = "PatientLast")
    protected String patientLast;
    @XmlElement(name = "PatientFirst")
    protected String patientFirst;
    @XmlElement(name = "RefillResponse")
    protected String refillResponse;
    @XmlElement(name = "NumRefillsApproved")
    protected int numRefillsApproved;
    @XmlElement(name = "RefillResponseNote")
    protected String refillResponseNote;
    @XmlElement(name = "RefilledRxId")
    protected int refilledRxId;
    @XmlElement(name = "NewRxId")
    protected int newRxId;

    /**
     * Gets the value of the refillReqId property.
     * 
     */
    public int getRefillReqId() {
        return refillReqId;
    }

    /**
     * Sets the value of the refillReqId property.
     * 
     */
    public void setRefillReqId(int value) {
        this.refillReqId = value;
    }

    /**
     * Gets the value of the patientLastReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientLastReq() {
        return patientLastReq;
    }

    /**
     * Sets the value of the patientLastReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientLastReq(String value) {
        this.patientLastReq = value;
    }

    /**
     * Gets the value of the patientFirstReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientFirstReq() {
        return patientFirstReq;
    }

    /**
     * Sets the value of the patientFirstReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientFirstReq(String value) {
        this.patientFirstReq = value;
    }

    /**
     * Gets the value of the drug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrug() {
        return drug;
    }

    /**
     * Sets the value of the drug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrug(String value) {
        this.drug = value;
    }

    /**
     * Gets the value of the directions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirections() {
        return directions;
    }

    /**
     * Sets the value of the directions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirections(String value) {
        this.directions = value;
    }

    /**
     * Gets the value of the refillRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRefillRequestDate() {
        return refillRequestDate;
    }

    /**
     * Sets the value of the refillRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefillRequestDate(Calendar value) {
        this.refillRequestDate = value;
    }

    /**
     * Gets the value of the pharmacyNCPDP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyNCPDP() {
        return pharmacyNCPDP;
    }

    /**
     * Sets the value of the pharmacyNCPDP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyNCPDP(String value) {
        this.pharmacyNCPDP = value;
    }

    /**
     * Gets the value of the pharmacy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacy() {
        return pharmacy;
    }

    /**
     * Sets the value of the pharmacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacy(String value) {
        this.pharmacy = value;
    }

    /**
     * Gets the value of the providerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderId(String value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the refillResponseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRefillResponseDate() {
        return refillResponseDate;
    }

    /**
     * Sets the value of the refillResponseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefillResponseDate(Calendar value) {
        this.refillResponseDate = value;
    }

    /**
     * Gets the value of the patientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * Sets the value of the patientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientId(String value) {
        this.patientId = value;
    }

    /**
     * Gets the value of the patientLast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientLast() {
        return patientLast;
    }

    /**
     * Sets the value of the patientLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientLast(String value) {
        this.patientLast = value;
    }

    /**
     * Gets the value of the patientFirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientFirst() {
        return patientFirst;
    }

    /**
     * Sets the value of the patientFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientFirst(String value) {
        this.patientFirst = value;
    }

    /**
     * Gets the value of the refillResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefillResponse() {
        return refillResponse;
    }

    /**
     * Sets the value of the refillResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefillResponse(String value) {
        this.refillResponse = value;
    }

    /**
     * Gets the value of the numRefillsApproved property.
     * 
     */
    public int getNumRefillsApproved() {
        return numRefillsApproved;
    }

    /**
     * Sets the value of the numRefillsApproved property.
     * 
     */
    public void setNumRefillsApproved(int value) {
        this.numRefillsApproved = value;
    }

    /**
     * Gets the value of the refillResponseNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefillResponseNote() {
        return refillResponseNote;
    }

    /**
     * Sets the value of the refillResponseNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefillResponseNote(String value) {
        this.refillResponseNote = value;
    }

    /**
     * Gets the value of the refilledRxId property.
     * 
     */
    public int getRefilledRxId() {
        return refilledRxId;
    }

    /**
     * Sets the value of the refilledRxId property.
     * 
     */
    public void setRefilledRxId(int value) {
        this.refilledRxId = value;
    }

    /**
     * Gets the value of the newRxId property.
     * 
     */
    public int getNewRxId() {
        return newRxId;
    }

    /**
     * Sets the value of the newRxId property.
     * 
     */
    public void setNewRxId(int value) {
        this.newRxId = value;
    }

}
