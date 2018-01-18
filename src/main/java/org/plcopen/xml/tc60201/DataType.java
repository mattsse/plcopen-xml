//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11-b140731.1112 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.17 um 05:44:19 PM CET 
//


package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * A generic data type
 * <p>
 * <p>Java-Klasse für dataType complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType name="dataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}elementaryTypes"/>
 *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}derivedTypes"/>
 *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}extended"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataType", propOrder = {
        "bool",
        "_byte",
        "word",
        "dword",
        "lword",
        "sint",
        "_int",
        "dint",
        "lint",
        "usint",
        "uint",
        "udint",
        "ulint",
        "real",
        "lreal",
        "time",
        "date",
        "dt",
        "tod",
        "string",
        "wstring",
        "any",
        "anyderived",
        "anyelementary",
        "anymagnitude",
        "anynum",
        "anyreal",
        "anyint",
        "anybit",
        "anystring",
        "anydate",
        "array",
        "derived",
        "_enum",
        "struct",
        "subrangeSigned",
        "subrangeUnsigned",
        "pointer"
})
public class DataType implements org.plcopen.xml.tc60201.PlcNode {

    @XmlElement(name = "BOOL")
    protected Object bool;
    @XmlElement(name = "BYTE")
    protected Object _byte;
    @XmlElement(name = "WORD")
    protected Object word;
    @XmlElement(name = "DWORD")
    protected Object dword;
    @XmlElement(name = "LWORD")
    protected Object lword;
    @XmlElement(name = "SINT")
    protected Object sint;
    @XmlElement(name = "INT")
    protected Object _int;
    @XmlElement(name = "DINT")
    protected Object dint;
    @XmlElement(name = "LINT")
    protected Object lint;
    @XmlElement(name = "USINT")
    protected Object usint;
    @XmlElement(name = "UINT")
    protected Object uint;
    @XmlElement(name = "UDINT")
    protected Object udint;
    @XmlElement(name = "ULINT")
    protected Object ulint;
    @XmlElement(name = "REAL")
    protected Object real;
    @XmlElement(name = "LREAL")
    protected Object lreal;
    @XmlElement(name = "TIME")
    protected Object time;
    @XmlElement(name = "DATE")
    protected Object date;
    @XmlElement(name = "DT")
    protected Object dt;
    @XmlElement(name = "TOD")
    protected Object tod;
    protected DataType.String string;
    protected DataType.Wstring wstring;
    @XmlElement(name = "ANY")
    protected Object any;
    @XmlElement(name = "ANY_DERIVED")
    protected Object anyderived;
    @XmlElement(name = "ANY_ELEMENTARY")
    protected Object anyelementary;
    @XmlElement(name = "ANY_MAGNITUDE")
    protected Object anymagnitude;
    @XmlElement(name = "ANY_NUM")
    protected Object anynum;
    @XmlElement(name = "ANY_REAL")
    protected Object anyreal;
    @XmlElement(name = "ANY_INT")
    protected Object anyint;
    @XmlElement(name = "ANY_BIT")
    protected Object anybit;
    @XmlElement(name = "ANY_STRING")
    protected Object anystring;
    @XmlElement(name = "ANY_DATE")
    protected Object anydate;
    protected DataType.Array array;
    protected DataType.Derived derived;
    @XmlElement(name = "enum")
    protected DataType.Enum _enum;
    protected VarListPlain struct;
    protected DataType.SubrangeSigned subrangeSigned;
    protected DataType.SubrangeUnsigned subrangeUnsigned;
    protected DataType.Pointer pointer;

