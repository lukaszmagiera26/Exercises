import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

	public static int sumaCyfr(int x)
	{
		int s = 0;
		while(x > 0)
		{
			s += x % 10;
			x /= 10;
		}
		return s;
	}
	public static void main(String[] args) {
		//w java 8 znajduje sie duzo wbudowanych interfejsow
		//ktore mozesz od razu wykorzystac do roznych celow
		
		//interfejs Predicate zawiera w sobie metode, dzieki ktorej
		//mozesz testowac rozne rzeczy, sprawdzac, ...
		Predicate<String> p1 = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		Predicate<Integer> p2 = i -> i % 2 == 0 && i % 5 < 3;
		
		//interfejs Consumer - pozwala nam na przetwarzanie danych
		//typu podanego w <>
		Consumer<Integer> consumer1 = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println("Podana liczba int to " + t);
			}
		};
		Consumer<Integer> consumer2 = i -> {
			System.out.println("Oto liczba " + i);
		};
		
		//interfejs Comparator sluzy do zwracania najczesciej wyniku porownania
		//dwoch przekazanych w jego metodzie argumentow
		Comparator<Double> comp1 = new Comparator<Double>() {
			
			@Override
			public int compare(Double o1, Double o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1, o2);
			}
		};
		
		//sortowanie tablic malejaco
		Integer[] arr = new Integer[]{64, 321, 554, 91, 27};
		Arrays.sort(arr); //sortowanie rosnace
		//Comparator okresla nam zasady porownywania dwoch kolejnych
		//zmiennych, ktore sa sortowane
		
		//sortowanie malejaco
		Arrays.sort(arr, (d1,d2) -> Integer.compare(d2, d1));
		//sortowanie po sumie cyfr
		Arrays.sort(arr, (d1,d2)-> Integer.compare(sumaCyfr(d2), sumaCyfr(d1)));
		System.out.println(Arrays.toString(arr));
		
		//interfejs Function posiada metode apply ktora realizuje
		//konwersje pierwszego typu w <> na drugi typ w <>
		Function<String, Integer> func1 = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return t.length();
			}
		};
		Function<Integer, Double> func2 = i -> i.doubleValue();
		
		//interfejs Supplier ma za zadanie generowac i zwracac typ podany w <>
		Supplier<Integer> sup = new Supplier<Integer>() {
			
			@Override
			public Integer get() {
				Random rnd = new Random();
				return rnd.nextInt(10);
			}
		};
		
		Supplier<Integer> sup2 = () -> {
			Random rnd = new Random();
			return rnd.nextInt(10);
		};
		
		BooleanSupplier sup3 = new BooleanSupplier() {
			
			@Override
			public boolean getAsBoolean() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		BooleanSupplier sup4 = () -> true;
		
		DoubleFunction<String> dfr = new DoubleFunction<String>() {
			
			@Override
			public String apply(double value) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		DoubleFunction<String> dfr2 = d -> String.valueOf(d);
		
		//interface UnaryOperator ktory przyjmuje w metodzie argument danego typu
		//i zwraca element danego tego samego typu
		UnaryOperator<String> uo = new UnaryOperator<String>() {
			
			@Override
			public String apply(String t) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		UnaryOperator<Integer> uo2 = i -> ++i;
		
		//interface BinaryOperator tym sie rozni od UnaryOperatora
		//ze jako argumnt przyjmuje dwa elemnty danego typu a zwraca 1 element
		//tego samego typu
		BinaryOperator<String> bo = new BinaryOperator<String>() {
			
			@Override
			public String apply(String arg0, String arg1) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		BinaryOperator<Integer> bo2 = (i1,i2) -> i1 > i2 ? i1 : i2;
		
		//https://www.tutorialspoint.com/java8/java8_functional_interfaces.htm
		
		BiFunction<String, Integer, Double> biFun1 = new BiFunction<String, Integer, Double>() {
			
			@Override
			public Double apply(String t, Integer u) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		BiFunction<String, Integer, Double> biFun2 = (s,i) -> {
			if (s.endsWith("A"))
			{
				return i.doubleValue();
			}
			else
			{
				++i;
				return i.doubleValue();
			}
		};
		
		BiConsumer<String, Integer> biCons2 = new BiConsumer<String, Integer>() {
			
			@Override
			public void accept(String t, Integer u) {
				// TODO Auto-generated method stub
				
			}
		};
		BiConsumer<String, Integer> biCons3 = (s,i) -> {
			System.out.println(s + " " + i);
		};
		
		BiPredicate<String, Integer> biPred = new BiPredicate<String, Integer>() {
			
			@Override
			public boolean test(String t, Integer u) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		BiPredicate<String, Integer> biPred2 = (s,i) -> s.length() > i;
		
		//przyklad z interfejsem generycznym
		GenericInterface<String> gen1 = new GenericInterface<String>() {
			
			@Override
			public String operation(String t1, String t2) {
				// TODO Auto-generated method stub
				return t1.concat(t2);
			}
		};
		

	}

}
