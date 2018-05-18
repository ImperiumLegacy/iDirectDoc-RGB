
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
 *         &lt;element name="LoginStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserPermissionLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HasActiveToken" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanApprove" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanSignSend" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAccessControlManager" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "loginStatus",
    "userPermissionLevel",
    "hasActiveToken",
    "canApprove",
    "canSignSend",
    "isAccessControlManager",
    "statusFlag",
    "statusMsg"
})
@XmlRootElement(name = "CheckUserRegistrationResponse")
public class CheckUserRegistrationResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LoginStatus")
    protected int loginStatus;
    @XmlElement(name = "UserPermissionLevel")
    protected int userPermissionLevel;
    @XmlElement(name = "HasActiveToken")
    protected boolean hasActiveToken;
    @XmlElement(name = "CanApprove")
    protected boolean canApprove;
    @XmlElement(name = "CanSignSend")
    protected boolean canSignSend;
    @XmlElement(name = "IsAccessControlManager")
    protected boolean isAccessControlManager;
    @XmlElement(name = "StatusFlag", required = true)
    @XmlSchemaType(name = "string")
    protected Status statusFlag;
    @XmlElement(name = "StatusMsg")
    protected String statusMsg;

    /**
     * Gets the value of the loginStatus property.
     * 
     */
    public int getLoginStatus() {
        return loginStatus;
    }

    /**
     * Sets the value of the loginStatus property.
     * 
     */
    public void setLoginStatus(int value) {
        this.loginStatus = value;
    }

    /**
     * Gets the value of the userPermissionLevel property.
     * 
     */
    public int getUserPermissionLevel() {
        return userPermissionLevel;
    }

    /**
     * Sets the value of the userPermissionLevel property.
     * 
     */
    public void setUserPermissionLevel(int value) {
        this.userPermissionLevel = value;
    }

    /**
     * Gets the value of the hasActiveToken property.
     * 
     */
    public boolean isHasActiveToken() {
        return hasActiveToken;
    }

    /**
     * Sets the value of the hasActiveToken property.
     * 
     */
    public void setHasActiveToken(boolean value) {
        this.hasActiveToken = value;
    }

    /**
     * Gets the value of the canApprove property.
     * 
     */
    public boolean isCanApprove() {
        return canApprove;
    }

    /**
     * Sets the value of the canApprove property.
     * 
     */
    public void setCanApprove(boolean value) {
        this.canApprove = value;
    }

    /**
     * Gets the value of the canSignSend property.
     * 
     */
    public boolean isCanSignSend() {
        return canSignSend;
    }

    /**
     * Sets the value of the canSignSend property.
     * 
     */
    public void setCanSignSend(boolean value) {
        this.canSignSend = value;
    }

    /**
     * Gets the value of the isAccessControlManager property.
     * 
     */
    public boolean isIsAccessControlManager() {
        return isAccessControlManager;
    }

    /**
     * Sets the value of the isAccessControlManager property.
     * 
     */
    public void setIsAccessControlManager(boolean value) {
        this.isAccessControlManager = value;
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
