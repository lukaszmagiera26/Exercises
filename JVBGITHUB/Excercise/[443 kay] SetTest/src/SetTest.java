import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Program drukuj¹cy wszystkie s³owa ze strumienia wejœciowego przy u¿yciu
 * zbioru
 * 
 * @version 1.11 2012-01-26
 * @author Cay Horstmann
 */
public class SetTest {
	public static void main(String[] args) throws FileNotFoundException {
		Set<String> words = new HashSet<>(); // Klasa HashSet implementuje
												// interfejs Set
		long totalTime = 0;

		Scanner in = new Scanner(new File("alice30.txt"));
		while (in.hasNext()) {
			String word = in.next();
			long callTime = System.currentTimeMillis();
			words.add(word);
			callTime = System.currentTimeMillis() - callTime;
			totalTime += callTime;
		}
		Iterator<String> iter = words.iterator();
		for (int i = 1; i <= 20 && iter.hasNext(); i++)
			System.out.println(iter.next());
		System.out.println(". . .");
		System.out.println(words.size() + " niepowtarzaj¹cych siê s³ów. " + totalTime + " milisekund.");
	}
}