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
 * List of access variable declarations
 * <p>
 * <p>
 * <p>Java-Klasse für varListAccess complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType name="varListAccess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessVariable" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="type" type="{http://www.plcopen.org/xml/tc6_0201}dataType"/>
 *                   &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="alias" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="instancePathAndName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="direction" type="{http://www.plcopen.org/xml/tc6_0201}accessType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "varListAccess", propOrder = {
        "accessVariable",
        "addData",
        "documentation"
})
public class VarListAccess implements AddDataContainer{

    protected List<VarListAccess.AccessVariable> accessVariable;
    protected AddData addData;
    protected FormattedText documentation;

    /**
     * Gets the value of the accessVariable property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessVariable property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessVariable().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VarListAccess.AccessVariable }
     */
    public List<VarListAccess.AccessVariable> getAccessVariable() {
        if (accessVariable == null) {
            accessVariable = new ArrayList<VarListAccess.AccessVariable>();
        }
        return this.accessVariable;
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
     * Declaration of an access variable
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
     *         &lt;element name="type" type="{http://www.plcopen.org/xml/tc6_0201}dataType"/>
     *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
     *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="alias" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="instancePathAndName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="direction" type="{http://www.plcopen.org/xml/tc6_0201}accessType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "type",
            "addData",
            "documentation"
    })
    public static class AccessVariable implements AddDataContainer{

        @XmlElement(required = true)
        protected DataType type;
        protected AddData addData;
        protected FormattedText documentation;
        @XmlAttribute(name = "alias", required = true)
        protected String alias;
        @XmlAttribute(name = "instancePathAndName", required = true)
        protected String instancePathAndName;
        @XmlAttribute(name = "direction")
        protected AccessType direction;

        /**
         * Ruft den Wert der type-Eigenschaft ab.
         *
         * @return possible object is
         * {@link DataType }
         */
        public DataType getType() {
            return type;
        }

        /**
         * Legt den Wert der type-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link DataType }
         */
        public void setType(DataType value) {
            this.type = value;
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
         * Ruft den Wert der alias-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getAlias() {
            return alias;
        }

        /**
         * Legt den Wert der alias-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAlias(String value) {
            this.alias = value;
        }

        /**
         * Ruft den Wert der instancePathAndName-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getInstancePathAndName() {
            return instancePathAndName;
        }

        /**
         * Legt den Wert der instancePathAndName-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInstancePathAndName(String value) {
            this.instancePathAndName = value;
        }

        /**
         * Ruft den Wert der direction-Eigenschaft ab.
         *
         * @return possible object is
         * {@link AccessType }
         */
        public AccessType getDirection() {
            return direction;
        }

        /**
         * Legt den Wert der direction-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link AccessType }
         */
        public void setDirection(AccessType value) {
            this.direction = value;
        }

    }

}
