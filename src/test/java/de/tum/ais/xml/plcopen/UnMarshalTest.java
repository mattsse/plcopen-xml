package de.tum.ais.xml.plcopen;

import java.io.File;

import javax.xml.bind.JAXBException;

import org.junit.Assert;
import org.junit.Test;
import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.Project;

public class UnMarshalTest {
	
	@SuppressWarnings("restriction")
	@Test
	public void unmarshallProjectTest() {
		File xml = new File("src/main/resources/Scenario_3.xml");
		Assert.assertTrue(xml.exists());
		
		
		try {
			Project project = XmlUnMarshaller.unmarshal(xml);
			for(AddData.Data data : project.getAddData().getData()){
				System.out.println(data.getAny());
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
