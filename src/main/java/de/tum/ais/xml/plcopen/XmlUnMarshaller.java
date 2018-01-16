package de.tum.ais.xml.plcopen;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.eclipse.persistence.sessions.SessionEventListener;
import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.Method;
import org.plcopen.xml.tc60201.Project;
import org.plcopen.xml.tc60201.ProjectInformation;
import org.plcopen.xml.tc60201.ProjectStructure;
import org.plcopen.xml.tc60201.ProjectStructure.Folder;
import org.plcopen.xml.tc60201.pou.TcPlcObject;
import org.plcopen.xml.tc60201.Property;

public class XmlUnMarshaller {

	@SuppressWarnings("all")
	public static Project unmarshal(File xml) throws JAXBException {
		final Map<String, Object> properties = new HashMap<String, Object>(1);
		final SessionEventListener sessionEventListener = new NullPolicySessionEventListener();
		properties.put(JAXBContextProperties.SESSION_EVENT_LISTENER, sessionEventListener);

		JAXBContext jaxbContext = JAXBContext
				.newInstance(new Class[] { Project.class, AddData.class, AddData.Data.class, ProjectInformation.class,
						Method.class, ProjectStructure.class, Folder.class, Property.class, TcPlcObject.class }, properties);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Project project = (Project) jaxbUnmarshaller.unmarshal(xml);
		return project;
	}

}
