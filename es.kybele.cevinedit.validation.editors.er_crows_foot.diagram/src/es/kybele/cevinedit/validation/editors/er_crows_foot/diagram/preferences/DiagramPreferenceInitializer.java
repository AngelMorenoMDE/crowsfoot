package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
