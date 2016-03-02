package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Er_crows_footEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
					.getVisualID(view)) {

			case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFDiagramEditPart.VISUAL_ID:
				return new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFDiagramEditPart(
						view);

			case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart.VISUAL_ID:
				return new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart(
						view);

			case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityNameEditPart.VISUAL_ID:
				return new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityNameEditPart(
						view);

			case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFAttributeEditPart.VISUAL_ID:
				return new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFAttributeEditPart(
						view);

			case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFAttributeNameEditPart.VISUAL_ID:
				return new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFAttributeNameEditPart(
						view);

			case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityERCFEntityAttributesCompartmentEditPart.VISUAL_ID:
				return new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityERCFEntityAttributesCompartmentEditPart(
						view);

			case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart.VISUAL_ID:
				return new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart(
						view);

			case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipNameEditPart.VISUAL_ID:
				return new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipNameEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
