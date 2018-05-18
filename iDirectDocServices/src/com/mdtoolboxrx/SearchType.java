
package com.mdtoolboxrx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Common"/>
 *     &lt;enumeration value="Class"/>
 *     &lt;enumeration value="Diagnosis"/>
 *     &lt;enumeration value="Favs"/>
 *     &lt;enumeration value="Supplies"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchType")
@XmlEnum
public enum SearchType {

    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Common")
    COMMON("Common"),
    @XmlEnumValue("Class")
    CLASS("Class"),
    @XmlEnumValue("Diagnosis")
    DIAGNOSIS("Diagnosis"),
    @XmlEnumValue("Favs")
    FAVS("Favs"),
    @XmlEnumValue("Supplies")
    SUPPLIES("Supplies");
    private final String value;

    SearchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchType fromValue(String v) {
        for (SearchType c: SearchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
