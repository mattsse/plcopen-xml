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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


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
        Body.SFC.Transition.Condition.Inline.class
})
public class Body {

    @XmlElement(name = "IL")
    protected FormattedText il;
    @XmlElement(name = "ST")
    protected FormattedText st;
    @XmlElement(name = "FBD")
    protected Body.FBD fbd;
    @XmlElement(name = "LD")
    protected Body.LD ld;
    @XmlElement(name = "SFC")
    protected Body.SFC sfc;
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
     * {@link Body.FBD }
     */
    public Body.FBD getFBD() {
        return fbd;
    }

    /**
     * Legt den Wert der fbd-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Body.FBD }
     */
    public void setFBD(Body.FBD value) {
        this.fbd = value;
    }

    /**
     * Ruft den Wert der ld-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Body.LD }
     */
    public Body.LD getLD() {
        return ld;
    }

    /**
     * Legt den Wert der ld-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Body.LD }
     */
    public void setLD(Body.LD value) {
        this.ld = value;
    }

    /**
     * Ruft den Wert der sfc-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Body.SFC }
     */
    public Body.SFC getSFC() {
        return sfc;
    }

    /**
     * Legt den Wert der sfc-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Body.SFC }
     */
    public void setSFC(Body.SFC value) {
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

    /**
     * <p>Java-Klasse für anonymous complex type.
     * <p>
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}commonObjects"/>
     *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}fbdObjects"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "commentOrErrorOrConnector"
    })
    public static class FBD {

        @XmlElements({
                @XmlElement(name = "comment", type = Body.SFC.Comment.class),
                @XmlElement(name = "error", type = Body.SFC.Error.class),
                @XmlElement(name = "connector", type = Body.SFC.Connector.class),
                @XmlElement(name = "continuation", type = Body.SFC.Continuation.class),
                @XmlElement(name = "actionBlock", type = Body.SFC.ActionBlock.class),
                @XmlElement(name = "vendorElement", type = Body.SFC.VendorElement.class),
                @XmlElement(name = "block", type = Body.SFC.Block.class),
                @XmlElement(name = "inVariable", type = Body.SFC.InVariable.class),
                @XmlElement(name = "outVariable", type = Body.SFC.OutVariable.class),
                @XmlElement(name = "inOutVariable", type = Body.SFC.InOutVariable.class),
                @XmlElement(name = "label", type = Body.SFC.Label.class),
                @XmlElement(name = "jump", type = Body.SFC.Jump.class),
                @XmlElement(name = "return", type = Body.SFC.Return.class)
        })
        protected List<Object> commentOrErrorOrConnector;

        /**
         * Gets the value of the commentOrErrorOrConnector property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commentOrErrorOrConnector property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommentOrErrorOrConnector().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Body.SFC.Comment }
         * {@link Body.SFC.Error }
         * {@link Body.SFC.Connector }
         * {@link Body.SFC.Continuation }
         * {@link Body.SFC.ActionBlock }
         * {@link Body.SFC.VendorElement }
         * {@link Body.SFC.Block }
         * {@link Body.SFC.InVariable }
         * {@link Body.SFC.OutVariable }
         * {@link Body.SFC.InOutVariable }
         * {@link Body.SFC.Label }
         * {@link Body.SFC.Jump }
         * {@link Body.SFC.Return }
         */
        public List<Object> getCommentOrErrorOrConnector() {
            if (commentOrErrorOrConnector == null) {
                commentOrErrorOrConnector = new ArrayList<Object>();
            }
            return this.commentOrErrorOrConnector;
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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}commonObjects"/>
     *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}fbdObjects"/>
     *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}ldObjects"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "commentOrErrorOrConnector"
    })
    public static class LD {

        @XmlElements({
                @XmlElement(name = "comment", type = Body.SFC.Comment.class),
                @XmlElement(name = "error", type = Body.SFC.Error.class),
                @XmlElement(name = "connector", type = Body.SFC.Connector.class),
                @XmlElement(name = "continuation", type = Body.SFC.Continuation.class),
                @XmlElement(name = "actionBlock", type = Body.SFC.ActionBlock.class),
                @XmlElement(name = "vendorElement", type = Body.SFC.VendorElement.class),
                @XmlElement(name = "block", type = Body.SFC.Block.class),
                @XmlElement(name = "inVariable", type = Body.SFC.InVariable.class),
                @XmlElement(name = "outVariable", type = Body.SFC.OutVariable.class),
                @XmlElement(name = "inOutVariable", type = Body.SFC.InOutVariable.class),
                @XmlElement(name = "label", type = Body.SFC.Label.class),
                @XmlElement(name = "jump", type = Body.SFC.Jump.class),
                @XmlElement(name = "return", type = Body.SFC.Return.class),
                @XmlElement(name = "leftPowerRail", type = Body.SFC.LeftPowerRail.class),
                @XmlElement(name = "rightPowerRail", type = Body.SFC.RightPowerRail.class),
                @XmlElement(name = "coil", type = Body.SFC.Coil.class),
                @XmlElement(name = "contact", type = Body.SFC.Contact.class)
        })
        protected List<Object> commentOrErrorOrConnector;

        /**
         * Gets the value of the commentOrErrorOrConnector property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commentOrErrorOrConnector property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommentOrErrorOrConnector().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Body.SFC.Comment }
         * {@link Body.SFC.Error }
         * {@link Body.SFC.Connector }
         * {@link Body.SFC.Continuation }
         * {@link Body.SFC.ActionBlock }
         * {@link Body.SFC.VendorElement }
         * {@link Body.SFC.Block }
         * {@link Body.SFC.InVariable }
         * {@link Body.SFC.OutVariable }
         * {@link Body.SFC.InOutVariable }
         * {@link Body.SFC.Label }
         * {@link Body.SFC.Jump }
         * {@link Body.SFC.Return }
         * {@link Body.SFC.LeftPowerRail }
         * {@link Body.SFC.RightPowerRail }
         * {@link Body.SFC.Coil }
         * {@link Body.SFC.Contact }
         */
        public List<Object> getCommentOrErrorOrConnector() {
            if (commentOrErrorOrConnector == null) {
                commentOrErrorOrConnector = new ArrayList<Object>();
            }
            return this.commentOrErrorOrConnector;
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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}commonObjects"/>
     *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}fbdObjects"/>
     *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}ldObjects"/>
     *         &lt;group ref="{http://www.plcopen.org/xml/tc6_0201}sfcObjects"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "commentOrErrorOrConnector"
    })
    public static class SFC {

        @XmlElements({
                @XmlElement(name = "comment", type = Body.SFC.Comment.class),
                @XmlElement(name = "error", type = Body.SFC.Error.class),
                @XmlElement(name = "connector", type = Body.SFC.Connector.class),
                @XmlElement(name = "continuation", type = Body.SFC.Continuation.class),
                @XmlElement(name = "actionBlock", type = Body.SFC.ActionBlock.class),
                @XmlElement(name = "vendorElement", type = Body.SFC.VendorElement.class),
                @XmlElement(name = "block", type = Body.SFC.Block.class),
                @XmlElement(name = "inVariable", type = Body.SFC.InVariable.class),
                @XmlElement(name = "outVariable", type = Body.SFC.OutVariable.class),
                @XmlElement(name = "inOutVariable", type = Body.SFC.InOutVariable.class),
                @XmlElement(name = "label", type = Body.SFC.Label.class),
                @XmlElement(name = "jump", type = Body.SFC.Jump.class),
                @XmlElement(name = "return", type = Body.SFC.Return.class),
                @XmlElement(name = "leftPowerRail", type = Body.SFC.LeftPowerRail.class),
                @XmlElement(name = "rightPowerRail", type = Body.SFC.RightPowerRail.class),
                @XmlElement(name = "coil", type = Body.SFC.Coil.class),
                @XmlElement(name = "contact", type = Body.SFC.Contact.class),
                @XmlElement(name = "step", type = Body.SFC.Step.class),
                @XmlElement(name = "macroStep", type = Body.SFC.MacroStep.class),
                @XmlElement(name = "jumpStep", type = Body.SFC.JumpStep.class),
                @XmlElement(name = "transition", type = Body.SFC.Transition.class),
                @XmlElement(name = "selectionDivergence", type = Body.SFC.SelectionDivergence.class),
                @XmlElement(name = "selectionConvergence", type = Body.SFC.SelectionConvergence.class),
                @XmlElement(name = "simultaneousDivergence", type = Body.SFC.SimultaneousDivergence.class),
                @XmlElement(name = "simultaneousConvergence", type = Body.SFC.SimultaneousConvergence.class)
        })
        protected List<Object> commentOrErrorOrConnector;

        /**
         * Gets the value of the commentOrErrorOrConnector property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commentOrErrorOrConnector property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommentOrErrorOrConnector().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Body.SFC.Comment }
         * {@link Body.SFC.Error }
         * {@link Body.SFC.Connector }
         * {@link Body.SFC.Continuation }
         * {@link Body.SFC.ActionBlock }
         * {@link Body.SFC.VendorElement }
         * {@link Body.SFC.Block }
         * {@link Body.SFC.InVariable }
         * {@link Body.SFC.OutVariable }
         * {@link Body.SFC.InOutVariable }
         * {@link Body.SFC.Label }
         * {@link Body.SFC.Jump }
         * {@link Body.SFC.Return }
         * {@link Body.SFC.LeftPowerRail }
         * {@link Body.SFC.RightPowerRail }
         * {@link Body.SFC.Coil }
         * {@link Body.SFC.Contact }
         * {@link Body.SFC.Step }
         * {@link Body.SFC.MacroStep }
         * {@link Body.SFC.JumpStep }
         * {@link Body.SFC.Transition }
         * {@link Body.SFC.SelectionDivergence }
         * {@link Body.SFC.SelectionConvergence }
         * {@link Body.SFC.SimultaneousDivergence }
         * {@link Body.SFC.SimultaneousConvergence }
         */
        public List<Object> getCommentOrErrorOrConnector() {
            if (commentOrErrorOrConnector == null) {
                commentOrErrorOrConnector = new ArrayList<Object>();
            }
            return this.commentOrErrorOrConnector;
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="action" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="relPosition" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *                   &lt;element name="reference" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="inline" type="{http://www.plcopen.org/xml/tc6_0201}body" minOccurs="0"/>
         *                   &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *                   &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *                 &lt;attribute name="qualifier" default="N">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *                       &lt;enumeration value="P1"/>
         *                       &lt;enumeration value="N"/>
         *                       &lt;enumeration value="P0"/>
         *                       &lt;enumeration value="R"/>
         *                       &lt;enumeration value="S"/>
         *                       &lt;enumeration value="L"/>
         *                       &lt;enumeration value="D"/>
         *                       &lt;enumeration value="P"/>
         *                       &lt;enumeration value="DS"/>
         *                       &lt;enumeration value="DL"/>
         *                       &lt;enumeration value="SD"/>
         *                       &lt;enumeration value="SL"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="indicator" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *                 &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "action",
                "addData",
                "documentation"
        })
        public static class ActionBlock {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            protected List<Body.SFC.ActionBlock.Action> action;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "negated")
            protected Boolean negated;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
            }

            /**
             * Gets the value of the action property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the action property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAction().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Body.SFC.ActionBlock.Action }
             */
            public List<Body.SFC.ActionBlock.Action> getAction() {
                if (action == null) {
                    action = new ArrayList<Body.SFC.ActionBlock.Action>();
                }
                return this.action;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der negated-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Boolean }
             */
            public boolean isNegated() {
                if (negated == null) {
                    return false;
                } else {
                    return negated;
                }
            }

            /**
             * Legt den Wert der negated-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setNegated(Boolean value) {
                this.negated = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
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


            /**
             * Association of an action with qualifier
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
             *       &lt;sequence>
             *         &lt;element name="relPosition" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
             *         &lt;element name="reference" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="inline" type="{http://www.plcopen.org/xml/tc6_0201}body" minOccurs="0"/>
             *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
             *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
             *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
             *       &lt;attribute name="qualifier" default="N">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
             *             &lt;enumeration value="P1"/>
             *             &lt;enumeration value="N"/>
             *             &lt;enumeration value="P0"/>
             *             &lt;enumeration value="R"/>
             *             &lt;enumeration value="S"/>
             *             &lt;enumeration value="L"/>
             *             &lt;enumeration value="D"/>
             *             &lt;enumeration value="P"/>
             *             &lt;enumeration value="DS"/>
             *             &lt;enumeration value="DL"/>
             *             &lt;enumeration value="SD"/>
             *             &lt;enumeration value="SL"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="indicator" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
             *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "relPosition",
                    "reference",
                    "inline",
                    "connectionPointOut",
                    "addData",
                    "documentation"
            })
            public static class Action {

                @XmlElement(required = true)
                protected Position relPosition;
                protected Body.SFC.ActionBlock.Action.Reference reference;
                protected Body inline;
                protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
                protected AddData addData;
                protected FormattedText documentation;
                @XmlAttribute(name = "localId", required = true)
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger localId;
                @XmlAttribute(name = "qualifier")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String qualifier;
                @XmlAttribute(name = "width")
                protected BigDecimal width;
                @XmlAttribute(name = "height")
                protected BigDecimal height;
                @XmlAttribute(name = "duration")
                protected String duration;
                @XmlAttribute(name = "indicator")
                protected String indicator;
                @XmlAttribute(name = "executionOrderId")
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger executionOrderId;
                @XmlAttribute(name = "globalId")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
                protected String globalId;

                /**
                 * Ruft den Wert der relPosition-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link Position }
                 */
                public Position getRelPosition() {
                    return relPosition;
                }

                /**
                 * Legt den Wert der relPosition-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link Position }
                 */
                public void setRelPosition(Position value) {
                    this.relPosition = value;
                }

                /**
                 * Ruft den Wert der reference-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link Body.SFC.ActionBlock.Action.Reference }
                 */
                public Body.SFC.ActionBlock.Action.Reference getReference() {
                    return reference;
                }

                /**
                 * Legt den Wert der reference-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link Body.SFC.ActionBlock.Action.Reference }
                 */
                public void setReference(Body.SFC.ActionBlock.Action.Reference value) {
                    this.reference = value;
                }

                /**
                 * Ruft den Wert der inline-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link Body }
                 */
                public Body getInline() {
                    return inline;
                }

                /**
                 * Legt den Wert der inline-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link Body }
                 */
                public void setInline(Body value) {
                    this.inline = value;
                }

                /**
                 * Ruft den Wert der connectionPointOut-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
                 */
                public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                    return connectionPointOut;
                }

                /**
                 * Legt den Wert der connectionPointOut-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
                 */
                public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                    this.connectionPointOut = value;
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
                 * Ruft den Wert der localId-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link BigInteger }
                 */
                public BigInteger getLocalId() {
                    return localId;
                }

                /**
                 * Legt den Wert der localId-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link BigInteger }
                 */
                public void setLocalId(BigInteger value) {
                    this.localId = value;
                }

                /**
                 * Ruft den Wert der qualifier-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getQualifier() {
                    if (qualifier == null) {
                        return "N";
                    } else {
                        return qualifier;
                    }
                }

                /**
                 * Legt den Wert der qualifier-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setQualifier(String value) {
                    this.qualifier = value;
                }

                /**
                 * Ruft den Wert der width-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getWidth() {
                    return width;
                }

                /**
                 * Legt den Wert der width-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setWidth(BigDecimal value) {
                    this.width = value;
                }

                /**
                 * Ruft den Wert der height-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getHeight() {
                    return height;
                }

                /**
                 * Legt den Wert der height-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setHeight(BigDecimal value) {
                    this.height = value;
                }

                /**
                 * Ruft den Wert der duration-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getDuration() {
                    return duration;
                }

                /**
                 * Legt den Wert der duration-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setDuration(String value) {
                    this.duration = value;
                }

                /**
                 * Ruft den Wert der indicator-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getIndicator() {
                    return indicator;
                }

                /**
                 * Legt den Wert der indicator-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setIndicator(String value) {
                    this.indicator = value;
                }

                /**
                 * Ruft den Wert der executionOrderId-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link BigInteger }
                 */
                public BigInteger getExecutionOrderId() {
                    return executionOrderId;
                }

                /**
                 * Legt den Wert der executionOrderId-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link BigInteger }
                 */
                public void setExecutionOrderId(BigInteger value) {
                    this.executionOrderId = value;
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


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * <p>
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * <p>
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Reference {

                    @XmlAttribute(name = "name", required = true)
                    protected String name;

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

                }

            }

        }


        /**
         * Describes a graphical object representing a
         * call statement
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="inputVariables">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="variable" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn"/>
         *                             &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                           &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
         *                           &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
         *                           &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="inOutVariables">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="variable" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *                             &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *                             &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                           &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
         *                           &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
         *                           &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="outputVariables">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="variable" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *                             &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                           &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
         *                           &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
         *                           &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="typeName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "inputVariables",
                "inOutVariables",
                "outputVariables",
                "addData",
                "documentation"
        })
        public static class Block {

            @XmlElement(required = true)
            protected Position position;
            @XmlElement(required = true)
            protected Body.SFC.Block.InputVariables inputVariables;
            @XmlElement(required = true)
            protected Body.SFC.Block.InOutVariables inOutVariables;
            @XmlElement(required = true)
            protected Body.SFC.Block.OutputVariables outputVariables;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "typeName", required = true)
            protected String typeName;
            @XmlAttribute(name = "instanceName")
            protected String instanceName;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der inputVariables-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Body.SFC.Block.InputVariables }
             */
            public Body.SFC.Block.InputVariables getInputVariables() {
                return inputVariables;
            }

            /**
             * Legt den Wert der inputVariables-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Body.SFC.Block.InputVariables }
             */
            public void setInputVariables(Body.SFC.Block.InputVariables value) {
                this.inputVariables = value;
            }

            /**
             * Ruft den Wert der inOutVariables-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Body.SFC.Block.InOutVariables }
             */
            public Body.SFC.Block.InOutVariables getInOutVariables() {
                return inOutVariables;
            }

            /**
             * Legt den Wert der inOutVariables-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Body.SFC.Block.InOutVariables }
             */
            public void setInOutVariables(Body.SFC.Block.InOutVariables value) {
                this.inOutVariables = value;
            }

            /**
             * Ruft den Wert der outputVariables-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Body.SFC.Block.OutputVariables }
             */
            public Body.SFC.Block.OutputVariables getOutputVariables() {
                return outputVariables;
            }

            /**
             * Legt den Wert der outputVariables-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Body.SFC.Block.OutputVariables }
             */
            public void setOutputVariables(Body.SFC.Block.OutputVariables value) {
                this.outputVariables = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
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
             * Ruft den Wert der instanceName-Eigenschaft ab.
             *
             * @return possible object is
             * {@link String }
             */
            public String getInstanceName() {
                return instanceName;
            }

            /**
             * Legt den Wert der instanceName-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInstanceName(String value) {
                this.instanceName = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
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
             *         &lt;element name="variable" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
             *                   &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
             *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *                 &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
             *                 &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
             *                 &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
                    "variable"
            })
            public static class InOutVariables {

                protected List<Body.SFC.Block.InOutVariables.Variable> variable;

                /**
                 * Gets the value of the variable property.
                 * <p>
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the variable property.
                 * <p>
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVariable().add(newItem);
                 * </pre>
                 * <p>
                 * <p>
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Body.SFC.Block.InOutVariables.Variable }
                 */
                public List<Body.SFC.Block.InOutVariables.Variable> getVariable() {
                    if (variable == null) {
                        variable = new ArrayList<Body.SFC.Block.InOutVariables.Variable>();
                    }
                    return this.variable;
                }


                /**
                 * Describes a inOutVariable of a Function
                 * or a FunctionBlock
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
                 *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
                 *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
                 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *       &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
                 *       &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
                 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "connectionPointIn",
                        "connectionPointOut",
                        "documentation"
                })
                public static class Variable {

                    protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
                    protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
                    protected FormattedText documentation;
                    @XmlAttribute(name = "formalParameter", required = true)
                    protected String formalParameter;
                    @XmlAttribute(name = "negated")
                    protected Boolean negated;
                    @XmlAttribute(name = "edge")
                    protected EdgeModifierType edge;
                    @XmlAttribute(name = "storage")
                    protected StorageModifierType storage;
                    @XmlAttribute(name = "hidden")
                    protected Boolean hidden;

                    /**
                     * Ruft den Wert der connectionPointIn-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
                     */
                    public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                        return connectionPointIn;
                    }

                    /**
                     * Legt den Wert der connectionPointIn-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
                     */
                    public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                        this.connectionPointIn = value;
                    }

                    /**
                     * Ruft den Wert der connectionPointOut-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
                     */
                    public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                        return connectionPointOut;
                    }

                    /**
                     * Legt den Wert der connectionPointOut-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
                     */
                    public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                        this.connectionPointOut = value;
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
                     * Ruft den Wert der formalParameter-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getFormalParameter() {
                        return formalParameter;
                    }

                    /**
                     * Legt den Wert der formalParameter-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setFormalParameter(String value) {
                        this.formalParameter = value;
                    }

                    /**
                     * Ruft den Wert der negated-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link Boolean }
                     */
                    public boolean isNegated() {
                        if (negated == null) {
                            return false;
                        } else {
                            return negated;
                        }
                    }

                    /**
                     * Legt den Wert der negated-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link Boolean }
                     */
                    public void setNegated(Boolean value) {
                        this.negated = value;
                    }

                    /**
                     * Ruft den Wert der edge-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link EdgeModifierType }
                     */
                    public EdgeModifierType getEdge() {
                        if (edge == null) {
                            return EdgeModifierType.NONE;
                        } else {
                            return edge;
                        }
                    }

                    /**
                     * Legt den Wert der edge-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link EdgeModifierType }
                     */
                    public void setEdge(EdgeModifierType value) {
                        this.edge = value;
                    }

                    /**
                     * Ruft den Wert der storage-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link StorageModifierType }
                     */
                    public StorageModifierType getStorage() {
                        if (storage == null) {
                            return StorageModifierType.NONE;
                        } else {
                            return storage;
                        }
                    }

                    /**
                     * Legt den Wert der storage-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link StorageModifierType }
                     */
                    public void setStorage(StorageModifierType value) {
                        this.storage = value;
                    }

                    /**
                     * Ruft den Wert der hidden-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link Boolean }
                     */
                    public boolean isHidden() {
                        if (hidden == null) {
                            return false;
                        } else {
                            return hidden;
                        }
                    }

                    /**
                     * Legt den Wert der hidden-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link Boolean }
                     */
                    public void setHidden(Boolean value) {
                        this.hidden = value;
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
             *         &lt;element name="variable" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn"/>
             *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *                 &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
             *                 &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
             *                 &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
                    "variable"
            })
            public static class InputVariables {

                protected List<Body.SFC.Block.InputVariables.Variable> variable;

                /**
                 * Gets the value of the variable property.
                 * <p>
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the variable property.
                 * <p>
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVariable().add(newItem);
                 * </pre>
                 * <p>
                 * <p>
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Body.SFC.Block.InputVariables.Variable }
                 */
                public List<Body.SFC.Block.InputVariables.Variable> getVariable() {
                    if (variable == null) {
                        variable = new ArrayList<Body.SFC.Block.InputVariables.Variable>();
                    }
                    return this.variable;
                }


                /**
                 * Describes an inputVariable of a Function
                 * or a FunctionBlock
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
                 *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn"/>
                 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *       &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
                 *       &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
                 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "connectionPointIn",
                        "documentation"
                })
                public static class Variable {

                    @XmlElement(required = true)
                    protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
                    protected FormattedText documentation;
                    @XmlAttribute(name = "formalParameter", required = true)
                    protected String formalParameter;
                    @XmlAttribute(name = "negated")
                    protected Boolean negated;
                    @XmlAttribute(name = "edge")
                    protected EdgeModifierType edge;
                    @XmlAttribute(name = "storage")
                    protected StorageModifierType storage;
                    @XmlAttribute(name = "hidden")
                    protected Boolean hidden;

                    /**
                     * Ruft den Wert der connectionPointIn-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
                     */
                    public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                        return connectionPointIn;
                    }

                    /**
                     * Legt den Wert der connectionPointIn-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
                     */
                    public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                        this.connectionPointIn = value;
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
                     * Ruft den Wert der formalParameter-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getFormalParameter() {
                        return formalParameter;
                    }

                    /**
                     * Legt den Wert der formalParameter-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setFormalParameter(String value) {
                        this.formalParameter = value;
                    }

                    /**
                     * Ruft den Wert der negated-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link Boolean }
                     */
                    public boolean isNegated() {
                        if (negated == null) {
                            return false;
                        } else {
                            return negated;
                        }
                    }

                    /**
                     * Legt den Wert der negated-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link Boolean }
                     */
                    public void setNegated(Boolean value) {
                        this.negated = value;
                    }

                    /**
                     * Ruft den Wert der edge-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link EdgeModifierType }
                     */
                    public EdgeModifierType getEdge() {
                        if (edge == null) {
                            return EdgeModifierType.NONE;
                        } else {
                            return edge;
                        }
                    }

                    /**
                     * Legt den Wert der edge-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link EdgeModifierType }
                     */
                    public void setEdge(EdgeModifierType value) {
                        this.edge = value;
                    }

                    /**
                     * Ruft den Wert der storage-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link StorageModifierType }
                     */
                    public StorageModifierType getStorage() {
                        if (storage == null) {
                            return StorageModifierType.NONE;
                        } else {
                            return storage;
                        }
                    }

                    /**
                     * Legt den Wert der storage-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link StorageModifierType }
                     */
                    public void setStorage(StorageModifierType value) {
                        this.storage = value;
                    }

                    /**
                     * Ruft den Wert der hidden-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link Boolean }
                     */
                    public boolean isHidden() {
                        if (hidden == null) {
                            return false;
                        } else {
                            return hidden;
                        }
                    }

                    /**
                     * Legt den Wert der hidden-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link Boolean }
                     */
                    public void setHidden(Boolean value) {
                        this.hidden = value;
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
             *         &lt;element name="variable" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
             *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *                 &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
             *                 &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
             *                 &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
                    "variable"
            })
            public static class OutputVariables {

                protected List<Body.SFC.Block.OutputVariables.Variable> variable;

                /**
                 * Gets the value of the variable property.
                 * <p>
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the variable property.
                 * <p>
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVariable().add(newItem);
                 * </pre>
                 * <p>
                 * <p>
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Body.SFC.Block.OutputVariables.Variable }
                 */
                public List<Body.SFC.Block.OutputVariables.Variable> getVariable() {
                    if (variable == null) {
                        variable = new ArrayList<Body.SFC.Block.OutputVariables.Variable>();
                    }
                    return this.variable;
                }


                /**
                 * Describes a outputVariable of a Function
                 * or a FunctionBlock
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
                 *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
                 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *       &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
                 *       &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
                 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "connectionPointOut",
                        "documentation"
                })
                public static class Variable {

                    protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
                    protected FormattedText documentation;
                    @XmlAttribute(name = "formalParameter", required = true)
                    protected String formalParameter;
                    @XmlAttribute(name = "negated")
                    protected Boolean negated;
                    @XmlAttribute(name = "edge")
                    protected EdgeModifierType edge;
                    @XmlAttribute(name = "storage")
                    protected StorageModifierType storage;
                    @XmlAttribute(name = "hidden")
                    protected Boolean hidden;

                    /**
                     * Ruft den Wert der connectionPointOut-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
                     */
                    public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                        return connectionPointOut;
                    }

                    /**
                     * Legt den Wert der connectionPointOut-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
                     */
                    public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                        this.connectionPointOut = value;
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
                     * Ruft den Wert der formalParameter-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getFormalParameter() {
                        return formalParameter;
                    }

                    /**
                     * Legt den Wert der formalParameter-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setFormalParameter(String value) {
                        this.formalParameter = value;
                    }

                    /**
                     * Ruft den Wert der negated-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link Boolean }
                     */
                    public boolean isNegated() {
                        if (negated == null) {
                            return false;
                        } else {
                            return negated;
                        }
                    }

                    /**
                     * Legt den Wert der negated-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link Boolean }
                     */
                    public void setNegated(Boolean value) {
                        this.negated = value;
                    }

                    /**
                     * Ruft den Wert der edge-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link EdgeModifierType }
                     */
                    public EdgeModifierType getEdge() {
                        if (edge == null) {
                            return EdgeModifierType.NONE;
                        } else {
                            return edge;
                        }
                    }

                    /**
                     * Legt den Wert der edge-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link EdgeModifierType }
                     */
                    public void setEdge(EdgeModifierType value) {
                        this.edge = value;
                    }

                    /**
                     * Ruft den Wert der storage-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link StorageModifierType }
                     */
                    public StorageModifierType getStorage() {
                        if (storage == null) {
                            return StorageModifierType.NONE;
                        } else {
                            return storage;
                        }
                    }

                    /**
                     * Legt den Wert der storage-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link StorageModifierType }
                     */
                    public void setStorage(StorageModifierType value) {
                        this.storage = value;
                    }

                    /**
                     * Ruft den Wert der hidden-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link Boolean }
                     */
                    public boolean isHidden() {
                        if (hidden == null) {
                            return false;
                        } else {
                            return hidden;
                        }
                    }

                    /**
                     * Legt den Wert der hidden-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link Boolean }
                     */
                    public void setHidden(Boolean value) {
                        this.hidden = value;
                    }

                }

            }

        }


        /**
         * Describes a graphical object representing a
         * boolean variable which can be used as l-value and r-value at the
         * same time
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *         &lt;element name="variable" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
         *       &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "connectionPointOut",
                "variable",
                "addData",
                "documentation"
        })
        public static class Coil {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
            @XmlElement(required = true)
            protected String variable;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "negated")
            protected Boolean negated;
            @XmlAttribute(name = "edge")
            protected EdgeModifierType edge;
            @XmlAttribute(name = "storage")
            protected StorageModifierType storage;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
            }

            /**
             * Ruft den Wert der connectionPointOut-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                return connectionPointOut;
            }

            /**
             * Legt den Wert der connectionPointOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                this.connectionPointOut = value;
            }

            /**
             * Ruft den Wert der variable-Eigenschaft ab.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVariable() {
                return variable;
            }

            /**
             * Legt den Wert der variable-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVariable(String value) {
                this.variable = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
            }

            /**
             * Ruft den Wert der negated-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Boolean }
             */
            public boolean isNegated() {
                if (negated == null) {
                    return false;
                } else {
                    return negated;
                }
            }

            /**
             * Legt den Wert der negated-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setNegated(Boolean value) {
                this.negated = value;
            }

            /**
             * Ruft den Wert der edge-Eigenschaft ab.
             *
             * @return possible object is
             * {@link EdgeModifierType }
             */
            public EdgeModifierType getEdge() {
                if (edge == null) {
                    return EdgeModifierType.NONE;
                } else {
                    return edge;
                }
            }

            /**
             * Legt den Wert der edge-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link EdgeModifierType }
             */
            public void setEdge(EdgeModifierType value) {
                this.edge = value;
            }

            /**
             * Ruft den Wert der storage-Eigenschaft ab.
             *
             * @return possible object is
             * {@link StorageModifierType }
             */
            public StorageModifierType getStorage() {
                if (storage == null) {
                    return StorageModifierType.NONE;
                } else {
                    return storage;
                }
            }

            /**
             * Legt den Wert der storage-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link StorageModifierType }
             */
            public void setStorage(StorageModifierType value) {
                this.storage = value;
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="content" type="{http://www.plcopen.org/xml/tc6_0201}formattedText"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "content",
                "addData",
                "documentation"
        })
        public static class Comment {

            @XmlElement(required = true)
            protected Position position;
            @XmlElement(required = true)
            protected FormattedText content;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height", required = true)
            protected BigDecimal height;
            @XmlAttribute(name = "width", required = true)
            protected BigDecimal width;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der content-Eigenschaft ab.
             *
             * @return possible object is
             * {@link FormattedText }
             */
            public FormattedText getContent() {
                return content;
            }

            /**
             * Legt den Wert der content-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link FormattedText }
             */
            public void setContent(FormattedText value) {
                this.content = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
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

        }


        /**
         * Describes a graphical object representing a
         * variable, literal or expression used as r-value
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
         *       &lt;sequence>
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "addData",
                "documentation"
        })
        public static class Connector {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
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

        }


        /**
         * Describes a graphical object representing a
         * variable which can be used as l-value and r-value at the same
         * time
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *         &lt;element name="variable" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
         *       &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "connectionPointOut",
                "variable",
                "addData",
                "documentation"
        })
        public static class Contact {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
            @XmlElement(required = true)
            protected String variable;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "negated")
            protected Boolean negated;
            @XmlAttribute(name = "edge")
            protected EdgeModifierType edge;
            @XmlAttribute(name = "storage")
            protected StorageModifierType storage;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
            }

            /**
             * Ruft den Wert der connectionPointOut-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                return connectionPointOut;
            }

            /**
             * Legt den Wert der connectionPointOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                this.connectionPointOut = value;
            }

            /**
             * Ruft den Wert der variable-Eigenschaft ab.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVariable() {
                return variable;
            }

            /**
             * Legt den Wert der variable-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVariable(String value) {
                this.variable = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
            }

            /**
             * Ruft den Wert der negated-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Boolean }
             */
            public boolean isNegated() {
                if (negated == null) {
                    return false;
                } else {
                    return negated;
                }
            }

            /**
             * Legt den Wert der negated-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setNegated(Boolean value) {
                this.negated = value;
            }

            /**
             * Ruft den Wert der edge-Eigenschaft ab.
             *
             * @return possible object is
             * {@link EdgeModifierType }
             */
            public EdgeModifierType getEdge() {
                if (edge == null) {
                    return EdgeModifierType.NONE;
                } else {
                    return edge;
                }
            }

            /**
             * Legt den Wert der edge-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link EdgeModifierType }
             */
            public void setEdge(EdgeModifierType value) {
                this.edge = value;
            }

            /**
             * Ruft den Wert der storage-Eigenschaft ab.
             *
             * @return possible object is
             * {@link StorageModifierType }
             */
            public StorageModifierType getStorage() {
                if (storage == null) {
                    return StorageModifierType.NONE;
                } else {
                    return storage;
                }
            }

            /**
             * Legt den Wert der storage-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link StorageModifierType }
             */
            public void setStorage(StorageModifierType value) {
                this.storage = value;
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

        }


        /**
         * Describes a graphical object representing a
         * variable, literal or expression used as r-value
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
         *       &lt;sequence>
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointOut",
                "addData",
                "documentation"
        })
        public static class Continuation {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointOut-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                return connectionPointOut;
            }

            /**
             * Legt den Wert der connectionPointOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                this.connectionPointOut = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
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

        }


        /**
         * Describes a graphical object representing a
         * conversion error. Used to keep information which can not be
         * interpreted by the importing system
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="content" type="{http://www.plcopen.org/xml/tc6_0201}formattedText"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "content",
                "addData",
                "documentation"
        })
        public static class Error {

            @XmlElement(required = true)
            protected Position position;
            @XmlElement(required = true)
            protected FormattedText content;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height", required = true)
            protected BigDecimal height;
            @XmlAttribute(name = "width", required = true)
            protected BigDecimal width;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der content-Eigenschaft ab.
             *
             * @return possible object is
             * {@link FormattedText }
             */
            public FormattedText getContent() {
                return content;
            }

            /**
             * Legt den Wert der content-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link FormattedText }
             */
            public void setContent(FormattedText value) {
                this.content = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
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

        }


        /**
         * Describes a graphical object representing a
         * variable which can be used as l-value and r-value at the same
         * time
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *         &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="negatedIn" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="edgeIn" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
         *       &lt;attribute name="storageIn" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
         *       &lt;attribute name="negatedOut" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="edgeOut" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
         *       &lt;attribute name="storageOut" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "connectionPointOut",
                "expression",
                "addData",
                "documentation"
        })
        public static class InOutVariable {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
            @XmlElement(required = true)
            protected String expression;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "negatedIn")
            protected Boolean negatedIn;
            @XmlAttribute(name = "edgeIn")
            protected EdgeModifierType edgeIn;
            @XmlAttribute(name = "storageIn")
            protected StorageModifierType storageIn;
            @XmlAttribute(name = "negatedOut")
            protected Boolean negatedOut;
            @XmlAttribute(name = "edgeOut")
            protected EdgeModifierType edgeOut;
            @XmlAttribute(name = "storageOut")
            protected StorageModifierType storageOut;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
            }

            /**
             * Ruft den Wert der connectionPointOut-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                return connectionPointOut;
            }

            /**
             * Legt den Wert der connectionPointOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                this.connectionPointOut = value;
            }

            /**
             * Ruft den Wert der expression-Eigenschaft ab.
             *
             * @return possible object is
             * {@link String }
             */
            public String getExpression() {
                return expression;
            }

            /**
             * Legt den Wert der expression-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setExpression(String value) {
                this.expression = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
            }

            /**
             * Ruft den Wert der negatedIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Boolean }
             */
            public boolean isNegatedIn() {
                if (negatedIn == null) {
                    return false;
                } else {
                    return negatedIn;
                }
            }

            /**
             * Legt den Wert der negatedIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setNegatedIn(Boolean value) {
                this.negatedIn = value;
            }

            /**
             * Ruft den Wert der edgeIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link EdgeModifierType }
             */
            public EdgeModifierType getEdgeIn() {
                if (edgeIn == null) {
                    return EdgeModifierType.NONE;
                } else {
                    return edgeIn;
                }
            }

            /**
             * Legt den Wert der edgeIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link EdgeModifierType }
             */
            public void setEdgeIn(EdgeModifierType value) {
                this.edgeIn = value;
            }

            /**
             * Ruft den Wert der storageIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link StorageModifierType }
             */
            public StorageModifierType getStorageIn() {
                if (storageIn == null) {
                    return StorageModifierType.NONE;
                } else {
                    return storageIn;
                }
            }

            /**
             * Legt den Wert der storageIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link StorageModifierType }
             */
            public void setStorageIn(StorageModifierType value) {
                this.storageIn = value;
            }

            /**
             * Ruft den Wert der negatedOut-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Boolean }
             */
            public boolean isNegatedOut() {
                if (negatedOut == null) {
                    return false;
                } else {
                    return negatedOut;
                }
            }

            /**
             * Legt den Wert der negatedOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setNegatedOut(Boolean value) {
                this.negatedOut = value;
            }

            /**
             * Ruft den Wert der edgeOut-Eigenschaft ab.
             *
             * @return possible object is
             * {@link EdgeModifierType }
             */
            public EdgeModifierType getEdgeOut() {
                if (edgeOut == null) {
                    return EdgeModifierType.NONE;
                } else {
                    return edgeOut;
                }
            }

            /**
             * Legt den Wert der edgeOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link EdgeModifierType }
             */
            public void setEdgeOut(EdgeModifierType value) {
                this.edgeOut = value;
            }

            /**
             * Ruft den Wert der storageOut-Eigenschaft ab.
             *
             * @return possible object is
             * {@link StorageModifierType }
             */
            public StorageModifierType getStorageOut() {
                if (storageOut == null) {
                    return StorageModifierType.NONE;
                } else {
                    return storageOut;
                }
            }

            /**
             * Legt den Wert der storageOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link StorageModifierType }
             */
            public void setStorageOut(StorageModifierType value) {
                this.storageOut = value;
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

        }


        /**
         * Describes a graphical object representing a
         * variable, literal or expression used as r-value
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
         *       &lt;sequence>
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *         &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
         *       &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointOut",
                "expression",
                "addData",
                "documentation"
        })
        public static class InVariable {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
            @XmlElement(required = true)
            protected String expression;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "negated")
            protected Boolean negated;
            @XmlAttribute(name = "edge")
            protected EdgeModifierType edge;
            @XmlAttribute(name = "storage")
            protected StorageModifierType storage;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointOut-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                return connectionPointOut;
            }

            /**
             * Legt den Wert der connectionPointOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                this.connectionPointOut = value;
            }

            /**
             * Ruft den Wert der expression-Eigenschaft ab.
             *
             * @return possible object is
             * {@link String }
             */
            public String getExpression() {
                return expression;
            }

            /**
             * Legt den Wert der expression-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setExpression(String value) {
                this.expression = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
            }

            /**
             * Ruft den Wert der negated-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Boolean }
             */
            public boolean isNegated() {
                if (negated == null) {
                    return false;
                } else {
                    return negated;
                }
            }

            /**
             * Legt den Wert der negated-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setNegated(Boolean value) {
                this.negated = value;
            }

            /**
             * Ruft den Wert der edge-Eigenschaft ab.
             *
             * @return possible object is
             * {@link EdgeModifierType }
             */
            public EdgeModifierType getEdge() {
                if (edge == null) {
                    return EdgeModifierType.NONE;
                } else {
                    return edge;
                }
            }

            /**
             * Legt den Wert der edge-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link EdgeModifierType }
             */
            public void setEdge(EdgeModifierType value) {
                this.edge = value;
            }

            /**
             * Ruft den Wert der storage-Eigenschaft ab.
             *
             * @return possible object is
             * {@link StorageModifierType }
             */
            public StorageModifierType getStorage() {
                if (storage == null) {
                    return StorageModifierType.NONE;
                } else {
                    return storage;
                }
            }

            /**
             * Legt den Wert der storage-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link StorageModifierType }
             */
            public void setStorage(StorageModifierType value) {
                this.storage = value;
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

        }


        /**
         * Describes a graphical object representing a
         * jump statement
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "addData",
                "documentation"
        })
        public static class Jump {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "label", required = true)
            protected String label;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der label-Eigenschaft ab.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLabel() {
                return label;
            }

            /**
             * Legt den Wert der label-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLabel(String value) {
                this.label = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="targetName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "addData",
                "documentation"
        })
        public static class JumpStep {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "targetName", required = true)
            protected String targetName;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der targetName-Eigenschaft ab.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTargetName() {
                return targetName;
            }

            /**
             * Legt den Wert der targetName-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTargetName(String value) {
                this.targetName = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
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

        }


        /**
         * Describes a graphical object representing a
         * jump label
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "addData",
                "documentation"
        })
        public static class Label {

            @XmlElement(required = true)
            protected Position position;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "label", required = true)
            protected String label;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der label-Eigenschaft ab.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLabel() {
                return label;
            }

            /**
             * Legt den Wert der label-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLabel(String value) {
                this.label = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
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

        }


        /**
         * Describes a graphical object representing a
         * left powerrail
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointOut" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut">
         *                 &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointOut",
                "addData",
                "documentation"
        })
        public static class LeftPowerRail {

            @XmlElement(required = true)
            protected Position position;
            protected List<Body.SFC.LeftPowerRail.ConnectionPointOut> connectionPointOut;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Gets the value of the connectionPointOut property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the connectionPointOut property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConnectionPointOut().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Body.SFC.LeftPowerRail.ConnectionPointOut }
             */
            public List<Body.SFC.LeftPowerRail.ConnectionPointOut> getConnectionPointOut() {
                if (connectionPointOut == null) {
                    connectionPointOut = new ArrayList<Body.SFC.LeftPowerRail.ConnectionPointOut>();
                }
                return this.connectionPointOut;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
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


            /**
             * <p>Java-Klasse für anonymous complex type.
             * <p>
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut">
             *       &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ConnectionPointOut
                    extends org.plcopen.xml.tc60201.ConnectionPointOut {

                @XmlAttribute(name = "formalParameter", required = true)
                protected String formalParameter;

                /**
                 * Ruft den Wert der formalParameter-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getFormalParameter() {
                    return formalParameter;
                }

                /**
                 * Legt den Wert der formalParameter-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setFormalParameter(String value) {
                    this.formalParameter = value;
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *         &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body" minOccurs="0"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "connectionPointOut",
                "body",
                "addData",
                "documentation"
        })
        public static class MacroStep {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
            protected Body body;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
            }

            /**
             * Ruft den Wert der connectionPointOut-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                return connectionPointOut;
            }

            /**
             * Legt den Wert der connectionPointOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                this.connectionPointOut = value;
            }

            /**
             * Ruft den Wert der body-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Body }
             */
            public Body getBody() {
                return body;
            }

            /**
             * Legt den Wert der body-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Body }
             */
            public void setBody(Body value) {
                this.body = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
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
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
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

        }


        /**
         * Describes a graphical object representing a
         * variable or expression used as l-value
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
         *       &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "expression",
                "addData",
                "documentation"
        })
        public static class OutVariable {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            @XmlElement(required = true)
            protected String expression;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "negated")
            protected Boolean negated;
            @XmlAttribute(name = "edge")
            protected EdgeModifierType edge;
            @XmlAttribute(name = "storage")
            protected StorageModifierType storage;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
            }

            /**
             * Ruft den Wert der expression-Eigenschaft ab.
             *
             * @return possible object is
             * {@link String }
             */
            public String getExpression() {
                return expression;
            }

            /**
             * Legt den Wert der expression-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setExpression(String value) {
                this.expression = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
            }

            /**
             * Ruft den Wert der negated-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Boolean }
             */
            public boolean isNegated() {
                if (negated == null) {
                    return false;
                } else {
                    return negated;
                }
            }

            /**
             * Legt den Wert der negated-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setNegated(Boolean value) {
                this.negated = value;
            }

            /**
             * Ruft den Wert der edge-Eigenschaft ab.
             *
             * @return possible object is
             * {@link EdgeModifierType }
             */
            public EdgeModifierType getEdge() {
                if (edge == null) {
                    return EdgeModifierType.NONE;
                } else {
                    return edge;
                }
            }

            /**
             * Legt den Wert der edge-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link EdgeModifierType }
             */
            public void setEdge(EdgeModifierType value) {
                this.edge = value;
            }

            /**
             * Ruft den Wert der storage-Eigenschaft ab.
             *
             * @return possible object is
             * {@link StorageModifierType }
             */
            public StorageModifierType getStorage() {
                if (storage == null) {
                    return StorageModifierType.NONE;
                } else {
                    return storage;
                }
            }

            /**
             * Legt den Wert der storage-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link StorageModifierType }
             */
            public void setStorage(StorageModifierType value) {
                this.storage = value;
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

        }


        /**
         * Describes a graphical object representing
         * areturn statement
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "addData",
                "documentation"
        })
        public static class Return {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
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

        }


        /**
         * Describes a graphical object representing a
         * right powerrail
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "addData",
                "documentation"
        })
        public static class RightPowerRail {

            @XmlElement(required = true)
            protected Position position;
            protected List<org.plcopen.xml.tc60201.ConnectionPointIn> connectionPointIn;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Gets the value of the connectionPointIn property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the connectionPointIn property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConnectionPointIn().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public List<org.plcopen.xml.tc60201.ConnectionPointIn> getConnectionPointIn() {
                if (connectionPointIn == null) {
                    connectionPointIn = new ArrayList<org.plcopen.xml.tc60201.ConnectionPointIn>();
                }
                return this.connectionPointIn;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn">
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "connectionPointOut",
                "addData",
                "documentation"
        })
        public static class SelectionConvergence {

            @XmlElement(required = true)
            protected Position position;
            protected List<Body.SFC.SelectionConvergence.ConnectionPointIn> connectionPointIn;
            protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Gets the value of the connectionPointIn property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the connectionPointIn property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConnectionPointIn().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Body.SFC.SelectionConvergence.ConnectionPointIn }
             */
            public List<Body.SFC.SelectionConvergence.ConnectionPointIn> getConnectionPointIn() {
                if (connectionPointIn == null) {
                    connectionPointIn = new ArrayList<Body.SFC.SelectionConvergence.ConnectionPointIn>();
                }
                return this.connectionPointIn;
            }

            /**
             * Ruft den Wert der connectionPointOut-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                return connectionPointOut;
            }

            /**
             * Legt den Wert der connectionPointOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                this.connectionPointOut = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
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


            /**
             * <p>Java-Klasse für anonymous complex type.
             * <p>
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn">
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ConnectionPointIn
                    extends org.plcopen.xml.tc60201.ConnectionPointIn {


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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="connectionPointOut" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut">
         *                 &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "connectionPointOut",
                "addData",
                "documentation"
        })
        public static class SelectionDivergence {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            protected List<Body.SFC.SelectionDivergence.ConnectionPointOut> connectionPointOut;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
            }

            /**
             * Gets the value of the connectionPointOut property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the connectionPointOut property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConnectionPointOut().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Body.SFC.SelectionDivergence.ConnectionPointOut }
             */
            public List<Body.SFC.SelectionDivergence.ConnectionPointOut> getConnectionPointOut() {
                if (connectionPointOut == null) {
                    connectionPointOut = new ArrayList<Body.SFC.SelectionDivergence.ConnectionPointOut>();
                }
                return this.connectionPointOut;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
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


            /**
             * <p>Java-Klasse für anonymous complex type.
             * <p>
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut">
             *       &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ConnectionPointOut
                    extends org.plcopen.xml.tc60201.ConnectionPointOut {

                @XmlAttribute(name = "formalParameter", required = true)
                protected String formalParameter;

                /**
                 * Ruft den Wert der formalParameter-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getFormalParameter() {
                    return formalParameter;
                }

                /**
                 * Legt den Wert der formalParameter-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setFormalParameter(String value) {
                    this.formalParameter = value;
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "connectionPointOut",
                "addData",
                "documentation"
        })
        public static class SimultaneousConvergence {

            @XmlElement(required = true)
            protected Position position;
            protected List<org.plcopen.xml.tc60201.ConnectionPointIn> connectionPointIn;
            protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Gets the value of the connectionPointIn property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the connectionPointIn property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConnectionPointIn().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public List<org.plcopen.xml.tc60201.ConnectionPointIn> getConnectionPointIn() {
                if (connectionPointIn == null) {
                    connectionPointIn = new ArrayList<org.plcopen.xml.tc60201.ConnectionPointIn>();
                }
                return this.connectionPointIn;
            }

            /**
             * Ruft den Wert der connectionPointOut-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                return connectionPointOut;
            }

            /**
             * Legt den Wert der connectionPointOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                this.connectionPointOut = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="connectionPointOut" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut">
         *                 &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "connectionPointOut",
                "addData",
                "documentation"
        })
        public static class SimultaneousDivergence {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            protected List<Body.SFC.SimultaneousDivergence.ConnectionPointOut> connectionPointOut;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
            }

            /**
             * Gets the value of the connectionPointOut property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the connectionPointOut property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConnectionPointOut().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Body.SFC.SimultaneousDivergence.ConnectionPointOut }
             */
            public List<Body.SFC.SimultaneousDivergence.ConnectionPointOut> getConnectionPointOut() {
                if (connectionPointOut == null) {
                    connectionPointOut = new ArrayList<Body.SFC.SimultaneousDivergence.ConnectionPointOut>();
                }
                return this.connectionPointOut;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
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


            /**
             * <p>Java-Klasse für anonymous complex type.
             * <p>
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut">
             *       &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ConnectionPointOut
                    extends org.plcopen.xml.tc60201.ConnectionPointOut {

                @XmlAttribute(name = "formalParameter", required = true)
                protected String formalParameter;

                /**
                 * Ruft den Wert der formalParameter-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getFormalParameter() {
                    return formalParameter;
                }

                /**
                 * Legt den Wert der formalParameter-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setFormalParameter(String value) {
                    this.formalParameter = value;
                }

            }

        }


        /**
         * Contains actions
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="connectionPointOut" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut">
         *                 &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="connectionPointOutAction" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut">
         *                 &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="initialStep" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "connectionPointOut",
                "connectionPointOutAction",
                "addData",
                "documentation"
        })
        public static class Step {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            protected Body.SFC.Step.ConnectionPointOut connectionPointOut;
            protected Body.SFC.Step.ConnectionPointOutAction connectionPointOutAction;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "initialStep")
            protected Boolean initialStep;
            @XmlAttribute(name = "negated")
            protected Boolean negated;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
            }

            /**
             * Ruft den Wert der connectionPointOut-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Body.SFC.Step.ConnectionPointOut }
             */
            public Body.SFC.Step.ConnectionPointOut getConnectionPointOut() {
                return connectionPointOut;
            }

            /**
             * Legt den Wert der connectionPointOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Body.SFC.Step.ConnectionPointOut }
             */
            public void setConnectionPointOut(Body.SFC.Step.ConnectionPointOut value) {
                this.connectionPointOut = value;
            }

            /**
             * Ruft den Wert der connectionPointOutAction-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Body.SFC.Step.ConnectionPointOutAction }
             */
            public Body.SFC.Step.ConnectionPointOutAction getConnectionPointOutAction() {
                return connectionPointOutAction;
            }

            /**
             * Legt den Wert der connectionPointOutAction-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Body.SFC.Step.ConnectionPointOutAction }
             */
            public void setConnectionPointOutAction(Body.SFC.Step.ConnectionPointOutAction value) {
                this.connectionPointOutAction = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
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
             * Ruft den Wert der initialStep-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Boolean }
             */
            public boolean isInitialStep() {
                if (initialStep == null) {
                    return false;
                } else {
                    return initialStep;
                }
            }

            /**
             * Legt den Wert der initialStep-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setInitialStep(Boolean value) {
                this.initialStep = value;
            }

            /**
             * Ruft den Wert der negated-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Boolean }
             */
            public boolean isNegated() {
                if (negated == null) {
                    return false;
                } else {
                    return negated;
                }
            }

            /**
             * Legt den Wert der negated-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setNegated(Boolean value) {
                this.negated = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
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


            /**
             * <p>Java-Klasse für anonymous complex type.
             * <p>
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut">
             *       &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ConnectionPointOut
                    extends org.plcopen.xml.tc60201.ConnectionPointOut {

                @XmlAttribute(name = "formalParameter", required = true)
                protected String formalParameter;

                /**
                 * Ruft den Wert der formalParameter-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getFormalParameter() {
                    return formalParameter;
                }

                /**
                 * Legt den Wert der formalParameter-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setFormalParameter(String value) {
                    this.formalParameter = value;
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
             *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut">
             *       &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ConnectionPointOutAction
                    extends org.plcopen.xml.tc60201.ConnectionPointOut {

                @XmlAttribute(name = "formalParameter", required = true)
                protected String formalParameter;

                /**
                 * Ruft den Wert der formalParameter-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getFormalParameter() {
                    return formalParameter;
                }

                /**
                 * Legt den Wert der formalParameter-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setFormalParameter(String value) {
                    this.formalParameter = value;
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *         &lt;element name="condition" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="reference">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn"/>
         *                   &lt;element name="inline">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}body">
         *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/choice>
         *                 &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "connectionPointIn",
                "connectionPointOut",
                "condition",
                "addData",
                "documentation"
        })
        public static class Transition {

            @XmlElement(required = true)
            protected Position position;
            protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
            protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
            protected Body.SFC.Transition.Condition condition;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "priority")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger priority;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
             */
            public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                this.connectionPointIn = value;
            }

            /**
             * Ruft den Wert der connectionPointOut-Eigenschaft ab.
             *
             * @return possible object is
             * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                return connectionPointOut;
            }

            /**
             * Legt den Wert der connectionPointOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
             */
            public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                this.connectionPointOut = value;
            }

            /**
             * Ruft den Wert der condition-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Body.SFC.Transition.Condition }
             */
            public Body.SFC.Transition.Condition getCondition() {
                return condition;
            }

            /**
             * Legt den Wert der condition-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Body.SFC.Transition.Condition }
             */
            public void setCondition(Body.SFC.Transition.Condition value) {
                this.condition = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der priority-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getPriority() {
                return priority;
            }

            /**
             * Legt den Wert der priority-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setPriority(BigInteger value) {
                this.priority = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
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


            /**
             * <p>Java-Klasse für anonymous complex type.
             * <p>
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;choice>
             *         &lt;element name="reference">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn"/>
             *         &lt;element name="inline">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}body">
             *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/choice>
             *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "reference",
                    "connectionPointIn",
                    "inline"
            })
            public static class Condition {

                protected Body.SFC.Transition.Condition.Reference reference;
                protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
                protected Body.SFC.Transition.Condition.Inline inline;
                @XmlAttribute(name = "negated")
                protected Boolean negated;

                /**
                 * Ruft den Wert der reference-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link Body.SFC.Transition.Condition.Reference }
                 */
                public Body.SFC.Transition.Condition.Reference getReference() {
                    return reference;
                }

                /**
                 * Legt den Wert der reference-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link Body.SFC.Transition.Condition.Reference }
                 */
                public void setReference(Body.SFC.Transition.Condition.Reference value) {
                    this.reference = value;
                }

                /**
                 * Ruft den Wert der connectionPointIn-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
                 */
                public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                    return connectionPointIn;
                }

                /**
                 * Legt den Wert der connectionPointIn-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
                 */
                public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                    this.connectionPointIn = value;
                }

                /**
                 * Ruft den Wert der inline-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link Body.SFC.Transition.Condition.Inline }
                 */
                public Body.SFC.Transition.Condition.Inline getInline() {
                    return inline;
                }

                /**
                 * Legt den Wert der inline-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link Body.SFC.Transition.Condition.Inline }
                 */
                public void setInline(Body.SFC.Transition.Condition.Inline value) {
                    this.inline = value;
                }

                /**
                 * Ruft den Wert der negated-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public boolean isNegated() {
                    if (negated == null) {
                        return false;
                    } else {
                        return negated;
                    }
                }

                /**
                 * Legt den Wert der negated-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setNegated(Boolean value) {
                    this.negated = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * <p>
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * <p>
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}body">
                 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Inline
                        extends Body {

                    @XmlAttribute(name = "name", required = true)
                    protected String name;

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
                 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Reference {

                    @XmlAttribute(name = "name", required = true)
                    protected String name;

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

                }

            }

        }


        /**
         * Describes a graphical object representing a
         * call statement
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
         *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position"/>
         *         &lt;element name="alternativeText" type="{http://www.plcopen.org/xml/tc6_0201}formattedText"/>
         *         &lt;element name="inputVariables" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="variable" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn"/>
         *                             &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                           &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
         *                           &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
         *                           &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="inOutVariables" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="variable" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
         *                             &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *                             &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                           &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
         *                           &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
         *                           &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="outputVariables" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="variable" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
         *                             &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                           &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
         *                           &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
         *                           &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData"/>
         *       &lt;/sequence>
         *       &lt;attribute name="localId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="executionOrderId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "position",
                "alternativeText",
                "inputVariables",
                "inOutVariables",
                "outputVariables",
                "addData"
        })
        public static class VendorElement {

            @XmlElement(required = true)
            protected Position position;
            @XmlElement(required = true)
            protected FormattedText alternativeText;
            protected Body.SFC.VendorElement.InputVariables inputVariables;
            protected Body.SFC.VendorElement.InOutVariables inOutVariables;
            protected Body.SFC.VendorElement.OutputVariables outputVariables;
            @XmlElement(required = true)
            protected AddData addData;
            @XmlAttribute(name = "localId", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger localId;
            @XmlAttribute(name = "width")
            protected BigDecimal width;
            @XmlAttribute(name = "height")
            protected BigDecimal height;
            @XmlAttribute(name = "executionOrderId")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger executionOrderId;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

            /**
             * Ruft den Wert der position-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Position }
             */
            public Position getPosition() {
                return position;
            }

            /**
             * Legt den Wert der position-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Position }
             */
            public void setPosition(Position value) {
                this.position = value;
            }

            /**
             * Ruft den Wert der alternativeText-Eigenschaft ab.
             *
             * @return possible object is
             * {@link FormattedText }
             */
            public FormattedText getAlternativeText() {
                return alternativeText;
            }

            /**
             * Legt den Wert der alternativeText-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link FormattedText }
             */
            public void setAlternativeText(FormattedText value) {
                this.alternativeText = value;
            }

            /**
             * Ruft den Wert der inputVariables-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Body.SFC.VendorElement.InputVariables }
             */
            public Body.SFC.VendorElement.InputVariables getInputVariables() {
                return inputVariables;
            }

            /**
             * Legt den Wert der inputVariables-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Body.SFC.VendorElement.InputVariables }
             */
            public void setInputVariables(Body.SFC.VendorElement.InputVariables value) {
                this.inputVariables = value;
            }

            /**
             * Ruft den Wert der inOutVariables-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Body.SFC.VendorElement.InOutVariables }
             */
            public Body.SFC.VendorElement.InOutVariables getInOutVariables() {
                return inOutVariables;
            }

            /**
             * Legt den Wert der inOutVariables-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Body.SFC.VendorElement.InOutVariables }
             */
            public void setInOutVariables(Body.SFC.VendorElement.InOutVariables value) {
                this.inOutVariables = value;
            }

            /**
             * Ruft den Wert der outputVariables-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Body.SFC.VendorElement.OutputVariables }
             */
            public Body.SFC.VendorElement.OutputVariables getOutputVariables() {
                return outputVariables;
            }

            /**
             * Legt den Wert der outputVariables-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Body.SFC.VendorElement.OutputVariables }
             */
            public void setOutputVariables(Body.SFC.VendorElement.OutputVariables value) {
                this.outputVariables = value;
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
             * Ruft den Wert der localId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getLocalId() {
                return localId;
            }

            /**
             * Legt den Wert der localId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setLocalId(BigInteger value) {
                this.localId = value;
            }

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der executionOrderId-Eigenschaft ab.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getExecutionOrderId() {
                return executionOrderId;
            }

            /**
             * Legt den Wert der executionOrderId-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setExecutionOrderId(BigInteger value) {
                this.executionOrderId = value;
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
             *         &lt;element name="variable" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
             *                   &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
             *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *                 &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
             *                 &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
             *                 &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
                    "variable"
            })
            public static class InOutVariables {

                protected List<Body.SFC.VendorElement.InOutVariables.Variable> variable;

                /**
                 * Gets the value of the variable property.
                 * <p>
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the variable property.
                 * <p>
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVariable().add(newItem);
                 * </pre>
                 * <p>
                 * <p>
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Body.SFC.VendorElement.InOutVariables.Variable }
                 */
                public List<Body.SFC.VendorElement.InOutVariables.Variable> getVariable() {
                    if (variable == null) {
                        variable = new ArrayList<Body.SFC.VendorElement.InOutVariables.Variable>();
                    }
                    return this.variable;
                }


                /**
                 * Describes a inOutVariable of a Function
                 * or a FunctionBlock
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
                 *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn" minOccurs="0"/>
                 *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
                 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *       &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
                 *       &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
                 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "connectionPointIn",
                        "connectionPointOut",
                        "documentation"
                })
                public static class Variable {

                    protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
                    protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
                    protected FormattedText documentation;
                    @XmlAttribute(name = "formalParameter", required = true)
                    protected String formalParameter;
                    @XmlAttribute(name = "negated")
                    protected Boolean negated;
                    @XmlAttribute(name = "edge")
                    protected EdgeModifierType edge;
                    @XmlAttribute(name = "storage")
                    protected StorageModifierType storage;
                    @XmlAttribute(name = "hidden")
                    protected Boolean hidden;

                    /**
                     * Ruft den Wert der connectionPointIn-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
                     */
                    public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                        return connectionPointIn;
                    }

                    /**
                     * Legt den Wert der connectionPointIn-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
                     */
                    public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                        this.connectionPointIn = value;
                    }

                    /**
                     * Ruft den Wert der connectionPointOut-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
                     */
                    public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                        return connectionPointOut;
                    }

                    /**
                     * Legt den Wert der connectionPointOut-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
                     */
                    public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                        this.connectionPointOut = value;
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
                     * Ruft den Wert der formalParameter-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getFormalParameter() {
                        return formalParameter;
                    }

                    /**
                     * Legt den Wert der formalParameter-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setFormalParameter(String value) {
                        this.formalParameter = value;
                    }

                    /**
                     * Ruft den Wert der negated-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link Boolean }
                     */
                    public boolean isNegated() {
                        if (negated == null) {
                            return false;
                        } else {
                            return negated;
                        }
                    }

                    /**
                     * Legt den Wert der negated-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link Boolean }
                     */
                    public void setNegated(Boolean value) {
                        this.negated = value;
                    }

                    /**
                     * Ruft den Wert der edge-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link EdgeModifierType }
                     */
                    public EdgeModifierType getEdge() {
                        if (edge == null) {
                            return EdgeModifierType.NONE;
                        } else {
                            return edge;
                        }
                    }

                    /**
                     * Legt den Wert der edge-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link EdgeModifierType }
                     */
                    public void setEdge(EdgeModifierType value) {
                        this.edge = value;
                    }

                    /**
                     * Ruft den Wert der storage-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link StorageModifierType }
                     */
                    public StorageModifierType getStorage() {
                        if (storage == null) {
                            return StorageModifierType.NONE;
                        } else {
                            return storage;
                        }
                    }

                    /**
                     * Legt den Wert der storage-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link StorageModifierType }
                     */
                    public void setStorage(StorageModifierType value) {
                        this.storage = value;
                    }

                    /**
                     * Ruft den Wert der hidden-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link Boolean }
                     */
                    public boolean isHidden() {
                        if (hidden == null) {
                            return false;
                        } else {
                            return hidden;
                        }
                    }

                    /**
                     * Legt den Wert der hidden-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link Boolean }
                     */
                    public void setHidden(Boolean value) {
                        this.hidden = value;
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
             *         &lt;element name="variable" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn"/>
             *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *                 &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
             *                 &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
             *                 &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
                    "variable"
            })
            public static class InputVariables {

                protected List<Body.SFC.VendorElement.InputVariables.Variable> variable;

                /**
                 * Gets the value of the variable property.
                 * <p>
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the variable property.
                 * <p>
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVariable().add(newItem);
                 * </pre>
                 * <p>
                 * <p>
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Body.SFC.VendorElement.InputVariables.Variable }
                 */
                public List<Body.SFC.VendorElement.InputVariables.Variable> getVariable() {
                    if (variable == null) {
                        variable = new ArrayList<Body.SFC.VendorElement.InputVariables.Variable>();
                    }
                    return this.variable;
                }


                /**
                 * Describes an inputVariable of a Function
                 * or a FunctionBlock
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
                 *         &lt;element name="connectionPointIn" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointIn"/>
                 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *       &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
                 *       &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
                 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "connectionPointIn",
                        "documentation"
                })
                public static class Variable {

                    @XmlElement(required = true)
                    protected org.plcopen.xml.tc60201.ConnectionPointIn connectionPointIn;
                    protected FormattedText documentation;
                    @XmlAttribute(name = "formalParameter", required = true)
                    protected String formalParameter;
                    @XmlAttribute(name = "negated")
                    protected Boolean negated;
                    @XmlAttribute(name = "edge")
                    protected EdgeModifierType edge;
                    @XmlAttribute(name = "storage")
                    protected StorageModifierType storage;
                    @XmlAttribute(name = "hidden")
                    protected Boolean hidden;

                    /**
                     * Ruft den Wert der connectionPointIn-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link org.plcopen.xml.tc60201.ConnectionPointIn }
                     */
                    public org.plcopen.xml.tc60201.ConnectionPointIn getConnectionPointIn() {
                        return connectionPointIn;
                    }

                    /**
                     * Legt den Wert der connectionPointIn-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link org.plcopen.xml.tc60201.ConnectionPointIn }
                     */
                    public void setConnectionPointIn(org.plcopen.xml.tc60201.ConnectionPointIn value) {
                        this.connectionPointIn = value;
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
                     * Ruft den Wert der formalParameter-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getFormalParameter() {
                        return formalParameter;
                    }

                    /**
                     * Legt den Wert der formalParameter-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setFormalParameter(String value) {
                        this.formalParameter = value;
                    }

                    /**
                     * Ruft den Wert der negated-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link Boolean }
                     */
                    public boolean isNegated() {
                        if (negated == null) {
                            return false;
                        } else {
                            return negated;
                        }
                    }

                    /**
                     * Legt den Wert der negated-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link Boolean }
                     */
                    public void setNegated(Boolean value) {
                        this.negated = value;
                    }

                    /**
                     * Ruft den Wert der edge-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link EdgeModifierType }
                     */
                    public EdgeModifierType getEdge() {
                        if (edge == null) {
                            return EdgeModifierType.NONE;
                        } else {
                            return edge;
                        }
                    }

                    /**
                     * Legt den Wert der edge-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link EdgeModifierType }
                     */
                    public void setEdge(EdgeModifierType value) {
                        this.edge = value;
                    }

                    /**
                     * Ruft den Wert der storage-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link StorageModifierType }
                     */
                    public StorageModifierType getStorage() {
                        if (storage == null) {
                            return StorageModifierType.NONE;
                        } else {
                            return storage;
                        }
                    }

                    /**
                     * Legt den Wert der storage-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link StorageModifierType }
                     */
                    public void setStorage(StorageModifierType value) {
                        this.storage = value;
                    }

                    /**
                     * Ruft den Wert der hidden-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link Boolean }
                     */
                    public boolean isHidden() {
                        if (hidden == null) {
                            return false;
                        } else {
                            return hidden;
                        }
                    }

                    /**
                     * Legt den Wert der hidden-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link Boolean }
                     */
                    public void setHidden(Boolean value) {
                        this.hidden = value;
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
             *         &lt;element name="variable" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
             *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *                 &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
             *                 &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
             *                 &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
                    "variable"
            })
            public static class OutputVariables {

                protected List<Body.SFC.VendorElement.OutputVariables.Variable> variable;

                /**
                 * Gets the value of the variable property.
                 * <p>
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the variable property.
                 * <p>
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVariable().add(newItem);
                 * </pre>
                 * <p>
                 * <p>
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Body.SFC.VendorElement.OutputVariables.Variable }
                 */
                public List<Body.SFC.VendorElement.OutputVariables.Variable> getVariable() {
                    if (variable == null) {
                        variable = new ArrayList<Body.SFC.VendorElement.OutputVariables.Variable>();
                    }
                    return this.variable;
                }


                /**
                 * Describes a outputVariable of a Function
                 * or a FunctionBlock
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
                 *         &lt;element name="connectionPointOut" type="{http://www.plcopen.org/xml/tc6_0201}connectionPointOut" minOccurs="0"/>
                 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="formalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *       &lt;attribute name="edge" type="{http://www.plcopen.org/xml/tc6_0201}edgeModifierType" default="none" />
                 *       &lt;attribute name="storage" type="{http://www.plcopen.org/xml/tc6_0201}storageModifierType" default="none" />
                 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "connectionPointOut",
                        "documentation"
                })
                public static class Variable {

                    protected org.plcopen.xml.tc60201.ConnectionPointOut connectionPointOut;
                    protected FormattedText documentation;
                    @XmlAttribute(name = "formalParameter", required = true)
                    protected String formalParameter;
                    @XmlAttribute(name = "negated")
                    protected Boolean negated;
                    @XmlAttribute(name = "edge")
                    protected EdgeModifierType edge;
                    @XmlAttribute(name = "storage")
                    protected StorageModifierType storage;
                    @XmlAttribute(name = "hidden")
                    protected Boolean hidden;

                    /**
                     * Ruft den Wert der connectionPointOut-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link org.plcopen.xml.tc60201.ConnectionPointOut }
                     */
                    public org.plcopen.xml.tc60201.ConnectionPointOut getConnectionPointOut() {
                        return connectionPointOut;
                    }

                    /**
                     * Legt den Wert der connectionPointOut-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link org.plcopen.xml.tc60201.ConnectionPointOut }
                     */
                    public void setConnectionPointOut(org.plcopen.xml.tc60201.ConnectionPointOut value) {
                        this.connectionPointOut = value;
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
                     * Ruft den Wert der formalParameter-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getFormalParameter() {
                        return formalParameter;
                    }

                    /**
                     * Legt den Wert der formalParameter-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setFormalParameter(String value) {
                        this.formalParameter = value;
                    }

                    /**
                     * Ruft den Wert der negated-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link Boolean }
                     */
                    public boolean isNegated() {
                        if (negated == null) {
                            return false;
                        } else {
                            return negated;
                        }
                    }

                    /**
                     * Legt den Wert der negated-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link Boolean }
                     */
                    public void setNegated(Boolean value) {
                        this.negated = value;
                    }

                    /**
                     * Ruft den Wert der edge-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link EdgeModifierType }
                     */
                    public EdgeModifierType getEdge() {
                        if (edge == null) {
                            return EdgeModifierType.NONE;
                        } else {
                            return edge;
                        }
                    }

                    /**
                     * Legt den Wert der edge-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link EdgeModifierType }
                     */
                    public void setEdge(EdgeModifierType value) {
                        this.edge = value;
                    }

                    /**
                     * Ruft den Wert der storage-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link StorageModifierType }
                     */
                    public StorageModifierType getStorage() {
                        if (storage == null) {
                            return StorageModifierType.NONE;
                        } else {
                            return storage;
                        }
                    }

                    /**
                     * Legt den Wert der storage-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link StorageModifierType }
                     */
                    public void setStorage(StorageModifierType value) {
                        this.storage = value;
                    }

                    /**
                     * Ruft den Wert der hidden-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link Boolean }
                     */
                    public boolean isHidden() {
                        if (hidden == null) {
                            return false;
                        } else {
                            return hidden;
                        }
                    }

                    /**
                     * Legt den Wert der hidden-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link Boolean }
                     */
                    public void setHidden(Boolean value) {
                        this.hidden = value;
                    }

                }

            }

        }

    }
}
