import java.util.Random;

public class TabliceDwuwymiarowe {

	public static void main(String[] args) {
		int w = 4;
		int k = 5;

		int[][] tab = new int[w][k];

		tab[1][4] = 3;

		Random rnd = new Random();

		// jak przegladac tablice dwuwymiarowe?
		// w ponizszy sposob tablice przegladasz po wierszach
		for (int i = 0; i < w; i++) {
			// 1 etap - zanim jeszcze wejdziesz do petli wewnetrznej czyli zanim
			// bedzioesz przegladal
			// elementy z wiersza luz zkolumny

			for (int j = 0; j < k; j++) {
				// 2 etap - jestes juz w petli i tutaj przegladasz eleemnty
				tab[i][j] = rnd.nextInt(20); // najpierw podajesz
				// indeks wiersza a potem indeks kolumny
			}

			// 3 etap - jestes zaraaz po przejrzeniu elementow wiersza lub
			// kolumny
		}

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(tab[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		// przeglad po kolumnach
		for (int j = 0; j < k; j++) {
			for (int i = 0; i < w; i++) {
				System.out.print(tab[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("======================================");
		System.out.println("======================================");
		System.out.println("======================================");
		int[][] t = new int[w][k];
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < k; j++) {
				// 2 etap - jestes juz w petli i tutaj przegladasz eleemnty
				t[i][j] = rnd.nextInt(20); // najpierw podajesz
				// indeks wiersza a potem indeks kolumny
			}
		}
		
		
		for (int i = 0; i < w; ++i)
		{
			for (int j = 0; j < k; ++j)
			{
				System.out.print(t[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("ss");
		//wyznaczyc numer wiersza w ktorym znajduja sie elementy o najwiekszej sredniej
		double sredniaWiersz = 0;
		double maxSredniaWiersz = 0;
		int idxMax = -1;
		for (int i = 0; i < w; i++) {
			//przed wejsciem do petli z elementami wiersza
			sredniaWiersz = 0;
			
			for (int j = 0; j < k; j++) {
				sredniaWiersz += t[i][j];
			}
			
			//skonczylem przegladac petle wewnetrzna czyli mam policzona sume wszystkich elementow z danego wiersza
			sredniaWiersz /= k;
			System.out.println("SREDNIA WIERSZ NR " + i + " = " + sredniaWiersz);
			if (sredniaWiersz > maxSredniaWiersz)
			{
				idxMax = i;
				maxSredniaWiersz = sredniaWiersz;
			}
		}
		
		System.out.println("WIERSZ O ELEMENTACH Z NAJWIEKSZA SREDNIA = " + idxMax);
	}

}
