
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="RefillRequestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RefResp" type="{http://mdtoolboxrx.com/}RXRefillResponse"/>
 *         &lt;element name="OptRefNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumRefillsAppr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DenyReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "refillRequestId",
    "refResp",
    "optRefNote",
    "numRefillsAppr",
    "denyReasonCode",
    "accountObj"
})
@XmlRootElement(name = "eSendRefillReqResponse")
public class ESendRefillReqResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RefillRequestId")
    protected int refillRequestId;
    @XmlElement(name = "RefResp", required = true)
    @XmlSchemaType(name = "string")
    protected RXRefillResponse refResp;
    @XmlElement(name = "OptRefNote")
    protected String optRefNote;
    @XmlElement(name = "NumRefillsAppr")
    protected int numRefillsAppr;
    @XmlElement(name = "DenyReasonCode")
    protected String denyReasonCode;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the refillRequestId property.
     * 
     */
    public int getRefillRequestId() {
        return refillRequestId;
    }

    /**
     * Sets the value of the refillRequestId property.
     * 
     */
    public void setRefillRequestId(int value) {
        this.refillRequestId = value;
    }

    /**
     * Gets the value of the refResp property.
     * 
     * @return
     *     possible object is
     *     {@link RXRefillResponse }
     *     
     */
    public RXRefillResponse getRefResp() {
        return refResp;
    }

    /**
     * Sets the value of the refResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXRefillResponse }
     *     
     */
    public void setRefResp(RXRefillResponse value) {
        this.refResp = value;
    }

    /**
     * Gets the value of the optRefNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptRefNote() {
        return optRefNote;
    }

    /**
     * Sets the value of the optRefNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptRefNote(String value) {
        this.optRefNote = value;
    }

    /**
     * Gets the value of the numRefillsAppr property.
     * 
     */
    public int getNumRefillsAppr() {
        return numRefillsAppr;
    }

    /**
     * Sets the value of the numRefillsAppr property.
     * 
     */
    public void setNumRefillsAppr(int value) {
        this.numRefillsAppr = value;
    }

    /**
     * Gets the value of the denyReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenyReasonCode() {
        return denyReasonCode;
    }

    /**
     * Sets the value of the denyReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenyReasonCode(String value) {
        this.denyReasonCode = value;
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
