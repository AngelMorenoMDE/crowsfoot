package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Er_crows_footModelingAssistantProviderOfERCFEntityEditPart
		extends
		es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFAttribute_3001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFRelationship_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart) {
			types.add(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFRelationship_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFRelationship_4001) {
			types.add(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFEntity_2001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFRelationship_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFRelationship_4001) {
			types.add(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFEntity_2001);
		}
		return types;
	}

}
