package org.plcopen.xml.util;

import java.io.File;

import javax.xml.bind.JAXBException;

import org.junit.Assert;
import org.junit.Test;
import org.plcopen.xml.tc60201.*;

public class UnMarshalTest {
	
	@SuppressWarnings("restriction")
	@Test
	public void unmarshallProjectTest() {
		File xml = new File("src/main/resources/Scenario_3.xml");
		Assert.assertTrue(xml.exists());

        try {
            Project project = XmlUnMarshaller.unmarshal(xml);
//            Project.Instances.Configurations.Configuration.Resource resource = project.getChildNodes(Project.Instances.Configurations.Configuration.Resource.class).get(0);

//            List<Project.Types.Pous.Pou> pous =  resource.getChildNodes(Project.Types.Pous.Pou.class);
//            for(Project.Types.Pous.Pou p : pous ){
//                System.out.println(p.getChildNodes(Body.SFC.class));
//            }
//            System.out.println(resource.getAddData());
            System.out.println("result " + project.getChildNodes(SFC.class));
//            resource.getAddData().getData().forEach(c-> System.out.println(c.getAny()));
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
}
