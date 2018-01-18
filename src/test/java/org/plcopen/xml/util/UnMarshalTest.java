package org.plcopen.xml.util;

import java.io.File;

import javax.xml.bind.JAXBException;

import org.junit.Assert;
import org.junit.Test;
import org.plcopen.xml.tc60201.Body;
import org.plcopen.xml.tc60201.Project;

public class UnMarshalTest {
	
	@SuppressWarnings("restriction")
	@Test
	public void unmarshallProjectTest() {
		File xml = new File("src/main/resources/Scenario_3.xml");
		Assert.assertTrue(xml.exists());
		
		
		try {
			Project project = XmlUnMarshaller.unmarshal(xml);
			System.out.println(project.getAddData()
									  .getAllChildren(Body.class));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
