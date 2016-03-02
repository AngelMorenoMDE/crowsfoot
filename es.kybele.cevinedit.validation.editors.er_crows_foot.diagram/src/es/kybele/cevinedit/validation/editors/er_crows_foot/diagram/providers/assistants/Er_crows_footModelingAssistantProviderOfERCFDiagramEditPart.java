package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Er_crows_footModelingAssistantProviderOfERCFDiagramEditPart
		extends
		es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFEntity_2001);
		return types;
	}

}
