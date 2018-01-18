package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für anonymous complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="range" type="{http://www.plcopen.org/xml/tc6_0201}rangeUnsigned"/>
 *         &lt;element name="baseType" type="{http://www.plcopen.org/xml/tc6_0201}dataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "range",
        "baseType"
})
public class SubrangeUnsigned implements PlcNode{

    @XmlElement(required = true)
    protected RangeUnsigned range;
    @XmlElement(required = true)
    protected DataType baseType;

    /**
     * Ruft den Wert der range-Eigenschaft ab.
     *
     * @return possible object is
     * {@link RangeUnsigned }
     */
    public RangeUnsigned getRange() {
        return range;
    }

    /**
     * Legt den Wert der range-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link RangeUnsigned }
     */
    public void setRange(RangeUnsigned value) {
        this.range = value;
    }

    /**
     * Ruft den Wert der baseType-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DataType }
     */
    public DataType getBaseType() {
        return baseType;
    }

    /**
     * Legt den Wert der baseType-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DataType }
     */
    public void setBaseType(DataType value) {
        this.baseType = value;
    }

}
