import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void zapiszDoPliku(String nazwaPliku)
	{
		
		//musielismy obtoczyc kod komunikajacy sie z plikiem za pomoca 
		//sekcji try...catch
		//na ten moment w uproszczeniu mozemy powiedziec ze kod ktory 
		//znajduje sie w sekcji
		//try jest sprawdzany pod katem wystapienia bledu, jezeli blad wystapi
		//np. nie ma mozliwosci zapisania do pliku pod wskazana lokalizacja
		//to zmiast konczyc program po prostu przechodzi do sekcji catch 
		//gdzie wykonyany
		//jest kod zapasowy a program moze kontynuowac
		try {
			//ta metoda zapisze do pliku txt dowolne dane
			//1. Przygotuj specjalny obiekt / zmienna ktora nawiaze 
			//polaczenie z plikiem txt
			//FileWriter file = new FileWriter(nazwaPliku, true); //jako 
			//drugi argument argumnt
			//dajesz true albo false, tue powoduje ze do pliku dopiujesz 
			//a false
			//ze nadpisujesz (dmyslnie jest false)
			//tutaj podajesz nazwe pliku
			//2. Przkeaz przygotowany wczesniej obiekt do kolejnego, 
			//ktory bedzie w stanie zapisywac dane 
			//do pliku
			PrintWriter pw = new PrintWriter(nazwaPliku);
			
			//jak juz wszystkie sie powiedzie to za pomoca pw piszesz do pliku
			//tak akbys uzywal syso
			pw.println("HEJ");
			pw.println("JAK SIE MASZ");
			int x = 23;
			pw.println(x);
			
			//jak juz skonczysz zabawe z plikiem tekstowym to zamknij 
			//polaczenie z plikiem txt
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
	
	public static void odczyt1(String filename)
	{
		try {
			FileReader file = new FileReader(filename);
			//do odczytywania danych zastosujemy dobrzez znany Scanner
			Scanner sc = new Scanner(file);
			String s = "";
			//pobierasz dopoki masz dane w pliku txt
			while(sc.hasNextLine()) //dopoki jest nowa linia w pliku to pobieraj
			{
				s = sc.nextLine();				
				System.out.println(s.toUpperCase());
			}
			//na koniec warto zamknac polaczenie z plikiem
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int[] odczyt2(String filename)
	{
		int[] arr = null;
		try {
			FileReader file = new FileReader(filename);
			Scanner sc = new Scanner(file);
			String[] liczby = null;
			//wiemy ze nasza tablica jest w jednym wierszu, nie musze robic
			//petli while
			//tylko ifem sprawdze czy faktycznie dane sa w pliku
			if (sc.hasNextLine())
			{
				liczby = sc.nextLine().split(" "); //w tablicy liczby masz 
				//kolejne liczby
				//z pliku ale poki co sa to elementy tablicy napisowej
				arr = new int[liczby.length];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = Integer.parseInt(liczby[i]);
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return arr;
	}
	
	public static double[][] odczyt3(String filename)
	{
		double[][]  tab = null;
		try {
			FileReader file = new FileReader(filename);
			Scanner sc = new Scanner(file);
			
			//najpierw pobierzemy ile wierszy i kolumn
			int w = sc.nextInt();
			int k = sc.nextInt();
			//kiedy masz juz wymiary tablicy pobrane to utworz ta 
			//tablice i do niej pobierzesz
			//reszte informacji
			tab = new double[w][k];
			
			for (int i = 0; i < w; ++i)
			{
				for (int j = 0; j < k; ++j)
				{
					tab[i][j] = sc.nextDouble();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tab;
		
	}
	
	public static void main(String[] args) {
		
		zapiszDoPliku("dane.txt");
		odczyt1("odczyt1.txt");
		int[] arr = odczyt2("odczyt2.txt");
		if (arr != null)
		{
			System.out.println(Arrays.toString(arr));
		}
		double[][] arr2 = odczyt3("odczyt3.txt");
		if (arr2 != null)
		{
			System.out.println(Arrays.deepToString(arr2));
		}
	}

}

//oprocz zadan zaleglych, zrob:

//1. Wygeneruj tablice jednowymiarowa elementow typu int - funkcja generujaca 
//tabice 
//przyjmuje jako argument trzy liczby int a, b, n - funkcja zwraca tablice o 
//wymiarze
//n i elementach losowanych z przedzialu <a,b>, taka tablice przekaz do
//kolejnej funkcji, podobnie jak 
//do tej funkcji przekazesz nazwe pliku txt, do ktorego masz zapisac tablice
//z arguentu funkcji

//2. Wygeneruj tabice dwuwymiarowa, w ktorej kazdy elemnt ma wartosc 
//wiekszego z indeksow wiersza i kolumny 
//w ktorym sie znajdujde. Do generowania tablicy uzyj funkcji ktora jako 
//argument dostanie
//wymiary tablicy dwuwymiarowej. Tablice zapisz z poziomu glownej funkcji 
//main do pliku
//txt ktorego nazwe dostaniesz od usera.