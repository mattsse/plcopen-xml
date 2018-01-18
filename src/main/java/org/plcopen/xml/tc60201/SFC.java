package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.math.BigInteger;
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
public class SFC implements PlcNode{

    @XmlElements({
            @XmlElement(name = "comment", type = Comment.class),
            @XmlElement(name = "error", type = Error.class),
            @XmlElement(name = "connector", type = Connector.class),
            @XmlElement(name = "continuation", type = Continuation.class),
            @XmlElement(name = "actionBlock", type = ActionBlock.class),
            @XmlElement(name = "vendorElement", type = VendorElement.class),
            @XmlElement(name = "block", type = Block.class),
            @XmlElement(name = "inVariable", type = InVariable.class),
            @XmlElement(name = "outVariable", type = OutVariable.class),
            @XmlElement(name = "inOutVariable", type = InOutVariable.class),
            @XmlElement(name = "label", type = Label.class),
            @XmlElement(name = "jump", type = Jump.class),
            @XmlElement(name = "return", type = Return.class),
            @XmlElement(name = "leftPowerRail", type = LeftPowerRail.class),
            @XmlElement(name = "rightPowerRail", type = RightPowerRail.class),
            @XmlElement(name = "coil", type = Coil.class),
            @XmlElement(name = "contact", type = Contact.class),
            @XmlElement(name = "step", type = Step.class),
            @XmlElement(name = "macroStep", type = MacroStep.class),
            @XmlElement(name = "jumpStep", type = JumpStep.class),
            @XmlElement(name = "transition", type = Transition.class),
            @XmlElement(name = "selectionDivergence", type = SelectionDivergence.class),
            @XmlElement(name = "selectionConvergence", type = SelectionConvergence.class),
            @XmlElement(name = "simultaneousDivergence", type = SimultaneousDivergence.class),
            @XmlElement(name = "simultaneousConvergence", type = SimultaneousConvergence.class)
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
     * {@link Comment }
     * {@link Error }
     * {@link Connector }
     * {@link Continuation }
     * {@link ActionBlock }
     * {@link VendorElement }
     * {@link Block }
     * {@link InVariable }
     * {@link OutVariable }
     * {@link InOutVariable }
     * {@link Label }
     * {@link Jump }
     * {@link Return }
     * {@link LeftPowerRail }
     * {@link RightPowerRail }
     * {@link Coil }
     * {@link Contact }
     * {@link Step }
     * {@link MacroStep }
     * {@link JumpStep }
     * {@link Transition }
     * {@link SelectionDivergence }
     * {@link SelectionConvergence }
     * {@link SimultaneousDivergence }
     * {@link SimultaneousConvergence }
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
    public static class ActionBlock implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
        protected List<ActionBlock.Action> action;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
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
         * {@link ActionBlock.Action }
         */
        public List<ActionBlock.Action> getAction() {
            if (action == null) {
                action = new ArrayList<ActionBlock.Action>();
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
        public static class Action implements AddDataContainer, PlcNode{

            @XmlElement(required = true)
            protected Position relPosition;
            protected ActionBlock.Action.Reference reference;
            protected Body inline;
            protected ConnectionPointOut connectionPointOut;
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
             * {@link ActionBlock.Action.Reference }
             */
            public ActionBlock.Action.Reference getReference() {
                return reference;
            }

            /**
             * Legt den Wert der reference-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link ActionBlock.Action.Reference }
             */
            public void setReference(ActionBlock.Action.Reference value) {
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
             * {@link ConnectionPointOut }
             */
            public ConnectionPointOut getConnectionPointOut() {
                return connectionPointOut;
            }

            /**
             * Legt den Wert der connectionPointOut-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link ConnectionPointOut }
             */
            public void setConnectionPointOut(ConnectionPointOut value) {
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
            public static class Reference implements PlcNode{

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
    public static class Block implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        @XmlElement(required = true)
        protected Block.InputVariables inputVariables;
        @XmlElement(required = true)
        protected Block.InOutVariables inOutVariables;
        @XmlElement(required = true)
        protected Block.OutputVariables outputVariables;
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
         * {@link Block.InputVariables }
         */
        public Block.InputVariables getInputVariables() {
            return inputVariables;
        }

        /**
         * Legt den Wert der inputVariables-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link Block.InputVariables }
         */
        public void setInputVariables(Block.InputVariables value) {
            this.inputVariables = value;
        }

        /**
         * Ruft den Wert der inOutVariables-Eigenschaft ab.
         *
         * @return possible object is
         * {@link Block.InOutVariables }
         */
        public Block.InOutVariables getInOutVariables() {
            return inOutVariables;
        }

        /**
         * Legt den Wert der inOutVariables-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link Block.InOutVariables }
         */
        public void setInOutVariables(Block.InOutVariables value) {
            this.inOutVariables = value;
        }

        /**
         * Ruft den Wert der outputVariables-Eigenschaft ab.
         *
         * @return possible object is
         * {@link Block.OutputVariables }
         */
        public Block.OutputVariables getOutputVariables() {
            return outputVariables;
        }

        /**
         * Legt den Wert der outputVariables-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link Block.OutputVariables }
         */
        public void setOutputVariables(Block.OutputVariables value) {
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
        public static class InOutVariables implements PlcNode{

            protected List<Block.InOutVariables.Variable> variable;

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
             * {@link Block.InOutVariables.Variable }
             */
            public List<Block.InOutVariables.Variable> getVariable() {
                if (variable == null) {
                    variable = new ArrayList<Block.InOutVariables.Variable>();
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
            public static class Variable implements PlcNode{

                protected ConnectionPointIn connectionPointIn;
                protected ConnectionPointOut connectionPointOut;
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
                 * {@link ConnectionPointIn }
                 */
                public ConnectionPointIn getConnectionPointIn() {
                    return connectionPointIn;
                }

                /**
                 * Legt den Wert der connectionPointIn-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link ConnectionPointIn }
                 */
                public void setConnectionPointIn(ConnectionPointIn value) {
                    this.connectionPointIn = value;
                }

                /**
                 * Ruft den Wert der connectionPointOut-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link ConnectionPointOut }
                 */
                public ConnectionPointOut getConnectionPointOut() {
                    return connectionPointOut;
                }

                /**
                 * Legt den Wert der connectionPointOut-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link ConnectionPointOut }
                 */
                public void setConnectionPointOut(ConnectionPointOut value) {
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
        public static class InputVariables implements PlcNode{

            protected List<Block.InputVariables.Variable> variable;

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
             * {@link Block.InputVariables.Variable }
             */
            public List<Block.InputVariables.Variable> getVariable() {
                if (variable == null) {
                    variable = new ArrayList<Block.InputVariables.Variable>();
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
            public static class Variable implements PlcNode{

                @XmlElement(required = true)
                protected ConnectionPointIn connectionPointIn;
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
                 * {@link ConnectionPointIn }
                 */
                public ConnectionPointIn getConnectionPointIn() {
                    return connectionPointIn;
                }

                /**
                 * Legt den Wert der connectionPointIn-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link ConnectionPointIn }
                 */
                public void setConnectionPointIn(ConnectionPointIn value) {
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
        public static class OutputVariables implements PlcNode{

            protected List<Block.OutputVariables.Variable> variable;

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
             * {@link Block.OutputVariables.Variable }
             */
            public List<Block.OutputVariables.Variable> getVariable() {
                if (variable == null) {
                    variable = new ArrayList<Block.OutputVariables.Variable>();
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
            public static class Variable implements PlcNode{

                protected ConnectionPointOut connectionPointOut;
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
                 * {@link ConnectionPointOut }
                 */
                public ConnectionPointOut getConnectionPointOut() {
                    return connectionPointOut;
                }

                /**
                 * Legt den Wert der connectionPointOut-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link ConnectionPointOut }
                 */
                public void setConnectionPointOut(ConnectionPointOut value) {
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
    public static class Coil implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
        protected ConnectionPointOut connectionPointOut;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
            this.connectionPointIn = value;
        }

        /**
         * Ruft den Wert der connectionPointOut-Eigenschaft ab.
         *
         * @return possible object is
         * {@link ConnectionPointOut }
         */
        public ConnectionPointOut getConnectionPointOut() {
            return connectionPointOut;
        }

        /**
         * Legt den Wert der connectionPointOut-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointOut }
         */
        public void setConnectionPointOut(ConnectionPointOut value) {
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
    public static class Comment implements AddDataContainer, PlcNode{

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
    public static class Connector implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
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
    public static class Contact implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
        protected ConnectionPointOut connectionPointOut;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
            this.connectionPointIn = value;
        }

        /**
         * Ruft den Wert der connectionPointOut-Eigenschaft ab.
         *
         * @return possible object is
         * {@link ConnectionPointOut }
         */
        public ConnectionPointOut getConnectionPointOut() {
            return connectionPointOut;
        }

        /**
         * Legt den Wert der connectionPointOut-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointOut }
         */
        public void setConnectionPointOut(ConnectionPointOut value) {
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
    public static class Continuation implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointOut connectionPointOut;
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
         * {@link ConnectionPointOut }
         */
        public ConnectionPointOut getConnectionPointOut() {
            return connectionPointOut;
        }

        /**
         * Legt den Wert der connectionPointOut-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointOut }
         */
        public void setConnectionPointOut(ConnectionPointOut value) {
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
    public static class Error implements AddDataContainer, PlcNode{

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
    public static class InOutVariable implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
        protected ConnectionPointOut connectionPointOut;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
            this.connectionPointIn = value;
        }

        /**
         * Ruft den Wert der connectionPointOut-Eigenschaft ab.
         *
         * @return possible object is
         * {@link ConnectionPointOut }
         */
        public ConnectionPointOut getConnectionPointOut() {
            return connectionPointOut;
        }

        /**
         * Legt den Wert der connectionPointOut-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointOut }
         */
        public void setConnectionPointOut(ConnectionPointOut value) {
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
    public static class InVariable implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointOut connectionPointOut;
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
         * {@link ConnectionPointOut }
         */
        public ConnectionPointOut getConnectionPointOut() {
            return connectionPointOut;
        }

        /**
         * Legt den Wert der connectionPointOut-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointOut }
         */
        public void setConnectionPointOut(ConnectionPointOut value) {
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
    public static class Jump implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
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
    public static class JumpStep implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
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
    public static class Label implements AddDataContainer, PlcNode{

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
    public static class LeftPowerRail implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected List<LeftPowerRail.ConnectionPointOut> connectionPointOut;
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
         * {@link LeftPowerRail.ConnectionPointOut }
         */
        public List<LeftPowerRail.ConnectionPointOut> getConnectionPointOut() {
            if (connectionPointOut == null) {
                connectionPointOut = new ArrayList<LeftPowerRail.ConnectionPointOut>();
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
    public static class MacroStep implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
        protected ConnectionPointOut connectionPointOut;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
            this.connectionPointIn = value;
        }

        /**
         * Ruft den Wert der connectionPointOut-Eigenschaft ab.
         *
         * @return possible object is
         * {@link ConnectionPointOut }
         */
        public ConnectionPointOut getConnectionPointOut() {
            return connectionPointOut;
        }

        /**
         * Legt den Wert der connectionPointOut-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointOut }
         */
        public void setConnectionPointOut(ConnectionPointOut value) {
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
    public static class OutVariable implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
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
    public static class Return implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
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
    public static class RightPowerRail implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected List<ConnectionPointIn> connectionPointIn;
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
         * {@link ConnectionPointIn }
         */
        public List<ConnectionPointIn> getConnectionPointIn() {
            if (connectionPointIn == null) {
                connectionPointIn = new ArrayList<ConnectionPointIn>();
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
    public static class SelectionConvergence implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected List<SelectionConvergence.ConnectionPointIn> connectionPointIn;
        protected ConnectionPointOut connectionPointOut;
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
         * {@link SelectionConvergence.ConnectionPointIn }
         */
        public List<SelectionConvergence.ConnectionPointIn> getConnectionPointIn() {
            if (connectionPointIn == null) {
                connectionPointIn = new ArrayList<SelectionConvergence.ConnectionPointIn>();
            }
            return this.connectionPointIn;
        }

        /**
         * Ruft den Wert der connectionPointOut-Eigenschaft ab.
         *
         * @return possible object is
         * {@link ConnectionPointOut }
         */
        public ConnectionPointOut getConnectionPointOut() {
            return connectionPointOut;
        }

        /**
         * Legt den Wert der connectionPointOut-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointOut }
         */
        public void setConnectionPointOut(ConnectionPointOut value) {
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
    public static class SelectionDivergence implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
        protected List<SelectionDivergence.ConnectionPointOut> connectionPointOut;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
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
         * {@link SelectionDivergence.ConnectionPointOut }
         */
        public List<SelectionDivergence.ConnectionPointOut> getConnectionPointOut() {
            if (connectionPointOut == null) {
                connectionPointOut = new ArrayList<SelectionDivergence.ConnectionPointOut>();
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
    public static class SimultaneousConvergence implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected List<ConnectionPointIn> connectionPointIn;
        protected ConnectionPointOut connectionPointOut;
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
         * {@link ConnectionPointIn }
         */
        public List<ConnectionPointIn> getConnectionPointIn() {
            if (connectionPointIn == null) {
                connectionPointIn = new ArrayList<ConnectionPointIn>();
            }
            return this.connectionPointIn;
        }

        /**
         * Ruft den Wert der connectionPointOut-Eigenschaft ab.
         *
         * @return possible object is
         * {@link ConnectionPointOut }
         */
        public ConnectionPointOut getConnectionPointOut() {
            return connectionPointOut;
        }

        /**
         * Legt den Wert der connectionPointOut-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointOut }
         */
        public void setConnectionPointOut(ConnectionPointOut value) {
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
    public static class SimultaneousDivergence implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
        protected List<SimultaneousDivergence.ConnectionPointOut> connectionPointOut;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
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
         * {@link SimultaneousDivergence.ConnectionPointOut }
         */
        public List<SimultaneousDivergence.ConnectionPointOut> getConnectionPointOut() {
            if (connectionPointOut == null) {
                connectionPointOut = new ArrayList<SimultaneousDivergence.ConnectionPointOut>();
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
    public static class Step implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
        protected Step.ConnectionPointOut connectionPointOut;
        protected Step.ConnectionPointOutAction connectionPointOutAction;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
            this.connectionPointIn = value;
        }

        /**
         * Ruft den Wert der connectionPointOut-Eigenschaft ab.
         *
         * @return possible object is
         * {@link Step.ConnectionPointOut }
         */
        public Step.ConnectionPointOut getConnectionPointOut() {
            return connectionPointOut;
        }

        /**
         * Legt den Wert der connectionPointOut-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link Step.ConnectionPointOut }
         */
        public void setConnectionPointOut(Step.ConnectionPointOut value) {
            this.connectionPointOut = value;
        }

        /**
         * Ruft den Wert der connectionPointOutAction-Eigenschaft ab.
         *
         * @return possible object is
         * {@link Step.ConnectionPointOutAction }
         */
        public Step.ConnectionPointOutAction getConnectionPointOutAction() {
            return connectionPointOutAction;
        }

        /**
         * Legt den Wert der connectionPointOutAction-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link Step.ConnectionPointOutAction }
         */
        public void setConnectionPointOutAction(Step.ConnectionPointOutAction value) {
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
    public static class Transition implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        protected ConnectionPointIn connectionPointIn;
        protected ConnectionPointOut connectionPointOut;
        protected Transition.Condition condition;
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
         * {@link ConnectionPointIn }
         */
        public ConnectionPointIn getConnectionPointIn() {
            return connectionPointIn;
        }

        /**
         * Legt den Wert der connectionPointIn-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointIn }
         */
        public void setConnectionPointIn(ConnectionPointIn value) {
            this.connectionPointIn = value;
        }

        /**
         * Ruft den Wert der connectionPointOut-Eigenschaft ab.
         *
         * @return possible object is
         * {@link ConnectionPointOut }
         */
        public ConnectionPointOut getConnectionPointOut() {
            return connectionPointOut;
        }

        /**
         * Legt den Wert der connectionPointOut-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link ConnectionPointOut }
         */
        public void setConnectionPointOut(ConnectionPointOut value) {
            this.connectionPointOut = value;
        }

        /**
         * Ruft den Wert der condition-Eigenschaft ab.
         *
         * @return possible object is
         * {@link Transition.Condition }
         */
        public Transition.Condition getCondition() {
            return condition;
        }

        /**
         * Legt den Wert der condition-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link Transition.Condition }
         */
        public void setCondition(Transition.Condition value) {
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
        public static class Condition implements PlcNode{

            protected Transition.Condition.Reference reference;
            protected ConnectionPointIn connectionPointIn;
            protected Transition.Condition.Inline inline;
            @XmlAttribute(name = "negated")
            protected Boolean negated;

            /**
             * Ruft den Wert der reference-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Transition.Condition.Reference }
             */
            public Transition.Condition.Reference getReference() {
                return reference;
            }

            /**
             * Legt den Wert der reference-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Transition.Condition.Reference }
             */
            public void setReference(Transition.Condition.Reference value) {
                this.reference = value;
            }

            /**
             * Ruft den Wert der connectionPointIn-Eigenschaft ab.
             *
             * @return possible object is
             * {@link ConnectionPointIn }
             */
            public ConnectionPointIn getConnectionPointIn() {
                return connectionPointIn;
            }

            /**
             * Legt den Wert der connectionPointIn-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link ConnectionPointIn }
             */
            public void setConnectionPointIn(ConnectionPointIn value) {
                this.connectionPointIn = value;
            }

            /**
             * Ruft den Wert der inline-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Transition.Condition.Inline }
             */
            public Transition.Condition.Inline getInline() {
                return inline;
            }

            /**
             * Legt den Wert der inline-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Transition.Condition.Inline }
             */
            public void setInline(Transition.Condition.Inline value) {
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
            public static class Reference implements PlcNode{

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
    public static class VendorElement implements AddDataContainer, PlcNode{

        @XmlElement(required = true)
        protected Position position;
        @XmlElement(required = true)
        protected FormattedText alternativeText;
        protected VendorElement.InputVariables inputVariables;
        protected VendorElement.InOutVariables inOutVariables;
        protected VendorElement.OutputVariables outputVariables;
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
         * {@link VendorElement.InputVariables }
         */
        public VendorElement.InputVariables getInputVariables() {
            return inputVariables;
        }

        /**
         * Legt den Wert der inputVariables-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link VendorElement.InputVariables }
         */
        public void setInputVariables(VendorElement.InputVariables value) {
            this.inputVariables = value;
        }

        /**
         * Ruft den Wert der inOutVariables-Eigenschaft ab.
         *
         * @return possible object is
         * {@link VendorElement.InOutVariables }
         */
        public VendorElement.InOutVariables getInOutVariables() {
            return inOutVariables;
        }

        /**
         * Legt den Wert der inOutVariables-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link VendorElement.InOutVariables }
         */
        public void setInOutVariables(VendorElement.InOutVariables value) {
            this.inOutVariables = value;
        }

        /**
         * Ruft den Wert der outputVariables-Eigenschaft ab.
         *
         * @return possible object is
         * {@link VendorElement.OutputVariables }
         */
        public VendorElement.OutputVariables getOutputVariables() {
            return outputVariables;
        }

        /**
         * Legt den Wert der outputVariables-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link VendorElement.OutputVariables }
         */
        public void setOutputVariables(VendorElement.OutputVariables value) {
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
        public static class InOutVariables implements PlcNode{

            protected List<VendorElement.InOutVariables.Variable> variable;

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
             * {@link VendorElement.InOutVariables.Variable }
             */
            public List<VendorElement.InOutVariables.Variable> getVariable() {
                if (variable == null) {
                    variable = new ArrayList<VendorElement.InOutVariables.Variable>();
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
            public static class Variable implements PlcNode{

                protected ConnectionPointIn connectionPointIn;
                protected ConnectionPointOut connectionPointOut;
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
                 * {@link ConnectionPointIn }
                 */
                public ConnectionPointIn getConnectionPointIn() {
                    return connectionPointIn;
                }

                /**
                 * Legt den Wert der connectionPointIn-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link ConnectionPointIn }
                 */
                public void setConnectionPointIn(ConnectionPointIn value) {
                    this.connectionPointIn = value;
                }

                /**
                 * Ruft den Wert der connectionPointOut-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link ConnectionPointOut }
                 */
                public ConnectionPointOut getConnectionPointOut() {
                    return connectionPointOut;
                }

                /**
                 * Legt den Wert der connectionPointOut-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link ConnectionPointOut }
                 */
                public void setConnectionPointOut(ConnectionPointOut value) {
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
        public static class InputVariables implements PlcNode{

            protected List<VendorElement.InputVariables.Variable> variable;

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
             * {@link VendorElement.InputVariables.Variable }
             */
            public List<VendorElement.InputVariables.Variable> getVariable() {
                if (variable == null) {
                    variable = new ArrayList<VendorElement.InputVariables.Variable>();
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
            public static class Variable implements PlcNode{

                @XmlElement(required = true)
                protected ConnectionPointIn connectionPointIn;
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
                 * {@link ConnectionPointIn }
                 */
                public ConnectionPointIn getConnectionPointIn() {
                    return connectionPointIn;
                }

                /**
                 * Legt den Wert der connectionPointIn-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link ConnectionPointIn }
                 */
                public void setConnectionPointIn(ConnectionPointIn value) {
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
        public static class OutputVariables implements PlcNode{

            protected List<VendorElement.OutputVariables.Variable> variable;

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
             * {@link VendorElement.OutputVariables.Variable }
             */
            public List<VendorElement.OutputVariables.Variable> getVariable() {
                if (variable == null) {
                    variable = new ArrayList<VendorElement.OutputVariables.Variable>();
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
            public static class Variable implements PlcNode{

                protected ConnectionPointOut connectionPointOut;
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
                 * {@link ConnectionPointOut }
                 */
                public ConnectionPointOut getConnectionPointOut() {
                    return connectionPointOut;
                }

                /**
                 * Legt den Wert der connectionPointOut-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link ConnectionPointOut }
                 */
                public void setConnectionPointOut(ConnectionPointOut value) {
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
