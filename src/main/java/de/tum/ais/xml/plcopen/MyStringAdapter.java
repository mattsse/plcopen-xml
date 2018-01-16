package de.tum.ais.xml.plcopen;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MyStringAdapter extends XmlAdapter<String, String> {

	@Override
	public String unmarshal(String v) throws Exception {
		return "";
	}

	@Override
	public String marshal(String v) throws Exception {
		return v;
	}

}
