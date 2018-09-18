package bounce;

import java.awt.geom.*;

/**
 * Pi�ka, kt�ra porusza si� i odbija od kraw�dzi prostok�ta
 * 
 * @version 1.33 2007-05-17
 * @author Cay Horstmann
 */
public class Ball {
	private static final int XSIZE = 35;
	private static final int YSIZE = 350;
	private double x = 0;
	private double y = 0;
	private double dx = 1;
	private double dy = 1;

	/**
	 * Przesuwa pi�k� do nast�pnego po�o�enia, odwracaj�c kierunek, je�li pi�ka
	 * uderzy w kraw�d�
	 */

	public void move(Rectangle2D bounds) {
		x += dx;
		y += dy;
		
		if (x < bounds.getMinX()) {
			x = bounds.getMinX();
			dx = -dx;
			
		}
		if (x + XSIZE >= bounds.getMaxX()) {
			x = bounds.getMaxX() - XSIZE;
			dx = -dx;
		}
		if (y < bounds.getMinY()) {
			y = bounds.getMinY();
			dy = -dy;
		}
		if (y + YSIZE >= bounds.getMaxY()) {
			y = bounds.getMaxY() - YSIZE;
			dy = -dy;
		}
	}


	public Ellipse2D getShape(){
		return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
		
	}
}