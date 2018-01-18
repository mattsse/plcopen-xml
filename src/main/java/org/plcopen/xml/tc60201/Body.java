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
 * Implementation part of a POU, action or
 * transistion
 * <p>
 * <p>Java-Klasse für body complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType name="body">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="IL" type="{http://www.plcopen.org/xml/tc6_0201}formattedText"/>
 *           &lt;element name="ST" type="{http://www.plcopen.org/xml/tc6_0201}formattedText"/>
 *           &lt;element name="FBD">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}commonObjects"/>
 *                     &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}fbdObjects"/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="LD">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}commonObjects"/>
 *                     &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}fbdObjects"/>
 *                     &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}ldObjects"/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="SFC">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}commonObjects"/>
 *                     &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}fbdObjects"/>
 *                     &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}ldObjects"/>
 *                     &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}sfcObjects"/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WorksheetName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "body", propOrder = {
        "il",
        "st",
        "fbd",
        "ld",
        "sfc",
        "addData",
        "documentation"
})
@XmlSeeAlso({
        SFC.Transition.Condition.Inline.class
})
public class Body implements AddDataContainer, org.plcopen.xml.tc60201.PlcNode{

    @XmlElement(name = "IL")
    protected FormattedText il;
    @XmlElement(name = "ST")
    protected FormattedText st;
    @XmlElement(name = "FBD")
    protected FBD fbd;
    @XmlElement(name = "LD")
    protected LD ld;
    @XmlElement(name = "SFC")
    protected SFC sfc;
    protected AddData addData;
    protected FormattedText documentation;
    @XmlAttribute(name = "WorksheetName")
    protected String worksheetName;
    @XmlAttribute(name = "globalId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String globalId;

    /**
     * Ruft den Wert der il-Eigenschaft ab.
     *
     * @return possible object is
     * {@link FormattedText }
     */
    public FormattedText getIL() {
        return il;
    }

    /**
     * Legt den Wert der il-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link FormattedText }
     */
    public void setIL(FormattedText value) {
        this.il = value;
    }

    /**
     * Ruft den Wert der st-Eigenschaft ab.
     *
     * @return possible object is
     * {@link FormattedText }
     */
    public FormattedText getST() {
        return st;
    }

    /**
     * Legt den Wert der st-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link FormattedText }
     */
    public void setST(FormattedText value) {
        this.st = value;
    }

    /**
     * Ruft den Wert der fbd-Eigenschaft ab.
     *
     * @return possible object is
     * {@link FBD }
     */
    public FBD getFBD() {
        return fbd;
    }

    /**
     * Legt den Wert der fbd-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link FBD }
     */
    public void setFBD(FBD value) {
        this.fbd = value;
    }

    /**
     * Ruft den Wert der ld-Eigenschaft ab.
     *
     * @return possible object is
     * {@link LD }
     */
    public LD getLD() {
        return ld;
    }

    /**
     * Legt den Wert der ld-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link LD }
     */
    public void setLD(LD value) {
        this.ld = value;
    }

    /**
     * Ruft den Wert der sfc-Eigenschaft ab.
     *
     * @return possible object is
     * {@link SFC }
     */
    public SFC getSFC() {
        return sfc;
    }

    /**
     * Legt den Wert der sfc-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link SFC }
     */
    public void setSFC(SFC value) {
        this.sfc = value;
    }

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
     * Ruft den Wert der worksheetName-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWorksheetName() {
        return worksheetName;
    }

    /**
     * Legt den Wert der worksheetName-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWorksheetName(String value) {
        this.worksheetName = value;
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
        return "Body{" +
                "il=" + il +
                ", st=" + st +
                ", fbd=" + fbd +
                ", ld=" + ld +
                ", sfc=" + sfc +
                ", addData=" + addData +
                ", documentation=" + documentation +
                ", worksheetName='" + worksheetName + '\'' +
                ", globalId='" + globalId + '\'' +
                '}';
    }

}
