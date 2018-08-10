
public class Main {

	public static void main(String[] args) {
		Silnik silnik = new Silnik(5.6);
		Nadwozie nadwozie = new Nadwozie("Czarny");
		Samochod s = new Samochod("Mazda", silnik, nadwozie);
		System.out.println(s);

	}

}
