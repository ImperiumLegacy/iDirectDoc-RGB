
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="ProviderObj" type="{http://mdtoolboxrx.com/}Prescriber" minOccurs="0"/>
 *         &lt;element name="RegDirectMailUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegisterForRx" type="{http://mdtoolboxrx.com/}SurescriptsServices" minOccurs="0"/>
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
    "providerObj",
    "regDirectMailUserName",
    "registerForRx",
    "accountObj"
})
@XmlRootElement(name = "HIERegisterProvider")
public class HIERegisterProvider
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProviderObj")
    protected Prescriber providerObj;
    @XmlElement(name = "RegDirectMailUserName")
    protected String regDirectMailUserName;
    @XmlElement(name = "RegisterForRx")
    protected SurescriptsServices registerForRx;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the providerObj property.
     * 
     * @return
     *     possible object is
     *     {@link Prescriber }
     *     
     */
    public Prescriber getProviderObj() {
        return providerObj;
    }

    /**
     * Sets the value of the providerObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prescriber }
     *     
     */
    public void setProviderObj(Prescriber value) {
        this.providerObj = value;
    }

    /**
     * Gets the value of the regDirectMailUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDirectMailUserName() {
        return regDirectMailUserName;
    }

    /**
     * Sets the value of the regDirectMailUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDirectMailUserName(String value) {
        this.regDirectMailUserName = value;
    }

    /**
     * Gets the value of the registerForRx property.
     * 
     * @return
     *     possible object is
     *     {@link SurescriptsServices }
     *     
     */
    public SurescriptsServices getRegisterForRx() {
        return registerForRx;
    }

    /**
     * Sets the value of the registerForRx property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurescriptsServices }
     *     
     */
    public void setRegisterForRx(SurescriptsServices value) {
        this.registerForRx = value;
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
