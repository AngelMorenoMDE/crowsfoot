package es.kybele.cevinedit.validation.editors.er_crows_foot.diagram.edit.parts;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;


public class CircleDecoration extends Ellipse implements RotatableDecoration {

	
	private int myRadius = 3;
	private Point myCenter = new Point();
	
	public void	setRadius(int radius) 
	{
		erase();
		myRadius = Math.abs(radius);
		bounds = null;
		repaint();
	}
	public void	setLineWidth(int width) 
	{
		super.setLineWidth(width);
	}
	public Rectangle getBounds() {
		if (bounds == null) 
		{
			int
			diameter = myRadius * 2;
			bounds = new Rectangle(myCenter.x - myRadius, myCenter.y - myRadius, diameter, diameter);
			bounds.expand(lineWidth / 2, lineWidth / 2);
		}
		return bounds;
	}
	
	public void	setLocation(Point p) {
		if (myCenter.equals(p)) {
			return;
		}
		myCenter.setLocation(p);
		bounds = null;
	}
	
	public void	setReferencePoint(Point p) {
	// ignore, does not make sense to rotate circle
	}
	

}
