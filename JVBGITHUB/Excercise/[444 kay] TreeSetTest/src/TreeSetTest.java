
/**
@version 1.12 2012-01-26
@author Cay Horstmann
*/
import java.util.*;

/**
 * Program sortuj¹cy zbiór elementów poprzez porównanie ich opisów
 */
public class TreeSetTest {
	public static void main(String[] args) {
		SortedSet<Item> parts = new TreeSet<>();
		parts.add(new Item("Toster", 1234));
		parts.add(new Item("Widget", 4562));
		parts.add(new Item("Modem", 9944));
		
		
		System.out.println(parts);
		SortedSet<Item> sortByDescription = new TreeSet<>(new Comparator<Item>() {
			public int compare(Item a, Item b) {
				
				String descrA = a.getDescription();
				
				String descrB = b.getDescription();
				return descrA.compareTo(descrB);
			}
			
		});
	
		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
	}
}