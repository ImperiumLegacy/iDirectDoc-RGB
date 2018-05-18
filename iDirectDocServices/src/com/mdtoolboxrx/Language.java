
package com.mdtoolboxrx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Language.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Language">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="English"/>
 *     &lt;enumeration value="Spanish"/>
 *     &lt;enumeration value="French"/>
 *     &lt;enumeration value="EnglishPed"/>
 *     &lt;enumeration value="SpanishPed"/>
 *     &lt;enumeration value="FrenchPed"/>
 *     &lt;enumeration value="MultumEnglish"/>
 *     &lt;enumeration value="MultumSpanish"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Language")
@XmlEnum
public enum Language {

    @XmlEnumValue("English")
    ENGLISH("English"),
    @XmlEnumValue("Spanish")
    SPANISH("Spanish"),
    @XmlEnumValue("French")
    FRENCH("French"),
    @XmlEnumValue("EnglishPed")
    ENGLISH_PED("EnglishPed"),
    @XmlEnumValue("SpanishPed")
    SPANISH_PED("SpanishPed"),
    @XmlEnumValue("FrenchPed")
    FRENCH_PED("FrenchPed"),
    @XmlEnumValue("MultumEnglish")
    MULTUM_ENGLISH("MultumEnglish"),
    @XmlEnumValue("MultumSpanish")
    MULTUM_SPANISH("MultumSpanish");
    private final String value;

    Language(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Language fromValue(String v) {
        for (Language c: Language.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
