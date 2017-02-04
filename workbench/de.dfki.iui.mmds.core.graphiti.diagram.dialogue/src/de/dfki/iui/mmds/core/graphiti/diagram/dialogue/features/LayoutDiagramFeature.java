package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.graph.CompoundDirectedGraph;
import org.eclipse.draw2d.graph.CompoundDirectedGraphLayout;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.draw2d.graph.EdgeList;
import org.eclipse.draw2d.graph.Node;
import org.eclipse.draw2d.graph.NodeList;
import org.eclipse.draw2d.graph.Subgraph;
import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

/**
 * Maps the Graphiti Diagram to a graph structure which can be consumed by the
 * GEF Layouter, layouts the graph structure and maps the new coordinates back
 * to the diagram. Refresh is triggered automatically by the changes on the
 * diagram model.
 * 
 * Disclaimer: this is just an example to show how to plug an arbitrary layouter
 * into a Graphiti diagram editor. For instance, the basic layouting here does
 * not consider bendpoints etc.
 * 
 */
public class LayoutDiagramFeature extends AbstractCustomFeature {

	/**
	 * Minimal distance between nodes.
	 */
	private static final int PADDING = 30;

	/**
	 * Creates new LayoutDiagramFeature
	 * @param fp the feature provider
	 */
	public LayoutDiagramFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Gets the description
	 * 
	 * @return the description
	 */
	@Override
	public String getDescription() {
		return "Layout diagram with GEF Layouter"; //$NON-NLS-1$
	}

	/**
	 * Gets the name
	 * 
	 * @return the name
	 */
	@Override
	public String getName() {
		return "&Layout Diagram"; //$NON-NLS-1$
	}

	/**
	 * Can execute?
	 * 
	 * @return true if can execute
	 */
	@Override
	public boolean canExecute(ICustomContext context) {
		return true;
	}

	/**
	 * Executes layouting
	 * 
	 * @param context the context.
	 */
	@Override
	public void execute(ICustomContext context) {
//		final CompoundDirectedGraph graph = mapDiagramToGraph();
//		graph.setDefaultPadding(new Insets(PADDING));
//
//		new CompoundDirectedGraphLayout().visit(graph);
//		mapGraphCoordinatesToDiagram(graph);
		execLayout(getDiagram());
	}


	private Diagram mapGraphCoordinatesToDiagram(CompoundDirectedGraph graph) {
		NodeList myNodes = new NodeList();
		myNodes.addAll(graph.nodes);
		myNodes.addAll(graph.subgraphs);
		for (Object object : myNodes) {

			Node node = (Node) object;
			//System.out.println("data "+node.data);
			Shape shape = (Shape) node.data;
			shape.getGraphicsAlgorithm().setX(node.x);
			shape.getGraphicsAlgorithm().setY(node.y);
			shape.getGraphicsAlgorithm().setWidth(node.width);
			shape.getGraphicsAlgorithm().setHeight(node.height);
		}
		return null;
	}

	public void traverseChildren(ContainerShape cs, NodeList nodeList, Subgraph parent){
		if(cs.getChildren().isEmpty()){
			nodeList.add(parent);
			return;
		}else{

			EList<Shape> children = cs.getChildren();
			for(Shape shape : children){
				if(shape instanceof ContainerShape){

					Subgraph node = new Subgraph(shape, parent);
					GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
					node.x = ga.getX();
					node.y = ga.getY();
					node.width = ga.getWidth();
					node.height = ga.getHeight();
					//node.data = shape;

					//parent.addMember(node);

					traverseChildren((ContainerShape) shape, nodeList, node);
				}
			}

		}
	}

	//	public void contributeNodesToGraph(ContainerShape cs, CompoundDirectedGraph graph,
	//			Subgraph s, Map<AnchorContainer, Node> partsToNodesOrEdges) {
	//		/*
	//		 * Copied from StructuredActivityPart, this method
	//		 * adds this thing as a graph node and then recurses on
	//		 * the children.
	//		 */
	//		Subgraph me = new Subgraph(cs, s);
	//		
	//		GraphicsAlgorithm ga = cs.getGraphicsAlgorithm();
	//		me.x = ga.getX();
	//		me.y = ga.getY();
	//		me.width = ga.getWidth();
	//		me.height = ga.getHeight();
	//		me.outgoingOffset = 5;
	//		me.incomingOffset = 5;
	//		
	//		partsToNodesOrEdges.put(cs, me);
	//		
	//		//@SuppressWarnings({"unused", "unchecked"})
	//		boolean DONTUSE = graph.nodes.add(me);
	//		
	//		EList<Shape> children = cs.getChildren();
	//		for(Shape shape : children){
	//			if(shape instanceof ContainerShape){
	//				
	//				contributeNodesToGraph((ContainerShape) shape, graph, me, partsToNodesOrEdges);
	//			}
	//		}
	//	}

