package org.plcopen.xml.tc60201.pou;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class TcElement {

	@XmlCDATA
	private String Declaration;

	private String ST;

}
