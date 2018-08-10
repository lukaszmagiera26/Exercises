import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TalkingClock clock = new TalkingClock() ;
		clock.start(1000, true);
		JOptionPane.showMessageDialog(null, "zamknac sie ? ");
		System.exit(0);
		
	}
	
	
}
		
		

	
	class TalkingClock {
		
		
		public void start(int interval, boolean beep){
			ActionListener listener = new ActionListener(){
				public void actionPerformed(ActionEvent Event) {
					System.out.println("uwaga bedzie data uwaga " + new Date());
					if (beep) Toolkit.getDefaultToolkit().beep();
					};
			};
			Timer t = new Timer(interval, listener);
			t.start();
			
		}
		
		
	}
	
	
	
	
	
	
	