	private CompoundDirectedGraph mapDiagramToGraph() {
		Map<AnchorContainer, Node> shapeToNode = new HashMap<AnchorContainer, Node>();
		Diagram d = getDiagram();
		CompoundDirectedGraph dg = new CompoundDirectedGraph();
		//EdgeList edgeList = new EdgeList();
		NodeList nodeList = new NodeList();

		EList<Shape> children = d.getChildren();
		for (Shape shape : children) {

			if(shape instanceof ContainerShape){
				Node node = new Node(shape);
				GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
				node.x = ga.getX();
				node.y = ga.getY();
				node.width = ga.getWidth();
				node.height = ga.getHeight();
				//node.data = shape;
				shapeToNode.put(shape, node);


				nodeList.add((Node)node);
				//contributeNodesToGraph((ContainerShape) shape, dg, new Subgraph(shape), shapeToNode);

				//traverseChildren((ContainerShape) shape, nodeList, node);
			}
		}

		//		
		//		System.out.println("Final node list:");
		//		for(int i=0; i<nodeList.size(); i++){
		//			Subgraph sg = (Subgraph) nodeList.getNode(i);
		//			
		//			System.out.println("Object="+getBusinessObjectForPictogramElement((PictogramElement) sg.data));
		//			
		//			if(!sg.members.isEmpty()){
		//				for(int j=0; j< sg.members.size(); j++){
		//					System.out.println("     child "+getBusinessObjectForPictogramElement((PictogramElement) sg.members.getNode(j).data));
		//				}
		//			}
		//		}
		//		

		//		EList<Connection> connections = d.getConnections();
		//		for (Connection connection : connections) {
		//			AnchorContainer source = connection.getStart().getParent();
		//			AnchorContainer target = connection.getEnd().getParent();
		//			if(source != null && target != null && shapeToNode.get(source)!= null && shapeToNode.get(target)!=null){
		//				
		//				Edge edge = new Edge(shapeToNode.get(source), shapeToNode.get(target));
		//				edge.data = connection;
		//				edgeList.add(edge);
		//			}
		//		}


		dg.nodes = nodeList;
		dg.edges = getEdges(d, shapeToNode);

		return dg;
	}
	
	private void execLayout(ContainerShape cs){
		
			Map<AnchorContainer, Node> shapeToNode = new HashMap<AnchorContainer, Node>();
			CompoundDirectedGraph graph = new CompoundDirectedGraph();
			
			graph.nodes = getNodes(cs, shapeToNode);
			graph.edges = getEdges(getDiagram(), shapeToNode);
			
			graph.setDefaultPadding(new Insets(PADDING));
			graph.setDirection(PositionConstants.EAST);
			//graph.setMargin(new Insets(2));
			
			new CompoundDirectedGraphLayout().visit(graph);
			mapGraphCoordinatesToDiagram(graph);
			
			EList<Shape> children = cs.getChildren();
			for(Shape shape : children){
				if(shape instanceof ContainerShape){
					execLayout((ContainerShape) shape);
				}
			}
		
	}

	private NodeList getNodes(ContainerShape cs, Map<AnchorContainer, Node> shapeToNode){
		NodeList nodeList = new NodeList();

		EList<Shape> children = cs.getChildren();
		int n = 0;
		for (Shape shape : children) {

			if(shape instanceof ContainerShape){
				Node node = new Node(shape);
				GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
				node.x = ga.getX();
				node.y = ga.getY();
				node.width = ga.getWidth();
				node.height = ga.getHeight();
				node.setRowConstraint(n);
				n++;
				//node.setPadding(new Insets(PADDING));
				//node.data = shape;
				shapeToNode.put(shape, node);
				nodeList.add((Node)node);
			}
		}

		return nodeList;
	}


	private EdgeList getEdges(Diagram d, Map<AnchorContainer, Node> shapeToNode){
		EdgeList edgeList = new EdgeList();
		EList<Connection> connections = d.getConnections();
		for (Connection connection : connections) {
			AnchorContainer source = connection.getStart().getParent();
			AnchorContainer target = connection.getEnd().getParent();
			if(source != null && target != null && shapeToNode.get(source)!= null && shapeToNode.get(target)!=null){

				Edge edge = new Edge(shapeToNode.get(source), shapeToNode.get(target));
				edge.data = connection;
				edgeList.add(edge);
			}
		}
		return edgeList;
	}

}