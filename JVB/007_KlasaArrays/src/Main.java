import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr1 = {4, 5, 2, 3, 4, 5, 6, 7};
		int[] arr2 = {4, 5, 2, 3, 4, 5, 6, 7};
		
		System.out.println(Arrays.toString(arr1));
		
		boolean czyRowne = true;
		
		if (arr1.length != arr2.length)
		{
			czyRowne = false;
		}
		else
		{
			for (int i = 0; i < arr2.length; i++) {
				if (arr1[i] != arr2[i])
				{
					czyRowne = false;
					break;
				}
			}
		}
		
		if (Arrays.equals(arr1, arr2) == true)
		{
			System.out.println("ROWNE");
		}
		
		//sorotwanie tablicy
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//jak wyznaczyc w tablicy najwiekszy element?
		//jezeli nie zalezy ci czy tablica ma byc posrtowana czy nie to ja mozesz posortowac i zwrocic ostani element
		int maxEl = arr1[arr1.length-1];
		System.out.println(maxEl);
		
		//inny sposob szukania max
		int maxEl2 = arr2[0];
		for (int i = 1; i < arr2.length; i++) {
			maxEl2 = Integer.max(maxEl2, arr2[i]);
		}
		
		//jak juz posrtujesz tablice mozesz ja przeszukiwac, binarySearch pozwala nam zwracac pozycje 
		//szukanego elemntu, ale UWAGA TABLICA MUSI BYC POSRTOWANA
		int idx = Arrays.binarySearch(arr1, 3);
		
		if (idx < 0)
		{
			System.out.println("NIE ZNALEZIONO");
		}
		else
		{
			System.out.println("ZNALEZIONO NA POZYCJI = " + idx);
		}
		
		int[] arr3 = Arrays.copyOf(arr2, arr2.length); //do arr3 skopiowalem arr2
		System.out.println(Arrays.toString(arr3));
		
		arr2 = Arrays.copyOf(arr2, arr2.length + 1);//dodawanie jednej wartosci
		arr2[arr2.length-1] = 23;
		System.out.println(Arrays.toString(arr2));
	
		
		int[] arr4 = new int[10];
		Arrays.fill(arr4, 1); //wszystkie elementy tablicy wypelniamy wartoscia 1
		System.out.println(Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOfRange(arr4, 2, 8); //kopiowanie elemntow tablic z zakresu indeksow od 2 do 8
		System.out.println(Arrays.toString(arr5));
		
	}

}
