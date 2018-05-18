
package com.mdtoolboxrx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CDA"/>
 *     &lt;enumeration value="CCR"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="DOC"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="JPG"/>
 *     &lt;enumeration value="TIF"/>
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="TXT"/>
 *     &lt;enumeration value="XLS"/>
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="RTF"/>
 *     &lt;enumeration value="XML"/>
 *     &lt;enumeration value="ZIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttachmentType")
@XmlEnum
public enum AttachmentType {

    CDA,
    CCR,
    PDF,
    DOC,
    PNG,
    JPG,
    TIF,
    GIF,
    TXT,
    XLS,
    HTML,
    RTF,
    XML,
    ZIP;

    public String value() {
        return name();
    }

    public static AttachmentType fromValue(String v) {
        return valueOf(v);
    }

}
