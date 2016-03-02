package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class Er_crows_footNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem
				&& !isOwnView(((es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorGroup) {
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorGroup group = (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorGroup) element;
			return es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem) {
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem navigatorItem = (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
				.getVisualID(view)) {
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.kybele.es/gmf/er_crows_foot?ERCFDiagram", es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFDiagram_1000); //$NON-NLS-1$
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_crows_foot?ERCFEntity", es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFEntity_2001); //$NON-NLS-1$
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.kybele.es/gmf/er_crows_foot?ERCFAttribute", es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFAttribute_3001); //$NON-NLS-1$
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kybele.es/gmf/er_crows_foot?ERCFRelationship", es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFRelationship_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes
						.isKnownElementType(elementType)) {
			image = es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorGroup) {
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorGroup group = (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem) {
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem navigatorItem = (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.navigator.Er_crows_footNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
				.getVisualID(view)) {
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFDiagramEditPart.VISUAL_ID:
			return getERCFDiagram_1000Text(view);
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart.VISUAL_ID:
			return getERCFEntity_2001Text(view);
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFAttributeEditPart.VISUAL_ID:
			return getERCFAttribute_3001Text(view);
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart.VISUAL_ID:
			return getERCFRelationship_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getERCFDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getERCFEntity_2001Text(View view) {
		IParser parser = es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footParserProvider
				.getParser(
						es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFEntity_2001,
						view.getElement() != null ? view.getElement() : view,
						es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
								.getType(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERCFAttribute_3001Text(View view) {
		IParser parser = es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footParserProvider
				.getParser(
						es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFAttribute_3001,
						view.getElement() != null ? view.getElement() : view,
						es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
								.getType(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERCFRelationship_4001Text(View view) {
		IParser parser = es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footParserProvider
				.getParser(
						es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFRelationship_4001,
						view.getElement() != null ? view.getElement() : view,
						es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
								.getType(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFDiagramEditPart.MODEL_ID
				.equals(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
						.getModelID(view));
	}

}
