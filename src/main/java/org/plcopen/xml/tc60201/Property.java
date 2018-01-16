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
@XmlType(name = "", propOrder = { "_interface", "_getAccessor", "_setAccessor", "plaintext", "addData" })
@XmlRootElement(name = "Property")
public class Property implements AddDataable {
	@XmlElement(name = "interface")
	protected Project.Types.Pous.Pou.Interface _interface;
	@XmlElement(name = "SetAccessor")
	protected Property.Accessor _setAccessor;
	@XmlElement(name = "GetAccessor")
	protected Property.Accessor _getAccessor;
	protected AddData addData;
	@XmlAttribute(name = "name", required = true)
	protected String name;
	@XmlAttribute(name = "ObjectId", required = true)
	protected String objectId;
	@XmlElement(name = "InterfaceAsPlainText")
	protected PlainText plaintext; /* dort wird der ST Klartext gespeichert */

	public PlainText getPlaintext() {
		return plaintext;
	}

	/**
	 * 
	 * @param plaintext
	 * den ST text
	 */
	public void setPlaintext(PlainText plaintext) {
		this.plaintext = plaintext;
	}

	public void setSetAccessor(Accessor setAccessor) {
		this._setAccessor = setAccessor;
	}

	public Accessor getSetAccessor() {
		return this._setAccessor;
	}

	public Accessor getGetAccessor() {
		return this._getAccessor;
	}

	public void setGetAccessor(Accessor getAccessor) {
		this._getAccessor = getAccessor;
	}

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

	/**
	 * Accessor fuer das Property Element
	 * 
	 * @author Matthias
	 *
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "_interface", "body", "plaintext", "addData" })
	@XmlRootElement(name = "Accessor")
	public static class Accessor implements AddDataable {
		@XmlElement(name = "interface")
		protected Project.Types.Pous.Pou.Interface _interface;
		protected List<Body> body;
		protected AddData addData;
		@XmlElement(name = "InterfaceAsPlainText")
		protected PlainText plaintext; /* dort wird der ST Klartext gespeichert */

		public PlainText getPlaintext() {
			return plaintext;
		}

		/**
		 * 
		 * @param plaintext
		 * den ST text
		 */
		public void setPlaintext(PlainText plaintext) {
			this.plaintext = plaintext;
		}

		public AddData getAddData() {
			return addData;
		}

		public void setAddData(AddData addData) {
			this.addData = addData;
		}

		public List<Body> getBody() {
			if (body == null) {
				body = new ArrayList<Body>();
			}
			return this.body;
		}

		public Project.Types.Pous.Pou.Interface getInterface() {
			return _interface;
		}

		public void setInterface(Project.Types.Pous.Pou.Interface value) {
			this._interface = value;
		}
	}
}
