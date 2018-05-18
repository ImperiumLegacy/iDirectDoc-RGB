
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
 *         &lt;element name="eSendNewRxResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RouteStatusFlag" type="{http://mdtoolboxrx.com/}RXRouteStatus"/>
 *         &lt;element name="WentByFax" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "eSendNewRxResult",
    "routeStatusFlag",
    "wentByFax",
    "statusFlag",
    "statusMsg"
})
@XmlRootElement(name = "eSendNewRxResponse")
public class ESendNewRxResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String eSendNewRxResult;
    @XmlElement(name = "RouteStatusFlag", required = true)
    @XmlSchemaType(name = "string")
    protected RXRouteStatus routeStatusFlag;
    @XmlElement(name = "WentByFax")
    protected boolean wentByFax;
    @XmlElement(name = "StatusFlag", required = true)
    @XmlSchemaType(name = "string")
    protected Status statusFlag;
    @XmlElement(name = "StatusMsg")
    protected String statusMsg;

    /**
     * Gets the value of the eSendNewRxResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESendNewRxResult() {
        return eSendNewRxResult;
    }

    /**
     * Sets the value of the eSendNewRxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESendNewRxResult(String value) {
        this.eSendNewRxResult = value;
    }

    /**
     * Gets the value of the routeStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link RXRouteStatus }
     *     
     */
    public RXRouteStatus getRouteStatusFlag() {
        return routeStatusFlag;
    }

    /**
     * Sets the value of the routeStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXRouteStatus }
     *     
     */
    public void setRouteStatusFlag(RXRouteStatus value) {
        this.routeStatusFlag = value;
    }

    /**
     * Gets the value of the wentByFax property.
     * 
     */
    public boolean isWentByFax() {
        return wentByFax;
    }

    /**
     * Sets the value of the wentByFax property.
     * 
     */
    public void setWentByFax(boolean value) {
        this.wentByFax = value;
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
