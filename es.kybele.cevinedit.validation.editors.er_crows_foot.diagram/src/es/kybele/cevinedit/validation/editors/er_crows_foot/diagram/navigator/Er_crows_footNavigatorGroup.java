package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator;

import java.util.Collection;
import java.util.LinkedList;

/**
 * @generated
 */
public class Er_crows_footNavigatorGroup
		extends
		es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footAbstractNavigatorItem {

	/**
	 * @generated
	 */
	private String myGroupName;

	/**
	 * @generated
	 */
	private String myIcon;

	/**
	 * @generated
	 */
	private Collection myChildren = new LinkedList();

	/**
	 * @generated
	 */
	Er_crows_footNavigatorGroup(String groupName, String icon, Object parent) {
		super(parent);
		myGroupName = groupName;
		myIcon = icon;
	}

	/**
	 * @generated
	 */
	public String getGroupName() {
		return myGroupName;
	}

	/**
	 * @generated
	 */
	public String getIcon() {
		return myIcon;
	}

	/**
	 * @generated
	 */
	public Object[] getChildren() {
		return myChildren.toArray();
	}

	/**
	 * @generated
	 */
	public void addChildren(Collection children) {
		myChildren.addAll(children);
	}

	/**
	 * @generated
	 */
	public void addChild(Object child) {
		myChildren.add(child);
	}

	/**
	 * @generated
	 */
	public boolean isEmpty() {
		return myChildren.size() == 0;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorGroup) {
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorGroup anotherGroup = (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorGroup) obj;
			if (getGroupName().equals(anotherGroup.getGroupName())) {
				return getParent().equals(anotherGroup.getParent());
			}
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return getGroupName().hashCode();
	}

}
