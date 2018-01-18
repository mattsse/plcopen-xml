package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="interface" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="returnType" type="{http://www.plcopen.org/xml/tc6_0201}dataType" minOccurs="0"/>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="localVars">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="tempVars">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="inputVars">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="outputVars">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="inOutVars">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="externalVars">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="globalVars">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="accessVars" type="{http://www.plcopen.org/xml/tc6_0201}varList"/>
 *                   &lt;/choice>
 *                   &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="actions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="action" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body"/>
 *                             &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                             &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="transitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transition" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body"/>
 *                             &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                             &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pouType" use="required" type="{http://www.plcopen.org/xml/tc6_0201}pouType" />
 *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "_interface",
        "actions",
        "transitions",
        "body",
        "addData",
        "documentation"
})
@XmlRootElement(name = "pou")
public class Pou implements AddDataContainer, PlcNode {

    @XmlElement(name = "interface")
    protected Interface _interface;
    protected Actions actions;
    protected Transitions transitions;
    protected List<Body> body;
    protected AddData addData;
    protected FormattedText documentation;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "pouType", required = true)
    protected PouType pouType;
    @XmlAttribute(name = "globalId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String globalId;

    /**
     * Ruft den Wert der interface-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Interface }
     */
    public Interface getInterface() {
        return _interface;
    }

    /**
     * Legt den Wert der interface-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Interface }
     */
    public void setInterface(Interface value) {
        this._interface = value;
    }

    /**
     * Ruft den Wert der actions-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Actions }
     */
    public Actions getActions() {
        return actions;
    }

    /**
     * Legt den Wert der actions-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Actions }
     */
    public void setActions(Actions value) {
        this.actions = value;
    }

    /**
     * Ruft den Wert der transitions-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Transitions }
     */
    public Transitions getTransitions() {
        return transitions;
    }

    /**
     * Legt den Wert der transitions-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Transitions }
     */
    public void setTransitions(Transitions value) {
        this.transitions = value;
    }

    /**
     * Gets the value of the body property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the body property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBody().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Body }
     */
    public List<Body> getBody() {
        if (body == null) {
            body = new ArrayList<Body>();
        }
        return this.body;
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
     * Ruft den Wert der pouType-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PouType }
     */
    public PouType getPouType() {
        return pouType;
    }

    /**
     * Legt den Wert der pouType-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PouType }
     */
    public void setPouType(PouType value) {
        this.pouType = value;
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
     *         &lt;element name="action" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body"/>
     *                   &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
     *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
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
            "action"
    })
    public static class Actions implements PlcNode {

        protected List<Actions.Action> action;

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
         * {@link Actions.Action }
         */
        public List<Actions.Action> getAction() {
            if (action == null) {
                action = new ArrayList<Actions.Action>();
            }
            return this.action;
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
         *         &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "body",
                "addData",
                "documentation"
        })
        public static class Action implements AddDataContainer, PlcNode {

            @XmlElement(required = true)
            protected Body body;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

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
     *         &lt;element name="returnType" type="{http://www.plcopen.org/xml/tc6_0201}dataType" minOccurs="0"/>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="localVars">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="tempVars">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="inputVars">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="outputVars">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="inOutVars">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="externalVars">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="globalVars">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="accessVars" type="{http://www.plcopen.org/xml/tc6_0201}varList"/>
     *         &lt;/choice>
     *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
     *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "returnType",
            "localVarsOrTempVarsOrInputVars",
            "addData",
            "documentation"
    })
    public static class Interface implements AddDataContainer, PlcNode {

        protected DataType returnType;
        @XmlElements({
                @XmlElement(name = "localVars", type = Interface.LocalVars.class),
                @XmlElement(name = "tempVars", type = Interface.TempVars.class),
                @XmlElement(name = "inputVars", type = Interface.InputVars.class),
                @XmlElement(name = "outputVars", type = Interface.OutputVars.class),
                @XmlElement(name = "inOutVars", type = Interface.InOutVars.class),
                @XmlElement(name = "externalVars", type = Interface.ExternalVars.class),
                @XmlElement(name = "globalVars", type = Interface.GlobalVars.class),
                @XmlElement(name = "accessVars")
        })
        protected List<VarList> localVarsOrTempVarsOrInputVars;
        protected AddData addData;
        protected FormattedText documentation;

        /**
         * Ruft den Wert der returnType-Eigenschaft ab.
         *
         * @return possible object is
         * {@link DataType }
         */
        public DataType getReturnType() {
            return returnType;
        }

        /**
         * Legt den Wert der returnType-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link DataType }
         */
        public void setReturnType(DataType value) {
            this.returnType = value;
        }

        /**
         * Gets the value of the localVarsOrTempVarsOrInputVars property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the localVarsOrTempVarsOrInputVars property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocalVarsOrTempVarsOrInputVars().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Interface.LocalVars }
         * {@link Interface.TempVars }
         * {@link Interface.InputVars }
         * {@link Interface.OutputVars }
         * {@link Interface.InOutVars }
         * {@link Interface.ExternalVars }
         * {@link Interface.GlobalVars }
         * {@link VarList }
         */
        public List<VarList> getLocalVarsOrTempVarsOrInputVars() {
            if (localVarsOrTempVarsOrInputVars == null) {
                localVarsOrTempVarsOrInputVars = new ArrayList<VarList>();
            }
            return this.localVarsOrTempVarsOrInputVars;
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
         * <p>Java-Klasse für anonymous complex type.
         * <p>
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ExternalVars
                extends VarList {


        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * <p>
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GlobalVars
                extends VarList {


        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * <p>
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InOutVars
                extends VarList {


        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * <p>
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InputVars
                extends VarList {


        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * <p>
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LocalVars
                extends VarList {


        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * <p>
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OutputVars
                extends VarList {


        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * <p>
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TempVars
                extends VarList {


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
     *         &lt;element name="transition" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body"/>
     *                   &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
     *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
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
            "transition"
    })
    public static class Transitions implements PlcNode {

        protected List<Transitions.Transition> transition;

        /**
         * Gets the value of the transition property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transition property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransition().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transitions.Transition }
         */
        public List<Transitions.Transition> getTransition() {
            if (transition == null) {
                transition = new ArrayList<Transitions.Transition>();
            }
            return this.transition;
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
         *         &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body"/>
         *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "body",
                "addData",
                "documentation"
        })
        public static class Transition implements AddDataContainer, PlcNode {

            @XmlElement(required = true)
            protected Body body;
            protected AddData addData;
            protected FormattedText documentation;
            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "globalId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String globalId;

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

        }

    }

}
