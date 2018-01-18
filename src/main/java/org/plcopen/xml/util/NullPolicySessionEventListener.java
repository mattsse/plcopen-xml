package org.plcopen.xml.util;

import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.mappings.DatabaseMapping;
import org.eclipse.persistence.oxm.mappings.XMLDirectMapping;
import org.eclipse.persistence.sessions.Project;
import org.eclipse.persistence.sessions.SessionEvent;
import org.eclipse.persistence.sessions.SessionEventAdapter;

/**
 *
 *
 * @author Firstname Lastname <a href="mailto:emailadress">emailaddress</a>
 *
 */
public class NullPolicySessionEventListener extends SessionEventAdapter {

	@Override
	public void preLogin(SessionEvent event) {
		final Project project = event.getSession()
				.getProject();
		for (final ClassDescriptor descriptor : project.getOrderedDescriptors()) {
			for (final DatabaseMapping mapping : descriptor.getMappings()) {
				if (mapping.isAbstractDirectMapping()) {
					final XMLDirectMapping xmlDirectMapping = (XMLDirectMapping) mapping;
					//		    xmlDirectMapping.getNullPolicy().setMarshalNullRepresentation(XMLNullRepresentationType.EMPTY_NODE);
					xmlDirectMapping.getNullPolicy()
							.setNullRepresentedByEmptyNode(true);
				}
			}
		}
	}

}