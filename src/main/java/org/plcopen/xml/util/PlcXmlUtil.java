package org.plcopen.xml.util;

import org.plcopen.xml.tc60201.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class PlcXmlUtil {

    @SuppressWarnings("all")
    public static Project unmarshal(File xml) throws JAXBException {
        JAXBContext jaxbContext = createContext();
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Project project = (Project) jaxbUnmarshaller.unmarshal(xml);
        return project;
    }


    public static JAXBContext createContext() throws JAXBException {
        return JAXBContext
                .newInstance(new Class[]{Project.class,
                        Instances.Configurations.Configuration.Resource.class,
                        ProjectStructure.class,
                        ProjectStructure.StructureObject.class,
                        Folder.class,
                        Pou.class});
    }

    public static void marshall(Project project, File output) throws JAXBException {
        JAXBContext jaxbContext = createContext();
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(project, output);
    }

}
