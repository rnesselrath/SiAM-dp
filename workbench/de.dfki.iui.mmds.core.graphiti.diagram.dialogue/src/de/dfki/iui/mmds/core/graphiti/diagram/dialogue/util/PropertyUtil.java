package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util;

import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;

public class PropertyUtil {
 
    public static final String PACKAGE_KEY = "package";
 
    public static final String STATE_CHART_PACKAGE_VALUE = "state-chart";
    public static final String FLOW_CHART_PACKAGE_VALUE = "flow-chart";
    public static final String MESSAGING_PACKAGE_VALUE = "messaging";
    public static final String ON_ENTRY_EXIT_KEY = "ON_ENTRY_EXIT";
    public static final String ON_ENTRY_VALUE = "onEntry";
    public static final String ON_EXIT_VALUE = "onExit";
    public static final String IS_COLLAPSED_KEY = "isCollapsed";
    public static final String INITIAL_WIDTH_KEY = "initial_width";
    public static final String INITIAL_HEIGHT_KEY = "initial_height";
    public static final String INITIAL_X_KEY = "initial_x";
    public static final String INITIAL_Y_KEY = "initial_y";
    public static final String MORE_ENTRY_EXIT_KEY = "moreEntryExit";
    public static final String MORE_ENTRY_VALUE = "moreEntry";
    public static final String MORE_EXIT_VLUE = "moreExit";
    public static final String ENTRY_EXIT_HOLDER_KEY = "entryExitHolder";
    public static final String ENTRY_EXIT_HOLDER_VALUE = "entryExitHolderValue";
    public static final String ENTRY_EXIT_IMG_KEY = "entryExitImage";
    public static final String ENTRY_IMG_VALUE = "entryImage";
    public static final String EXIT_IMG_VALUE = "exitImage";
    public static final String PARENT_DIAGRAM_KEY = "isParentDiagram";
    public static final String INITIAL_VISIBLE_KEY = "isInitialVisible";
    public static final String TEXT_FIELD_KEY = "textField";
    public static final String DISPLAY_TEXT_VALUE = "displayText";
    public static final String CONDITION_DESC_TEXT_VALUE = "conditionDescText";
    public static final String CONDITION_TEXT_VALUE = "conditionText";
    public static final String FOOTER_KEY = "footer";
    public static final String FOOTER_LINE_VALUE = "footerLine";
    public static final String THEN_TEXT_VALUE = "thenText";
    public static final String ELSE_TEXT_VALUE = "elseText";
    public static final String THEN_ELSE_KEY = "thenElse";
    public static final String THEN_VALUE = "then";
    public static final String ELSE_VALUE = "else";
    public static final String EXEC_CONTENT_HOLDER_KEY = "exec_content_holder_key";
    public static final String EXEC_CONTENT_HOLDER_VALUE = "exec_content_holder";
    public static final String COND_EVENT_HOLDER_KEY = "cond_event_holder_key";
    public static final String COND_EVENT_HOLDER_VALUE = "cond_event_holder";
    public static final String SEQUENCE_HOLDER_KEY = "sequence_holder_key";
    public static final String SEQUENCE_HOLDER_VALUE = "sequence_holder";
    public static final String SEQUENCE_ORDER_KEY = "sequence_order";
    public static final String RESIZING_PARENT_KEY = "resizing_parent";
    public static final String SERVICE_SHAPE = "service_shape";
    public static final String STATE_CONNECTIONS = "connections";
    
    
    public static final void setPackage(PictogramElement pe, String value) {
        Graphiti.getPeService().setPropertyValue(pe, PACKAGE_KEY, value);
    }
 
