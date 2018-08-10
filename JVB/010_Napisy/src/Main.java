import java.awt.image.SampleModel;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String n = "ala ma kota";
		
		/*
		System.out.println("Podaj napis");
		Scanner sc = new Scanner(System.in);
		n = sc.nextLine();
		System.out.println("Podany napis -> " + n);
		*/
		
		//kazdy pojedynczy element - znak naszego napisu to char
		//specjalna zmienna ktora przechowuje znak
		//ta zmienna to tak naprawde mala zmienna liczbowa, ktora nie tyle przechowuje znak co jego kod
		char znak1 = 'w'; //dajesz znka w apostrofach
		char znak2 = '2';
		char znak3 = '?';
		char znak4 = '*';
		
		int ileLiter = 0;
		int ileMalychLiter = 0;
		int ileDuzychLiter = 0;
		int ileCyfr = 0;
		int ileSamoglosek = 0;
		int ileSpolglosek = 0;
		int ileBialychZnakow = 0;
		
		//moge napis przegladac litera po literze i go analizowac
		for (int i = 0; i < n.length(); i++) { //pamietaj ze dla napisu masz n.length()
			//moge dzieki petli przejrzec napis literka po literce
			//System.out.println(n.charAt(i));
			//klasa Character - klasa ktora ma za zadanie analizowac pojedyncze znaki
			char z = n.charAt(i);
			//https://pl.wikipedia.org/wiki/ASCII
			if (Character.isLetter(z))
			{
				ileLiter++;
				
				if (Character.isLowerCase(z)) //czy mala litera
				{
					ileMalychLiter++;
					
					//sprawdzamy samogloski i spolgloski
					if (z == 'a' || z == 'e' || z == 'y' || z == 'u' || z == 'i' || z == 'o')
					{
						ileSamoglosek++;
					}
					else
					{
						ileSpolglosek++;
					}
				}
				else //if (Character.isUpperCase(z))
				{
					ileDuzychLiter++;
					
					//sprawdzamy samogloski i spolgloski
					if (z == 'A' || z == 'E' || z == 'Y' || z == 'U' || z == 'I' || z == 'O')
					{
						ileSamoglosek++;
					}
					else
					{
						ileSpolglosek++;
					}
				}
			}
			else if (Character.isDigit(z)) //sprawdzam czy cyfra
			{
				ileCyfr++;
			}
			else if (Character.isWhitespace(z)) //tabulatory, spacje
			{
				ileBialychZnakow++;
			}
		}
		
		System.out.println("LITER = " + ileLiter);
		System.out.println("MALE LITERY = " + ileMalychLiter);
		System.out.println("DUZE LITERY = " + ileDuzychLiter);
		System.out.println("CYFRY = " + ileCyfr);
		System.out.println("SAMOGLOSKI = " + ileSamoglosek);
		System.out.println("SPOLGLOSKI = " + ileSpolglosek);
		System.out.println("BIALE ZNAKI = " + ileBialychZnakow);
	}

}

//1. Czy w jednej klasie moze byc kilka metod main?
//2. Czym sie rozni JDK, JRE, JVM
//3. Co to jest garbage collector?
//4. Czym sie rozni stos od sterty?
//5. Jaki bedzie wynik ponizszego kodu i dlaczego?
/*
Integer x = 10;
Integer y = 10;
if(x == y)
{
	System.out.println("OK1");
}
Integer xx = 1000;
Integer yy = 1000;
if(xx == yy)
{
	System.out.println("OK2");
}
*/