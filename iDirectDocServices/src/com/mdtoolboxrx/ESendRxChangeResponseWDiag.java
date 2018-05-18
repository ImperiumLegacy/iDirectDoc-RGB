
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
 *         &lt;element name="ChangeRequestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Resp" type="{http://mdtoolboxrx.com/}RXChangeResponse"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DenyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PANum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovedMed" type="{http://mdtoolboxrx.com/}Prescription" minOccurs="0"/>
 *         &lt;element name="Sig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Diag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "changeRequestId",
    "resp",
    "note",
    "denyCode",
    "paNum",
    "approvedMed",
    "sig",
    "diag",
    "accountObj"
})
@XmlRootElement(name = "eSendRxChangeResponseWDiag")
public class ESendRxChangeResponseWDiag
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ChangeRequestId")
    protected int changeRequestId;
    @XmlElement(name = "Resp", required = true)
    @XmlSchemaType(name = "string")
    protected RXChangeResponse resp;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "DenyCode")
    protected String denyCode;
    @XmlElement(name = "PANum")
    protected String paNum;
    @XmlElement(name = "ApprovedMed")
    protected Prescription approvedMed;
    @XmlElement(name = "Sig")
    protected String sig;
    @XmlElement(name = "Diag")
    protected String diag;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the changeRequestId property.
     * 
     */
    public int getChangeRequestId() {
        return changeRequestId;
    }

    /**
     * Sets the value of the changeRequestId property.
     * 
     */
    public void setChangeRequestId(int value) {
        this.changeRequestId = value;
    }

    /**
     * Gets the value of the resp property.
     * 
     * @return
     *     possible object is
     *     {@link RXChangeResponse }
     *     
     */
    public RXChangeResponse getResp() {
        return resp;
    }

    /**
     * Sets the value of the resp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXChangeResponse }
     *     
     */
    public void setResp(RXChangeResponse value) {
        this.resp = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the denyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenyCode() {
        return denyCode;
    }

    /**
     * Sets the value of the denyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenyCode(String value) {
        this.denyCode = value;
    }

    /**
     * Gets the value of the paNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANum() {
        return paNum;
    }

    /**
     * Sets the value of the paNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPANum(String value) {
        this.paNum = value;
    }

    /**
     * Gets the value of the approvedMed property.
     * 
     * @return
     *     possible object is
     *     {@link Prescription }
     *     
     */
    public Prescription getApprovedMed() {
        return approvedMed;
    }

    /**
     * Sets the value of the approvedMed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prescription }
     *     
     */
    public void setApprovedMed(Prescription value) {
        this.approvedMed = value;
    }

    /**
     * Gets the value of the sig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSig() {
        return sig;
    }

    /**
     * Sets the value of the sig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSig(String value) {
        this.sig = value;
    }

    /**
     * Gets the value of the diag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiag() {
        return diag;
    }

    /**
     * Sets the value of the diag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiag(String value) {
        this.diag = value;
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
