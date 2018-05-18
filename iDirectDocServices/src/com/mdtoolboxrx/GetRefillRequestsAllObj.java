
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
 *         &lt;element name="PrescriberId" type="{http://mdtoolboxrx.com/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="ReqStatus" type="{http://mdtoolboxrx.com/}RXRefillReqStatus"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "prescriberId",
    "reqStatus",
    "startDate",
    "endDate",
    "accountObj"
})
@XmlRootElement(name = "GetRefillRequestsAllObj")
public class GetRefillRequestsAllObj
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PrescriberId")
    protected ArrayOfString prescriberId;
    @XmlElement(name = "ReqStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RXRefillReqStatus reqStatus;
    @XmlElement(name = "StartDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startDate;
    @XmlElement(name = "EndDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endDate;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the prescriberId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPrescriberId() {
        return prescriberId;
    }

    /**
     * Sets the value of the prescriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPrescriberId(ArrayOfString value) {
        this.prescriberId = value;
    }

    /**
     * Gets the value of the reqStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RXRefillReqStatus }
     *     
     */
    public RXRefillReqStatus getReqStatus() {
        return reqStatus;
    }

    /**
     * Sets the value of the reqStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXRefillReqStatus }
     *     
     */
    public void setReqStatus(RXRefillReqStatus value) {
        this.reqStatus = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Calendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Calendar value) {
        this.endDate = value;
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
