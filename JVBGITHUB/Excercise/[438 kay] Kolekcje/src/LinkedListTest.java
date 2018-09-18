

import java.util.*;

/**
 * Program demonstruj¹cy dzia³ania na listach powi¹zanych
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
		// Usuniêcie co drugiego s³owa z listy b
		
		bIter = b.iterator();
	
		while (bIter.hasNext()) {
			bIter.next(); // Opuszczenie jednego elementu
			if (bIter.hasNext())

			{
				bIter.next(); // Opuszczenie nastêpnego elementu
				bIter.remove(); // Usuniêcie elementu
			}
		}
		System.out.println(b);
		// Usuniêcie wszystkich s³ów znajduj¹cych siê w liœcie b z listy a
		a.removeAll(b);
		System.out.println(a);
	}
}