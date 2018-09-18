package imageviewer;

import java.awt.EventQueue;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/**
 * Program do przegl¹dania obrazów.
 * 
 * @version 1.22 2007-05-21
 * @author Cay Horstmann
 */
public class ImageViewer {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new ImageViewerFrame();
				frame.setTitle("ImageViewer");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

/**
 * Ramka z etykiet¹ wyœwietlaj¹ca obraz.
 */
class ImageViewerFrame extends JFrame {

	private JLabel label;
	private JFileChooser chooser;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 400;

	public ImageViewerFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		// U¿ycie etykiety do wyœwietlenia obrazów.
		label = new JLabel();
		add(label);
		// Dodawanie opcji wyboru obrazu.
		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));
		// Pasek menu.
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menu = new JMenu("Plik");
		menuBar.add(menu);
		JMenuItem openItem = new JMenuItem("Otwórz");
		menu.add(openItem);
		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// Wyœwietlenie okna dialogowego wyboru pliku.
				int result = chooser.showOpenDialog(null);
				// Jeœli plik zosta³ wybrany, ustawiamy go jako ikonê etykiety.
				if (result == JFileChooser.APPROVE_OPTION) {
					String name = chooser.getSelectedFile().getPath();
					label.setIcon(new ImageIcon(name));
				}
			}
		});
		JMenuItem exitItem = new JMenuItem("Zakoñcz");
		menu.add(exitItem);
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
	}
}