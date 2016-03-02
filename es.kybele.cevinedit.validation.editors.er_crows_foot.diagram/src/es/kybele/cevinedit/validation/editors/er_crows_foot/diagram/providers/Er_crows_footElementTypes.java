package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class Er_crows_footElementTypes {

	/**
	 * @generated
	 */
	private Er_crows_footElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ERCFDiagram_1000 = getElementType("es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.ERCFDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERCFEntity_2001 = getElementType("es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.ERCFEntity_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERCFAttribute_3001 = getElementType("es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.ERCFAttribute_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERCFRelationship_4001 = getElementType("es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.ERCFRelationship_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ERCFDiagram_1000,
					er_crows_foot.Er_crows_footPackage.eINSTANCE
							.getERCFDiagram());

			elements.put(ERCFEntity_2001,
					er_crows_foot.Er_crows_footPackage.eINSTANCE
							.getERCFEntity());

			elements.put(ERCFAttribute_3001,
					er_crows_foot.Er_crows_footPackage.eINSTANCE
							.getERCFAttribute());

			elements.put(ERCFRelationship_4001,
					er_crows_foot.Er_crows_footPackage.eINSTANCE
							.getERCFRelationship());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ERCFDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(ERCFEntity_2001);
			KNOWN_ELEMENT_TYPES.add(ERCFAttribute_3001);
			KNOWN_ELEMENT_TYPES.add(ERCFRelationship_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFDiagramEditPart.VISUAL_ID:
			return ERCFDiagram_1000;
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart.VISUAL_ID:
			return ERCFEntity_2001;
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFAttributeEditPart.VISUAL_ID:
			return ERCFAttribute_3001;
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart.VISUAL_ID:
			return ERCFRelationship_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
