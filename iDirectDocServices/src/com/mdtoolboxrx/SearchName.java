
package com.mdtoolboxrx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DrugDisplayName"/>
 *     &lt;enumeration value="GenericName"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchName")
@XmlEnum
public enum SearchName {

    @XmlEnumValue("DrugDisplayName")
    DRUG_DISPLAY_NAME("DrugDisplayName"),
    @XmlEnumValue("GenericName")
    GENERIC_NAME("GenericName"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    SearchName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchName fromValue(String v) {
        for (SearchName c: SearchName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
