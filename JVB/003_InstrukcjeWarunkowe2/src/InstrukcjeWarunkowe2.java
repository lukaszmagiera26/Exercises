import java.util.Random;

public class InstrukcjeWarunkowe2 {

	public static void main(String[] args) {
		//zeby losowac tworezymy obiekt klasy Random
		Random rnd = new Random();
		int losowana1 = rnd.nextInt(11); //instrukcja nextInt(a) zawsze losuje liczbe z przedzialu <0, a-1>
		System.out.println("WYLOSOWANA1 = " + losowana1);
		
		//a teraz losujemy liczbe <3, 12>
		//<3, 12> -> <0, 9> + 3
		int losowana2 = rnd.nextInt(10) + 3;
		System.out.println("WYLOSOWANA2 = " + losowana2);
		
		//a teraz losujemy liczbe <-5, 13>
		//<-5, 13> -> <0,18> - 5
		int losowana3 = rnd.nextInt(19) - 5;
		System.out.println("WYLOSOWANA3 = " + losowana3);
		
		//a teraz losujemy liczbe z <0.12, 0.345>
		//<0.12, 0.345> -> mnozymy razy tysiac -> <120, 345> -> <0, 225> + 120 -> dzielimy przez tysiac
		double losowana4 = (rnd.nextInt(226) + 120) / 1000.0; //obowiazkowo dajesz 1000.0 bo to
		//pozwoli traktowac liczbe 1000 jak double a my dostaniemy dzielnie w ktorym jeden ze skladnikow
		//jest double
		System.out.println("WYLOSOWANA4 = " + losowana4);
		
		//sprawdz czy zmienna losowana1 jest parzysta lub podzielna przez 3
		//tym razem stosuje samego if-a, wiec jezeli warunek nie zachodzi to po prostu program biegnie dalej
		//przypominam ze wczesniej miales if...esle czyli jak warunek nie zachodzi to robilo else
		if (losowana1 % 2 == 0 || losowana1 % 3 ==0 ) //|| oznacza ze caly warunek jest prawdziwy kiedy 
			//przynajmniej jeden z warunkow skladowych jest prawdziwy
		{
			System.out.println("JEST PARZYSTA LUB PODZIELNA PRZEZ 3!");
		}
		
		//trzecia wersja instrukcji if
		/*
		if (warunek1)
		{
			instrukcje_wykonywane_kiedy_zachodzi_warunek_1
		}
		else if (warunek2)
		{
			instrukcje_wykonywane_kiedy_zachodzi_warunek_2
		}
		else if (warunek3)
		{
			instrukcje_wykonywane_kiedy_zachodzi_warunek_1
		}
		//...koleje else if
		else
		{
			instrukcje_wykonywane_kiedy_nie_zaszedl_zaden_z_powyzszych_warunkow
		}
		*/
		//analizujemy liczbe z przedzialu <3,12>
		//kiedy wykona sie if to juz kolejnych else if-ow nie sprawdzasz
		//kiedy if sie nie wykona to badasz kelse if i jak zachodzi to kolejnych nie sprawdasz
		//do pierwszego trafionego warunku
		//if..esle if..esle if..else if..else uzywasz tylko z warunkami rozlacznymi!!!
		//kiedy masz kilka warunkow ale moze byc tak ze sie nie wykluczaja to wtedy
		//robisz jeden pod drugim kilka ifow
		if (losowana1 >= 3 && losowana1 <= 5)
		{
			System.out.println("PRZEDZIAL <3,5>");
		}
		else if(losowana1 > 5 && losowana1 <= 7)
		{
			System.out.println("PRZEDZIAL (5,7>");
		}
		else if (losowana1 > 7 && losowana1 <= 9)
		{
			System.out.println("PRZEDZIAL (7,9>");
		}
		else
		{
			System.out.println("INNY PRZEDZIAL");
		}
	}

}

//zad1
//pobierasz od uzytkownika dwie liczby i wyswietlasz na ekranie wieksza z nich

//zad2
//losujesz liczbe a z przedzialu <12, 23> oraz liczbe b z przedzialu <45, 67>
//pozniej pobierasz od uzytkownika trzecia liczbe i sprawdzasz czy nalezy do przedzialu <a,b>

//zad3
//losujesz cztery liczby double
//liczbe a z przedzialu <1.23, 4.34>
//liczbe b z przedzialu <5.21, 6.25>
//liczbe c z przedzialu <7.31, 9.72>
//liczbe d z przedzialu <10.33, 12.23>
//nastepnie losujesz liczbe e z przedzialu <1.23, 12.23> i sprawdzasz
//do ktorego z przedzialow <a,b>, (b,c), <c,d) nalezy liczba e
//wypisujac komunika PRZEDZIAL1, PRZEDZIAL2 itd. kiedy nie nalezy do zadnego z tych przedzialow
//piszesz INNY

//zad4
//pobierz od uzytkownika trzy liczby typu double i wylicz ich srednia arytmetyczna

//zad5
//pobierz od uzytkownika dwie liczby double, nastepnie wyznacz wieksza z nich
//nastepnie oblicz pole trojkata rownobocznego o boku rownym wiekszej z podanych liczb

//zad6
//pobierz od usera liczbe calkowta do zmiennej x a nastepnie sprawdz czy dzieli sie ona przez
//liczbe y wylosowana z przedzialu <4, 20>

//zad7
//pobierz od usera liczbe calkowita do zmiennej x, nastepnie wylosuj liczbe a z przedzialu <3, 5>
//oraz liczbe b z przedzialu <4, 8>, sprawdz czy podana liczba dzieli sie przez liczbe a i czy przy 
//dzieleniu przez liczbe b daje reszte wieksza od 2

//zad8
//pobierz od usera dwie liczby double beda to boki prostokata, wyznacz pole i obwod tego prostokata

//zad9
//pobierz od usera trzy liczby int - sa to boki trojkata
//sprawdz czy jest to trojkat prostokatny

//zad10
//pobierz od usera liczbe calkowita i sprawdz czy przy dzieelniu przez 5 daje ona wieksza reszte niz
//prz dzieleniu przez 7
