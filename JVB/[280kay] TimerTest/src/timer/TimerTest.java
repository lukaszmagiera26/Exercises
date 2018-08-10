package timer;

import java.awt.event.ActionListener;
import java.util.Date;


import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;


public class TimerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(5000, listener);
		t.start();
		JOptionPane.showMessageDialog(null, "Zamkanac program. koniec szopki");
		System.exit(0);
	}
}
		
		class TimePrinter implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				System.out.println("Kiedy uslyszysz dzwiek bedzie godzina " + new Date() );
				Toolkit.getDefaultToolkit().beep();
		
		
		
		
		
	}

}
		
		
		
		
		
		
