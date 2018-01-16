package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class PrimitiveDatatypeAdapter extends XmlAdapter<String, Object> {

	@Override
	public String marshal(Object arg0) throws Exception {
		if (arg0 == null) {
			return null;
		}
		return "";
	}

	@Override
	public Object unmarshal(String arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
