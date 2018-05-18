
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
 *         &lt;element name="GetAllergyIdResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AllergyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusFlag" type="{http://mdtoolboxrx.com/}Status"/>
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
@XmlType(name = "", propOrder = {
    "getAllergyIdResult",
    "allergyName",
    "statusFlag",
    "statusMsg"
})
@XmlRootElement(name = "GetAllergyIdResponse")
public class GetAllergyIdResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GetAllergyIdResult")
    protected int getAllergyIdResult;
    @XmlElement(name = "AllergyName")
    protected String allergyName;
    @XmlElement(name = "StatusFlag", required = true)
    @XmlSchemaType(name = "string")
    protected Status statusFlag;
    @XmlElement(name = "StatusMsg")
    protected String statusMsg;

    /**
     * Gets the value of the getAllergyIdResult property.
     * 
     */
    public int getGetAllergyIdResult() {
        return getAllergyIdResult;
    }

    /**
     * Sets the value of the getAllergyIdResult property.
     * 
     */
    public void setGetAllergyIdResult(int value) {
        this.getAllergyIdResult = value;
    }

    /**
     * Gets the value of the allergyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllergyName() {
        return allergyName;
    }

    /**
     * Sets the value of the allergyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllergyName(String value) {
        this.allergyName = value;
    }

    /**
     * Gets the value of the statusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatusFlag() {
        return statusFlag;
    }

    /**
     * Sets the value of the statusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatusFlag(Status value) {
        this.statusFlag = value;
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
