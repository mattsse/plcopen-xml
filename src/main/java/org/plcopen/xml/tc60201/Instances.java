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
 *         &lt;element name="configurations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="configuration" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="resource" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="task" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="pouInstance" type="{http://www.plcopen.org/xml/tc6_0201}pouInstance" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                                                 &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="single" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="interval" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="priority" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                     &lt;minInclusive value="0"/>
 *                                                     &lt;maxInclusive value="65535"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="globalVars" type="{http://www.plcopen.org/xml/tc6_0201}varList" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="pouInstance" type="{http://www.plcopen.org/xml/tc6_0201}pouInstance" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                                       &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="globalVars" type="{http://www.plcopen.org/xml/tc6_0201}varList" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="accessVars" type="{http://www.plcopen.org/xml/tc6_0201}varListAccess" minOccurs="0"/>
 *                             &lt;element name="configVars" type="{http://www.plcopen.org/xml/tc6_0201}varListConfig" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "configurations"
})
public class Instances implements PlcNode {

    @XmlElement(required = true)
    protected Configurations configurations;

    /**
     * Ruft den Wert der configurations-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Configurations }
     */
    public Configurations getConfigurations() {
        return configurations;
    }

    /**
     * Legt den Wert der configurations-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Configurations }
     */
    public void setConfigurations(Configurations value) {
        this.configurations = value;
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
     *         &lt;element name="configuration" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="resource" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="task" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="pouInstance" type="{http://www.plcopen.org/xml/tc6_0201}pouInstance" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
     *                                       &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="single" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="interval" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="priority" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                           &lt;minInclusive value="0"/>
     *                                           &lt;maxInclusive value="65535"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="globalVars" type="{http://www.plcopen.org/xml/tc6_0201}varList" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="pouInstance" type="{http://www.plcopen.org/xml/tc6_0201}pouInstance" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
     *                             &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="globalVars" type="{http://www.plcopen.org/xml/tc6_0201}varList" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="accessVars" type="{http://www.plcopen.org/xml/tc6_0201}varListAccess" minOccurs="0"/>
     *                   &lt;element name="configVars" type="{http://www.plcopen.org/xml/tc6_0201}varListConfig" minOccurs="0"/>
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
            "configuration"
    })
    public static class Configurations implements PlcNode {

        protected List<Configurations.Configuration> configuration;

        /**
         * Gets the value of the configuration property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the configuration property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConfiguration().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Configurations.Configuration }
         */
        public List<Configurations.Configuration> getConfiguration() {
            if (configuration == null) {
                configuration = new ArrayList<Configurations.Configuration>();
            }
            return this.configuration;
        }


        /**
         * Represents a group of resources and
         * global variables
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
         *         &lt;element name="resource" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="task" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="pouInstance" type="{http://www.plcopen.org/xml/tc6_0201}pouInstance" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *                             &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="single" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="interval" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="priority" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                 &lt;minInclusive value="0"/>
         *                                 &lt;maxInclusive value="65535"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="globalVars" type="{http://www.plcopen.org/xml/tc6_0201}varList" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="pouInstance" type="{http://www.plcopen.org/xml/tc6_0201}pouInstance" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="globalVars" type="{http://www.plcopen.org/xml/tc6_0201}varList" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="accessVars" type="{http://www.plcopen.org/xml/tc6_0201}varListAccess" minOccurs="0"/>
         *         &lt;element name="configVars" type="{http://www.plcopen.org/xml/tc6_0201}varListConfig" minOccurs="0"/>
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
                "resource",
                "globalVars",
                "accessVars",
                "configVars",
                "addData",
                "documentation"
        })
        public static class Configuration implements AddDataContainer, PlcNode {

            protected List<Configurations.Configuration.Resource> resource;
            protected List<VarList> globalVars;
            protected VarListAccess accessVars;
            protected VarListConfig configVars;
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
             * Gets the value of the resource property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the resource property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getResource().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Configurations.Configuration.Resource }
             */
            public List<Configurations.Configuration.Resource> getResource() {
                if (resource == null) {
                    resource = new ArrayList<Configurations.Configuration.Resource>();
                }
                return this.resource;
            }

            /**
             * Gets the value of the globalVars property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the globalVars property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGlobalVars().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link VarList }
             */
            public List<VarList> getGlobalVars() {
                if (globalVars == null) {
                    globalVars = new ArrayList<VarList>();
                }
                return this.globalVars;
            }

            /**
             * Ruft den Wert der accessVars-Eigenschaft ab.
             *
             * @return possible object is
             * {@link VarListAccess }
             */
            public VarListAccess getAccessVars() {
                return accessVars;
            }

            /**
             * Legt den Wert der accessVars-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link VarListAccess }
             */
            public void setAccessVars(VarListAccess value) {
                this.accessVars = value;
            }

            /**
             * Ruft den Wert der configVars-Eigenschaft ab.
             *
             * @return possible object is
             * {@link VarListConfig }
             */
            public VarListConfig getConfigVars() {
                return configVars;
            }

            /**
             * Legt den Wert der configVars-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link VarListConfig }
             */
            public void setConfigVars(VarListConfig value) {
                this.configVars = value;
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


            /**
             * Represents a group of programs and
             * tasks and global variables
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
             *         &lt;element name="task" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="pouInstance" type="{http://www.plcopen.org/xml/tc6_0201}pouInstance" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
             *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="single" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="interval" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="priority" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                       &lt;minInclusive value="0"/>
             *                       &lt;maxInclusive value="65535"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="globalVars" type="{http://www.plcopen.org/xml/tc6_0201}varList" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="pouInstance" type="{http://www.plcopen.org/xml/tc6_0201}pouInstance" maxOccurs="unbounded" minOccurs="0"/>
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
                    "task",
                    "globalVars",
                    "pouInstance",
                    "addData",
                    "documentation"
            })
            @XmlRootElement(name = "resource")
            public static class Resource implements AddDataContainer, PlcNode {

                protected List<Configurations.Configuration.Resource.Task> task;
                protected List<VarList> globalVars;
                protected List<PouInstance> pouInstance;
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
                 * Gets the value of the task property.
                 * <p>
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the task property.
                 * <p>
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTask().add(newItem);
                 * </pre>
                 * <p>
                 * <p>
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Configurations.Configuration.Resource.Task }
                 */
                public List<Configurations.Configuration.Resource.Task> getTask() {
                    if (task == null) {
                        task = new ArrayList<Configurations.Configuration.Resource.Task>();
                    }
                    return this.task;
                }

                /**
                 * Gets the value of the globalVars property.
                 * <p>
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the globalVars property.
                 * <p>
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getGlobalVars().add(newItem);
                 * </pre>
                 * <p>
                 * <p>
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VarList }
                 */
                public List<VarList> getGlobalVars() {
                    if (globalVars == null) {
                        globalVars = new ArrayList<VarList>();
                    }
                    return this.globalVars;
                }

                /**
                 * Gets the value of the pouInstance property.
                 * <p>
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pouInstance property.
                 * <p>
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPouInstance().add(newItem);
                 * </pre>
                 * <p>
                 * <p>
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PouInstance }
                 */
                public List<PouInstance> getPouInstance() {
                    if (pouInstance == null) {
                        pouInstance = new ArrayList<PouInstance>();
                    }
                    return this.pouInstance;
                }

                /**
                 * Ruft den Wert der addData-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link AddData }
                 */
                public AddData getAddData() {
                    System.out.println("resource addata called");
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


                /**
                 * Represents a periodic or triggered
                 * task
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
                 *         &lt;element name="pouInstance" type="{http://www.plcopen.org/xml/tc6_0201}pouInstance" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
                 *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="single" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="interval" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="priority" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *             &lt;minInclusive value="0"/>
                 *             &lt;maxInclusive value="65535"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "pouInstance",
                        "addData",
                        "documentation"
                })
                public static class Task implements AddDataContainer, PlcNode {

                    protected List<PouInstance> pouInstance;
                    protected AddData addData;
                    protected FormattedText documentation;
                    @XmlAttribute(name = "name", required = true)
                    protected String name;
                    @XmlAttribute(name = "single")
                    protected String single;
                    @XmlAttribute(name = "interval")
                    protected String interval;
                    @XmlAttribute(name = "priority", required = true)
                    protected int priority;
                    @XmlAttribute(name = "globalId")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlID
                    @XmlSchemaType(name = "ID")
                    protected String globalId;

                    /**
                     * Gets the value of the pouInstance property.
                     * <p>
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the pouInstance property.
                     * <p>
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPouInstance().add(newItem);
                     * </pre>
                     * <p>
                     * <p>
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PouInstance }
                     */
                    public List<PouInstance> getPouInstance() {
                        if (pouInstance == null) {
                            pouInstance = new ArrayList<PouInstance>();
                        }
                        return this.pouInstance;
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
                     * Ruft den Wert der single-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getSingle() {
                        return single;
                    }

                    /**
                     * Legt den Wert der single-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setSingle(String value) {
                        this.single = value;
                    }

                    /**
                     * Ruft den Wert der interval-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getInterval() {
                        return interval;
                    }

                    /**
                     * Legt den Wert der interval-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setInterval(String value) {
                        this.interval = value;
                    }

                    /**
                     * Ruft den Wert der priority-Eigenschaft ab.
                     */
                    public int getPriority() {
                        return priority;
                    }

                    /**
                     * Legt den Wert der priority-Eigenschaft fest.
                     */
                    public void setPriority(int value) {
                        this.priority = value;
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

        @Override
        public String toString() {
            return "Configurations{" +
                    "configuration=" + configuration +
                    '}';
        }
    }

}
