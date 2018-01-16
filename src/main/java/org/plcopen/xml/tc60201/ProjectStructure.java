package org.plcopen.xml.tc60201;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ProjectStructure")
public class ProjectStructure {
	@XmlAnyElement(lax = true)
	protected StructureObject root;

	public StructureObject getRoot() {
		return root;
	}

	public void setRoot(StructureObject any) {
		this.root = any;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlRootElement(name = "Object")
	public static class StructureObject {
		@XmlAttribute(name = "Name")
		protected String name;
		@XmlAttribute(name = "ObjectId")
		protected String objectID;
		protected List<StructureObject> Object;
		protected List<Folder> Folder;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getObjectID() {
			return objectID;
		}

		public void setObjectID(String objectID) {
			this.objectID = objectID;
		}

		public List<StructureObject> getStructureObjects() {
			if (Object == null) {
				Object = new ArrayList<StructureObject>();
			}
			return this.Object;
		}

		public List<Folder> getFolders() {
			if (Folder == null) {
				Folder = new ArrayList<Folder>();
			}
			return this.Folder;
		}

		@Override
		public String toString() {
			return "StructureObject{" +
					"name='" + name + '\'' +
					", objectID='" + objectID + '\'' +
					", Object=" + Object +
					", Folder=" + Folder +
					'}';
		}
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlRootElement(name = "Folder")
	public static class Folder {
		@XmlAttribute(name = "Name")
		protected String name;
		protected List<StructureObject> Object;
		protected List<Folder> Folder;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<StructureObject> getStructureObjects() {
			if (Object == null) {
				Object = new ArrayList<StructureObject>();
			}
			return this.Object;
		}

		public List<Folder> getFolders() {
			if (Folder == null) {
				Folder = new ArrayList<Folder>();
			}
			return this.Folder;
		}

		@Override
		public String toString() {
			return "Folder{" +
					"name='" + name + '\'' +
					", Object=" + Object +
					", Folder=" + Folder +
					'}';
		}
	}

	@Override
	public String toString() {
		return "ProjectStructure{" +
				"root=" + root +
				'}';
	}
}