    /**
     * Ruft den Wert der bool-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getBOOL() {
        return bool;
    }


    @Override
    public <T> List<T> getChildNodes(Class<T> clazz) {
        return Collections.emptyList();
    }

    /**
     * Legt den Wert der bool-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setBOOL(Object value) {
        this.bool = value;
    }

    /**
     * Ruft den Wert der byte-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getBYTE() {
        return _byte;
    }

    /**
     * Legt den Wert der byte-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setBYTE(Object value) {
        this._byte = value;
    }

    /**
     * Ruft den Wert der word-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getWORD() {
        return word;
    }

    /**
     * Legt den Wert der word-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setWORD(Object value) {
        this.word = value;
    }

    /**
     * Ruft den Wert der dword-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getDWORD() {
        return dword;
    }

    /**
     * Legt den Wert der dword-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setDWORD(Object value) {
        this.dword = value;
    }

    /**
     * Ruft den Wert der lword-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getLWORD() {
        return lword;
    }

    /**
     * Legt den Wert der lword-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setLWORD(Object value) {
        this.lword = value;
    }

    /**
     * Ruft den Wert der sint-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getSINT() {
        return sint;
    }

    /**
     * Legt den Wert der sint-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setSINT(Object value) {
        this.sint = value;
    }

    /**
     * Ruft den Wert der int-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getINT() {
        return _int;
    }

    /**
     * Legt den Wert der int-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setINT(Object value) {
        this._int = value;
    }

    /**
     * Ruft den Wert der dint-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getDINT() {
        return dint;
    }

    /**
     * Legt den Wert der dint-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setDINT(Object value) {
        this.dint = value;
    }

    /**
     * Ruft den Wert der lint-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getLINT() {
        return lint;
    }

    /**
     * Legt den Wert der lint-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setLINT(Object value) {
        this.lint = value;
    }

    /**
     * Ruft den Wert der usint-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getUSINT() {
        return usint;
    }

    /**
     * Legt den Wert der usint-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setUSINT(Object value) {
        this.usint = value;
    }

    /**
     * Ruft den Wert der uint-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getUINT() {
        return uint;
    }

    /**
     * Legt den Wert der uint-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setUINT(Object value) {
        this.uint = value;
    }

    /**
     * Ruft den Wert der udint-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getUDINT() {
        return udint;
    }

    /**
     * Legt den Wert der udint-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setUDINT(Object value) {
        this.udint = value;
    }

    /**
     * Ruft den Wert der ulint-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getULINT() {
        return ulint;
    }

    /**
     * Legt den Wert der ulint-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setULINT(Object value) {
        this.ulint = value;
    }

    /**
     * Ruft den Wert der real-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getREAL() {
        return real;
    }

    /**
     * Legt den Wert der real-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setREAL(Object value) {
        this.real = value;
    }

    /**
     * Ruft den Wert der lreal-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getLREAL() {
        return lreal;
    }

    /**
     * Legt den Wert der lreal-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setLREAL(Object value) {
        this.lreal = value;
    }

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getTIME() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setTIME(Object value) {
        this.time = value;
    }

    /**
     * Ruft den Wert der date-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getDATE() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setDATE(Object value) {
        this.date = value;
    }

    /**
     * Ruft den Wert der dt-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getDT() {
        return dt;
    }

    /**
     * Legt den Wert der dt-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setDT(Object value) {
        this.dt = value;
    }

    /**
     * Ruft den Wert der tod-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getTOD() {
        return tod;
    }

    /**
     * Legt den Wert der tod-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setTOD(Object value) {
        this.tod = value;
    }

    /**
     * Ruft den Wert der string-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DataType.String }
     */
    public DataType.String getString() {
        return string;
    }

    /**
     * Legt den Wert der string-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DataType.String }
     */
    public void setString(DataType.String value) {
        this.string = value;
    }

    /**
     * Ruft den Wert der wstring-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DataType.Wstring }
     */
    public DataType.Wstring getWstring() {
        return wstring;
    }

    /**
     * Legt den Wert der wstring-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DataType.Wstring }
     */
    public void setWstring(DataType.Wstring value) {
        this.wstring = value;
    }

