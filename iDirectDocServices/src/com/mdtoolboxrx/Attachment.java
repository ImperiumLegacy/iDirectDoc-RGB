
package com.mdtoolboxrx;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Attachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileType" type="{http://mdtoolboxrx.com/}AttachmentType"/>
 *         &lt;element name="Base64EncFileData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attachment", propOrder = {
    "fileName",
    "fileType",
    "base64EncFileData"
})
public class Attachment
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "FileType", required = true)
    @XmlSchemaType(name = "string")
    protected AttachmentType fileType;
    @XmlElement(name = "Base64EncFileData")
    protected String base64EncFileData;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     */
    public void setFileType(AttachmentType value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the base64EncFileData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64EncFileData() {
        return base64EncFileData;
    }

    /**
     * Sets the value of the base64EncFileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64EncFileData(String value) {
        this.base64EncFileData = value;
    }

}
