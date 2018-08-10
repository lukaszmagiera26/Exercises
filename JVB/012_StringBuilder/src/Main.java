
public class Main {

	public static void main(String[] args) {
		String n = "ala ma kota";
		StringBuilder sb = new StringBuilder(n); //klasa zawiera w sobie napis, ale tylko ten jeden napis jest
		//modyfikowany przez co dziala szybciej
		
		for(int i = 0; i < sb.length(); ++i)
		{
			System.out.println(sb.charAt(i));
			//stringh builder umozliwai modyfikowanie pojedynczego znaku
			sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
		}
		
		System.out.println(sb.toString()); //toString wyluskuje ze string buildera napis
		
		sb.delete(2, 4); //usuwa z napisu znaki z pozycji od 2 do 3
		sb.deleteCharAt(3); //usuwa znak na pozycji 3
		sb.insert(3,  "ala"); //wstawiam "ala" na pozycje 3
		sb.replace(1, 5, "koksik"); //slowo "koksi" zastapi ci znaki z pozycji od 1 do 4
		
		//odwracanie napisu - sprawdzamy czy slow jest palindromem - czytane od konca daje to samo slowo
		String wyraz = "kajak";
		StringBuilder odwrocony = new StringBuilder(wyraz);
		odwrocony.reverse(); //odwracamy litery w napisie
		if (wyraz.equals(odwrocony.toString())) //sprawdzam czy wyraz i jego odwrocona postac sa takie same
		{
			System.out.println("PALINDROM");
		}
		
		StringBuilder sb2 = new StringBuilder(n);
		System.out.println(sb);
		for(int i = 0; i < 1; ++i)
		{
			sb.replace(0, 1, sb2.substring(0, 1));
		}
		System.out.println("END");
		System.out.println(sb);
		

	}

}
