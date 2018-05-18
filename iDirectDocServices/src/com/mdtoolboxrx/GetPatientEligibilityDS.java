
package com.mdtoolboxrx;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


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
 *         &lt;element name="PatientObj" type="{http://mdtoolboxrx.com/}Patient" minOccurs="0"/>
 *         &lt;element name="PrescriberObj" type="{http://mdtoolboxrx.com/}Prescriber" minOccurs="0"/>
 *         &lt;element name="DateOfService" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "patientObj",
    "prescriberObj",
    "dateOfService",
    "accountObj"
})
@XmlRootElement(name = "GetPatientEligibilityDS")
public class GetPatientEligibilityDS
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PatientObj")
    protected Patient patientObj;
    @XmlElement(name = "PrescriberObj")
    protected Prescriber prescriberObj;
    @XmlElement(name = "DateOfService", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dateOfService;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

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
     * Gets the value of the dateOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateOfService() {
        return dateOfService;
    }

    /**
     * Sets the value of the dateOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfService(Calendar value) {
        this.dateOfService = value;
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
