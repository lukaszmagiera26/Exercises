	package shuffle;
	import java.util.*;
	/**
	* Program demonstruj¹cy algorytmy tasowania i sortowania
	* @version 1.11 2012-01-26
	* @author Cay Horstmann
	*/
	
public class ShuffleTest {


	
	public static void main(String[] args)
	{
	List<Integer> numbers = new ArrayList<>();
	for (int i = 1; i <= 49; i++)
	numbers.add(i);
	
	Collections.shuffle(numbers);
	List<Integer> winningCombination = numbers.subList(0, 6);
	Collections.sort(winningCombination);
	System.out.println(winningCombination);
	}
}
			
	
