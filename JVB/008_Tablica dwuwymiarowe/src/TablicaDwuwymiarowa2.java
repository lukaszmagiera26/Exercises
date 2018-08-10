import java.util.Arrays;
import java.util.Random;

public class TablicaDwuwymiarowa2 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[][] tab = new int[2 + rnd.nextInt(5)][3 + rnd.nextInt(3)];
		
		for (int i = 0; i < tab.length; i++) { //tab.length to ilosc wierszy
			
			for (int j = 0; j < tab[i].length; j++) { //tab[i].length - ilosc elementow w i-tym wierszu
				
				tab[i][j] = rnd.nextInt(20); 
				
				System.out.print(tab[i][j] + "\t");
			}
			System.out.println();

		}
		
		//czyli skoro moge sie odwolac do jednego wiersza z tablicy to moge rowniez 
		//zastosowac klase Arrays dla poszczegolnych wierszy
		int[][] kopia = new int[tab.length][];  //podajesz tylko ile ma byc wierszy a o kolumnach nic nie wiesz
		//bo za chwile za pomoca copyOf bedziesz kopiowal kolejne wierszy pomiedzy tablicami dwuwymiarowymi
		for(int i = 0; i < tab.length; ++i)
		{
			kopia[i] = Arrays.copyOf(tab[i], tab[i].length);
		}
		
		System.out.println("KOPIA:");
		for (int i = 0; i < kopia.length; i++) {
			System.out.println(Arrays.toString(kopia[i]));
		}
		
		
		//klasa Arrays ma doslownie 3 metody do obslugi tablicy dwuwymiarowych
		System.out.println("DEEP TO STRING: ");
		System.out.println(Arrays.deepToString(tab));
		if(Arrays.deepEquals(tab, kopia))
		{
			System.out.println("ROWNE 2D");
		}
		
		//TABLICE KWADRATOWE - liczba ich wierszy jest taka sama jak liczba ich kolumn
		int r = 4;
		int[][] kwadratowa = new int[r][r];
		
		for (int i = 0; i < kwadratowa.length; ++i)
		{
			for (int j = 0; j < kwadratowa[i].length; ++j)
			{
				kwadratowa[i][j] = rnd.nextInt(5) + 10;
			}
		}
		
		//ZASATNOW SIE JAK MAJA SIE INDEKSY WIERSZY I KOLUMN DO SIEBIE DLA ELEMENTOW NA PRZEKTANEJ
		//POD PRZEKATNA I NAD PRZEKATNA?
		
		//elementy na przekatnej maja taki sam indeks wiersza jak i kolumny
		//elementy pod przekatna maja indeks wiersza wiekszy od indeksu kolumny
		//elementy nad przekatna maja indeks wiersza mniejszy od indeksu kolumny
		
		//zad 
		//oblicz srednia elementow na przekatnej a nastapnie sprawdz ile elementow nad przekatna ma wartosci
		//mniejsze od sredniej oraz ile eleemntow pod przekatna ma wartosci wieksze od sredniej
		double s = 0;
		//do przegladania przekatnej wystarczy jedna petla for
		//poniewaz masz taki sam indeks wiersza jak i kolumny
		
		for (int i = 0; i < r; ++i)
		{
			s += kwadratowa[i][i]; //w dwoch miejscach daje ten sam indeks bo przeciez indeks wiersza
			//jest taki sam jak indeks kolumny
		}
		double srednia = s / r;
		
		//sprawdzamy ile elementow nad przekatna ma wartosci mniejsze od sredniej a ile elementow
		//pod przekatna ma wartosci wieksze od sredniej
		int ileNad = 0;
		int ilePod = 0;
		
		for (int i = 0; i < r; ++i) //wiersze
		{
			for (int j = 0; j < r; ++j) //kolumny
			{
				if (i < j) //element nad przekatna
				{
					if (kwadratowa[i][j] < srednia)
					{
						++ileNad;
					}					
				}
				else if (i > j) //element pod przekatna
				{
					if (kwadratowa[i][j] > srednia) //eleemnt pod przekatna
					{
						++ilePod;
					}
				}
			}
		}
		for (int i = 0; i < kwadratowa.length; i++) {
			System.out.println(Arrays.toString(kwadratowa[i]));
		}
		System.out.println("Srednia = " + srednia);
		System.out.println("NAD = " + ileNad);
		System.out.println("POD = " + ilePod);
		
		
		
		//tablica dwuwymiarowa - rozmiar losowany z przedzialu <1,5>
		//elementy tablicy wypelniasz w nastepujacy sposob:
		//kiedy indeks wiersza mniejszy od indeksu kolumny to losujeszz przedzialu <-1, 5>
		//kiedy indeks wiersza wiekszy od indeksu kolumny to losujesz z przedzialu <8,12>
		//w pozostalych przypadkach losujesz z przedzialu <13,18>

		//zad1
		//znajdz sumy elementow w poszczegolnych kolumnach, wyznacz najwieksza z nich

		//zad2
		//znajdz liczbe elementow ktore sa ujemne io okres najmniejszy indeks wiersza na ktorym znajduje sie element ujemny

		//zad3
		//wszystkie elementy z przedzialu <a,b> - a i b pobrane od usera zwieksza o srednia arytmetyczna (zaokraglon w dol) 
		//elementow spoza przedzialu <a,b>

		//zad4
		//oblicz odchylenie standardowe eleemntow parzystych w tablicy

		//zad5
		//oblicz sume eleemntow w kolumnach parzystych i zwieksz wszystkie elementy tablicy o cyfre dziesiatek tak otzrymanej 
		//sumy

		//zad8
		//oblicz sume tych elementow tablicy, ktorych indeks wiersza jest liczba pierwsza

		//zad9
		//zamien miejscami kolumne pierwsza i ostatnia w tablicy

		//zad10
		//oblicz srednia arytmetyczna elementow tablicy lezacych w naroznikach tablicy
		//1 2 3
		//4 5 6
		//7 8 9
		//to bierzemy pod uwage 1,3,7,9

	}

}
