package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;

import er_crows_foot.ERCFRelationshipCardinalityTypes;

public class ERCFPolylineDecorationFactory {

	public static RotatableDecoration getDecoration(IMapMode mapMode, int type)
	{
		PolylineDecoration decoration = new PolylineDecoration(); 
		PointList pl = new PointList();
		switch(type)
		{
			case ERCFRelationshipCardinalityTypes.ZERO_OR_ONE_VALUE: 
				decoration.setLineWidth(2);
				decoration.setForegroundColor(ColorConstants.black);
				pl.addPoint(mapMode.DPtoLP(-4), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-4), mapMode.DPtoLP(-1));
				pl.addPoint(mapMode.DPtoLP(-3), mapMode.DPtoLP(-2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(-1));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-1), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-1), mapMode.DPtoLP(-2));
				pl.addPoint(mapMode.DPtoLP(-1), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-1), mapMode.DPtoLP(2));
				pl.addPoint(mapMode.DPtoLP(-1), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(1));
				pl.addPoint(mapMode.DPtoLP(-3), mapMode.DPtoLP(2));
				pl.addPoint(mapMode.DPtoLP(-4), mapMode.DPtoLP(1));
				pl.addPoint(mapMode.DPtoLP(-4), mapMode.DPtoLP(0));
				decoration.setTemplate(pl);
				decoration.setScale(mapMode.DPtoLP(7), mapMode.DPtoLP(3));			
				break;
				
			case ERCFRelationshipCardinalityTypes.ZERO_OR_MANY_VALUE: 
				decoration.setLineWidth(2);
				decoration.setForegroundColor(ColorConstants.black);
				pl.addPoint(mapMode.DPtoLP(-4), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-4), mapMode.DPtoLP(-1));
				pl.addPoint(mapMode.DPtoLP(-3), mapMode.DPtoLP(-2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(-1));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(0), mapMode.DPtoLP(-2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(0), mapMode.DPtoLP(2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(1));
				pl.addPoint(mapMode.DPtoLP(-3), mapMode.DPtoLP(2));
				pl.addPoint(mapMode.DPtoLP(-4), mapMode.DPtoLP(1));
				pl.addPoint(mapMode.DPtoLP(-4), mapMode.DPtoLP(0));
				decoration.setTemplate(pl);
				decoration.setScale(mapMode.DPtoLP(7), mapMode.DPtoLP(3));			
				break;			
				
			case ERCFRelationshipCardinalityTypes.ONLY_ONE_VALUE: 
				decoration.setLineWidth(2);
				decoration.setForegroundColor(ColorConstants.black);
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(-2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-3), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-3), mapMode.DPtoLP(-2));
				pl.addPoint(mapMode.DPtoLP(-3), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-3), mapMode.DPtoLP(2));
				pl.addPoint(mapMode.DPtoLP(-3), mapMode.DPtoLP(0));
				decoration.setTemplate(pl);
				decoration.setScale(mapMode.DPtoLP(7), mapMode.DPtoLP(3));			
				break;			
				
			case ERCFRelationshipCardinalityTypes.ONE_VALUE:
				decoration.setLineWidth(3);
				decoration.setForegroundColor(ColorConstants.black);
				decoration.setBackgroundColor(ColorConstants.black);
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(-2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				decoration.setTemplate(pl);
				decoration.setScale(mapMode.DPtoLP(7), mapMode.DPtoLP(3));
				break;
				
		
			case ERCFRelationshipCardinalityTypes.ONE_OR_MANY_VALUE: 
				decoration.setLineWidth(2);
				decoration.setForegroundColor(ColorConstants.black);
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(-2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(0), mapMode.DPtoLP(-2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(0), mapMode.DPtoLP(2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				decoration.setTemplate(pl);
				decoration.setScale(mapMode.DPtoLP(7), mapMode.DPtoLP(3));
				break;
	
				
			case ERCFRelationshipCardinalityTypes.MANY_VALUE: 
	
				decoration.setLineWidth(2);
				decoration.setForegroundColor(ColorConstants.black);
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(0), mapMode.DPtoLP(-2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				pl.addPoint(mapMode.DPtoLP(0), mapMode.DPtoLP(2));
				pl.addPoint(mapMode.DPtoLP(-2), mapMode.DPtoLP(0));
				decoration.setTemplate(pl);
				decoration.setScale(mapMode.DPtoLP(7), mapMode.DPtoLP(3));			
				break;					
			
		}
		
		return decoration;
	}
	
}
