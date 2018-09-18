import java.util.Scanner;

public class Main {

	public static void testujFigura(Figura f)
	{
		//jak sprawdzic jaki faktycznie obiekt przyszedl do metody
		if (f instanceof Prostokat)
		{
			System.out.println("TO JEST PROSTOKAT");
		}
		else if (f instanceof Kwadrat)
		{
			System.out.println("TO JEST KWADRAT");
		}
		
		System.out.println("NAZWA KLASY: " + f.getClass().getCanonicalName());
		System.out.println("POLE = " + f.pole());
		System.out.println("OBWOD = " + f.obwod());
	}
	public static void main(String[] args) {
		Kwadrat k = new Kwadrat(10);
		testujFigura(k);
		
		Prostokat p = new Prostokat(1, 4);
		testujFigura(p);
		
		//final przy zmiennej oznacza ze nie wolno zmieniac jej wartosci
		//czyli taka zmienna jest stala
		final int X = 10;
		
		//nie wolno utworzyc od klasy abstrakcyjnej obiektu
		//Figura f = new Figura();
		//jak objesc ten problem?
		//1. zawsze mozesz zainicjlaizowac referencje Figura obiektem
		//klasy pochodnej
		//Figura f = new Kwadrat(10);
		//f.pole();
		//2. zawsze mozesz zastosowac implemnetacje anonimowa
		//implementacja anonimowa pozwala w biegu implementowac
		//metody abstrakcyjne klasy
		Figura f = new Figura() {
			
			private double getBok()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Podaj bok");
				double a = sc.nextDouble();
				return a;
			}
			@Override
			public double pole() {
				double a = getBok();
				return (Math.sqrt(3.0) * a * a) / 4.0;
			}
			
			@Override
			public double obwod() {
				return 3 * getBok();
			}
		};
		
		testujFigura(f);
		
	}

}
