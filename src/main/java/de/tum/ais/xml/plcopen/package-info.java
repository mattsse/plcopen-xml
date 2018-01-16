@XmlSchema(namespace = "http://www.plcopen.org/xml/tc6_0200", elementFormDefault = XmlNsForm.QUALIFIED)
@XmlJavaTypeAdapters({
		@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter(value = MyStringAdapter.class, type = String.class) })

package de.tum.ais.xml.plcopen;

import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;