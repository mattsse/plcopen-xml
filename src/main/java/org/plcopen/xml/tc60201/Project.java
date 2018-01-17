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
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
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
 *         &lt;element name="fileHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="companyName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="companyURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="productName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="productVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="productRelease" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="creationDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="contentDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contentHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="coordinateInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="pageSize" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fbd">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="scaling">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ld">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="scaling">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="sfc">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="scaling">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="addDataInfo" type="{http://www.plcopen.org/xml/tc6_0201}addDataInfo" minOccurs="0"/>
 *                   &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="modificationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="organization" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="types">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dataTypes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dataType" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="baseType" type="{http://www.plcopen.org/xml/tc6_0201}dataType"/>
 *                                       &lt;element name="initialValue" type="{http://www.plcopen.org/xml/tc6_0201}value" minOccurs="0"/>
 *                                       &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                                       &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="pous">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="pou" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="interface" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="returnType" type="{http://www.plcopen.org/xml/tc6_0201}dataType" minOccurs="0"/>
 *                                                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;element name="localVars">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                                                         &lt;/extension>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="tempVars">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                                                         &lt;/extension>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="inputVars">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                                                         &lt;/extension>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="outputVars">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                                                         &lt;/extension>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="inOutVars">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                                                         &lt;/extension>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="externalVars">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                                                         &lt;/extension>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="globalVars">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
 *                                                         &lt;/extension>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="accessVars" type="{http://www.plcopen.org/xml/tc6_0201}varList"/>
 *                                                 &lt;/choice>
 *                                                 &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                                                 &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="actions" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="action" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body"/>
 *                                                           &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                                                           &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="transitions" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="transition" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body"/>
 *                                                           &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                                                           &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                                       &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="pouType" use="required" type="{http://www.plcopen.org/xml/tc6_0201}pouType" />
 *                                     &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="instances">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="configurations">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="configuration" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="resource" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="task" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="pouInstance" type="{http://www.plcopen.org/xml/tc6_0201}pouInstance" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                                                           &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="single" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="interval" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="priority" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                               &lt;minInclusive value="0"/>
 *                                                               &lt;maxInclusive value="65535"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="globalVars" type="{http://www.plcopen.org/xml/tc6_0201}varList" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="pouInstance" type="{http://www.plcopen.org/xml/tc6_0201}pouInstance" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                                                 &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="globalVars" type="{http://www.plcopen.org/xml/tc6_0201}varList" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="accessVars" type="{http://www.plcopen.org/xml/tc6_0201}varListAccess" minOccurs="0"/>
 *                                       &lt;element name="configVars" type="{http://www.plcopen.org/xml/tc6_0201}varListConfig" minOccurs="0"/>
 *                                       &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *                                       &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "fileHeader",
        "contentHeader",
        "types",
        "instances",
        "addData",
        "documentation"
})
@XmlRootElement(name = "project")
public class Project {

    @XmlElement(required = true)
    protected Project.FileHeader fileHeader;
    @XmlElement(required = true)
    protected Project.ContentHeader contentHeader;
    @XmlElement(required = true)
    protected Project.Types types;
    @XmlElement(required = true)
    protected Project.Instances instances;
    protected AddData addData;
    protected FormattedText documentation;

    /**
     * Ruft den Wert der fileHeader-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Project.FileHeader }
     */
    public Project.FileHeader getFileHeader() {
        return fileHeader;
    }

    /**
     * Legt den Wert der fileHeader-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Project.FileHeader }
     */
    public void setFileHeader(Project.FileHeader value) {
        this.fileHeader = value;
    }

    /**
     * Ruft den Wert der contentHeader-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Project.ContentHeader }
     */
    public Project.ContentHeader getContentHeader() {
        return contentHeader;
    }

    /**
     * Legt den Wert der contentHeader-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Project.ContentHeader }
     */
    public void setContentHeader(Project.ContentHeader value) {
        this.contentHeader = value;
    }

    /**
     * Ruft den Wert der types-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Project.Types }
     */
    public Project.Types getTypes() {
        return types;
    }

    /**
     * Legt den Wert der types-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Project.Types }
     */
    public void setTypes(Project.Types value) {
        this.types = value;
    }

