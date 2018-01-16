package org.plcopen.xml.tc60201;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_interface", "body", "addData" })
@XmlRootElement(name = "Method")
public class Method implements AddDataable {
	@XmlElement(name = "interface")
	protected Project.Types.Pous.Pou.Interface _interface;
	protected List<Body> body;
	protected AddData addData;
	@XmlAttribute(name = "name", required = true)
	protected String name;
	@XmlAttribute(name = "ObjectId", required = true)
	protected String objectId;

	public AddData getAddData() {
		return addData;
	}

	public void setAddData(AddData addData) {
		this.addData = addData;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public Project.Types.Pous.Pou.Interface getInterface() {
		return _interface;
	}

	public void setInterface(Project.Types.Pous.Pou.Interface value) {
		this._interface = value;
	}

	public List<Body> getBody() {
		if (body == null) {
			body = new ArrayList<Body>();
		}
		return this.body;
	}
}
