package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util;

import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

/**
 * Styles are created here with "plain"-methods, i.e. all values have to be set
 * explicitly.
 * 
 * See chapters "Using Styles" and "Color Schemas" in tutorial for deatails.
 */
public class StyleUtil {

	private static final IColorConstant TEXT_FOREGROUND = new ColorConstant(0, 0, 0);
	private static final IColorConstant STATE_CHART_FOREGROUND = new ColorConstant(98, 131, 167);
	private static final IColorConstant SEQUENCE_FOREGROUND = new ColorConstant(133, 133, 133);
	private static final IColorConstant STATE_FOREGROUND = new ColorConstant(98, 131, 167);
	private static final IColorConstant ENTRY_BACKGROUND = new ColorConstant(250, 250, 250);
	private static final IColorConstant TRANSITION_FORERGROUND = new ColorConstant(255, 185, 84);
	

	
	private static final IColorConstant ENTRY_EXIT_HOLDER_BACKROUND = new ColorConstant(227, 227, 227);
	// no background color here, we have a gradient instead
	// see chapter "Color Schemas" in Tutorial

	// private static final IColorConstant E_CLASS_BACKGROUND = new
	// ColorConstant(187, 218, 247);

	public static Style getStyleForCommonValues(Diagram diagram) {
		final String styleId = "COMMON-VALUES"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// Is style already persisted?
		Style style = gaService.findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(diagram, styleId);
			setCommonValues(style);
		}
		return style;
	}

	/****************  Style for the state chart **************/
	public static Style getStyleForStateChart(Diagram diagram) {
		final String styleId = "STATE-CHART"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		//if (style == null) { // style not found - create new style
		style = gaService.createPlainStyle(parentStyle, styleId);
		style.setFilled(true);
		style.setLineWidth(1);
		//style.
		style.setForeground(gaService.manageColor(diagram, STATE_CHART_FOREGROUND));
		// style.setBackground(gaService.manageColor(diagram,
		// E_CLASS_BACKGROUND));

		// no background color here, we have a gradient instead
		// see chapter "Color Schemas" in Tutorial
		//PredefinedColoredAreas.getBlueWhiteGlossAdaptions()
		
		gaService.setRenderingStyle(style, DialogueColorProvider.getLightYellowAdaptions());
		//}
		return style;
	}

	public static Style getStyleForStateChartText(Diagram diagram) {
		final String styleId = "STATE-CHART-TEXT"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		//if (style == null) { // style not found - create new style
		style = gaService.createPlainStyle(parentStyle, styleId);
		setCommonTextValues(diagram, gaService, style);
		style.setFont(gaService.manageDefaultFont(diagram, false, true));
		style.setFilled(true);
		style.setBackground(gaService.manageColor(diagram, IColorConstant.LIGHT_GRAY));

		//}
		return style;
	}
	
	public static Style getStyleForConditionText(Diagram diagram) {
		final String styleId = "CONDITION-TEXT"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		//if (style == null) { // style not found - create new style
		style = gaService.createPlainStyle(parentStyle, styleId);
		//setCommonTextValues(diagram, gaService, style);
		style.setFont(gaService.manageDefaultFont(diagram, false, true));
		
		style.setFilled(true);
		style.setBackground(gaService.manageColor(diagram, IColorConstant.WHITE));
		style.setLineVisible(true);
		style.setLineStyle(LineStyle.SOLID);
		style.setLineWidth(1);
		
		

		//}
		return style;
	}


	/****************  Style for the states **************/
	public static Style getStyleForState(Diagram diagram) {
		final String styleId = "STATE"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		//if (style == null) { // style not found - create new style
		style = gaService.createPlainStyle(parentStyle, styleId);
		style.setFilled(true);
		style.setLineWidth(1);
		style.setForeground(gaService.manageColor(diagram, STATE_FOREGROUND));
		// style.setBackground(gaService.manageColor(diagram,
		// E_CLASS_BACKGROUND));
		// no background color here, we have a gradient instead
		gaService.setRenderingStyle(style, DialogueColorProvider.getBlueWhiteAdaptions());
		//}
		return style;
	}

	public static Style getStyleForStateText(Diagram diagram) {
		final String styleId = "STATE-TEXT"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			setCommonTextValues(diagram, gaService, style);
			style.setFont(gaService.manageDefaultFont(diagram, false, true));
		}
		return style;
	}

	public static Style getStyleForTextDecorator(Diagram diagram) {
		final String styleId = "TEXT-DECORATOR-TEXT"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			setCommonTextValues(diagram, gaService, style);
			style.setFont(gaService.manageDefaultFont(diagram, true, false));
		}
		return style;
	}

	/**
	 * Get Style for CompositeState
	 * @param diagram
	 * @return
	 */
	public static Style getStyleForCompositeState(Diagram diagram) {
		final String styleId = "STATE"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		//if (style == null) { // style not found - create new style
		style = gaService.createPlainStyle(parentStyle, styleId);
		style.setFilled(true);
		style.setLineWidth(1);
		style.setForeground(gaService.manageColor(diagram, STATE_FOREGROUND));
		// style.setBackground(gaService.manageColor(diagram,
		// E_CLASS_BACKGROUND));

		// no background color here, we have a gradient instead
		gaService.setRenderingStyle(style, DialogueColorProvider.getCopperWhiteGlossAdaptions());
		//}
		return style;
	}
	
	/**
	 * Get style for CompositeState text
	 * @param diagram
	 * @return
	 */
	public static Style getStyleForCompositeStateText(Diagram diagram) {
		final String styleId = "COMPOSITE-STATE-TEXT"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		//if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			setCommonTextValues(diagram, gaService, style);
			style.setFont(gaService.manageDefaultFont(diagram, false, true));
			//style.setAngle(-90);
			style.setFilled(true);
			style.setBackground(gaService.manageColor(diagram, IColorConstant.LIGHT_BLUE));
			
		//}
		return style;
	}
	
	/****************  Style for the on entry/exit **************/
	public static Style getStyleForEntry(Diagram diagram) {
		final String styleId = "ENTRY"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		//if (style == null) { // style not found - create new style
		style = gaService.createPlainStyle(parentStyle, styleId);
		style.setFilled(true);
		style.setLineWidth(1);
		style.setForeground(gaService.manageColor(diagram, STATE_FOREGROUND));
		style.setBackground(gaService.manageColor(diagram, ENTRY_BACKGROUND));

		// no background color here, we have a gradient instead
		//gaService.setRenderingStyle(style, DialogueColorProvider.getBlueWhiteAdaptions());
		//}
		return style;
	}
	
	public static Style getStyleForTransition(Diagram diagram){
		final String styleId = "TRANSITION"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			style.setLineWidth(1);
			setCommonTextValues(diagram, gaService, style);
			style.setFont(gaService.manageDefaultFont(diagram, true, false));
		}
		style.setFilled(false);
		return style;
	}
	
	public static Style getStileForColoredTansition(Diagram diagram){
		final String styleId = "TRANSITION2"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			style.setLineWidth(2);
			
			//style.setForeground(gaService.manageColor(diagram, IColorConstant.BLUE));
			
			//style.setLineStyle(LineStyle);
			setCommonTextValues(diagram, gaService, style);
			style.setFont(gaService.manageDefaultFont(diagram, true, false));
		}
		return style;
	}
	
	
	/****************  Style for the states **************/
	public static Style getStyleForEntryExitHolder(Diagram diagram) {
		final String styleId = "ENTRY-EXIT-HOLDER"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		//if (style == null) { // style not found - create new style
		style = gaService.createPlainStyle(parentStyle, styleId);
		style.setFilled(true);
		style.setLineWidth(1);
		style.setForeground(gaService.manageColor(diagram, STATE_FOREGROUND));
		 style.setBackground(gaService.manageColor(diagram, ENTRY_EXIT_HOLDER_BACKROUND));

		// no background color here, we have a gradient instead
		//gaService.setRenderingStyle(style, DialogueColorProvider.getBlueWhiteAdaptions());
		//}
		return style;
	}
	
	
	/****************  Style for the state chart **************/
	public static Style getStyleForSequence(Diagram diagram) {
		final String styleId = "SEQUENCE"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		//if (style == null) { // style not found - create new style
		style = gaService.createPlainStyle(parentStyle, styleId);
		style.setFilled(true);
		style.setLineWidth(1);
		//style.
		style.setForeground(gaService.manageColor(diagram, SEQUENCE_FOREGROUND));
		// style.setBackground(gaService.manageColor(diagram,
		// E_CLASS_BACKGROUND));

		// no background color here, we have a gradient instead
		// see chapter "Color Schemas" in Tutorial
		//PredefinedColoredAreas.getBlueWhiteGlossAdaptions()
		
		gaService.setRenderingStyle(style, DialogueColorProvider.getLightGrayAdaptions());
		//}
		return style;
	}

	
	public static Style getStyleForSequenceHolder(Diagram diagram){
		final String styleId = "SEQUENCE-HOLDER"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		//if (style == null) { // style not found - create new style
		style = gaService.createPlainStyle(parentStyle, styleId);
		style.setFilled(false);
		style.setLineWidth(2);
		style.setLineStyle(LineStyle.DASH);
		style.setForeground(gaService.manageColor(diagram, SEQUENCE_FOREGROUND));
	
		gaService.setRenderingStyle(style, DialogueColorProvider.getLightGrayAdaptions());
	
		return style;
	}
	
	
	private static void setCommonTextValues(Diagram diagram, IGaService gaService, Style style) {
		style.setFilled(false);
		style.setAngle(0);
		style.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		style.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		style.setForeground(gaService.manageColor(diagram, TEXT_FOREGROUND));
		style.setFilled(false);
	}

	private static void setCommonValues(Style style) {
		style.setLineStyle(LineStyle.SOLID);
		style.setLineVisible(true);
		style.setLineWidth(1);
		style.setTransparency(0.0);
	}
}
