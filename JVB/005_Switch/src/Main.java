import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//switch to taka alternatywa if-a
		//niekiedy np przy tworzeniu menu mozesz stosowac switch
		
		System.out.println("KALKULATOR");
		System.out.println("1. DODAWANIE");
		System.out.println("2. ODEJMOWANIE");
		System.out.println("3. MNOZENIE");
		System.out.println("4. DZIELENIE");
		System.out.println("5. PIERIWASTKOWANIE");
		System.out.println("6. POTEGOWANIE");
		System.out.println("TWOJ WYBOR");
		Scanner sc = new Scanner(System.in);
		int wybor = sc.nextInt();
		
		double a = 0;
		double b = 0;
		double w = 0;
		
		switch(wybor)
		{
		case 1:
			System.out.println("DODAWANIE");
			System.out.println("PODAJ PIERWSZA LICZBE");
			a = sc.nextInt();
			System.out.println("PODAJ DRUGA LICZBE");
			b = sc.nextInt();
			w = a + b;
			System.out.println(a + " + " + b + " = " + w );
			break;
		case 2:
			System.out.println("ODEJMOWANIE");
			break;
		case 3:
			System.out.println("MNOZENIE");
			break;
		case 4:
			System.out.println("DZIELENIE"); //pamietaj zeby obsluzyc ze nie dzielisz przez 0
			break;
		case 5:
			System.out.println("PIERWIASTKOWANIE"); //pierwiastkowac mozesz tylko liczby dodatnie
			break;
		case 6:
			System.out.println("POTEGOWANIE");
			break;
		default:
			System.out.println("NIE MA TAKIEJ OPCJI");
		}

	}

}

//kalkulator figur
//1. Kwadrat
//2. Prostokata
//3. Trojkat rownoboczny
//4. Szesciokat foremny
//5. Trapez prostokatny
//Po wyborze odpowiedniej opcji pobierasz od usera odpowiednie boki
//i wypisujesz na ekranie pole oraz obwod wybranej figury
