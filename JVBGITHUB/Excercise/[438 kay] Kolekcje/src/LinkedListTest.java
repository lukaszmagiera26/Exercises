

import java.util.*;

/**
 * Program demonstruj�cy dzia�ania na listach powi�zanych
 * 
 * @version 1.11 2012-01-26
 * @author Cay Horstmann
 */
public class LinkedListTest {
	public static void main(String[] args) {
		List<String> a = new LinkedList<>();
		a.add("Ania");
		a.add("Karol");
		a.add("Eryk");
		List<String> b = new LinkedList<>();
		b.add("Bartek");
		b.add("Daniel");
		b.add("Franek");
		b.add("Gosia");
		// Scalenie list a i b
		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();
		
		while (bIter.hasNext()) {
			if (aIter.hasNext())
				aIter.next();
			aIter.add(bIter.next());
		}
		System.out.println(a);
		// Usuni�cie co drugiego s�owa z listy b
		
		bIter = b.iterator();
	
		while (bIter.hasNext()) {
			bIter.next(); // Opuszczenie jednego elementu
			if (bIter.hasNext())

			{
				bIter.next(); // Opuszczenie nast�pnego elementu
				bIter.remove(); // Usuni�cie elementu
			}
		}
		System.out.println(b);
		// Usuni�cie wszystkich s��w znajduj�cych si� w li�cie b z listy a
		a.removeAll(b);
		System.out.println(a);
	}
}