package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class ERCFEntityEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ERCFEntityEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.policies.ERCFEntityItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ERCFEntityFigure();
	}

	/**
	 * @generated
	 */
	public ERCFEntityFigure getPrimaryShape() {
		return (ERCFEntityFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityNameEditPart) {
			((es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureERCFEntityNameFigure());
			return true;
		}
		if (childEditPart instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityERCFEntityAttributesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureERCFEntityAttributesInvisibleRectangleCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityERCFEntityAttributesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityNameEditPart) {
			return true;
		}
		if (childEditPart instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityERCFEntityAttributesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureERCFEntityAttributesInvisibleRectangleCompartment();
			pane.remove(((es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityERCFEntityAttributesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityERCFEntityAttributesCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureERCFEntityAttributesInvisibleRectangleCompartment();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(160, 250);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
				.getType(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFAttribute_3001) {
				return getChildBySemanticHint(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
						.getType(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityERCFEntityAttributesCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ERCFEntityFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureERCFEntityNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureERCFEntityAttributesInvisibleRectangleCompartment;

		/**
		 * @generated
		 */
		public ERCFEntityFigure() {
			this.setLayoutManager(new XYLayout());
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureERCFEntityNameFigure = new WrappingLabel();

			fFigureERCFEntityNameFigure.setText("Set Label...");

			fFigureERCFEntityNameFigure
					.setFont(FFIGUREERCFENTITYNAMEFIGURE_FONT);

			fFigureERCFEntityNameFigure.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(10), getMapMode().DPtoLP(10), getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(fFigureERCFEntityNameFigure);

			PolylineShape eRCFEntitySeparatorPolyline0 = new PolylineShape();

			eRCFEntitySeparatorPolyline0.addPoint(new Point(getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(2)));
			eRCFEntitySeparatorPolyline0.addPoint(new Point(getMapMode()
					.DPtoLP(160), getMapMode().DPtoLP(2)));
			eRCFEntitySeparatorPolyline0.setLineWidth(2);
			eRCFEntitySeparatorPolyline0
					.setForegroundColor(ColorConstants.black);

			this.add(
					eRCFEntitySeparatorPolyline0,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(
							30), getMapMode().DPtoLP(160), getMapMode().DPtoLP(
							4)));

			fFigureERCFEntityAttributesInvisibleRectangleCompartment = new RectangleFigure();

			fFigureERCFEntityAttributesInvisibleRectangleCompartment
					.setOutline(false);
			fFigureERCFEntityAttributesInvisibleRectangleCompartment
					.setFill(false);
			fFigureERCFEntityAttributesInvisibleRectangleCompartment
					.setOpaque(false);

			this.add(
					fFigureERCFEntityAttributesInvisibleRectangleCompartment,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(
							32), getMapMode().DPtoLP(160), getMapMode().DPtoLP(
							216)));
			fFigureERCFEntityAttributesInvisibleRectangleCompartment
					.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureERCFEntityNameFigure() {
			return fFigureERCFEntityNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureERCFEntityAttributesInvisibleRectangleCompartment() {
			return fFigureERCFEntityAttributesInvisibleRectangleCompartment;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREERCFENTITYNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), "Arial", 10, SWT.BOLD);

}