    public static boolean isPackageStateChart(PictogramElement pe) {
        return STATE_CHART_PACKAGE_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, PACKAGE_KEY));
    }
    
    public static boolean isPackageFlowChart(PictogramElement pe) {
        return FLOW_CHART_PACKAGE_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, PACKAGE_KEY));
    }
    
    public static boolean isPackageMessaging(PictogramElement pe) {
        return MESSAGING_PACKAGE_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, PACKAGE_KEY));
    }
    
    public static boolean isPackageMessaging(IContext context){
    	return context.getProperty(PropertyUtil.PACKAGE_KEY).equals(PropertyUtil.MESSAGING_PACKAGE_VALUE);
    }
    
    public static final void setEntryExit(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, PropertyUtil.ON_ENTRY_EXIT_KEY, value);
    }
    
    public static final void setConnectionHolder(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, PropertyUtil.STATE_CONNECTIONS, value);
    }
    
    public static boolean isConnectionHolder(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, STATE_CONNECTIONS)!= null){
    		return STATE_CONNECTIONS.equals(Graphiti.getPeService().getPropertyValue(pe, STATE_CONNECTIONS));
    	}else{
    		return false;
    	}
    }
    
    public static boolean isOnEntry(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, ON_ENTRY_EXIT_KEY)!= null){
    		return ON_ENTRY_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, ON_ENTRY_EXIT_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static boolean isOnExit(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, ON_ENTRY_EXIT_KEY)!= null){
    		return ON_EXIT_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, ON_ENTRY_EXIT_KEY));
    	}else
    		return false;
    }
    
    public static void setCollapsed(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, IS_COLLAPSED_KEY, value);
    }
    
    public static boolean isCollapsed(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, IS_COLLAPSED_KEY) != null){
    		return Graphiti.getPeService().getPropertyValue(pe, "isCollapsed").equals("true");
    	}
    	return false;
    }
    
    public static void setInitialWidth(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, INITIAL_WIDTH_KEY, value);
    }
    
    public static void setInitialHeight(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, INITIAL_HEIGHT_KEY, value);
    }
    
    public static int getInitialWidth(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, INITIAL_WIDTH_KEY) != null){
    		return Integer.parseInt(Graphiti.getPeService().getPropertyValue(pe, INITIAL_WIDTH_KEY));
    	}
    	return -1;
    }
    
    public static int getInitialHeight(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, INITIAL_HEIGHT_KEY) != null){
    		return Integer.parseInt(Graphiti.getPeService().getPropertyValue(pe, INITIAL_HEIGHT_KEY));
    	}
    	return -1;
    }
    
    public static void setInitialX(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, INITIAL_X_KEY, value);
    }
    
    public static void setInitialY(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, INITIAL_Y_KEY, value);
    }
    
    public static int getInitialX(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, INITIAL_X_KEY) != null){
    		return Integer.parseInt(Graphiti.getPeService().getPropertyValue(pe, INITIAL_X_KEY));
    	}
    	return -1;
    }
    
    public static int getInitialY(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, INITIAL_Y_KEY) != null){
    		return Integer.parseInt(Graphiti.getPeService().getPropertyValue(pe, INITIAL_Y_KEY));
    	}
    	return -1;
    }
    
    public static final void setMoreEntryExit(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, MORE_ENTRY_EXIT_KEY, value);
    }
    
    public static boolean isMoreEntry(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, MORE_ENTRY_EXIT_KEY)!= null){
    		return MORE_ENTRY_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, MORE_ENTRY_EXIT_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static boolean isMoreExit(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, MORE_ENTRY_EXIT_KEY)!= null){
    		return MORE_EXIT_VLUE.equals(Graphiti.getPeService().getPropertyValue(pe, MORE_ENTRY_EXIT_KEY));
    	}else
    		return false;
    }
    
    public static final void setEntryExitHolder(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, ENTRY_EXIT_HOLDER_KEY, value);
    }
    
    public static boolean isEntryExitHolder(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, ENTRY_EXIT_HOLDER_KEY) != null){
    		
    		return ENTRY_EXIT_HOLDER_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, ENTRY_EXIT_HOLDER_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static boolean isEntryImage(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, ENTRY_EXIT_IMG_KEY)!= null){
    		return ENTRY_IMG_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, ENTRY_EXIT_IMG_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static boolean isExitImage(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, ENTRY_EXIT_IMG_KEY)!= null){
    		return EXIT_IMG_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, ENTRY_EXIT_IMG_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static void setEntryExitImage(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, ENTRY_EXIT_IMG_KEY, value);
    }
    
    public static void setIsParentDiagram(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, PARENT_DIAGRAM_KEY, value);
    }
    
    /**
     * This is little bit the other way around. It is only set to false, so if the key is not set to a property then it is true
     * @param pe
     * @return
     */
    public static boolean isParentDiagram(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, PARENT_DIAGRAM_KEY)!= null){
    		if(Graphiti.getPeService().getPropertyValue(pe, PARENT_DIAGRAM_KEY).equals("false")){
    			return false;
    		}else{
    			return true;
    		}
    	}else{
    		return true;
    	}
    }
    
    public static boolean isInitialVisible(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, INITIAL_VISIBLE_KEY)!= null){
    		return "true".equals(Graphiti.getPeService().getPropertyValue(pe, INITIAL_VISIBLE_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static void setInitialVisible(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, INITIAL_VISIBLE_KEY, value);
    }
    
    /**
     * Set property to see what kind of text is the text field on the shape
     * @param pe
     * @param value
     */
    public static void setTextFieldVaue(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, TEXT_FIELD_KEY, value);
    }
    
    public static boolean isDisplayText(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, TEXT_FIELD_KEY)!= null){
    		return DISPLAY_TEXT_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, TEXT_FIELD_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static boolean isConditionDescText(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, TEXT_FIELD_KEY)!= null){
    		return CONDITION_DESC_TEXT_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, TEXT_FIELD_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static boolean isConditionText(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, TEXT_FIELD_KEY)!= null){
    		return CONDITION_TEXT_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, TEXT_FIELD_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static boolean isThenText(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, TEXT_FIELD_KEY)!= null){
    		return THEN_TEXT_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, TEXT_FIELD_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static boolean isElseText(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, TEXT_FIELD_KEY)!= null){
    		return ELSE_TEXT_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, TEXT_FIELD_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static void setFooterVaue(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, FOOTER_KEY, value);
    }
    
    public static boolean isFooterLine(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, FOOTER_KEY)!= null){
    		return FOOTER_LINE_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, FOOTER_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static void setThenElse(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, THEN_ELSE_KEY, value);
    }
    
    public static boolean isThen(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, THEN_ELSE_KEY)!= null){
    		return THEN_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, THEN_ELSE_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static boolean isElse(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, THEN_ELSE_KEY)!= null){
    		return ELSE_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, THEN_ELSE_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static void setExecContentHolder(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, EXEC_CONTENT_HOLDER_KEY, value);
    }
    
    public static boolean isExecContentHolder(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, EXEC_CONTENT_HOLDER_KEY)!= null){
    		return EXEC_CONTENT_HOLDER_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, EXEC_CONTENT_HOLDER_KEY));
    	}else{
    		return false;
    	}
    }
    
    
    public static void setCondEventHolder(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, COND_EVENT_HOLDER_KEY, value);
    }
    
    public static boolean isCondEventHolder(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, COND_EVENT_HOLDER_KEY)!= null){
    		return COND_EVENT_HOLDER_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, COND_EVENT_HOLDER_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static void setSequenceHolder(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, SEQUENCE_HOLDER_KEY, value);
    }
    
    public static boolean isSequenceHolder(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, SEQUENCE_HOLDER_KEY)!= null){
    		return SEQUENCE_HOLDER_VALUE.equals(Graphiti.getPeService().getPropertyValue(pe, SEQUENCE_HOLDER_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static void setSequenceOrder(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, SEQUENCE_ORDER_KEY, value);
    }
    
    public static int getSequenceOrder(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, SEQUENCE_ORDER_KEY)!= null){
    		return Integer.parseInt(Graphiti.getPeService().getPropertyValue(pe, SEQUENCE_ORDER_KEY));
    	}
    	return -1;
    }
    
    public static void setResizingParent(PictogramElement pe, String value){
    	Graphiti.getPeService().setPropertyValue(pe, RESIZING_PARENT_KEY, value);
    }
    
    public static boolean isResizingParent(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, RESIZING_PARENT_KEY)!= null){
    		return "true".equals(Graphiti.getPeService().getPropertyValue(pe, RESIZING_PARENT_KEY));
    	}else{
    		return false;
    	}
    }
    
    public static void setServiceShape(PictogramElement pe) {
    	Graphiti.getPeService().setPropertyValue(pe, SERVICE_SHAPE, "true");
    }
    
    public static boolean isServiceShape(PictogramElement pe){
    	if(Graphiti.getPeService().getPropertyValue(pe, SERVICE_SHAPE)!= null){
    		return true;
    	}else{
    		return false;
    	}
    }
    
}