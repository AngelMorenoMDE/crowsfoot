package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Er_crows_footDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footNodeDescriptor> getSemanticChildren(
			View view) {
		switch (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
				.getVisualID(view)) {
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFDiagramEditPart.VISUAL_ID:
			return getERCFDiagram_1000SemanticChildren(view);
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityERCFEntityAttributesCompartmentEditPart.VISUAL_ID:
			return getERCFEntityERCFEntityAttributesCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footNodeDescriptor> getERCFDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		er_crows_foot.ERCFDiagram modelElement = (er_crows_foot.ERCFDiagram) view
				.getElement();
		LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footNodeDescriptor> result = new LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEntities().iterator(); it
				.hasNext();) {
			er_crows_foot.ERCFEntity childElement = (er_crows_foot.ERCFEntity) it
					.next();
			int visualID = es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart.VISUAL_ID) {
				result.add(new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footNodeDescriptor> getERCFEntityERCFEntityAttributesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		er_crows_foot.ERCFEntity modelElement = (er_crows_foot.ERCFEntity) containerView
				.getElement();
		LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footNodeDescriptor> result = new LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			er_crows_foot.ERCFAttribute childElement = (er_crows_foot.ERCFAttribute) it
					.next();
			int visualID = es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFAttributeEditPart.VISUAL_ID) {
				result.add(new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getContainedLinks(
			View view) {
		switch (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
				.getVisualID(view)) {
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFDiagramEditPart.VISUAL_ID:
			return getERCFDiagram_1000ContainedLinks(view);
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart.VISUAL_ID:
			return getERCFEntity_2001ContainedLinks(view);
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFAttributeEditPart.VISUAL_ID:
			return getERCFAttribute_3001ContainedLinks(view);
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart.VISUAL_ID:
			return getERCFRelationship_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getIncomingLinks(
			View view) {
		switch (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
				.getVisualID(view)) {
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart.VISUAL_ID:
			return getERCFEntity_2001IncomingLinks(view);
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFAttributeEditPart.VISUAL_ID:
			return getERCFAttribute_3001IncomingLinks(view);
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart.VISUAL_ID:
			return getERCFRelationship_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
				.getVisualID(view)) {
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityEditPart.VISUAL_ID:
			return getERCFEntity_2001OutgoingLinks(view);
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFAttributeEditPart.VISUAL_ID:
			return getERCFAttribute_3001OutgoingLinks(view);
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart.VISUAL_ID:
			return getERCFRelationship_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getERCFDiagram_1000ContainedLinks(
			View view) {
		er_crows_foot.ERCFDiagram modelElement = (er_crows_foot.ERCFDiagram) view
				.getElement();
		LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> result = new LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ERCFRelationship_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getERCFEntity_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getERCFAttribute_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getERCFRelationship_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getERCFEntity_2001IncomingLinks(
			View view) {
		er_crows_foot.ERCFEntity modelElement = (er_crows_foot.ERCFEntity) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> result = new LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERCFRelationship_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getERCFAttribute_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getERCFRelationship_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getERCFEntity_2001OutgoingLinks(
			View view) {
		er_crows_foot.ERCFEntity modelElement = (er_crows_foot.ERCFEntity) view
				.getElement();
		LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> result = new LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ERCFRelationship_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getERCFAttribute_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getERCFRelationship_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getContainedTypeModelFacetLinks_ERCFRelationship_4001(
			er_crows_foot.ERCFDiagram container) {
		LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> result = new LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_crows_foot.ERCFRelationship) {
				continue;
			}
			er_crows_foot.ERCFRelationship link = (er_crows_foot.ERCFRelationship) linkObject;
			if (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart.VISUAL_ID != es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_crows_foot.ERCFEntity dst = link.getTarget();
			er_crows_foot.ERCFEntity src = link.getSource();
			result.add(new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor(
					src,
					dst,
					link,
					es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFRelationship_4001,
					es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getIncomingTypeModelFacetLinks_ERCFRelationship_4001(
			er_crows_foot.ERCFEntity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> result = new LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != er_crows_foot.Er_crows_footPackage.eINSTANCE
					.getERCFRelationship_Target()
					|| false == setting.getEObject() instanceof er_crows_foot.ERCFRelationship) {
				continue;
			}
			er_crows_foot.ERCFRelationship link = (er_crows_foot.ERCFRelationship) setting
					.getEObject();
			if (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart.VISUAL_ID != es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_crows_foot.ERCFEntity src = link.getSource();
			result.add(new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor(
					src,
					target,
					link,
					es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFRelationship_4001,
					es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getOutgoingTypeModelFacetLinks_ERCFRelationship_4001(
			er_crows_foot.ERCFEntity source) {
		er_crows_foot.ERCFDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof er_crows_foot.ERCFDiagram) {
				container = (er_crows_foot.ERCFDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> result = new LinkedList<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_crows_foot.ERCFRelationship) {
				continue;
			}
			er_crows_foot.ERCFRelationship link = (er_crows_foot.ERCFRelationship) linkObject;
			if (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart.VISUAL_ID != es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_crows_foot.ERCFEntity dst = link.getTarget();
			er_crows_foot.ERCFEntity src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor(
					src,
					dst,
					link,
					es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFRelationship_4001,
					es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footNodeDescriptor> getSemanticChildren(
				View view) {
			return Er_crows_footDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getContainedLinks(
				View view) {
			return Er_crows_footDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getIncomingLinks(
				View view) {
			return Er_crows_footDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footLinkDescriptor> getOutgoingLinks(
				View view) {
			return Er_crows_footDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
