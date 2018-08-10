import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;

public class Main {

	//napiszemy metode ktora zwraca ile elementow tablicy przekazanej
	//jako argument spelnia test
	public static int ileElementow(int[] arr, Tester tester)
	{
		if (arr == null)
		{
			return 0;
		}
		
		int ile = 0;
		for (int i = 0; i < arr.length; ++i)
		{
			if (tester.test(arr[i]))
			{
				++ile;
			}
		}
		
		return ile;
	}
	
	public static String[] metodaKonwertujaca(int[] arr, Konwerter konwerter)
	{
		if (arr == null)
		{
			return null;
		}
		
		String[] arr2 = new String[arr.length];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = konwerter.konwertuj(arr[i]);
		}
		return arr2;
	}
	
	//metoda zwraca jeden element z tablicy
	public static Integer findElement(int[] arr, Operacja operacja)
	{
		if (arr == null)
		{
			return null;
		}
		else if (arr.length == 1)
		{
			return arr[0];
		}
		else
		{
			Integer el = operacja.wykonajOperacja(arr[0], arr[1]);
			
			for (int i = 2; i < arr.length; ++i)
			{
				el = operacja.wykonajOperacja(arr[1], arr[i]);
				System.out.println(arr[i]);
				System.out.println("S "+ el);
			}
			return el;
		}
		
	}
	
	public static void przetwarzajElementy(String[] arr, Przetwarzacz<String> przetwarzacz)
	{
		for (int i = 0; i < arr.length; i++) {
			przetwarzacz.przetwarzaj(arr[i]);
		}
	}
	
	public static Integer[] generujTablica(int n, Generator<Integer> generator)
	{
		Integer[] arr = new Integer[n];
		
		for (int i = 0; i < arr .length; i++) {
			arr[i] = generator.generuj();
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{4, 3, 6, 7, 8};
		
		System.out.println("ARRAY: " + Arrays.toString(arr));
		
		int ile1 = ileElementow(arr, new Tester() {
			
			@Override
			public boolean test(int x) {
				// TODO Auto-generated method stub
				return x % 2 == 0;
			}
		});
		System.out.println("ILE = " + ile1);
		
		int ile2 = ileElementow(arr, new Tester() {
			
			@Override
			public boolean test(int x) {
				// TODO Auto-generated method stub
				return x > 6;
			}
		});
		System.out.println("ILE = " + ile2);
		
		//stosujemy wyrazenie lambda dla interfejsu Tester
		
		//skladania wyrazenia lambda
		//(argumenty o ile wystepuja) -> (wartosc zwracana)
		//(argumenty o ile wystepuja) -> {cialo + ewentualnie wartosc zwr.}
		
		int ile3 = ileElementow(arr, x -> x % 2 == 0);
		
		int ile4 = ileElementow(arr, k -> {
			Random rnd = new Random();
			int los = rnd.nextInt(10);
			return k > los;
		});
		
		
		String[] arrStr = metodaKonwertujaca(arr, new Konwerter() {
			
			@Override
			public String konwertuj(int x) {
				String res = "";
				
				switch(x)
				{
				case 0:
					res = "ZERO";
					break;
				case 1:
					res = "JEDEN";
					break;
				case 2:
					res = "DWA";
					break;
				case 3:
					res = "TRZY";
					break;
				case 4:
					res = "CZTERY";
					break;
				case 5:
					res = "PIEC";
					break;
				case 6:
					res = "SZESC";
					break;
				case 7:
					res = "SIEDEM";
					break;
				case 8:
					res = "OSIEM";
					break;
				case 9:
					res = "DZIEWIEC";
					break;
				default:
					res = "INNA";
				}
				
				return res;
			}
		});
		
		System.out.println(Arrays.toString(arrStr));
		
		/*Integer el = findElement(arr, new Operacja() {
			
			@Override
			public int wykonajOperacja(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		});*/
	
		Integer el = findElement(arr, (a,b) -> a >= b ? a : b);
		System.out.println("MAX = " + el);
		
		Integer el1 = findElement(arr, (a,b) -> a <= b ? a : b);
		System.out.println("MAX2 = " + el1);
		
		
		
		
		/*
		przetwarzajElementy(arrStr, new Przetwarzacz<String>() {
			
			@Override
			public void przetwarzaj(String t) {
				// TODO Auto-generated method stub
				
			}
		});*/
		
		przetwarzajElementy(arrStr, t -> {
			System.out.println("_" + t + "_");
		});
		
		
		/*
		Integer[] arr3 = generujTablica(10, new Generator<Integer>() {
			
			@Override
			public Integer generuj() {
				// TODO Auto-generated method stub
				return null;
			}
		});*/
		
		/*
		Integer[] arr3 = generujTablica(10, () -> {
			Random rnd = new Random();
			return rnd.nextInt(10);
		});
		*/
		
		Integer[] arr3 = generujTablica(10, () -> new Random().nextInt(10));
		System.out.println(Arrays.toString(arr3));
		
		/*
		Predicate<String> p = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		*/
		
		
	}

}
