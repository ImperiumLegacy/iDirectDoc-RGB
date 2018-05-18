
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
 * <p>Java class for HIEMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIEMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateTimeSent" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FromDirectAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToDirectAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Patient" type="{http://mdtoolboxrx.com/}Patient" minOccurs="0"/>
 *         &lt;element name="PatientAdditionalIds" type="{http://mdtoolboxrx.com/}ArrayOfIdentification" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{http://mdtoolboxrx.com/}ArrayOfAttachment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIEMessage", propOrder = {
    "id",
    "dateTimeSent",
    "fromDirectAddress",
    "toDirectAddress",
    "subject",
    "messageText",
    "patient",
    "patientAdditionalIds",
    "attachments"
})
public class HIEMessage
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "DateTimeSent", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dateTimeSent;
    @XmlElement(name = "FromDirectAddress")
    protected String fromDirectAddress;
    @XmlElement(name = "ToDirectAddress")
    protected String toDirectAddress;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "MessageText")
    protected String messageText;
    @XmlElement(name = "Patient")
    protected Patient patient;
    @XmlElement(name = "PatientAdditionalIds")
    protected ArrayOfIdentification patientAdditionalIds;
    @XmlElement(name = "Attachments")
    protected ArrayOfAttachment attachments;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the dateTimeSent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateTimeSent() {
        return dateTimeSent;
    }

    /**
     * Sets the value of the dateTimeSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeSent(Calendar value) {
        this.dateTimeSent = value;
    }

    /**
     * Gets the value of the fromDirectAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDirectAddress() {
        return fromDirectAddress;
    }

    /**
     * Sets the value of the fromDirectAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDirectAddress(String value) {
        this.fromDirectAddress = value;
    }

    /**
     * Gets the value of the toDirectAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDirectAddress() {
        return toDirectAddress;
    }

    /**
     * Sets the value of the toDirectAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDirectAddress(String value) {
        this.toDirectAddress = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the messageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * Sets the value of the messageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link Patient }
     *     
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patient }
     *     
     */
    public void setPatient(Patient value) {
        this.patient = value;
    }

    /**
     * Gets the value of the patientAdditionalIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIdentification }
     *     
     */
    public ArrayOfIdentification getPatientAdditionalIds() {
        return patientAdditionalIds;
    }

    /**
     * Sets the value of the patientAdditionalIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIdentification }
     *     
     */
    public void setPatientAdditionalIds(ArrayOfIdentification value) {
        this.patientAdditionalIds = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public ArrayOfAttachment getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public void setAttachments(ArrayOfAttachment value) {
        this.attachments = value;
    }

}
