
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DrugId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PatientAgeInDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PatientWeightinKG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PatientGenderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionalConditionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccountObj" type="{http://mdtoolboxrx.com/}Account" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "drugId",
    "patientAgeInDays",
    "patientWeightinKG",
    "patientGenderCode",
    "optionalConditionId",
    "accountObj"
})
@XmlRootElement(name = "GetDrugDosingDataPerDS")
public class GetDrugDosingDataPerDS
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DrugId")
    protected int drugId;
    @XmlElement(name = "PatientAgeInDays")
    protected int patientAgeInDays;
    @XmlElement(name = "PatientWeightinKG")
    protected int patientWeightinKG;
    @XmlElement(name = "PatientGenderCode")
    protected String patientGenderCode;
    @XmlElement(name = "OptionalConditionId")
    protected int optionalConditionId;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the drugId property.
     * 
     */
    public int getDrugId() {
        return drugId;
    }

    /**
     * Sets the value of the drugId property.
     * 
     */
    public void setDrugId(int value) {
        this.drugId = value;
    }

    /**
     * Gets the value of the patientAgeInDays property.
     * 
     */
    public int getPatientAgeInDays() {
        return patientAgeInDays;
    }

    /**
     * Sets the value of the patientAgeInDays property.
     * 
     */
    public void setPatientAgeInDays(int value) {
        this.patientAgeInDays = value;
    }

    /**
     * Gets the value of the patientWeightinKG property.
     * 
     */
    public int getPatientWeightinKG() {
        return patientWeightinKG;
    }

    /**
     * Sets the value of the patientWeightinKG property.
     * 
     */
    public void setPatientWeightinKG(int value) {
        this.patientWeightinKG = value;
    }

    /**
     * Gets the value of the patientGenderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientGenderCode() {
        return patientGenderCode;
    }

    /**
     * Sets the value of the patientGenderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientGenderCode(String value) {
        this.patientGenderCode = value;
    }

    /**
     * Gets the value of the optionalConditionId property.
     * 
     */
    public int getOptionalConditionId() {
        return optionalConditionId;
    }

    /**
     * Sets the value of the optionalConditionId property.
     * 
     */
    public void setOptionalConditionId(int value) {
        this.optionalConditionId = value;
    }

    /**
     * Gets the value of the accountObj property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccountObj() {
        return accountObj;
    }

    /**
     * Sets the value of the accountObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccountObj(Account value) {
        this.accountObj = value;
    }

}
