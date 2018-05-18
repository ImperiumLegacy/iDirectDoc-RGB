
package com.mdtoolboxrx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Brand"/>
 *     &lt;enumeration value="Generic"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameType")
@XmlEnum
public enum NameType {

    @XmlEnumValue("Brand")
    BRAND("Brand"),
    @XmlEnumValue("Generic")
    GENERIC("Generic"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    NameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameType fromValue(String v) {
        for (NameType c: NameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
