

import java.io.*;
import java.util.*;

/**
 * @version 1.01 2012-01-26
 * @author Cay Horstmann
 */
public class PairTest2 {
	public static void main(String[] args) {
		GregorianCalendar[] birthdays = { new GregorianCalendar(1906, Calendar.DECEMBER, 9), // G.
																								// Hopper
				new GregorianCalendar(1815, Calendar.DECEMBER, 10), // A.
																	// Lovelace
				new GregorianCalendar(1903, Calendar.DECEMBER, 3), // J. von
																	// Neumann
				new GregorianCalendar(1910, Calendar.JUNE, 22), // K. Zuse
		};
		Pair<GregorianCalendar> mm = ArrayAlg.minmax(birthdays);
		System.out.println("min = " + mm.getFirst().getTime());
		System.out.println("max = " + mm.getSecond().getTime());
	}
}

class ArrayAlg {
	/**
	 * Pobiera najmniejsz� i najwi�ksz� warto�� z tablicy obiekt�w typu T.
	 * 
	 * @param a
	 *            tablica obiekt�w typu T
	 * @return para z�o�ona z najmniejszej i najwi�kszej warto�ci lub warto��
	 *         null, je�li tablica �a� jest null b�d� pusta
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T extends Comparable> Pair<T> minmax(T[] a) {
		if (a == null || a.length == 0)
			return null;
		T min = a[0];
		T max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0)
				min = a[i];
			if (max.compareTo(a[i]) < 0)
				max = a[i];
		}
		return new Pair<>(min, max);
	}
}