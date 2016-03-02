package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Er_crows_footParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser eRCFEntityName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getERCFEntityName_5002Parser() {
		if (eRCFEntityName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { er_crows_foot.Er_crows_footPackage.eINSTANCE
					.getERCFEntity_Name() };
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.parsers.MessageFormatParser parser = new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.parsers.MessageFormatParser(
					features);
			eRCFEntityName_5002Parser = parser;
		}
		return eRCFEntityName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRCFAttributeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getERCFAttributeName_5001Parser() {
		if (eRCFAttributeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { er_crows_foot.Er_crows_footPackage.eINSTANCE
					.getERCFAttribute_Name() };
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.parsers.MessageFormatParser parser = new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.parsers.MessageFormatParser(
					features);
			eRCFAttributeName_5001Parser = parser;
		}
		return eRCFAttributeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRCFRelationshipName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getERCFRelationshipName_6001Parser() {
		if (eRCFRelationshipName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { er_crows_foot.Er_crows_footPackage.eINSTANCE
					.getERCFRelationship_Name() };
			es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.parsers.MessageFormatParser parser = new es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.parsers.MessageFormatParser(
					features);
			eRCFRelationshipName_6001Parser = parser;
		}
		return eRCFRelationshipName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFEntityNameEditPart.VISUAL_ID:
			return getERCFEntityName_5002Parser();
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFAttributeNameEditPart.VISUAL_ID:
			return getERCFAttributeName_5001Parser();
		case es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts.ERCFRelationshipNameEditPart.VISUAL_ID:
			return getERCFRelationshipName_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Er_crows_footVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
