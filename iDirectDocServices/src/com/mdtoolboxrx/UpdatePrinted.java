
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
 *         &lt;element name="PrescriberObj" type="{http://mdtoolboxrx.com/}Prescriber" minOccurs="0"/>
 *         &lt;element name="PatientObj" type="{http://mdtoolboxrx.com/}Patient" minOccurs="0"/>
 *         &lt;element name="PrescriptionObj" type="{http://mdtoolboxrx.com/}Prescription" minOccurs="0"/>
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
    "prescriberObj",
    "patientObj",
    "prescriptionObj",
    "accountObj"
})
@XmlRootElement(name = "UpdatePrinted")
public class UpdatePrinted
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PrescriberObj")
    protected Prescriber prescriberObj;
    @XmlElement(name = "PatientObj")
    protected Patient patientObj;
    @XmlElement(name = "PrescriptionObj")
    protected Prescription prescriptionObj;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the prescriberObj property.
     * 
     * @return
     *     possible object is
     *     {@link Prescriber }
     *     
     */
    public Prescriber getPrescriberObj() {
        return prescriberObj;
    }

    /**
     * Sets the value of the prescriberObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prescriber }
     *     
     */
    public void setPrescriberObj(Prescriber value) {
        this.prescriberObj = value;
    }

    /**
     * Gets the value of the patientObj property.
     * 
     * @return
     *     possible object is
     *     {@link Patient }
     *     
     */
    public Patient getPatientObj() {
        return patientObj;
    }

    /**
     * Sets the value of the patientObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patient }
     *     
     */
    public void setPatientObj(Patient value) {
        this.patientObj = value;
    }

    /**
     * Gets the value of the prescriptionObj property.
     * 
     * @return
     *     possible object is
     *     {@link Prescription }
     *     
     */
    public Prescription getPrescriptionObj() {
        return prescriptionObj;
    }

    /**
     * Sets the value of the prescriptionObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prescription }
     *     
     */
    public void setPrescriptionObj(Prescription value) {
        this.prescriptionObj = value;
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
