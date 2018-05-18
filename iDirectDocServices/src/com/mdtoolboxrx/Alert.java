
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Alert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Alert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PharmacyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pharmacy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Alert", propOrder = {
    "alertType",
    "pharmacyId",
    "pharmacy",
    "messageId",
    "statusMsg"
})
public class Alert
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AlertType")
    protected String alertType;
    @XmlElement(name = "PharmacyId")
    protected String pharmacyId;
    @XmlElement(name = "Pharmacy")
    protected String pharmacy;
    @XmlElement(name = "MessageId")
    protected String messageId;
    @XmlElement(name = "StatusMsg")
    protected String statusMsg;

    /**
     * Gets the value of the alertType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertType() {
        return alertType;
    }

    /**
     * Sets the value of the alertType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertType(String value) {
        this.alertType = value;
    }

    /**
     * Gets the value of the pharmacyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyId() {
        return pharmacyId;
    }

    /**
     * Sets the value of the pharmacyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyId(String value) {
        this.pharmacyId = value;
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
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the statusMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMsg() {
        return statusMsg;
    }

    /**
     * Sets the value of the statusMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMsg(String value) {
        this.statusMsg = value;
    }

}