    /**
     * Ruft den Wert der any-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getANY() {
        return any;
    }

    /**
     * Legt den Wert der any-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setANY(Object value) {
        this.any = value;
    }

    /**
     * Ruft den Wert der anyderived-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getANYDERIVED() {
        return anyderived;
    }

    /**
     * Legt den Wert der anyderived-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setANYDERIVED(Object value) {
        this.anyderived = value;
    }

    /**
     * Ruft den Wert der anyelementary-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getANYELEMENTARY() {
        return anyelementary;
    }

    /**
     * Legt den Wert der anyelementary-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setANYELEMENTARY(Object value) {
        this.anyelementary = value;
    }

    /**
     * Ruft den Wert der anymagnitude-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getANYMAGNITUDE() {
        return anymagnitude;
    }

    /**
     * Legt den Wert der anymagnitude-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setANYMAGNITUDE(Object value) {
        this.anymagnitude = value;
    }

    /**
     * Ruft den Wert der anynum-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getANYNUM() {
        return anynum;
    }

    /**
     * Legt den Wert der anynum-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setANYNUM(Object value) {
        this.anynum = value;
    }

    /**
     * Ruft den Wert der anyreal-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getANYREAL() {
        return anyreal;
    }

    /**
     * Legt den Wert der anyreal-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setANYREAL(Object value) {
        this.anyreal = value;
    }

    /**
     * Ruft den Wert der anyint-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getANYINT() {
        return anyint;
    }

    /**
     * Legt den Wert der anyint-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setANYINT(Object value) {
        this.anyint = value;
    }

    /**
     * Ruft den Wert der anybit-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getANYBIT() {
        return anybit;
    }

    /**
     * Legt den Wert der anybit-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setANYBIT(Object value) {
        this.anybit = value;
    }

    /**
     * Ruft den Wert der anystring-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getANYSTRING() {
        return anystring;
    }

    /**
     * Legt den Wert der anystring-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setANYSTRING(Object value) {
        this.anystring = value;
    }

    /**
     * Ruft den Wert der anydate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getANYDATE() {
        return anydate;
    }

    /**
     * Legt den Wert der anydate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setANYDATE(Object value) {
        this.anydate = value;
    }

    /**
     * Ruft den Wert der array-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DataType.Array }
     */
    public DataType.Array getArray() {
        return array;
    }

    /**
     * Legt den Wert der array-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DataType.Array }
     */
    public void setArray(DataType.Array value) {
        this.array = value;
    }

    /**
     * Ruft den Wert der derived-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DataType.Derived }
     */
    public DataType.Derived getDerived() {
        return derived;
    }

    /**
     * Legt den Wert der derived-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DataType.Derived }
     */
    public void setDerived(DataType.Derived value) {
        this.derived = value;
    }

    /**
     * Ruft den Wert der enum-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DataType.Enum }
     */
    public DataType.Enum getEnum() {
        return _enum;
    }

    /**
     * Legt den Wert der enum-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DataType.Enum }
     */
    public void setEnum(DataType.Enum value) {
        this._enum = value;
    }

    /**
     * Ruft den Wert der struct-Eigenschaft ab.
     *
     * @return possible object is
     * {@link VarListPlain }
     */
    public VarListPlain getStruct() {
        return struct;
    }

    /**
     * Legt den Wert der struct-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link VarListPlain }
     */
    public void setStruct(VarListPlain value) {
        this.struct = value;
    }

    /**
     * Ruft den Wert der subrangeSigned-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DataType.SubrangeSigned }
     */
    public DataType.SubrangeSigned getSubrangeSigned() {
        return subrangeSigned;
    }

    /**
     * Legt den Wert der subrangeSigned-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DataType.SubrangeSigned }
     */
    public void setSubrangeSigned(DataType.SubrangeSigned value) {
        this.subrangeSigned = value;
    }

    /**
     * Ruft den Wert der subrangeUnsigned-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DataType.SubrangeUnsigned }
     */
    public DataType.SubrangeUnsigned getSubrangeUnsigned() {
        return subrangeUnsigned;
    }

    /**
     * Legt den Wert der subrangeUnsigned-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DataType.SubrangeUnsigned }
     */
    public void setSubrangeUnsigned(DataType.SubrangeUnsigned value) {
        this.subrangeUnsigned = value;
    }

    /**
     * Ruft den Wert der pointer-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DataType.Pointer }
     */
    public DataType.Pointer getPointer() {
        return pointer;
    }

    /**
     * Legt den Wert der pointer-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DataType.Pointer }
     */
    public void setPointer(DataType.Pointer value) {
        this.pointer = value;
    }


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
    public static class Array implements org.plcopen.xml.tc60201.PlcNode{

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


    /**
     * The user defined alias type
     * <p>
     * <p>Java-Klasse für anonymous complex type.
     * <p>
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "addData"
    })
    public static class Derived implements AddDataContainer, org.plcopen.xml.tc60201.PlcNode {

        protected AddData addData;
        @XmlAttribute(name = "name", required = true)
        protected java.lang.String name;

        /**
         * Ruft den Wert der addData-Eigenschaft ab.
         *
         * @return possible object is
         * {@link AddData }
         */
        public AddData getAddData() {
            return addData;
        }

