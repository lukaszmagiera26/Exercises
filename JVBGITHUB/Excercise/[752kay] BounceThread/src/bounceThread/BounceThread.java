package bounceThread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Wy�wietla animowane pi�ki
 * 
 * @version 1.33 2007-05-17
 * @author Cay Horstmann
 */
public class BounceThread {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new BounceFrame();
				frame.setTitle("BounceThread");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

/**
 * Klasa implementuj�ca interfejs Runnable i tworz�ca animacj� pi�ki
 */

class BallRunnable implements Runnable {
	
	private Ball ball;
	private Component component;
	public static final int STEPS = 1000;
	public static final int DELAY = 5;

	/**
	 * Tworzy obiekt Runnable
	 * 
	 * @param aBall
	 *            pi�ka
	 * @param aComponent
	 *            komponent, w kt�rym odbija si� pi�ka
	 */
	public BallRunnable(Ball aBall, Component aComponent) {
		ball = aBall;
		component = aComponent;
	}

	public void run() {
		try {
			for (int i = 1; i <= STEPS; i++) {
				ball.move(component.getBounds());
				component.repaint();
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException e) {
		}
	}
}



/**
 * Ramka z panelem i przyciskami
 */
class BounceFrame extends JFrame {
	private BallComponent comp;

	/**
	 * Tworzy ramk� z komponentem zawieraj�cym pi�k� i przyciski Start oraz
	 * Zamknij
	 */
	public BounceFrame() {
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
		pack();
	}

	/**
	 * Dodaje przycisk do kontenera
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
	 * Dodaje pi�k� do obszaru roboczego i uruchamia w�tek wykonuj�cy kod
	 * odpowiedzialny za jej odbijanie
	 */
	public void addBall() {
		Ball b = new Ball();
		comp.add(b);
		Runnable r = new BallRunnable(b, comp);
		Thread t = new Thread(r);
		t.start();
	}
}