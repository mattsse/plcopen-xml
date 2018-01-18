# plcopen-xml

Bindings for the [plcopen-xml](http://www.plcopen.org/pages/tc6_xml/) format.

The Class hierachy is compliant to its [schema](src/main/resources/tc6_xml_v201.xsd).

### Usage

#### Parse plc-open xml file
```
import org.plcopen.xml.tc60201.*;
 
File xml = new File("plc-xml.xml");
Project project = PlcXmlUtil.unmarshal(xml);

```

#### Save project as plc-open xml file
```
import org.plcopen.xml.tc60201.*;
 
File output = new File("plc-xml.xml");
PlcXmlUtil.marshall(project, output);

```