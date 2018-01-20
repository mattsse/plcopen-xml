# plcopen-xml

Bindings for the [plcopen-xml](http://www.plcopen.org/pages/tc6_xml/) format.

The Class hierachy is compliant to its [schema](src/main/resources/tc6_xml_v201.xsd).

### Usage

#### Parse plc-open xml file
```java
import org.plcopen.xml.tc60201.*;
 
File xml = new File("plc-xml.xml");
Project project = PlcXmlUtil.unmarshal(xml);

```

#### Filtering
Filter the whole project tree
```java
// get all Pou Objects in the project
List<Pou> allPous = project.getAllChildren(Pou.class);

```

#### Save project as plc-open xml file
```java
import org.plcopen.xml.tc60201.*;
 
File output = new File("plc-xml.xml");
PlcXmlUtil.marshall(project, output);

```

### Troubleshooting

In case of namespace issues, edit the namespace annotation (`@javax.xml.bind.annotation.XmlSchema(namespace = "http://www.plcopen.org/xml/tc6_0200"`) in [package-info](./src/main/java/org/plcopen/xml/tc60201/package-info.java) to the correct version.