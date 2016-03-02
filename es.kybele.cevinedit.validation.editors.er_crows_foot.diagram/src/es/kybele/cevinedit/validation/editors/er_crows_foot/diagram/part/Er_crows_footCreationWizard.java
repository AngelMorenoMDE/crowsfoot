package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class Er_crows_footCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Messages.Er_crows_footCreationWizardTitle);
		setDefaultPageImageDescriptor(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewEr_crows_footWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footCreationWizardPage(
				"DiagramModelFile", getSelection(), "ercf"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Messages.Er_crows_footCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Messages.Er_crows_footCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Messages.Er_crows_footCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Messages.Er_crows_footCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
