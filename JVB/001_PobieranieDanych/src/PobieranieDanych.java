import java.util.Scanner;

//import java.util.Scanner; //niektore klasy trzeba jeszcze dolaczyc do programu

public class PobieranieDanych {

	public static void main(String[] args) {
		//kazda aplikacja zaczyna swoje dzialanie od funkcji main i to tutaj bedzie pierwsza linia kodu
		//ktora sie wykona
		
		//jak wypisywac dane na konsoli
		System.out.println("PIERWSZA LINIA"); //tekt do wypisania wypisujemy w ""
		
		//w eclipse istniej duza gama skrotow, najczesciej wykorzystywanym jest ctr + spacja
		//podpowiada on wszystko i wszedzie
		
		//zeby szybko uzyc instrukcje od wypisywania zwpisz syso a potem nacisnij ctrl + spacja 
		//i wybierz sysout
		System.out.println("DRUGA LINIA");
		
		//do przechowania danych zastosuj zmienne czyli fragmenty pamieci ktore potrafia przechowac
		//dane o okreslonym typie
		//jak tworzyc zmienna
		//typ_zmiennej nazwa_zemiennej = wartosc_poczatkowa
		//int - liczby calkowite
		//double - liczby z przecinkiem
		
		int wiek = 10; //zmienna wiek ktora przechowuje wartosc 10 i od tej pory w programie
		//mozesz ta zmienna sie poslugiwac
		
		double waga = 55.6;
		
		//co moge robic ze zmiennymi
		int x = 10;
		int y = 20;
		int wynik1 = x + y;
		int wynik2 = x - y;
		int wynik3 = x * y;
		int wynik4 = x / y; //w tym momencie to jest dzielenie calkowtoliczbowe czyli jak masz 4 / 3
		//to wynikiem jest 1 a nie 1.3333333
		
		//moge zmienna wypisac
		System.out.println("x = " + x + " y = " + y); //jak dasz "x" to ci wypisze x a jak dasz x bez "" to wypisze
		//wartosc zmiennej, mozesz laczyc komunikaty za pomoca +
		
		//jak pobierac dane od usera - napisz sob sca i daj ctrl + spacje a reszte podpowie
		Scanner sc = new Scanner(System.in); //System.in informuje o tym ze pobieramy dane z 
		//klawiatury
		System.out.println("Podaj int");
		int pobrana = sc.nextInt();
		System.out.println("POBRANA INT = " + pobrana);
		
		System.out.println("Podaj liczbe double");
		double dbl = sc.nextDouble(); //pamietaj wprowadzaj liczbe z , a potem przechowa i wyswietli z .
		System.out.println("DBL = " + dbl);
		

	}

}
