package bounce;

import java.awt.*;
import java.awt.event.*;
import java.util.zip.Checksum;

import javax.swing.*;

/**
 * Wy�wietla animowan� pi�k�
 * 
 * @version 1.33 2007-05-17
 * @author Cay Horstmann
 */
public class Bounce {
	public static void main(String[] args) {
		
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				JFrame frame = new BounceFrame();
				frame.setSize(500, 500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

/**
 * Ramka zawieraj�ca komponent pi�ki i przyciski
 */
class BounceFrame extends JFrame {
	private BallComponent comp;
	public static final int STEPS = 1000;
	public static final int DELAY = 10;

	/**
	 * Tworzy ramk� z komponentem zawieraj�cym odbijaj�c� si� pi�k� oraz
	 * przyciskami Start i Zamknij.
	 */
	public BounceFrame() {
		setTitle("Pi�ka");
		comp = new BallComponent();
		add(comp, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		addButton(buttonPanel, "Start", new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				addBall();
			}
		});
		addButton(buttonPanel, "Zamknij", new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		add(buttonPanel, BorderLayout.SOUTH);

	}

	/**
	 * Dodaje przycisk do kontenera.
	 * 
	 * @param c
	 *            kontener
	 * @param title
	 *            tytu� przycisku
	 * @param listener
	 *            s�uchacz akcji przycisku
	 */
	public void addButton(Container c, String title, ActionListener listener) {
		JButton button = new JButton(title);
		c.add(button);
		button.addActionListener(listener);
	}

	/**
	 * Dodaje odbijaj�c� si� pi�k� do panelu i odbija j� 1000 razy
	 */
	public void addBall() {
		try {
			Ball ball = new Ball();
			comp.add(ball);
			for (int i = 1; i <= STEPS; i++) {
				ball.move(comp.getBounds());
				comp.paint(comp.getGraphics());
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException e) {
		}
	}
}