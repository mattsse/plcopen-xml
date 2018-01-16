package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class VariableNode {
	@XmlTransient
	protected Object source;

	@XmlAnyElement(lax = true)
	protected Object any;

	public Object getSource() {
		return source;
	}

	public void setSource(Object source) {
		this.source = source;
	}

	public Object getAny() {
		return any;
	}

	public void setAny(Object any) {
		this.any = any;
	}

}
