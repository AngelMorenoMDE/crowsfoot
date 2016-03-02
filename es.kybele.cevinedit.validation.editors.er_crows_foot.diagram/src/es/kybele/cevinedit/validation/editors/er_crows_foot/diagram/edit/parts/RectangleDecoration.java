package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;

public class RectangleDecoration extends RectangleFigure implements
		RotatableDecoration {

	protected IMapMode getMapMode()
	{
		return MapModeUtil.getMapMode();
	}
	
	public RectangleDecoration()
	{
		erase();
		FlowLayout layoutThis = new FlowLayout();
		layoutThis.setStretchMinorAxis(false);
		layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

		layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
		layoutThis.setMajorSpacing(5);
		layoutThis.setMinorSpacing(5);
		layoutThis.setHorizontal(false);

		this.setLayoutManager(layoutThis);

		this.setOutline(false);
		this.setFill(true);
		this.setOpaque(true);

		this.setLineWidth(2);
		this.setForegroundColor(ColorConstants.black);
		this.setBackgroundColor(ColorConstants.red);
		this.setPreferredSize(10, 10);
		//this.setBounds(new Rectangle(-5, -5, 10, 10));

		this.setBounds(new Rectangle(-20, -5, 10, 10));
		repaint();
		//this.setSize(10, 6);
		//super.setBounds(new Rectangle(0,0,10,10));
		createContents();
	}
	
	/*public Rectangle getBounds()
	{

		return new Rectangle(-5, -5, 10, 10);
	}*/
	
	protected void createContents()
	{
		
	}
	
	@Override
	public void setReferencePoint(Point p) {
		// TODO Auto-generated method stub

	}

}
