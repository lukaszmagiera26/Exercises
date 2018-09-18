
public class Main {

	public static void main(String[] args) {
		// skladnik statyczny klasy to taki, ktory jest wspolny dla wszystkich obiektow klasy
		Film f1 = new Film("Spiderman", "Akcja", 45);
		Film f2 = new Film("Godzilla", "Horror", 31);
		Film f3 = new Film("Superman", "Horror", 61);
		Film f4 = new Film("Harry Potter", "Horror", 11);
		
		//wywolani naszej metody niestatycznej
		System.out.println(f1.cenaPoZnizce());
		System.out.println(f2.cenaPoZnizce());
		
		//raz zmieniona zmienna statyczna w jednym obiekcie jest rowniez widoczna
		//w innym obiekcie, czyli masz jedna wspoldzielona zmienna na wszystkie
		//obiekty
		f1.setZnizka(0.5);
		System.out.println(f2.getZnizka());
		
		System.out.println(f1.cenaPoZnizce());
		System.out.println(f2.cenaPoZnizce());
		
		//kiedy masz zmienna znizka i jest ona wspolna dla wszystkich obiektow czyli jest
		//zmienna statyczna to mamy sytuacje w ktorej powinno sie do niej
		//odwolywac za pomoca klasy
		Film.setZnizka(0.3);
		
		System.out.println(f1); //metoda syso sama siega po toString
		System.out.println(f2);
		
		//zastosowanie metody statycznej
		Film[] fTab = new Film[]{f1,f2,f3,f4};
		Film fm = Film.filmOMaxCenie(fTab);
		System.out.println("MAX -> " + fm);

	}

}
