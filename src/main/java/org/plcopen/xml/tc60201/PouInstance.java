//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11-b140731.1112 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.17 um 05:44:19 PM CET 
//


package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Represents a program or function block instance
 * either running with or without a task
 * <p>
 * <p>Java-Klasse für pouInstance complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType name="pouInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="typeName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pouInstance", propOrder = {
        "addData",
        "documentation"
})
public class PouInstance implements AddDataContainer, org.plcopen.xml.tc60201.PlcNode{

    protected AddData addData;
    protected FormattedText documentation;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "typeName", required = true)
    protected String typeName;
    @XmlAttribute(name = "globalId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String globalId;

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
     * Ruft den Wert der documentation-Eigenschaft ab.
     *
     * @return possible object is
     * {@link FormattedText }
     */
    public FormattedText getDocumentation() {
        return documentation;
    }

    /**
     * Legt den Wert der documentation-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link FormattedText }
     */
    public void setDocumentation(FormattedText value) {
        this.documentation = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der typeName-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Legt den Wert der typeName-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

    /**
     * Ruft den Wert der globalId-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGlobalId() {
        return globalId;
    }

    /**
     * Legt den Wert der globalId-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGlobalId(String value) {
        this.globalId = value;
    }

    @Override
    public String toString() {
        return "PouInstance{" +
                "addData=" + addData +
                ", documentation=" + documentation +
                ", name='" + name + '\'' +
                ", typeName='" + typeName + '\'' +
                ", globalId='" + globalId + '\'' +
                '}';
    }
}
