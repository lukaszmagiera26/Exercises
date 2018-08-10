import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//tablica nieregularna to taka ktora w kazdym wierszu moze miec inna liczbe kolumn
		//najpierw wylosujem ywymiary poszczegolnych wierszy a pozniej dla kazdego wiersza na 
		//podstawie jego wymiarow wylosujemy elementy w tym wierszu
		
		Random rnd = new Random();
		
		int[] wiersze = new int[rnd.nextInt(2) + 1];
		//do tablicy wiersze losuje ile w kazdym wiersu bedzie kolumn
		for (int i = 0; i < wiersze.length; i++) {
			wiersze[i] = rnd.nextInt(10)+1 ; //i-ty wiersz ma tyle kolumn ile wylosowalismy
		}
	
		
		
		//tablica nieregularna - okreslasz na podstawie wierszy ile ma byc kolumn ale przy tworzeniu 
		//nie podajesz ilosci kolumn
		int[][] tabNieregularna = new int[wiersze][]; //[] od kolumn jest pusty bo 
		//nie wiem ile bedzie mial kazdy wiersz
		for (int i = 0; i < tabNieregularna.length; ++i)
		{
			tabNieregularna[i] = new int[wiersze[i]]; //biore wartosc i-tego elementu z tablicy wiersze
			//i uzywam go do utworzenia / przydzielenia pamieci dla i-tego wiersza w tablicy nieregularnej
		}
	
		//majac tablice nieregularna wypelnimy ja rowniez elementami
		for (int i = 0; i < tabNieregularna.length; i++) {
			for (int j = 0; j < tabNieregularna[i].length; j++) {
				tabNieregularna[i][j] = rnd.nextInt(10);
			}
		}
		for (int i = 0; i < tabNieregularna.length; i++) {
			System.out.println(Arrays.toString(tabNieregularna[i]));
		}

	}

}
