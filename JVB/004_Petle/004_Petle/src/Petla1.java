import java.util.Random;
import java.util.Scanner;

public class Petla1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		/*
		//------------------------------------------------------------------
		//zad1
		//wylosuj liczbe z przedzialu <0,100>, nastepnie user zgaduje jaka to liczba 
		//czyli podaje ja dopoki nie trafi
		
		int los = rnd.nextInt(101);
		
		
		System.out.println("Podaj liczbe");
		int x = sc.nextInt();
		
		//while(warunek)
		//{
		//	wykonuje_gdy_warunek_jest_prawdziwy
		//}
		
		while(x != los) //petla
		{
			if (x > los)
			{
				System.out.println("Liczba ma byc mniejsza");
			}
			else if (x < los)
			{
				System.out.println("Liczba ma byc wieksza");
			}
			System.out.println("Podaj ponownie liczbe");
			x = sc.nextInt();
		}
		*/
		
		/*
		//------------------------------------------------------------------
		//zad2
		//pobieraj od usera dwie liczby dopoki pierwsza nie bedzie wieksza od drugiej o conajmniej 5
		System.out.println("Podaj pierwsza liczbe");
		int a = sc.nextInt();
		System.out.println("Podaj druga liczbe");
		int b = sc.nextInt();
		while(a < (b + 5))
		{
			System.out.println("ZLE");
			System.out.println("Podaj pierwsza liczbe");
			a = sc.nextInt();
			System.out.println("Podaj druga liczbe");
			b = sc.nextInt();
		}
		
		//zauwaz ze petla while najpierw sprawdza warunek a potem dopiero ewentualnie wykonuje czynnosci
		//moze byc tak ze petla while nie wykona sie ani razu, jezeli juz przy pierwszym sprawdzaniu bedzie
		//miec warunek falszywy
		*/
		
		/*
		//--------------------------------------------------------------------
		//czas na petle do while
		//petla do while ma ta sama zasade dzialania czyli wykonuje sie dopoki 
		//ma spelniony warunek, jednak w tej petli najpierw wykonasz instrukcje
		//a pozniej sprawdzisz warunek
		
		//zad3
		//pobieraj od usera dwie liczby dopoki ich suma ne bedzie parzysta
		int a, b;
		
		//najpierw wchodzi do petli i wykonuje instrukcje a pozniej dopiero sprawdza warunek
		//ta petla zawsze wykona sie co najmniej jeden raz
		do
		{
			System.out.println("Podaj pierwsza liczbe");
			a = sc.nextInt();
			System.out.println("Podaj druga liczbe");
			b = sc.nextInt();
		}
		while((a + b) % 2 != 0);
		*/
		
		/*
		//---------------------------------------------------------------------
		//petla for - o ile petla while i do while ma warunki ktore sprawiaja ze tak naprawde nie wiemy
		//kiedy sie petla skonczy, o tyle for jest petla ktora najczesciej jest wykonywana 
		//okreslona ilosc razy - czesto bedziemy jej uzywac przy tablicach
		
		//petla for sklada sie w naglowku z trzech elementow
		//pierwsza czesc naglowka to INICJALIZACJA ZMIENNEJ NAZYWANEJ POTOCZNIE LICZNIKIEM PETLI
		//ta czesc wykona sie tylko jeden raz i pozniej juz petla do niej nie wraca
		
		//czesc druga czyli i < 10 to WARUNEK PETLI, dopoki jest on spelniony petla wykona sie ponownie

		//czesc trzecia czyli i++ to MODYFIKACJA LICZNIKA PETLI
		//w tym przypadku mam i++ jest to zwiekszenie wartosci licznika o 1
		//ale mozesz pisac np i += 2, i -= 3 itd
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
		
		
		//zad4
		//wyznacz wszystkie liczby parzyste i podzielne przez 5 z przedzialu <4, 123>
		System.out.println("---------------------------------------------");
		for (int i = 4; i <= 123; i++)
		{
			if (i % 2 == 0 && i % 5 == 0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("---------------------------------------------");
		//2 sposob
		for(int i = 10; i <= 123; i += 10)
		{
			System.out.println(i);
		}

		//zad5
		//oblicz sume tych liczb z przedzialu <3, 120> ktore maja nieparzysta cyfra jednosci a przy
		//dzieleniu przez 5 ich reszta jest wieksza niz przy dzieleniu przez 3
		int suma = 0; //wprowadzamy zmienna suma, ktora bedzie w kazdym obiegu powiekszana o liczbe
		//ktora bedziesz chcial do niej dodawac
		for (int i = 3; i <= 120; i++)
		{
			if ((i % 10) % 2 == 0 && (i % 5 > i % 3))
			{
				suma += i;
			}
		}
		
		System.out.println("SUMA = " + suma);
		*/
		
		//-----------------------------------------------------------------------------
		//petla nieskonczona
		/*
		while(true)
		{
			System.out.println("WHILE NIESKONCZONY");
		}
		*/
		
		/*
		do
		{
			System.out.println("DO WHILE NIESKONCZONY");
		}while(true);
		*/
		
		/*
		for(;;)
		{
			System.out.println("FOR NIESKONCZONY");
		}
		*/
		
		//przerywanie petli za pomoca break
		System.out.println("Podaj liczbe");
		int x = sc.nextInt();
		
		while (true)
		{
			if (x % 2 == 0) //kiedy liczba bedzie parzysta to przeriwesz petle
			{
				break; //przerywa petle
			}
			System.out.println("Podaj liczbe");
			x = sc.nextInt();
		}
	}

}

