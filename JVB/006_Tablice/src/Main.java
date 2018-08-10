import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//czym jest tablica?
		//tablica pozwala nam przechowywac elementy tego samego rodzaju
		int[] tab = new int[10]; //tak oto mozesz w jednym miejscu przechowac 10 elementow typu int
		
		//teraz nauczymy sie odwolywac do elementow tablicy
		//elementy tablicy indeksujmey czyli w [] podajemy numer elementu (zaczynamy od 0!!!!!)
		tab[0] = 12; //pierwszy element tablicy ma wartosc 12
		tab[1] = 43;
		tab[9] = 51;
		//jezeli tablica ma 10 elementow to ostatni indeks to 9, mozesz go rowniez zapisac bardziej elastycznie
		tab[tab.length-1] = 22; //tab.length to rozmiar tablicy
		
		//laczyy tablice z petlami
		for (int i = 0; i < tab.length; i++) {
			System.out.println(i + "->" + tab[i]);
		}
		
		//losujemy do tablicy eleemnty
		Random rnd = new Random();
		for (int i = 0; i < tab.length; i++) {
			tab[i] = rnd.nextInt(32);
		}
		
		//pobieramy od uzytkownika
		/*Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tab.length; i++) {
			tab[i] = sc.nextInt();
		}*/
		
		//wypisywanie elementow tablicy
		for (int i = 0; i < tab.length; i++) {
			System.out.println("->" + tab[i]);
		}
		
		System.out.println("======================1======================");
		//wypiszmy eleemnty ktore sa z przedzialu <a,b>
		int a = 3;
		int b = 8;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] >= a && tab[i] <= b)
			{
				System.out.println(tab[i]);
			}
		}
		
		System.out.println("======================2======================");
		//oblicz ile jest elementow ktore maja parzysty indeks i wartosc podzielna przez 3
		int licznik = 0;
		//i - indeks elementu czyli pozycja na ktorej sie znajduje
		//tab[i] - to wartosc elementu
		for (int i = 0; i < tab.length; i++) {
			if (i % 2 == 0 && tab[i] % 3 == 0)
			{
				licznik++;
			}
		}
		System.out.println("LICZNIK = " + licznik);
		System.out.println("======================3======================");
		//sumowanie eleemntow tablicy
		int s = 0;
		for (int i = 0; i < tab.length; i++) {
			s += tab[i]; //s = s + tab[i]
		}
		//a treaz liczymy srednia eleemntow
		double sr = (double)s / tab.length;
		System.out.println("SREDNIA = " + sr);
		
		System.out.println("======================4======================");
		int iloczyn = 1;
		for (int i = 0; i < tab.length; i++) {
			iloczyn *= tab[i];
		}
		System.out.println("ILOCZYN = " + iloczyn);
		System.out.println("======================5======================");
		//modyfikujemy eleemnty tablicy - parzyste elementy zwiekszamy o 1 a nieparzyste zmniejszamy o 1
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 0)
			{
				tab[i]++;
			}
			else
			{
				tab[i]--;
			}
		}
		for (int i = 0; i < tab.length; i++) {
			System.out.println("EL NR " + i + " MA WARTOSC" + tab[i]);
		}
		System.out.println("======================6======================");
		//chcialbym sprawdzi czy elementy tablicy tworza ciag rosnacy
		int[] tab2 = new int[]{1, 3, 5, 6, 7, 8, 9};
		boolean czyCiagRosnacy = true; //zmienna opisuje czy ciag jest rosnacy
		for (int i = 0; i < tab2.length - 1; i++) {
			if (tab2[i+1] <= tab2[i])
			{
				czyCiagRosnacy = false;
				break;
			}
		}
		
		if (czyCiagRosnacy == true) 
		{
			System.out.println("CIAG ROSNACY");
		}
	}

}
