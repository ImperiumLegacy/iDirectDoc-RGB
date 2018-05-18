
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
 *         &lt;element name="GetDrugListWithPagingObjResult" type="{http://mdtoolboxrx.com/}ArrayOfDrug" minOccurs="0"/>
 *         &lt;element name="TotalRecordsAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getDrugListWithPagingObjResult",
    "totalRecordsAvailable",
    "statusFlag",
    "statusMsg"
})
@XmlRootElement(name = "GetDrugListWithPagingObjResponse")
public class GetDrugListWithPagingObjResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GetDrugListWithPagingObjResult")
    protected ArrayOfDrug getDrugListWithPagingObjResult;
    @XmlElement(name = "TotalRecordsAvailable")
    protected int totalRecordsAvailable;
    @XmlElement(name = "StatusFlag", required = true)
    @XmlSchemaType(name = "string")
    protected Status statusFlag;
    @XmlElement(name = "StatusMsg")
    protected String statusMsg;

    /**
     * Gets the value of the getDrugListWithPagingObjResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrug }
     *     
     */
    public ArrayOfDrug getGetDrugListWithPagingObjResult() {
        return getDrugListWithPagingObjResult;
    }

    /**
     * Sets the value of the getDrugListWithPagingObjResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrug }
     *     
     */
    public void setGetDrugListWithPagingObjResult(ArrayOfDrug value) {
        this.getDrugListWithPagingObjResult = value;
    }

    /**
     * Gets the value of the totalRecordsAvailable property.
     * 
     */
    public int getTotalRecordsAvailable() {
        return totalRecordsAvailable;
    }

    /**
     * Sets the value of the totalRecordsAvailable property.
     * 
     */
    public void setTotalRecordsAvailable(int value) {
        this.totalRecordsAvailable = value;
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
