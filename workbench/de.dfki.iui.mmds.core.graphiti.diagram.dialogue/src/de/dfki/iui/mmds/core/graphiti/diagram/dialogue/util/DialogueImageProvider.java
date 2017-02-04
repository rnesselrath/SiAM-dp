package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

public class DialogueImageProvider extends AbstractImageProvider{

	// The prefix for all identifiers of this image provider
	protected static final String PREFIX = "de.dfki.iui.mmds.core.graphiti.diagram.dialogue."; //$NON-NLS-1$

	// The image identifier for an EReference.
	public static final String IMG_EREFERENCE = PREFIX + "ereference"; //$NON-NLS-1$
	public static final String IMG_STATECHART = PREFIX + "statechart";
	public static final String IMG_STATE = PREFIX + "state";
	public static final String IMG_TRANSITION = PREFIX + "transition";
	public static final String IMG_COMPOSITE_STATE = PREFIX + "compositestate";
	public static final String IMG_HISTORY_STATE = PREFIX + "historystate";
	public static final String IMG_INITIAL_STATE = PREFIX + "initialstate";
	public static final String IMG_FINAL_STATE = PREFIX + "finalstate";
	public static final String IMG_DIALOGUE = PREFIX + "dialogue";
	public static final String IMG_PARALLEL_STATE = PREFIX + "parallelstate";
	public static final String IMG_ON_ENTRY = PREFIX + "onentry";
	public static final String IMG_ON_EXIT = PREFIX + "onexit";
	public static final String IMG_SEND = PREFIX + "send";
	public static final String IMG_MESSAGING = PREFIX + "messaging";
	public static final String IMG_RAISE = PREFIX + "raise";
	public static final String IMG_LOG = PREFIX + "log";
	public static final String IMG_ASSIGN = PREFIX + "assign";
	public static final String IMG_DELAY = PREFIX + "delay";
	public static final String IMG_JAVA_PLUGIN = PREFIX + "javaplugin";
	public static final String IMG_MORE_STACK = PREFIX + "morestack";
	public static final String IMG_SEQUENCE = PREFIX + "sequence";
	public static final String IMG_FLOW_CHART = PREFIX + "flowchart";
	public static final String IMG_DO_WHILE = PREFIX + "dowhile";
	public static final String IMG_WHILE = PREFIX + "while";
	public static final String IMG_FOR_EACH = PREFIX + "foreach";
	public static final String IMG_IF = PREFIX + "if";
	public static final String IMG_EXEC_CONTENT_NODE = PREFIX + "execcontentnode";
	public static final String IMG_IF_EXEC = PREFIX + "ifExec";
	public static final String IMG_WAIT_FOR_EVENT = PREFIX + "waitforevent";
	public static final String IMG_COND_EVENT = PREFIX + "condevent";
	public static final String IMG_DOWN = PREFIX+"down";
	public static final String IMG_UP = PREFIX+"up";
	
	@Override
	protected void addAvailableImages() {
		// register the path for each image identifier
		addImageFilePath(IMG_EREFERENCE, "icons/ereference.gif"); //$NON-NLS-1$
		addImageFilePath(IMG_STATECHART, "icons/StateChart2.gif");
		addImageFilePath(IMG_STATE, "icons/State.gif");
		addImageFilePath(IMG_TRANSITION, "icons/Transition.gif");
		addImageFilePath(IMG_COMPOSITE_STATE, "icons/CompositeState.gif");
		addImageFilePath(IMG_HISTORY_STATE, "icons/HistoryState.gif");
		addImageFilePath(IMG_INITIAL_STATE, "icons/InitialState.gif");
		addImageFilePath(IMG_FINAL_STATE, "icons/FinalState.gif");
		addImageFilePath(IMG_DIALOGUE, "icons/Dialogue.gif");
		addImageFilePath(IMG_PARALLEL_STATE, "icons/ParallelState.gif");
		addImageFilePath(IMG_ON_ENTRY, "icons/OnEntry5.png");
		addImageFilePath(IMG_ON_EXIT, "icons/OnExit5.png");
		addImageFilePath(IMG_SEND, "icons/Send.gif");
		addImageFilePath(IMG_MESSAGING, "icons/Messaging2.png");
		addImageFilePath(IMG_RAISE, "icons/Raise.gif");
		addImageFilePath(IMG_LOG, "icons/Log.gif");
		addImageFilePath(IMG_ASSIGN, "icons/Assign.gif");
		addImageFilePath(IMG_DELAY, "icons/Delay.gif");
		addImageFilePath(IMG_JAVA_PLUGIN, "icons/JavaPlugin.gif");
		addImageFilePath(IMG_MORE_STACK, "icons/layers_stack.png");
		addImageFilePath(IMG_SEQUENCE, "icons/Sequence.gif");
		addImageFilePath(IMG_FLOW_CHART, "icons/FlowChart.gif");
		addImageFilePath(IMG_DO_WHILE, "icons/DoWhile.gif");
		addImageFilePath(IMG_WHILE, "icons/While.gif");
		addImageFilePath(IMG_FOR_EACH, "icons/ForEach.gif");
		addImageFilePath(IMG_IF, "icons/If2.gif");
		addImageFilePath(IMG_IF_EXEC, "icons/If.gif");
		addImageFilePath(IMG_EXEC_CONTENT_NODE, "icons/ExecutableContentNode.gif");
		addImageFilePath(IMG_WAIT_FOR_EVENT, "icons/WaitForEvent.gif");
		addImageFilePath(IMG_COND_EVENT, "icons/CondEvent.gif");
		addImageFilePath(IMG_DOWN, "icons/down.png");
		addImageFilePath(IMG_UP, "icons/up.png");
	}

}
