
public class Main {

	public static void main(String[] args) {
		Car c1 = new Car("AUDI", "RED", 2345987.0, 100000);
		Car c2 = new Car("AUDI", "RED", 2345987.0, 100000); //zawsze tworzy nowy obszar
		Car c3 = c1; //c3 pokazuje na ten sam obszar pamieci co c1

		if (c1 == c3) //operator == porownuje referencje d obiektow, mowiac dokladniej
			//adresy obiektow w pamieci
		{
			System.out.println("EQUALS!");
		}
		
		//skoro c1 i c3 pokazuja na ten sam obszar pamieci to prowadzi to do
		//jedenj niebezpiecznej rzeczy
		//c1.setColor("PINK");
		//System.out.println(c3.getColor());
		
		//ogolnie jezeli zalezy ci na porownywaniu obiektow ale po ich zawartosci
		//to musisz zastosowac equals
		if (c1.equals(c2)) //equals to jedna z metod klasy Object
			//jezeli nie nadasz jej nowego znaczenia to domyslnie dziala ona jak operator 
			//== czyli porownuje referencje
		{
			System.out.println("EQUALS 2!");
		}
		
		//wszystkie klasy w java co do jednej, bez wyjatkow dziedzicza po klasie Object
		//klasa Object dostarcza domyslnie dla naszych klas pewne metody, ktore jak sie okazuje
		//sa pozniej potrzebne przy pracy z obiektami
		//przyklady najwazniejszych ktore kazda klasa ma od Object: getClass, equals,
		//toString, hashCode
		//zeby metody z klasy Object dzialaly wedlug naszych potrzeb potrzebujesz je 
		//przeladowac
		
		System.out.println("KONIEC");
		
		//klasa Object gwarantuje nam rowniez metoe toString, ktora ma za zadanie
		//zamienic obiekt klasy na napis
		//obiekt klasy Car domyslnie pokazuje w ramach toString nazwe klasy z ktorej pochodzi
		//a po @ adres tego obiektu, w zwiazku z czym pewnie bedziemy chcieli przeladowac
		//metode toString tak, zeby pokazywal np. zawartosc obiektu klasy Car
		System.out.println(c1.toString());
	}

}

//klasa Pilkarz
//pola imie, nazwisko, numer, liczba goli, nazwa druzyny
//imie i nazwisko musza byc z duzych liter
//numer pilkarza musi byc z przedzialu <1, 99>
//liczba goli musi byc zero lub wiecej
//nazwa druzyny ma skladac sie z dwoch wyrazow oddzielonych spacja i kazdy ma zaczynac sie 
//z duzej litery
//przygotuj settery i gettery
//konstruktor argumentowy
//konstruktor bezargumentowy - pobiera dane od usera
//przeladuj metody equals i hashCode
//w main utworz kilka obiektow wypisz co im ustawiles, sprawdz czy dziala porownywanie
