package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ERCFRelationshipReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ERCFRelationshipReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof er_crows_foot.ERCFRelationship) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof er_crows_foot.ERCFEntity && newEnd instanceof er_crows_foot.ERCFEntity)) {
			return false;
		}
		er_crows_foot.ERCFEntity target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof er_crows_foot.ERCFDiagram)) {
			return false;
		}
		er_crows_foot.ERCFDiagram container = (er_crows_foot.ERCFDiagram) getLink()
				.eContainer();
		return es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.policies.Er_crows_footBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistERCFRelationship_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof er_crows_foot.ERCFEntity && newEnd instanceof er_crows_foot.ERCFEntity)) {
			return false;
		}
		er_crows_foot.ERCFEntity source = getLink().getSource();
		if (!(getLink().eContainer() instanceof er_crows_foot.ERCFDiagram)) {
			return false;
		}
		er_crows_foot.ERCFDiagram container = (er_crows_foot.ERCFDiagram) getLink()
				.eContainer();
		return es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.policies.Er_crows_footBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistERCFRelationship_4001(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected er_crows_foot.ERCFRelationship getLink() {
		return (er_crows_foot.ERCFRelationship) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected er_crows_foot.ERCFEntity getOldSource() {
		return (er_crows_foot.ERCFEntity) oldEnd;
	}

	/**
	 * @generated
	 */
	protected er_crows_foot.ERCFEntity getNewSource() {
		return (er_crows_foot.ERCFEntity) newEnd;
	}

	/**
	 * @generated
	 */
	protected er_crows_foot.ERCFEntity getOldTarget() {
		return (er_crows_foot.ERCFEntity) oldEnd;
	}

	/**
	 * @generated
	 */
	protected er_crows_foot.ERCFEntity getNewTarget() {
		return (er_crows_foot.ERCFEntity) newEnd;
	}
}
