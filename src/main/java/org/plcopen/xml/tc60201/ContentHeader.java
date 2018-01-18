package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

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
public class ContentHeader implements AddDataContainer, PlcNode {

    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(required = true)
    protected CoordinateInfo coordinateInfo;
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
     * {@link CoordinateInfo }
     */
    public CoordinateInfo getCoordinateInfo() {
        return coordinateInfo;
    }

    /**
     * Legt den Wert der coordinateInfo-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link CoordinateInfo }
     */
    public void setCoordinateInfo(CoordinateInfo value) {
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
    public static class CoordinateInfo implements PlcNode {

        protected CoordinateInfo.PageSize pageSize;
        @XmlElement(required = true)
        protected CoordinateInfo.Fbd fbd;
        @XmlElement(required = true)
        protected CoordinateInfo.Ld ld;
        @XmlElement(required = true)
        protected CoordinateInfo.Sfc sfc;

        /**
         * Ruft den Wert der pageSize-Eigenschaft ab.
         *
         * @return possible object is
         * {@link CoordinateInfo.PageSize }
         */
        public CoordinateInfo.PageSize getPageSize() {
            return pageSize;
        }

        /**
         * Legt den Wert der pageSize-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link CoordinateInfo.PageSize }
         */
        public void setPageSize(CoordinateInfo.PageSize value) {
            this.pageSize = value;
        }

        /**
         * Ruft den Wert der fbd-Eigenschaft ab.
         *
         * @return possible object is
         * {@link CoordinateInfo.Fbd }
         */
        public CoordinateInfo.Fbd getFbd() {
            return fbd;
        }

        /**
         * Legt den Wert der fbd-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link CoordinateInfo.Fbd }
         */
        public void setFbd(CoordinateInfo.Fbd value) {
            this.fbd = value;
        }

        /**
         * Ruft den Wert der ld-Eigenschaft ab.
         *
         * @return possible object is
         * {@link CoordinateInfo.Ld }
         */
        public CoordinateInfo.Ld getLd() {
            return ld;
        }

        /**
         * Legt den Wert der ld-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link CoordinateInfo.Ld }
         */
        public void setLd(CoordinateInfo.Ld value) {
            this.ld = value;
        }

        /**
         * Ruft den Wert der sfc-Eigenschaft ab.
         *
         * @return possible object is
         * {@link CoordinateInfo.Sfc }
         */
        public CoordinateInfo.Sfc getSfc() {
            return sfc;
        }

        /**
         * Legt den Wert der sfc-Eigenschaft fest.
         *
         * @param value allowed object is
         *              {@link CoordinateInfo.Sfc }
         */
        public void setSfc(CoordinateInfo.Sfc value) {
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
        public static class Fbd implements PlcNode {

            @XmlElement(required = true)
            protected CoordinateInfo.Fbd.Scaling scaling;

            /**
             * Ruft den Wert der scaling-Eigenschaft ab.
             *
             * @return possible object is
             * {@link CoordinateInfo.Fbd.Scaling }
             */
            public CoordinateInfo.Fbd.Scaling getScaling() {
                return scaling;
            }

            /**
             * Legt den Wert der scaling-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link CoordinateInfo.Fbd.Scaling }
             */
            public void setScaling(CoordinateInfo.Fbd.Scaling value) {
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
            public static class Scaling implements PlcNode {

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
        public static class Ld implements PlcNode {

            @XmlElement(required = true)
            protected CoordinateInfo.Ld.Scaling scaling;

            /**
             * Ruft den Wert der scaling-Eigenschaft ab.
             *
             * @return possible object is
             * {@link CoordinateInfo.Ld.Scaling }
             */
            public CoordinateInfo.Ld.Scaling getScaling() {
                return scaling;
            }

            /**
             * Legt den Wert der scaling-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link CoordinateInfo.Ld.Scaling }
             */
            public void setScaling(CoordinateInfo.Ld.Scaling value) {
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
            public static class Scaling implements PlcNode {

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
        public static class PageSize implements PlcNode {

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
        public static class Sfc implements PlcNode {

            @XmlElement(required = true)
            protected CoordinateInfo.Sfc.Scaling scaling;

            /**
             * Ruft den Wert der scaling-Eigenschaft ab.
             *
             * @return possible object is
             * {@link CoordinateInfo.Sfc.Scaling }
             */
            public CoordinateInfo.Sfc.Scaling getScaling() {
                return scaling;
            }

            /**
             * Legt den Wert der scaling-Eigenschaft fest.
             *
             * @param value allowed object is
             *              {@link CoordinateInfo.Sfc.Scaling }
             */
            public void setScaling(CoordinateInfo.Sfc.Scaling value) {
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
            public static class Scaling implements PlcNode {

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
