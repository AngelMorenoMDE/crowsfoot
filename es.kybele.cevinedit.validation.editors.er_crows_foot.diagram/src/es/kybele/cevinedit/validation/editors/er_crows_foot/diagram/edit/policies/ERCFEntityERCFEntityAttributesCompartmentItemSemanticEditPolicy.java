package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ERCFEntityERCFEntityAttributesCompartmentItemSemanticEditPolicy
		extends
		es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.policies.Er_crows_footBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ERCFEntityERCFEntityAttributesCompartmentItemSemanticEditPolicy() {
		super(
				es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFEntity_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFAttribute_3001 == req
				.getElementType()) {
			return getGEFWrapper(new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.commands.ERCFAttributeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
