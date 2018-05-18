
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
 *         &lt;element name="Consent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ThruDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WhichElig" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "consent",
    "beginDate",
    "thruDate",
    "whichElig",
    "accountObj"
})
@XmlRootElement(name = "GetPatientRxHistoryRequestDS")
public class GetPatientRxHistoryRequestDS
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PatientObj")
    protected Patient patientObj;
    @XmlElement(name = "PrescriberObj")
    protected Prescriber prescriberObj;
    @XmlElement(name = "Consent")
    protected String consent;
    @XmlElement(name = "BeginDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar beginDate;
    @XmlElement(name = "ThruDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar thruDate;
    @XmlElement(name = "WhichElig")
    protected int whichElig;
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
     * Gets the value of the consent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsent() {
        return consent;
    }

    /**
     * Sets the value of the consent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsent(String value) {
        this.consent = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(Calendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the thruDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getThruDate() {
        return thruDate;
    }

    /**
     * Sets the value of the thruDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThruDate(Calendar value) {
        this.thruDate = value;
    }

    /**
     * Gets the value of the whichElig property.
     * 
     */
    public int getWhichElig() {
        return whichElig;
    }

    /**
     * Sets the value of the whichElig property.
     * 
     */
    public void setWhichElig(int value) {
        this.whichElig = value;
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
