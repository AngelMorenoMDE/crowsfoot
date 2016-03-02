package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class Er_crows_footNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem) {
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem item = (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem) element;
			return es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
