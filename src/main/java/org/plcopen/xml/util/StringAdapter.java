package org.plcopen.xml.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class StringAdapter extends XmlAdapter<String, String> {

	@Override
	public String unmarshal(String v) throws Exception {
		return "";
	}

	@Override
	public String marshal(String v) throws Exception {
		return v;
	}

}
