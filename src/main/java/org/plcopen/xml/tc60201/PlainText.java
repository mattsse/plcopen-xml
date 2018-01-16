package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InterfaceAsPlainText")
public class PlainText {
	@XmlPath("xhtml[@xmlns='http://www.w3.org/1999/xhtml']/text()")
	protected String text; /* dort wird der ST Klartext gespeichert */

	public String getText() {
		return text;
	}

	/**
	 * 
	 * @param plaintext
	 * den ST text
	 */
	public void setText(String text) {
		this.text = text;
	}

}
