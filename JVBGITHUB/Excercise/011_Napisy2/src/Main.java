import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//napis w java jest niemodyfikowalny!
		
		/*
		String n = "ala";
		n += "k";
		System.out.println(n);
		
		//co z tego ze napis jest niemodyfikowalny jak i tak koniec koncow
		//dostaje w n nowy napis i moge z niego korzystac
		//nalezy unikac napisow do operowania na duzej ilosc znakow na zasadzie ze cos wstawiamy, usuwamy
		//itd
		
		for (int i = 0; i < 1000000; i++) {
			n += "k";
			
		}
		System.out.println("END");
		
		*/
		//porownywanie dwoch napisow
		String s1 = "adam";
		String s2 = "adam";
		String s3 = new String("adam"); //tworzymy nowy napis za pomoca new
		
		if (s1 == s3) //operator == sprawdza ale czy zmienne s1 i s2 pokazuja na ten sam adres
			//a nie patrzy na zawartosc napisu
		{
			System.out.println("napisy rowne");
		}
		
		//napisy porownuj zawsze z pomoca equals lub compareTo
		//one porownuja zawartosc
		if (s1.equals(s3)) //jak napisy sa rowne pod katem zawartosci  to true a jak nie to false
		{
			System.out.println("ROWNE 1");
		}
		
		//compareTo jest bardziej rozbudowany
		//kiedy napis po lewej jest mniejszy to zwraca <0
		//kiedy npais po lewej jest wiekszy to zwraca >0
		//kiedy napisy sa rowne to zwraca 0
		
		//ktory napis jest mniejszy ala czy adama
		if (s1.compareTo(s2) < 0)
		{
			System.out.println("Napis po lewej jest mniejszy od napisu po prawej");
		}
		else if (s1.compareTo(s2) > 0)
		{
			System.out.println("Napis po lewej jest wiekszy od napisu po prawej");
		}
		else
		{
			System.out.println("Napisy sa rowne");
		}
		
		//if (s1.equalsIgnoreCase(s3)) //porownywanie z pominieciem wielkosci znakow
		//if(s1.compareToIgnoreCase(str)) //porownywanie z pominieciem wioelkosci
		
		String n1 = "   dzisiaj jest piatek    ";
		
		
		//if (n1.startsWith("dzis")) //sprawdzam czy napis zaczyna sie od dzis
		//if(n1.endsWith("tek")) //sprawdzam czy napis konczy sie na tek
		String bezSpacji = n1.trim(); //ucina spacje sprzed i zza napisu
		System.out.println(bezSpacji+"o");
		
		String podNapis = n1.substring(2, 5); //wycinam literki od pozycji 2 do pozycji 4
		System.out.println(podNapis);
		
		if(n1.contains("zi"))
		{
			System.out.println("Sprawdza czy napis zawiuera w sobie zi");
		}
		
		int szukany1 = n1.indexOf('j');
		System.out.println(szukany1); //znajduje pierwsze wystapienie literki w napisie, jak nie ma to zwraca <0
		
		//n1.lastIndexOf("ala"); //mozesz wyszukiwac wystapienia rowniez calych napisow, a ta fukca 
		//zwraca ostatnie takie wystapienie
		
		/*n1 = ""; //PUSTY NAPIS
		if(n1.isEmpty())
		{
			System.out.println("Pusty");
		}*/
		
		String n3 = n1.toUpperCase(); //zamienia wszystkie litery na duze
		String n4 = n1.toLowerCase(); //zamienia wszystkie litery na male
		
		//rozbijanie napisu na wyrazy
		String n5 = "ala ma kota i co z tego";
		String[] tab1 = n5.split(" "); //rozbijasz po spacji
		System.out.println(Arrays.toString(tab1));
		
		String n6 = "ala,ma;kota-i co z tego";
		String[] tab2 = n6.split("[,;-]");
		System.out.println(Arrays.toString(tab2));
	}

}
