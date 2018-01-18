package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="dimension" type="{http://www.plcopen.org/xml/tc6_0201}rangeSigned" maxOccurs="unbounded"/>
 *         &lt;element name="baseType" type="{http://www.plcopen.org/xml/tc6_0201}dataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "dimension",
        "baseType"
})
public class PlcArray implements PlcNode{

    @XmlElement(required = true)
    protected List<RangeSigned> dimension;
    @XmlElement(required = true)
    protected DataType baseType;

    /**
     * Gets the value of the dimension property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimension property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimension().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangeSigned }
     */
    public List<RangeSigned> getDimension() {
        if (dimension == null) {
            dimension = new ArrayList<RangeSigned>();
        }
        return this.dimension;
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
