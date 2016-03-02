package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.jface.preference.IPreferenceStore;

import es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated NOT
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(Er_crows_footDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
		initDefaults(getPreferenceStore());
	}

	/**
	 * Initializes the default preference values for this preference store.
	 * 
	 * @param preferenceStore
	 *            the preference store
	 *
	 * @generated NOT
	 */
	public static void initDefaults(IPreferenceStore preferenceStore) {
		preferenceStore.setDefault(IPreferenceConstants.PREF_LINE_STYLE,
				Routing.RECTILINEAR);
	}
}
