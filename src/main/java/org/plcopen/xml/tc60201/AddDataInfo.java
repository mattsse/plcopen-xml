//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11-b140731.1112 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.17 um 05:44:19 PM CET 
//


package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * List of additional data elements used in the
 * document with description
 * <p>
 * <p>Java-Klasse für addDataInfo complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType name="addDataInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="info" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="description" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="vendor" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
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
@XmlType(name = "addDataInfo", propOrder = {
        "info"
})
public class AddDataInfo implements org.plcopen.xml.tc60201.PlcNode{

    protected List<AddDataInfo.Info> info;

    /**
     * Gets the value of the info property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the info property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfo().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddDataInfo.Info }
     */
    public List<AddDataInfo.Info> getInfo() {
        if (info == null) {
            info = new ArrayList<AddDataInfo.Info>();
        }
        return this.info;
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
     *         &lt;element name="description" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="vendor" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "description"
    })
    public static class Info implements org.plcopen.xml.tc60201.PlcNode{

        protected FormattedText description;
        @XmlAttribute(name = "name", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String name;
        @XmlAttribute(name = "version")
        protected BigDecimal version;
        @XmlAttribute(name = "vendor", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String vendor;

        /**
         * Ruft den Wert der description-Eigenschaft ab.
         *
         * @return possible object is
         * {@link FormattedText }
         */
        public FormattedText getDescription() {
            return description;
        }

        /**
         * Legt den Wert der description-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link FormattedText }
         */
        public void setDescription(FormattedText value) {
            this.description = value;
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
         * Ruft den Wert der version-Eigenschaft ab.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getVersion() {
            return version;
        }

        /**
         * Legt den Wert der version-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setVersion(BigDecimal value) {
            this.version = value;
        }

        /**
         * Ruft den Wert der vendor-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVendor() {
            return vendor;
        }

        /**
         * Legt den Wert der vendor-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVendor(String value) {
            this.vendor = value;
        }

    }

}
