package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Folder")
public class Folder implements PlcNode{
    @XmlAttribute(name = "Name")
    protected String name;
    protected List<ProjectStructure.StructureObject> Object;
    protected List<org.plcopen.xml.tc60201.Folder> Folder;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProjectStructure.StructureObject> getStructureObjects() {
        if (Object == null) {
            Object = new ArrayList<ProjectStructure.StructureObject>();
        }
        return this.Object;
    }

    public List<org.plcopen.xml.tc60201.Folder> getFolders() {
        if (Folder == null) {
            Folder = new ArrayList<org.plcopen.xml.tc60201.Folder>();
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
