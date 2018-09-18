import java.util.Scanner;

public class Main {

	//napiszemy pierwsza metode
	//kazda metoda ktora napiszemy przed obiektowoscia bedzie miec psotac
	//public static typ_zwracany nazwa_metody(argumenty)
	//{
	//	cialo metody
	//}
	
	//kiedy jako typ zwracany napiszesz void oznacza to ze metoda nic nie zwraca
	//czyli sie wykonuje i konczy swoje dzialanie
	//metoda ma rownie puste () co znaczy ze nie przyjmuje argumentow
	//czyli wszystkie dane potrzebne do dzialania metody zostana w jakis sposob pobrane w jej srodku
	public static void obliczPoleProstokata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Pobierz bok 1");
		double b1 = sc.nextDouble();
		System.out.println("Pobierz bok 2");
		double b2 = sc.nextDouble();
		System.out.println("Pole = " + (b1 * b2));
	}
	
	//czas na metode ktora przyjmuje argumenty
	public static void obliczPoleProstokataArg(double b1, double b2) //tym razem mamy rowniez argumenty podane w ()
	{
		//nie musisz pobierac juz bokow od usera, bo zostana one dostarczone w postaci argumentow w ()
		//w metodzie korzystasz z argumentow jak ze zwyklych zmiennych ktoryz wartosci juz masz
		System.out.println("Arg Pole = " + (b1 * b2));
	}
	
	//funkcja to to samo co metoda!!!
	
		//zwracanie wartosci przez metode
		//zwroc sume liczb z przedzialu <a,b>, gdzie a i b to liczby int przekazane jako argument funkcji
		public static int obliczSumaPrzedzial(int a, int b)
		{
			int suma = 0;
			for (int i = a; i <= b; i++)
			{
				suma += i;
			}
			return suma; //kiedy funkcja zwraca jakas wartosc okreslonego typu - u nas jest to int -
			//to musi w jej ciele wystapic return, po ktorym piszesz co konkretnie jest zwracane
		}
	
	public static void main(String[] args) {
		//obliczPoleProstokata(); //wywolanie metody
		//obliczPoleProstokata();
		obliczPoleProstokataArg(3.5, 2.0); //podalem konkretne wartosci argumentow czyli b1 = 3.5, b2 = 2.0
		
		double a = 10;
		double b = 45.5;
		obliczPoleProstokataArg(a, b);
		
		int s = obliczSumaPrzedzial(3, 10); //po zakonczeniu dzialania funkcja zwraca do zmiennej s to co miala po return
		//mozesz zwrocona wartosc wykorzystac w main
		System.out.println("Suma = " + s);
		if (s % 2 == 0)
		{
			System.out.println("SUMA PARZYSTA!");
		}
	}
	
	//1. napisz funkcje ktora przyjmuje jako argument dwie liczby int i zwraca wieksza z nich
	//2. napisz funkcje ktora przyjmuje jako argument trzy liczby double i zwraca ich srednia
	//3. napisz funkcje ktora przyjmuje jako argument dwie liczby int a i b i wypisuje tylko te liczby z przedzialu <a,b> ktore sa parzyste

}
