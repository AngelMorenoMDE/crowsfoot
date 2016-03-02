package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts;

import java.awt.Rectangle;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import er_crows_foot.ERCFRelationship;
import er_crows_foot.impl.ERCFRelationshipImpl;
import es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.policies.ERCFRelationshipItemSemanticEditPolicy;

/**
 * @generated
 */
public class ERCFRelationshipEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		getPrimaryShape().update();
	}

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public ERCFRelationshipEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.policies.ERCFRelationshipItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */
	protected Connection createConnectionFigure() {

		return new ERCFRelationshipFigure(this);
	}

	/**
	 * @generated
	 */
	public ERCFRelationshipFigure getPrimaryShape() {
		return (ERCFRelationshipFigure) getFigure();
	}

	/**
	 * @generated NOT
	 */
	public class ERCFRelationshipFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ERCFRelationshipFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);

			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
		}

		protected EObject _eobject = null;
		protected EditPart _editPart = null;
		protected ERCFRelationshipImpl _relationshipEObject = null;

		/**
		 * @generated NOT
		 */
		public ERCFRelationshipFigure(EditPart editpart) {
			_editPart = editpart;
			initDataFigure();
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);

			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
		}

		public void initDataFigure() {
			_eobject = ((View) (_editPart).getModel()).getElement();

			if (_eobject instanceof ERCFRelationshipImpl) {
				_relationshipEObject = (ERCFRelationshipImpl) _eobject;
			}
		}

		/**
		 * @generated NOT
		 */
		private RotatableDecoration createSourceDecoration() {

			return ERCFPolylineDecorationFactory.getDecoration(getMapMode(),
					_relationshipEObject.getSourceCardinality().getValue());
		}

		/**
		 * @generated NOT
		 */
		private RotatableDecoration createTargetDecoration() {
			return ERCFPolylineDecorationFactory.getDecoration(getMapMode(),
					_relationshipEObject.getTargetCardinality().getValue());
		}

		public void update() {
			initDataFigure();
			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
		}

	}

}