        /**
         * Legt den Wert der addData-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link AddData }
         */
        public void setAddData(AddData value) {
            this.addData = value;
        }

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         *
         * @return possible object is
         * {@link java.lang.String }
         */
        public java.lang.String getName() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link java.lang.String }
         */
        public void setName(java.lang.String value) {
            this.name = value;
        }

    }


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
     *         &lt;element name="values">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="value">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="baseType" type="{http://www.plcopen.org/xml/tc6_0201}dataType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "values",
            "baseType"
    })
    public static class Enum implements org.plcopen.xml.tc60201.PlcNode{

        @XmlElement(required = true)
        protected DataType.Enum.Values values;
        protected DataType baseType;

        /**
         * Ruft den Wert der values-Eigenschaft ab.
         *
         * @return possible object is
         * {@link DataType.Enum.Values }
         */
        public DataType.Enum.Values getValues() {
            return values;
        }

        /**
         * Legt den Wert der values-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link DataType.Enum.Values }
         */
        public void setValues(DataType.Enum.Values value) {
            this.values = value;
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


        /**
         * <p>Java-Klasse für anonymous complex type.
         * <p>
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence maxOccurs="unbounded">
         *         &lt;element name="value">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
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
        public static class Values implements org.plcopen.xml.tc60201.PlcNode{

            @XmlElement(required = true)
            protected List<DataType.Enum.Values.Value> value;

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
             * {@link DataType.Enum.Values.Value }
             */
            public List<DataType.Enum.Values.Value> getValue() {
                if (value == null) {
                    value = new ArrayList<DataType.Enum.Values.Value>();
                }
                return this.value;
            }


            /**
             * An enumeration value used to build up
             * enumeration types
             * <p>
             * <p>Java-Klasse für anonymous complex type.
             * <p>
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Value implements org.plcopen.xml.tc60201.PlcNode{

                @XmlAttribute(name = "name", required = true)
                protected java.lang.String name;
                @XmlAttribute(name = "value")
                protected java.lang.String value;

                /**
                 * Ruft den Wert der name-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link java.lang.String }
                 */
                public java.lang.String getName() {
                    return name;
                }

                /**
                 * Legt den Wert der name-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link java.lang.String }
                 */
                public void setName(java.lang.String value) {
                    this.name = value;
                }

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link java.lang.String }
                 */
                public java.lang.String getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link java.lang.String }
                 */
                public void setValue(java.lang.String value) {
                    this.value = value;
                }

            }

        }

    }


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
     *         &lt;element name="baseType" type="{http://www.plcopen.org/xml/tc6_0201}dataType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "baseType"
    })
    public static class Pointer implements org.plcopen.xml.tc60201.PlcNode{

        @XmlElement(required = true)
        protected DataType baseType;

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


    /**
     * The single byte character string type
     * <p>
     * <p>
     * <p>Java-Klasse für anonymous complex type.
     * <p>
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class String implements org.plcopen.xml.tc60201.PlcNode{

        @XmlAttribute(name = "length")
        protected java.lang.String length;

        /**
         * Ruft den Wert der length-Eigenschaft ab.
         *
         * @return possible object is
         * {@link java.lang.String }
         */
        public java.lang.String getLength() {
            return length;
        }

        /**
         * Legt den Wert der length-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link java.lang.String }
         */
        public void setLength(java.lang.String value) {
            this.length = value;
        }

    }


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
     *         &lt;element name="range" type="{http://www.plcopen.org/xml/tc6_0201}rangeSigned"/>
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
    public static class SubrangeSigned implements org.plcopen.xml.tc60201.PlcNode{

        @XmlElement(required = true)
        protected RangeSigned range;
        @XmlElement(required = true)
        protected DataType baseType;

        /**
         * Ruft den Wert der range-Eigenschaft ab.
         *
         * @return possible object is
         * {@link RangeSigned }
         */
        public RangeSigned getRange() {
            return range;
        }

        /**
         * Legt den Wert der range-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link RangeSigned }
         */
        public void setRange(RangeSigned value) {
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
    public static class SubrangeUnsigned implements org.plcopen.xml.tc60201.PlcNode{

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


    /**
     * The wide character (WORD) string type
     * <p>
     * <p>
     * <p>Java-Klasse für anonymous complex type.
     * <p>
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Wstring implements org.plcopen.xml.tc60201.PlcNode{

        @XmlAttribute(name = "length")
        protected java.lang.String length;

        /**
         * Ruft den Wert der length-Eigenschaft ab.
         *
         * @return possible object is
         * {@link java.lang.String }
         */
        public java.lang.String getLength() {
            return length;
        }

        /**
         * Legt den Wert der length-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link java.lang.String }
         */
        public void setLength(java.lang.String value) {
            this.length = value;
        }

    }

}
