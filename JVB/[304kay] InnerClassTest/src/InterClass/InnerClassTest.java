package InterClass;

import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TalkingClocks clock = new TalkingClocks(1000, true);
		
		clock.start();
		JOptionPane.showMessageDialog(null, "zamknac sobie ? ");
	
		System.exit(0);
		
	}
	}

	
	class TalkingClocks{
		
		private int interval;
		private boolean beep;
		
		
		public  TalkingClocks(int interval, boolean beep){
			this.interval = interval;
			this.beep = beep;
			
		}
		
		
		public void start() {
			ActionListener listener = new TimePrinter();
			Timer t = new Timer(interval, listener);
			t.start();
		}
		
		public class TimePrinter implements ActionListener{
			public void actionPerformed (ActionEvent Event){
				System.out.println("jest godzinka " + new Date());
				if (beep) Toolkit.getDefaultToolkit().beep();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
