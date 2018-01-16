package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import de.tum.ais.xml.plcopen.XMLLiterals;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xhtml", propOrder = { "xmlns" }, namespace = XMLLiterals.XMLNS)
public class Xhtml {
	@XmlAttribute(name = "xmlns")
	protected String xmlns = XMLLiterals.XMLNS;

}
