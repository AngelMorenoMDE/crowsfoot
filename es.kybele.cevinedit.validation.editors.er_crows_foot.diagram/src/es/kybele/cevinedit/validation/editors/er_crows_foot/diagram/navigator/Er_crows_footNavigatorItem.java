package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Er_crows_footNavigatorItem
		extends
		es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					public Object getAdapter(Object adaptableObject,
							Class adapterType) {
						if (adaptableObject instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem
								&& (adapterType == View.class || adapterType == EObject.class)) {
							return ((es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem) adaptableObject)
									.getView();
						}
						return null;
					}

					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public Er_crows_footNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(EcoreUtil
							.getURI(((es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem) obj)
									.getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
