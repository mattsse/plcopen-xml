package org.plcopen.xml.tc60201.pou;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;
import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "TcPlcObject")
public class TcPlcObject {

	@XmlAttribute(name = "Version")
	private String version;
	@XmlAttribute(name = "ProductVersion")
	private String productVersion;
	@XmlElement(name = "POU")
	private Pou pou;

	public Pou getPou() {
		return pou;
	}

	public void setPou(Pou pou) {
		this.pou = pou;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	/**
	 * 
	 * @return all TcPOU Objects
	 */
	public List<TcPouObject> getTcPouObjects() {
		List<TcPouObject> result = new ArrayList<TcPouObject>();
		result.add(getPou());
		result.addAll(getPou().getMethods());
		return result;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	public static class Pou implements TcPouObject {
		@XmlAttribute(name = "Name")
		private String name;
		@XmlAttribute(name = "Id")
		private String id;
		@XmlCDATA
		private String Declaration;
		@XmlPath("Implementation/ST/text()")
		private String implementation;
		@XmlElement(name = "Method")
		private List<Method> methods;

		public String getImplementation() {
			return implementation;
		}

		public void setImplementation(String implementation) {
			this.implementation = implementation;
		}

		public String getDeclaration() {
			if (Declaration == null)
				Declaration = "";
			return Declaration;
		}

		public void setDeclaration(String declaration) {
			Declaration = declaration;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return id.replaceAll("(\\{|\\})", "");
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<Method> getMethods() {
			if (methods == null)
				methods = new ArrayList<TcPlcObject.Method>();
			return methods;
		}

		public void setMethods(List<Method> method) {
			methods = method;
		}

		/**
		 * 
		 * @param name
		 * der gewuenschte Name des Function Blocks
		 * @return den Deklaration String mit ersetztem Function name
		 */
		public String replaceFunctionBlockName(String name) {
			Pattern pattern = Pattern.compile("(?<=^\\w*[\\s*])\\w*");
			return pattern.matcher(getDeclaration())
					.replaceFirst(name);
		}
	}

	/**
	 * 
	 * @author Matthias
	 *
	 */
	public static class Method implements TcPouObject {
		@XmlAttribute(name = "Name")
		private String name;
		@XmlAttribute(name = "Id")
		private String id;
		@XmlCDATA
		private String Declaration;

		@XmlPath("Implementation/ST/text()")
		private String implementation;

		public String getImplementation() {
			return implementation;
		}

		public void setImplementation(String implementation) {
			this.implementation = implementation;
		}

		public String getDeclaration() {
			if (Declaration == null)
				Declaration = "";
			return Declaration;
		}

		public void setDeclaration(String declaration) {
			Declaration = declaration;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return id.replaceAll("(\\{|\\})", "");
		}

		public void setId(String id) {
			this.id = id;
		}

	}

}
