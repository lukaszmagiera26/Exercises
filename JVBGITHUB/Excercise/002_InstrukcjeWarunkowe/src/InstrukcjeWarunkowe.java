import java.util.Scanner;

public class InstrukcjeWarunkowe {

	public static void main(String[] args) {
		//pobieramy od uzytkownika jedna liczbe calkowita i sprawdzamy czy jest ona wieksza od 10
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbe calkowita");
		
		int liczba = sc.nextInt();
		System.out.println("LICZBA = " + liczba);
		
		/*
		if(warunek_logiczny)
		{
			instrukcje_wykonywane_kiedy_warunek_jest_prawdziwy
		}
		else
		{
			instrukcje_wykonywanie_kiedy_warunek_jest_falszywy
		}
		*/
		
		if (liczba > 10) //<, >=, <=, == (czy lewa strona rowna prawej stronie), 
			//!= (czy lewa strona rozna od prawej strony)
		{
			System.out.println("LICZBA WIEKSZA OD 10!");
		}
		else
		{
			System.out.println("LICZBA MNIEJSZA LUB ROWNA 10!");
		}
		
		//sprawdzimy czy liczba jest z przedzialu <34, 46)
		if (liczba >= 34 && liczba < 46) //operator && (i logiczne) - caly warunek zachodzi kiedy wszystkie warunki
			//skladowe sa prawdziwe
		{
			System.out.println("LICZBA NALEZY DO PRZEDZIALU <34, 46)");
		}
		else
		{
			System.out.println("LICZBA NIE NALEZY DO PRZEDZIALU");
		}
		
		//sprawdzamy czy podana liczba jest parzysta
		//do tej pory mozemy sie domyslec ze mamy operatory takie jak +, -, *, /
		int a = 10;
		int b = 20;
		int c1 = a + b;
		int c2 = a - b;
		int c3 = a * b;
		int c4 = a / b; //uwaga zeby b nie bylo 0, jest jeszcze jeden problem kiedy dzielisz int przez int
		//masz do czynienia z tzw dzieleniem calkowitoliczbowym czyli 2 / 5 to jest 0 a nie 0.4
		//urywa czesc ulamkowa, kiedy zalezy ci na wyniku po przecinku to stosuj double
		double c5 = a / b; //to ze dasz po lewej stronie double a po prawej dalej masz dwa inty nic nie da
		//bo dzielenie caly czas wykonuje sie na intach i obciecie czesci ulamkowej nastapi juz przy dzielniu
		//jezeli chcesz miec czesc ulamkowa to musisz przynajmniej jeden z dzielnikow albo mioec double
		//albo przerzutowac
		double c6 = (double)a/b; //w tej chwili zmienna a doslownie na jedna linijke staje sie double
		//co pomaga nam wykonac dzielenie z czescia ulamkowa
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		System.out.println("c6 = " + c6);
		
		//jest jeszcze operator typowo dla liczb calkowitych -> % (czytaj modulo)
		//% daje ci wynik dzielenie z reszta
		int c7 = a % 3; //pamietaj ze w a masz 10
		System.out.println("RESZTA Z DZIELENIE LICZBY " + a + " PRZEZ 3 WYNOSI " + c7);
		//operator % pozwala sprawdzac podzielnosc liczb!!!!!
		//sprawdz czy liczba a jest podzielna przez 4
		a = 12; //nie musisz pisac int a , przeciez napisales to przy pierwszym uzyciu zmiennej 
		//kompilator juz wie jaki jest jej typ, wystarczy pisac tylko sam nazwe
		if (a % 4 == 0) //operator == sprawdza czy lewa strona jest rowna prawej
		{
			System.out.println("PODZIELNA PRZEZ 4!");
		}
		
		//gdy chcesz sprawdzic czy liczba x jest parszysta to dajesz x % 2 == 0 a jak nieparzysta
		//to mozesz napisac x % 2 == 1 albo x % 2 != 0 - tutaj sprawdzasz czy reszta z dzielenia x przez 2
		//jest ROZNA OD 0
	}

}
