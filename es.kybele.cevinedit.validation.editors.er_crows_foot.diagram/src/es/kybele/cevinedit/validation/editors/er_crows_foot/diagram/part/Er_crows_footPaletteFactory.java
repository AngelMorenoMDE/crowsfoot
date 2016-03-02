package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class Er_crows_footPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createEr_crows_foot1Group());
	}

	/**
	 * Creates "er_crows_foot" palette tool group
	 * @generated
	 */
	private PaletteContainer createEr_crows_foot1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Messages.Er_crows_foot1Group_title);
		paletteContainer.setId("createEr_crows_foot1Group"); //$NON-NLS-1$
		paletteContainer.add(createERCFEntity1CreationTool());
		paletteContainer.add(createERCFAttribute2CreationTool());
		paletteContainer.add(createERCFRelationship3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERCFEntity1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Messages.ERCFEntity1CreationTool_title,
				es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Messages.ERCFEntity1CreationTool_desc,
				Collections
						.singletonList(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFEntity_2001));
		entry.setId("createERCFEntity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes
				.getImageDescriptor(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFEntity_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERCFAttribute2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Messages.ERCFAttribute2CreationTool_title,
				es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Messages.ERCFAttribute2CreationTool_desc,
				Collections
						.singletonList(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFAttribute_3001));
		entry.setId("createERCFAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes
				.getImageDescriptor(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFAttribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERCFRelationship3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Messages.ERCFRelationship3CreationTool_title,
				es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.part.Messages.ERCFRelationship3CreationTool_desc,
				Collections
						.singletonList(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFRelationship_4001));
		entry.setId("createERCFRelationship3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes
				.getImageDescriptor(es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.providers.Er_crows_footElementTypes.ERCFRelationship_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
