package de.dfki.iui.example_application;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.interfaces.IGrammarManagementService;
import de.dfki.iui.mmds.core.interfaces.IKnowledgeManager;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.ServiceInstance;
import de.dfki.iui.mmds.core.model.io.gui.GuiFactory;
import de.dfki.iui.mmds.core.model.io.gui.List;
import de.dfki.iui.mmds.core.model.io.gui.ListItem;
import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
import de.dfki.iui.mmds.core.model.project.ProjectFactory;
import de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface;

public class Plugin {

	static String[] cityNames = { "Berlin", "New York", "Tokyo", "Paris", "London", "Madrid" };

	public List getCityList() {
		IGrammarManagementService grammarManagementService = HelloWorldApp.getGrammarManagementService();
		List list = GuiFactory.eINSTANCE.createList();
		for (int i = 0; i < cityNames.length; ++i) {
			ListItem item = GuiFactory.eINSTANCE.createListItem();
			item.setLabel(new BString(cityNames[i]));
			item.setValue(new BString(cityNames[i]));
			list.getItem().add(item);
			grammarManagementService.addEntityToDynamicRule("hello_world", "CITY", cityNames[i], Integer.toString(i));
		}
		grammarManagementService.enableRule("hello_world", "CHOOSE_CITY_NAME");
		grammarManagementService.commit();

		return list;

	}

	Entity entity;

	public void looseDevice() {
		IKnowledgeManager knowledgeManager = HelloWorldApp.getKnowledgeManager();
		java.util.List<ServiceInstance> serviceInstances = (java.util.List<ServiceInstance>) knowledgeManager.getEntitiesOfType(IoPackage.eINSTANCE.getServiceInstance());
		entity = serviceInstances.get(2);
		knowledgeManager.removeEntity(entity.getENTITY_ID());
	}

	public void findDevice() {
		IKnowledgeManager knowledgeManager = HelloWorldApp.getKnowledgeManager();
		knowledgeManager.addEntity(entity);
	}

	public void registerDevice() {
		SiamInternalServiceInterface i = ProjectFactory.eINSTANCE.createSiamInternalServiceInterface();
		i.setModality(new BString("SPEECH"));
		i.setServiceName(new BString("speaker"));
		i.setServiceType(Io_interfacesPackage.eINSTANCE.getISpeechSynthesis());
		i.setSiamId(new BString("tts"));
		HelloWorldApp.getDeviceManager().registerDevice(i);
	}

	public void unregisterDevice() {
		HelloWorldApp.getDeviceManager().unregisterDevice("tts");
	}
}
