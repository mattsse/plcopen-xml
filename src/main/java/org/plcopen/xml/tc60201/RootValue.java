//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11-b140731.1112 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.17 um 05:44:19 PM CET 
//


package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * A generic value
 * <p>
 * <p>Java-Klasse für value complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType name="value">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="simpleValue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="arrayValue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}value">
 *                           &lt;attribute name="repetitionValue" type="{http://www.w3.org/2001/XMLSchema}string" default="1" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="structValue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}value">
 *                           &lt;attribute name="member" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "value", propOrder = {
        "simpleValue",
        "arrayValue",
        "structValue"
})
@XmlSeeAlso({
        RootValue.ArrayValue.Value.class,
        RootValue.StructValue.Value.class
})
public class RootValue implements org.plcopen.xml.tc60201.PlcNode{

    protected RootValue.SimpleValue simpleValue;
    protected RootValue.ArrayValue arrayValue;
    protected RootValue.StructValue structValue;

    /**
     * Ruft den Wert der simpleValue-Eigenschaft ab.
     *
     * @return possible object is
     * {@link RootValue.SimpleValue }
     */
    public RootValue.SimpleValue getSimpleValue() {
        return simpleValue;
    }

    /**
     * Legt den Wert der simpleValue-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link RootValue.SimpleValue }
     */
    public void setSimpleValue(RootValue.SimpleValue value) {
        this.simpleValue = value;
    }

    /**
     * Ruft den Wert der arrayValue-Eigenschaft ab.
     *
     * @return possible object is
     * {@link RootValue.ArrayValue }
     */
    public RootValue.ArrayValue getArrayValue() {
        return arrayValue;
    }

    /**
     * Legt den Wert der arrayValue-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link RootValue.ArrayValue }
     */
    public void setArrayValue(RootValue.ArrayValue value) {
        this.arrayValue = value;
    }

    /**
     * Ruft den Wert der structValue-Eigenschaft ab.
     *
     * @return possible object is
     * {@link RootValue.StructValue }
     */
    public RootValue.StructValue getStructValue() {
        return structValue;
    }

    /**
     * Legt den Wert der structValue-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link RootValue.StructValue }
     */
    public void setStructValue(RootValue.StructValue value) {
        this.structValue = value;
    }


    /**
     * PlcArray value consisting of a list of occurrances
     * - value pairs
     * <p>
     * <p>Java-Klasse für anonymous complex type.
     * <p>
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="value">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}value">
     *                 &lt;attribute name="repetitionValue" type="{http://www.w3.org/2001/XMLSchema}string" default="1" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    public static class ArrayValue implements org.plcopen.xml.tc60201.PlcNode{

        protected List<RootValue.ArrayValue.Value> value;

        /**
         * Gets the value of the value property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Value.ArrayValue.Value }
         */
        public List<Value.ArrayValue.Value> getValue() {
            if (value == null) {
                value = new ArrayList<Value.ArrayValue.Value>();
            }
            return this.value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * <p>
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}value">
         *       &lt;attribute name="repetitionValue" type="{http://www.w3.org/2001/XMLSchema}string" default="1" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Value
                extends RootValue {

            @XmlAttribute(name = "repetitionValue")
            protected String repetitionValue;

            /**
             * Ruft den Wert der repetitionValue-Eigenschaft ab.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRepetitionValue() {
                if (repetitionValue == null) {
                    return "1";
                } else {
                    return repetitionValue;
                }
            }

            /**
             * Legt den Wert der repetitionValue-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRepetitionValue(String value) {
                this.repetitionValue = value;
            }

        }

    }


    /**
     * Value that can be represented as a single token
     * string
     * <p>
     * <p>Java-Klasse für anonymous complex type.
     * <p>
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SimpleValue implements org.plcopen.xml.tc60201.PlcNode{

        @XmlAttribute(name = "value")
        protected String value;

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
            this.value = value;
        }

    }


    /**
     * Struct value consisting of a list of member -
     * value pairs
     * <p>
     * <p>Java-Klasse für anonymous complex type.
     * <p>
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="value">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}value">
     *                 &lt;attribute name="member" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    public static class StructValue implements org.plcopen.xml.tc60201.PlcNode{

        protected List<Value.StructValue.Value> value;

        /**
         * Gets the value of the value property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Value.StructValue.Value }
         */
        public List<Value.StructValue.Value> getValue() {
            if (value == null) {
                value = new ArrayList<Value.StructValue.Value>();
            }
            return this.value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * <p>
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}value">
         *       &lt;attribute name="member" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Value
                extends RootValue {

            @XmlAttribute(name = "member", required = true)
            protected String member;

            /**
             * Ruft den Wert der member-Eigenschaft ab.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMember() {
                return member;
            }

            /**
             * Legt den Wert der member-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMember(String value) {
                this.member = value;
            }

        }

    }

}
