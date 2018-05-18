
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
 *         &lt;element name="DrugId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AllergyIdArray" type="{http://mdtoolboxrx.com/}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="CurMedGenericIdArray" type="{http://mdtoolboxrx.com/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="ConditionIdArray" type="{http://mdtoolboxrx.com/}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="ICD9CodeArray" type="{http://mdtoolboxrx.com/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="IncludeDrugAllergy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeDrugDrug" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeDrugCondition" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeDupTherapy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "drugId",
    "allergyIdArray",
    "curMedGenericIdArray",
    "conditionIdArray",
    "icd9CodeArray",
    "includeDrugAllergy",
    "includeDrugDrug",
    "includeDrugCondition",
    "includeDupTherapy",
    "accountObj"
})
@XmlRootElement(name = "GetInterAlrtsAllArr")
public class GetInterAlrtsAllArr
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DrugId")
    protected int drugId;
    @XmlElement(name = "AllergyIdArray")
    protected ArrayOfInt allergyIdArray;
    @XmlElement(name = "CurMedGenericIdArray")
    protected ArrayOfString curMedGenericIdArray;
    @XmlElement(name = "ConditionIdArray")
    protected ArrayOfInt conditionIdArray;
    @XmlElement(name = "ICD9CodeArray")
    protected ArrayOfString icd9CodeArray;
    @XmlElement(name = "IncludeDrugAllergy")
    protected boolean includeDrugAllergy;
    @XmlElement(name = "IncludeDrugDrug")
    protected boolean includeDrugDrug;
    @XmlElement(name = "IncludeDrugCondition")
    protected boolean includeDrugCondition;
    @XmlElement(name = "IncludeDupTherapy")
    protected boolean includeDupTherapy;
    @XmlElement(name = "AccountObj")
    protected Account accountObj;

    /**
     * Gets the value of the drugId property.
     * 
     */
    public int getDrugId() {
        return drugId;
    }

    /**
     * Sets the value of the drugId property.
     * 
     */
    public void setDrugId(int value) {
        this.drugId = value;
    }

    /**
     * Gets the value of the allergyIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getAllergyIdArray() {
        return allergyIdArray;
    }

    /**
     * Sets the value of the allergyIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setAllergyIdArray(ArrayOfInt value) {
        this.allergyIdArray = value;
    }

    /**
     * Gets the value of the curMedGenericIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCurMedGenericIdArray() {
        return curMedGenericIdArray;
    }

    /**
     * Sets the value of the curMedGenericIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCurMedGenericIdArray(ArrayOfString value) {
        this.curMedGenericIdArray = value;
    }

    /**
     * Gets the value of the conditionIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getConditionIdArray() {
        return conditionIdArray;
    }

    /**
     * Sets the value of the conditionIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setConditionIdArray(ArrayOfInt value) {
        this.conditionIdArray = value;
    }

    /**
     * Gets the value of the icd9CodeArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getICD9CodeArray() {
        return icd9CodeArray;
    }

    /**
     * Sets the value of the icd9CodeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setICD9CodeArray(ArrayOfString value) {
        this.icd9CodeArray = value;
    }

    /**
     * Gets the value of the includeDrugAllergy property.
     * 
     */
    public boolean isIncludeDrugAllergy() {
        return includeDrugAllergy;
    }

    /**
     * Sets the value of the includeDrugAllergy property.
     * 
     */
    public void setIncludeDrugAllergy(boolean value) {
        this.includeDrugAllergy = value;
    }

    /**
     * Gets the value of the includeDrugDrug property.
     * 
     */
    public boolean isIncludeDrugDrug() {
        return includeDrugDrug;
    }

    /**
     * Sets the value of the includeDrugDrug property.
     * 
     */
    public void setIncludeDrugDrug(boolean value) {
        this.includeDrugDrug = value;
    }

    /**
     * Gets the value of the includeDrugCondition property.
     * 
     */
    public boolean isIncludeDrugCondition() {
        return includeDrugCondition;
    }

    /**
     * Sets the value of the includeDrugCondition property.
     * 
     */
    public void setIncludeDrugCondition(boolean value) {
        this.includeDrugCondition = value;
    }

    /**
     * Gets the value of the includeDupTherapy property.
     * 
     */
    public boolean isIncludeDupTherapy() {
        return includeDupTherapy;
    }

    /**
     * Sets the value of the includeDupTherapy property.
     * 
     */
    public void setIncludeDupTherapy(boolean value) {
        this.includeDupTherapy = value;
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
