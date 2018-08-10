package bounceThread;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * Komponent rysuj¹cy pi³ki
 * 
 * @version 1.34 2012-01-26
 * @author Cay Horstmann
 */
public class BallComponent extends JPanel {
	private static final int DEFAULT_WIDTH = 450;
	private static final int DEFAULT_HEIGHT = 350;

	private java.util.List<Ball> balls = new ArrayList<>();
	

	/**
	 * Dodaje pi³kê do komponentu
	 * 
	 * @param b
	 *            pi³ka, która ma zostaæ dodana
	 */
	public void add(Ball b) {
		balls.add(b);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Czyszczenie t³a
		Graphics2D g2 =  (Graphics2D) g;
		for (Ball b : balls) {
			g2.fill(b.getShape());
		
			
			}
	}

	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}

