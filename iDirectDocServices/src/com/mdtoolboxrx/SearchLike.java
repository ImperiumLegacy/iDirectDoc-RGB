
package com.mdtoolboxrx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchLike.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchLike">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BeginsWith"/>
 *     &lt;enumeration value="Contains"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchLike")
@XmlEnum
public enum SearchLike {

    @XmlEnumValue("BeginsWith")
    BEGINS_WITH("BeginsWith"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains");
    private final String value;

    SearchLike(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchLike fromValue(String v) {
        for (SearchLike c: SearchLike.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