//zad1
//pobieraj od usera dwie liczby a i b dopoki a nie bedzie mniejse od b
//nastepnie losuj dwie liczby x i y z przedzialu <a,b> dopoki x nie bedzie mnieszy od y
//nastepnie oblicz sume wszystkich liczb z przedzialu <x,y>

//zad2
//pobieraj od usera liczby a i b dopoki a nie bedzie co najmniej dwa razy mniejsze od b
//nastepnie losuj liczbe z przedzialu <a,b> dopoki nie bdzie ona podzielna przez 5
//zlicz ile razy musiales losowac liczbe zanim trafiles na podzielna przez 5

//zad3
//pobierz od usera liczbe a, a nastepnie wypisz wszystkie potegi 3 ktore sa mniejsze lub rowne podanej liczbie

//zad4
//pobierz od usera trzy liczby a,b,c typu double i oblicz ich srednia, nastepnie losuj liczbe z przedzialu
//<a,b> dopoki jej wartosc nie bedzie roznila sie od wyliczonej sredniej o mniej niz 2

//zad5
//pobieraj od usera dwie liczby typu double - bokiprostokata dopoki dlugosc przekatnej tego
//prostokata nie bedzie wieksza od jego pola

//zad6
//pobieraj od usera trzy liczby a,b,c tak dlugo az nie utworza ciagu rosnacego czyli a < b < c

//zad7
//pobieraj od usera trzy liczby tak dlugos az nie utworza one dodatniego ciagu arytmeycznego czyli
//roznica pomiedzy tymi liczbami ma byc taka sama czyli a, b = a + r, c = a + 2r, gdzie r to roznica

//zad8
//losuj kolejne liczby a,b,c z przedzialu <0,150> tak dlugo az nie zajdzie warunek a < b < c
//nastepnie oblicz sume elementow z przedzialu <a,b>, potem sume elemntow z przedzialu <b,c>
//sprawdz ktora suma jest wieksza i sprawdz czy jej cyfra dziesiatek jest wieksza od cyfry jednosci

//zad9
//pobierz od usera liczbe dopoki nie bedzie ona z przedzialu <100000, 900000>
//oblicz sume cyfr tej liczby