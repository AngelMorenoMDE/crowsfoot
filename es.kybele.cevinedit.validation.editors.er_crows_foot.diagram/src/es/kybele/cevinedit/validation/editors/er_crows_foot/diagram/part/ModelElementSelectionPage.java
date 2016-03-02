package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part;

import org.eclipse.gmf.tooling.runtime.part.DefaultModelElementSelectionPage;

/**
 * Wizard page that allows to select element from model.
 * @generated
 */
public class ModelElementSelectionPage extends DefaultModelElementSelectionPage {

	/**
	 * @generated
	 */
	public ModelElementSelectionPage(String pageName) {
		super(
				es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory(),
				pageName);
	}

	/**
	 * Override to provide custom model element description.
	 * @generated
	 */
	protected String getSelectionTitle() {
		return es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Messages.ModelElementSelectionPageMessage;
	}

}
