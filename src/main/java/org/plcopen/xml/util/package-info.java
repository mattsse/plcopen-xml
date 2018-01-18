@XmlSchema(namespace = "http://www.plcopen.org/xml/tc6_0200", elementFormDefault = XmlNsForm.QUALIFIED)
@XmlJavaTypeAdapters({
		@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter(value = StringAdapter.class, type = String.class) })

package org.plcopen.xml.util;

import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;