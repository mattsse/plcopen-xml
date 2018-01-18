package org.plcopen.xml.util;

import org.eclipse.persistence.sessions.SessionEventListener;
import org.plcopen.xml.tc60201.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class XmlUnMarshaller {

	@SuppressWarnings("all")
	public static Project unmarshal(File xml) throws JAXBException {

		final Map<String, Object> properties = new HashMap<String, Object>(1);
		final SessionEventListener sessionEventListener = new NullPolicySessionEventListener();
//		properties.put(JAXBContextProperties.SESSION_EVENT_LISTENER, sessionEventListener);

		JAXBContext jaxbContext = JAXBContext
				.newInstance(new Class[] { Project.class,
                        Instances.Configurations.Configuration.Resource.class,
                        ProjectStructure.class,
                        ProjectStructure.StructureObject.class,
                        Folder.class,
						Pou.class}, properties);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Project project = (Project) jaxbUnmarshaller.unmarshal(xml);
		return project;
	}

}
