
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccountAuthKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PracticeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PracticeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserPermissionLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountId",
    "accountAuthKey",
    "practiceId",
    "practiceName",
    "userId",
    "userName",
    "userPermissionLevel",
    "userFirstName",
    "userLastName",
    "userPosition"
})
public class Account
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AccountId")
    protected int accountId;
    @XmlElement(name = "AccountAuthKey")
    protected String accountAuthKey;
    @XmlElement(name = "PracticeId")
    protected String practiceId;
    @XmlElement(name = "PracticeName")
    protected String practiceName;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "UserPermissionLevel")
    protected int userPermissionLevel;
    @XmlElement(name = "UserFirstName")
    protected String userFirstName;
    @XmlElement(name = "UserLastName")
    protected String userLastName;
    @XmlElement(name = "UserPosition")
    protected String userPosition;

    /**
     * Gets the value of the accountId property.
     * 
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(int value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountAuthKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAuthKey() {
        return accountAuthKey;
    }

    /**
     * Sets the value of the accountAuthKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAuthKey(String value) {
        this.accountAuthKey = value;
    }

    /**
     * Gets the value of the practiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPracticeId() {
        return practiceId;
    }

    /**
     * Sets the value of the practiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPracticeId(String value) {
        this.practiceId = value;
    }

    /**
     * Gets the value of the practiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPracticeName() {
        return practiceName;
    }

    /**
     * Sets the value of the practiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPracticeName(String value) {
        this.practiceName = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
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
     * Gets the value of the userFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFirstName() {
        return userFirstName;
    }

    /**
     * Sets the value of the userFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFirstName(String value) {
        this.userFirstName = value;
    }

    /**
     * Gets the value of the userLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLastName() {
        return userLastName;
    }

    /**
     * Sets the value of the userLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLastName(String value) {
        this.userLastName = value;
    }

    /**
     * Gets the value of the userPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPosition() {
        return userPosition;
    }

    /**
     * Sets the value of the userPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPosition(String value) {
        this.userPosition = value;
    }

}