    /**
     * Ruft den Wert der instances-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Project.Instances }
     */
    public Project.Instances getInstances() {
        return instances;
    }

    /**
     * Legt den Wert der instances-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Project.Instances }
     */
    public void setInstances(Project.Instances value) {
        this.instances = value;
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

    @Override
    public String toString() {
        return "Project{" +
                "fileHeader=" + fileHeader +
                ", contentHeader=" + contentHeader +
                ", types=" + types +
                ", instances=" + instances +
                ", addData=" + addData +
                ", documentation=" + documentation +
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
     *       &lt;sequence>
     *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="coordinateInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="pageSize" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fbd">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="scaling">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ld">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="scaling">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="sfc">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="scaling">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="addDataInfo" type="{http://www.plcopen.org/xml/tc6_0201}addDataInfo" minOccurs="0"/>
     *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="modificationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="organization" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}language" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "comment",
            "coordinateInfo",
            "addDataInfo",
            "addData"
    })
    public static class ContentHeader {

        @XmlElement(name = "Comment")
        protected String comment;
        @XmlElement(required = true)
        protected Project.ContentHeader.CoordinateInfo coordinateInfo;
        protected AddDataInfo addDataInfo;
        protected AddData addData;
        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "version")
        protected String version;
        @XmlAttribute(name = "modificationDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar modificationDateTime;
        @XmlAttribute(name = "organization")
        protected String organization;
        @XmlAttribute(name = "author")
        protected String author;
        @XmlAttribute(name = "language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;

        /**
         * Ruft den Wert der comment-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getComment() {
            return comment;
        }

        /**
         * Legt den Wert der comment-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * Ruft den Wert der coordinateInfo-Eigenschaft ab.
         *
         * @return possible object is
         * {@link Project.ContentHeader.CoordinateInfo }
         */
        public Project.ContentHeader.CoordinateInfo getCoordinateInfo() {
            return coordinateInfo;
        }

        /**
         * Legt den Wert der coordinateInfo-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link Project.ContentHeader.CoordinateInfo }
         */
        public void setCoordinateInfo(Project.ContentHeader.CoordinateInfo value) {
            this.coordinateInfo = value;
        }

        /**
         * Ruft den Wert der addDataInfo-Eigenschaft ab.
         *
         * @return possible object is
         * {@link AddDataInfo }
         */
        public AddDataInfo getAddDataInfo() {
            return addDataInfo;
        }

        /**
         * Legt den Wert der addDataInfo-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link AddDataInfo }
         */
        public void setAddDataInfo(AddDataInfo value) {
            this.addDataInfo = value;
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
         * {@link String }
         */
        public String getVersion() {
            return version;
        }

        /**
         * Legt den Wert der version-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Ruft den Wert der modificationDateTime-Eigenschaft ab.
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getModificationDateTime() {
            return modificationDateTime;
        }

        /**
         * Legt den Wert der modificationDateTime-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setModificationDateTime(XMLGregorianCalendar value) {
            this.modificationDateTime = value;
        }

        /**
         * Ruft den Wert der organization-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getOrganization() {
            return organization;
        }

        /**
         * Legt den Wert der organization-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOrganization(String value) {
            this.organization = value;
        }

        /**
         * Ruft den Wert der author-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getAuthor() {
            return author;
        }

        /**
         * Legt den Wert der author-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAuthor(String value) {
            this.author = value;
        }

        /**
         * Ruft den Wert der language-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Legt den Wert der language-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLanguage(String value) {
            this.language = value;
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
         *         &lt;element name="pageSize" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fbd">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="scaling">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ld">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="scaling">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="sfc">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="scaling">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
                "pageSize",
                "fbd",
                "ld",
                "sfc"
        })
        public static class CoordinateInfo {

            protected Project.ContentHeader.CoordinateInfo.PageSize pageSize;
            @XmlElement(required = true)
            protected Project.ContentHeader.CoordinateInfo.Fbd fbd;
            @XmlElement(required = true)
            protected Project.ContentHeader.CoordinateInfo.Ld ld;
            @XmlElement(required = true)
            protected Project.ContentHeader.CoordinateInfo.Sfc sfc;

            /**
             * Ruft den Wert der pageSize-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Project.ContentHeader.CoordinateInfo.PageSize }
             */
            public Project.ContentHeader.CoordinateInfo.PageSize getPageSize() {
                return pageSize;
            }

            /**
             * Legt den Wert der pageSize-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Project.ContentHeader.CoordinateInfo.PageSize }
             */
            public void setPageSize(Project.ContentHeader.CoordinateInfo.PageSize value) {
                this.pageSize = value;
            }

            /**
             * Ruft den Wert der fbd-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Project.ContentHeader.CoordinateInfo.Fbd }
             */
            public Project.ContentHeader.CoordinateInfo.Fbd getFbd() {
                return fbd;
            }

            /**
             * Legt den Wert der fbd-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Project.ContentHeader.CoordinateInfo.Fbd }
             */
            public void setFbd(Project.ContentHeader.CoordinateInfo.Fbd value) {
                this.fbd = value;
            }

            /**
             * Ruft den Wert der ld-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Project.ContentHeader.CoordinateInfo.Ld }
             */
            public Project.ContentHeader.CoordinateInfo.Ld getLd() {
                return ld;
            }

            /**
             * Legt den Wert der ld-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Project.ContentHeader.CoordinateInfo.Ld }
             */
            public void setLd(Project.ContentHeader.CoordinateInfo.Ld value) {
                this.ld = value;
            }

            /**
             * Ruft den Wert der sfc-Eigenschaft ab.
             *
             * @return possible object is
             * {@link Project.ContentHeader.CoordinateInfo.Sfc }
             */
            public Project.ContentHeader.CoordinateInfo.Sfc getSfc() {
                return sfc;
            }

            /**
             * Legt den Wert der sfc-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link Project.ContentHeader.CoordinateInfo.Sfc }
             */
            public void setSfc(Project.ContentHeader.CoordinateInfo.Sfc value) {
                this.sfc = value;
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
             *         &lt;element name="scaling">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
                    "scaling"
            })
            public static class Fbd {

                @XmlElement(required = true)
                protected Project.ContentHeader.CoordinateInfo.Fbd.Scaling scaling;

                /**
                 * Ruft den Wert der scaling-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link Project.ContentHeader.CoordinateInfo.Fbd.Scaling }
                 */
                public Project.ContentHeader.CoordinateInfo.Fbd.Scaling getScaling() {
                    return scaling;
                }

                /**
                 * Legt den Wert der scaling-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link Project.ContentHeader.CoordinateInfo.Fbd.Scaling }
                 */
                public void setScaling(Project.ContentHeader.CoordinateInfo.Fbd.Scaling value) {
                    this.scaling = value;
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
                 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Scaling {

                    @XmlAttribute(name = "x", required = true)
                    protected BigDecimal x;
                    @XmlAttribute(name = "y", required = true)
                    protected BigDecimal y;

                    /**
                     * Ruft den Wert der x-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getX() {
                        return x;
                    }

                    /**
                     * Legt den Wert der x-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setX(BigDecimal value) {
                        this.x = value;
                    }

                    /**
                     * Ruft den Wert der y-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getY() {
                        return y;
                    }

                    /**
                     * Legt den Wert der y-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setY(BigDecimal value) {
                        this.y = value;
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
             *         &lt;element name="scaling">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
                    "scaling"
            })
            public static class Ld {

                @XmlElement(required = true)
                protected Project.ContentHeader.CoordinateInfo.Ld.Scaling scaling;

                /**
                 * Ruft den Wert der scaling-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link Project.ContentHeader.CoordinateInfo.Ld.Scaling }
                 */
                public Project.ContentHeader.CoordinateInfo.Ld.Scaling getScaling() {
                    return scaling;
                }

                /**
                 * Legt den Wert der scaling-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link Project.ContentHeader.CoordinateInfo.Ld.Scaling }
                 */
                public void setScaling(Project.ContentHeader.CoordinateInfo.Ld.Scaling value) {
                    this.scaling = value;
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
                 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Scaling {

                    @XmlAttribute(name = "x", required = true)
                    protected BigDecimal x;
                    @XmlAttribute(name = "y", required = true)
                    protected BigDecimal y;

                    /**
                     * Ruft den Wert der x-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getX() {
                        return x;
                    }

                    /**
                     * Legt den Wert der x-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setX(BigDecimal value) {
                        this.x = value;
                    }

                    /**
                     * Ruft den Wert der y-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getY() {
                        return y;
                    }

                    /**
                     * Legt den Wert der y-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setY(BigDecimal value) {
                        this.y = value;
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
             *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PageSize {

                @XmlAttribute(name = "x", required = true)
                protected BigDecimal x;
                @XmlAttribute(name = "y", required = true)
                protected BigDecimal y;

                /**
                 * Ruft den Wert der x-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getX() {
                    return x;
                }

                /**
                 * Legt den Wert der x-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setX(BigDecimal value) {
                    this.x = value;
                }

                /**
                 * Ruft den Wert der y-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getY() {
                    return y;
                }

                /**
                 * Legt den Wert der y-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setY(BigDecimal value) {
                    this.y = value;
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
             *         &lt;element name="scaling">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
                    "scaling"
            })
            public static class Sfc {

                @XmlElement(required = true)
                protected Project.ContentHeader.CoordinateInfo.Sfc.Scaling scaling;

                /**
                 * Ruft den Wert der scaling-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link Project.ContentHeader.CoordinateInfo.Sfc.Scaling }
                 */
                public Project.ContentHeader.CoordinateInfo.Sfc.Scaling getScaling() {
                    return scaling;
                }

                /**
                 * Legt den Wert der scaling-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link Project.ContentHeader.CoordinateInfo.Sfc.Scaling }
                 */
                public void setScaling(Project.ContentHeader.CoordinateInfo.Sfc.Scaling value) {
                    this.scaling = value;
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
                 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Scaling {

                    @XmlAttribute(name = "x", required = true)
                    protected BigDecimal x;
                    @XmlAttribute(name = "y", required = true)
                    protected BigDecimal y;

                    /**
                     * Ruft den Wert der x-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getX() {
                        return x;
                    }

                    /**
                     * Legt den Wert der x-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setX(BigDecimal value) {
                        this.x = value;
                    }

                    /**
                     * Ruft den Wert der y-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getY() {
                        return y;
                    }

                    /**
                     * Legt den Wert der y-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setY(BigDecimal value) {
                        this.y = value;
                    }

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
     *       &lt;attribute name="companyName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="companyURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="productName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="productVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="productRelease" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="creationDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="contentDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FileHeader {

        @XmlAttribute(name = "companyName", required = true)
        protected String companyName;
        @XmlAttribute(name = "companyURL")
        @XmlSchemaType(name = "anyURI")
        protected String companyURL;
        @XmlAttribute(name = "productName", required = true)
        protected String productName;
        @XmlAttribute(name = "productVersion", required = true)
        protected String productVersion;
        @XmlAttribute(name = "productRelease")
        protected String productRelease;
        @XmlAttribute(name = "creationDateTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar creationDateTime;
        @XmlAttribute(name = "contentDescription")
        protected String contentDescription;

        /**
         * Ruft den Wert der companyName-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCompanyName() {
            return companyName;
        }

        /**
         * Legt den Wert der companyName-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCompanyName(String value) {
            this.companyName = value;
        }

        /**
         * Ruft den Wert der companyURL-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCompanyURL() {
            return companyURL;
        }

        /**
         * Legt den Wert der companyURL-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCompanyURL(String value) {
            this.companyURL = value;
        }

        /**
         * Ruft den Wert der productName-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getProductName() {
            return productName;
        }

        /**
         * Legt den Wert der productName-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProductName(String value) {
            this.productName = value;
        }

        /**
         * Ruft den Wert der productVersion-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getProductVersion() {
            return productVersion;
        }

        /**
         * Legt den Wert der productVersion-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProductVersion(String value) {
            this.productVersion = value;
        }

        /**
         * Ruft den Wert der productRelease-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getProductRelease() {
            return productRelease;
        }

        /**
         * Legt den Wert der productRelease-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProductRelease(String value) {
            this.productRelease = value;
        }

        /**
         * Ruft den Wert der creationDateTime-Eigenschaft ab.
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getCreationDateTime() {
            return creationDateTime;
        }

        /**
         * Legt den Wert der creationDateTime-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setCreationDateTime(XMLGregorianCalendar value) {
            this.creationDateTime = value;
        }

        /**
         * Ruft den Wert der contentDescription-Eigenschaft ab.
         *
         * @return possible object is
         * {@link String }
         */
        public String getContentDescription() {
            return contentDescription;
        }

        /**
         * Legt den Wert der contentDescription-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setContentDescription(String value) {
            this.contentDescription = value;
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
    public static class Instances {

        @XmlElement(required = true)
        protected Project.Instances.Configurations configurations;

        /**
         * Ruft den Wert der configurations-Eigenschaft ab.
         *
         * @return possible object is
         * {@link Project.Instances.Configurations }
         */
        public Project.Instances.Configurations getConfigurations() {
            return configurations;
        }

        /**
         * Legt den Wert der configurations-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link Project.Instances.Configurations }
         */
        public void setConfigurations(Project.Instances.Configurations value) {
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
        public static class Configurations {

            protected List<Project.Instances.Configurations.Configuration> configuration;

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
             * {@link Project.Instances.Configurations.Configuration }
             */
            public List<Project.Instances.Configurations.Configuration> getConfiguration() {
                if (configuration == null) {
                    configuration = new ArrayList<Project.Instances.Configurations.Configuration>();
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
            public static class Configuration {

                protected List<Project.Instances.Configurations.Configuration.Resource> resource;
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
                 * {@link Project.Instances.Configurations.Configuration.Resource }
                 */
                public List<Project.Instances.Configurations.Configuration.Resource> getResource() {
                    if (resource == null) {
                        resource = new ArrayList<Project.Instances.Configurations.Configuration.Resource>();
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
                public static class Resource {

                    protected List<Project.Instances.Configurations.Configuration.Resource.Task> task;
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
                     * {@link Project.Instances.Configurations.Configuration.Resource.Task }
                     */
                    public List<Project.Instances.Configurations.Configuration.Resource.Task> getTask() {
                        if (task == null) {
                            task = new ArrayList<Project.Instances.Configurations.Configuration.Resource.Task>();
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
                    public static class Task {

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
     *         &lt;element name="dataTypes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dataType" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="baseType" type="{http://www.plcopen.org/xml/tc6_0201}dataType"/>
     *                             &lt;element name="initialValue" type="{http://www.plcopen.org/xml/tc6_0201}value" minOccurs="0"/>
     *                             &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
     *                             &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="pous">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="pou" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="interface" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="returnType" type="{http://www.plcopen.org/xml/tc6_0201}dataType" minOccurs="0"/>
     *                                       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;element name="localVars">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                                               &lt;/extension>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="tempVars">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                                               &lt;/extension>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="inputVars">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                                               &lt;/extension>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="outputVars">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                                               &lt;/extension>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="inOutVars">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                                               &lt;/extension>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="externalVars">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                                               &lt;/extension>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="globalVars">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
     *                                               &lt;/extension>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="accessVars" type="{http://www.plcopen.org/xml/tc6_0201}varList"/>
     *                                       &lt;/choice>
     *                                       &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
     *                                       &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="actions" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="action" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body"/>
     *                                                 &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
     *                                                 &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="transitions" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="transition" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body"/>
     *                                                 &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
     *                                                 &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
     *                             &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="pouType" use="required" type="{http://www.plcopen.org/xml/tc6_0201}pouType" />
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
            "dataTypes",
            "pous"
    })
    public static class Types {

        @XmlElement(required = true)
        protected Project.Types.DataTypes dataTypes;
        @XmlElement(required = true)
        protected Project.Types.Pous pous;

        /**
         * Ruft den Wert der dataTypes-Eigenschaft ab.
         *
         * @return possible object is
         * {@link Project.Types.DataTypes }
         */
        public Project.Types.DataTypes getDataTypes() {
            return dataTypes;
        }

        /**
         * Legt den Wert der dataTypes-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link Project.Types.DataTypes }
         */
        public void setDataTypes(Project.Types.DataTypes value) {
            this.dataTypes = value;
        }

        /**
         * Ruft den Wert der pous-Eigenschaft ab.
         *
         * @return possible object is
         * {@link Project.Types.Pous }
         */
        public Project.Types.Pous getPous() {
            return pous;
        }

        /**
         * Legt den Wert der pous-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link Project.Types.Pous }
         */
        public void setPous(Project.Types.Pous value) {
            this.pous = value;
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
         *         &lt;element name="dataType" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="baseType" type="{http://www.plcopen.org/xml/tc6_0201}dataType"/>
         *                   &lt;element name="initialValue" type="{http://www.plcopen.org/xml/tc6_0201}value" minOccurs="0"/>
         *                   &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "dataType"
        })
        public static class DataTypes {

            protected List<Project.Types.DataTypes.DataType> dataType;

            /**
             * Gets the value of the dataType property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dataType property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDataType().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Project.Types.DataTypes.DataType }
             */
            public List<Project.Types.DataTypes.DataType> getDataType() {
                if (dataType == null) {
                    dataType = new ArrayList<Project.Types.DataTypes.DataType>();
                }
                return this.dataType;
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
             *         &lt;element name="initialValue" type="{http://www.plcopen.org/xml/tc6_0201}value" minOccurs="0"/>
             *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
             *         &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "baseType",
                    "initialValue",
                    "addData",
                    "documentation"
            })
            public static class DataType {

                @XmlElement(required = true)
                protected org.plcopen.xml.tc60201.DataType baseType;
                protected RootValue initialValue;
                protected AddData addData;
                protected FormattedText documentation;
                @XmlAttribute(name = "name", required = true)
                protected String name;

                /**
                 * Ruft den Wert der baseType-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link org.plcopen.xml.tc60201.DataType }
                 */
                public org.plcopen.xml.tc60201.DataType getBaseType() {
                    return baseType;
                }

                /**
                 * Legt den Wert der baseType-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link org.plcopen.xml.tc60201.DataType }
                 */
                public void setBaseType(org.plcopen.xml.tc60201.DataType value) {
                    this.baseType = value;
                }

                /**
                 * Ruft den Wert der initialValue-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link RootValue }
                 */
                public RootValue getInitialValue() {
                    return initialValue;
                }

                /**
                 * Legt den Wert der initialValue-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link RootValue }
                 */
                public void setInitialValue(RootValue value) {
                    this.initialValue = value;
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
         *         &lt;element name="pou" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="interface" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="returnType" type="{http://www.plcopen.org/xml/tc6_0201}dataType" minOccurs="0"/>
         *                             &lt;choice maxOccurs="unbounded" minOccurs="0">
         *                               &lt;element name="localVars">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *                                     &lt;/extension>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="tempVars">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *                                     &lt;/extension>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="inputVars">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *                                     &lt;/extension>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="outputVars">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *                                     &lt;/extension>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="inOutVars">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *                                     &lt;/extension>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="externalVars">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *                                     &lt;/extension>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="globalVars">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;extension base="{http://www.plcopen.org/xml/tc6_0201}varList">
         *                                     &lt;/extension>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="accessVars" type="{http://www.plcopen.org/xml/tc6_0201}varList"/>
         *                             &lt;/choice>
         *                             &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *                             &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="actions" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="action" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body"/>
         *                                       &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *                                       &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="transitions" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="transition" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body"/>
         *                                       &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *                                       &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="body" type="{http://www.plcopen.org/xml/tc6_0201}body" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
         *                   &lt;element name="documentation" type="{http://www.plcopen.org/xml/tc6_0201}formattedText" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="pouType" use="required" type="{http://www.plcopen.org/xml/tc6_0201}pouType" />
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
                "pou"
        })
        public static class Pous {

            protected List<Project.Types.Pous.Pou> pou;

            /**
             * Gets the value of the pou property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pou property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPou().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Project.Types.Pous.Pou }
             */
            public List<Project.Types.Pous.Pou> getPou() {
                if (pou == null) {
                    pou = new ArrayList<Project.Types.Pous.Pou>();
                }
                return this.pou;
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
            public static class Pou {

                @XmlElement(name = "interface")
                protected Project.Types.Pous.Pou.Interface _interface;
                protected Project.Types.Pous.Pou.Actions actions;
                protected Project.Types.Pous.Pou.Transitions transitions;
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
                 * {@link Project.Types.Pous.Pou.Interface }
                 */
                public Project.Types.Pous.Pou.Interface getInterface() {
                    return _interface;
                }

                /**
                 * Legt den Wert der interface-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link Project.Types.Pous.Pou.Interface }
                 */
                public void setInterface(Project.Types.Pous.Pou.Interface value) {
                    this._interface = value;
                }

                /**
                 * Ruft den Wert der actions-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link Project.Types.Pous.Pou.Actions }
                 */
                public Project.Types.Pous.Pou.Actions getActions() {
                    return actions;
                }

                /**
                 * Legt den Wert der actions-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link Project.Types.Pous.Pou.Actions }
                 */
                public void setActions(Project.Types.Pous.Pou.Actions value) {
                    this.actions = value;
                }

                /**
                 * Ruft den Wert der transitions-Eigenschaft ab.
                 *
                 * @return possible object is
                 * {@link Project.Types.Pous.Pou.Transitions }
                 */
                public Project.Types.Pous.Pou.Transitions getTransitions() {
                    return transitions;
                }

                /**
                 * Legt den Wert der transitions-Eigenschaft fest.
                 *
                 * @param value allowed object is
                 *              {@link Project.Types.Pous.Pou.Transitions }
                 */
                public void setTransitions(Project.Types.Pous.Pou.Transitions value) {
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
                public static class Actions {

                    protected List<Project.Types.Pous.Pou.Actions.Action> action;

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
                     * {@link Project.Types.Pous.Pou.Actions.Action }
                     */
                    public List<Project.Types.Pous.Pou.Actions.Action> getAction() {
                        if (action == null) {
                            action = new ArrayList<Project.Types.Pous.Pou.Actions.Action>();
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
                    public static class Action {

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
                public static class Interface {

                    protected org.plcopen.xml.tc60201.DataType returnType;
                    @XmlElements({
                            @XmlElement(name = "localVars", type = Project.Types.Pous.Pou.Interface.LocalVars.class),
                            @XmlElement(name = "tempVars", type = Project.Types.Pous.Pou.Interface.TempVars.class),
                            @XmlElement(name = "inputVars", type = Project.Types.Pous.Pou.Interface.InputVars.class),
                            @XmlElement(name = "outputVars", type = Project.Types.Pous.Pou.Interface.OutputVars.class),
                            @XmlElement(name = "inOutVars", type = Project.Types.Pous.Pou.Interface.InOutVars.class),
                            @XmlElement(name = "externalVars", type = Project.Types.Pous.Pou.Interface.ExternalVars.class),
                            @XmlElement(name = "globalVars", type = Project.Types.Pous.Pou.Interface.GlobalVars.class),
                            @XmlElement(name = "accessVars")
                    })
                    protected List<VarList> localVarsOrTempVarsOrInputVars;
                    protected AddData addData;
                    protected FormattedText documentation;

                    /**
                     * Ruft den Wert der returnType-Eigenschaft ab.
                     *
                     * @return possible object is
                     * {@link org.plcopen.xml.tc60201.DataType }
                     */
                    public org.plcopen.xml.tc60201.DataType getReturnType() {
                        return returnType;
                    }

                    /**
                     * Legt den Wert der returnType-Eigenschaft fest.
                     *
                     * @param value allowed object is
                     *              {@link org.plcopen.xml.tc60201.DataType }
                     */
                    public void setReturnType(org.plcopen.xml.tc60201.DataType value) {
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
                     * {@link Project.Types.Pous.Pou.Interface.LocalVars }
                     * {@link Project.Types.Pous.Pou.Interface.TempVars }
                     * {@link Project.Types.Pous.Pou.Interface.InputVars }
                     * {@link Project.Types.Pous.Pou.Interface.OutputVars }
                     * {@link Project.Types.Pous.Pou.Interface.InOutVars }
                     * {@link Project.Types.Pous.Pou.Interface.ExternalVars }
                     * {@link Project.Types.Pous.Pou.Interface.GlobalVars }
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
                public static class Transitions {

                    protected List<Project.Types.Pous.Pou.Transitions.Transition> transition;

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
                     * {@link Project.Types.Pous.Pou.Transitions.Transition }
                     */
                    public List<Project.Types.Pous.Pou.Transitions.Transition> getTransition() {
                        if (transition == null) {
                            transition = new ArrayList<Project.Types.Pous.Pou.Transitions.Transition>();
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
                    public static class Transition {

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

        }

    }
}
