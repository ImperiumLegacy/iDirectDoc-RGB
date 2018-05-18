
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
 *         &lt;element name="GetFormularyDetailDisplayArrDetailResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoverageInfo" type="{http://mdtoolboxrx.com/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="CopayInfo" type="{http://mdtoolboxrx.com/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="PbmAlts" type="{http://mdtoolboxrx.com/}ArrayOfDrugAlt" minOccurs="0"/>
 *         &lt;element name="TherAlts" type="{http://mdtoolboxrx.com/}ArrayOfDrugAlt" minOccurs="0"/>
 *         &lt;element name="ReportingDisplayFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getFormularyDetailDisplayArrDetailResult",
    "coverageInfo",
    "copayInfo",
    "pbmAlts",
    "therAlts",
    "reportingDisplayFlags",
    "statusFlag",
    "statusMsg"
})
@XmlRootElement(name = "GetFormularyDetailDisplayArrDetailResponse")
public class GetFormularyDetailDisplayArrDetailResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GetFormularyDetailDisplayArrDetailResult")
    protected String getFormularyDetailDisplayArrDetailResult;
    @XmlElement(name = "CoverageInfo")
    protected ArrayOfString coverageInfo;
    @XmlElement(name = "CopayInfo")
    protected ArrayOfString copayInfo;
    @XmlElement(name = "PbmAlts")
    protected ArrayOfDrugAlt pbmAlts;
    @XmlElement(name = "TherAlts")
    protected ArrayOfDrugAlt therAlts;
    @XmlElement(name = "ReportingDisplayFlags")
    protected String reportingDisplayFlags;
    @XmlElement(name = "StatusFlag", required = true)
    @XmlSchemaType(name = "string")
    protected Status statusFlag;
    @XmlElement(name = "StatusMsg")
    protected String statusMsg;

    /**
     * Gets the value of the getFormularyDetailDisplayArrDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetFormularyDetailDisplayArrDetailResult() {
        return getFormularyDetailDisplayArrDetailResult;
    }

    /**
     * Sets the value of the getFormularyDetailDisplayArrDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetFormularyDetailDisplayArrDetailResult(String value) {
        this.getFormularyDetailDisplayArrDetailResult = value;
    }

    /**
     * Gets the value of the coverageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCoverageInfo() {
        return coverageInfo;
    }

    /**
     * Sets the value of the coverageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCoverageInfo(ArrayOfString value) {
        this.coverageInfo = value;
    }

    /**
     * Gets the value of the copayInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCopayInfo() {
        return copayInfo;
    }

    /**
     * Sets the value of the copayInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCopayInfo(ArrayOfString value) {
        this.copayInfo = value;
    }

    /**
     * Gets the value of the pbmAlts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrugAlt }
     *     
     */
    public ArrayOfDrugAlt getPbmAlts() {
        return pbmAlts;
    }

    /**
     * Sets the value of the pbmAlts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrugAlt }
     *     
     */
    public void setPbmAlts(ArrayOfDrugAlt value) {
        this.pbmAlts = value;
    }

    /**
     * Gets the value of the therAlts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrugAlt }
     *     
     */
    public ArrayOfDrugAlt getTherAlts() {
        return therAlts;
    }

    /**
     * Sets the value of the therAlts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrugAlt }
     *     
     */
    public void setTherAlts(ArrayOfDrugAlt value) {
        this.therAlts = value;
    }

    /**
     * Gets the value of the reportingDisplayFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingDisplayFlags() {
        return reportingDisplayFlags;
    }

    /**
     * Sets the value of the reportingDisplayFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingDisplayFlags(String value) {
        this.reportingDisplayFlags = value;
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
