import java.util.Arrays;
import java.util.Date;


import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] planets = new String[]{"Merkury", "Wenus", "Merkury", "Ziemia", "Uran", "Neptun"};
		System.out.println("Planety ktore zapisalem ");
		System.out.println(Arrays.toString(planets));
		Arrays.sort(planets);
		System.out.println("posortowane ladnie planety to " + Arrays.toString(planets));
		System.out.println("posortowane planetki ale pood wzgledem dlugosci wyrazu");
		Arrays.sort( planets, (first, second) -> first.length() - second.length() );
		System.out.println(Arrays.toString(planets));
		
		
		Timer t = new Timer(1000, event ->
		System.out.println("jest godzina " + new Date() ));
		
		t.start();
		
		JOptionPane. showMessageDialog(null, "wylacz to szalenstwo ");
		System.exit(0);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
