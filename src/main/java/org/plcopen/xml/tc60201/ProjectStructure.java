package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ProjectStructure")
public class ProjectStructure implements org.plcopen.xml.tc60201.PlcNode{
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
	public static class StructureObject implements org.plcopen.xml.tc60201.PlcNode{
		@XmlAttribute(name = "Name")
		protected String name;
		@XmlAttribute(name = "ObjectId")
		protected String objectID;
		protected List<StructureObject> structureObjects;
		protected List<Folder> folders;

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
			if (structureObjects == null) {
				structureObjects = new ArrayList<StructureObject>();
			}
			return this.structureObjects;
		}

		public List<Folder> getFolders() {
			if (folders == null) {
				folders = new ArrayList<Folder>();
			}
			return this.folders;
		}

		@Override
		public String toString() {
			return "StructureObject{" +
					"name='" + name + '\'' +
					", objectID='" + objectID + '\'' +
					", Object=" + structureObjects +
					", Folder=" + folders +
					'}';
		}
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlRootElement(name = "Folder")
	public static class Folder implements org.plcopen.xml.tc60201.PlcNode{
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
