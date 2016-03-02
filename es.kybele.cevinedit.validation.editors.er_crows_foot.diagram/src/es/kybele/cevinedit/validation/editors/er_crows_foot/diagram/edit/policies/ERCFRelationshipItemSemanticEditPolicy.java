package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ERCFRelationshipItemSemanticEditPolicy
		extends
		es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.policies.Er_crows_footBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ERCFRelationshipItemSemanticEditPolicy() {
		super(
				es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFRelationship_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
