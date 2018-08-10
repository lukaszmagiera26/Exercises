import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//regex = regular expression
		//String regex = "ala"; //true kiedy napis ma wartosc "ala"
		//String regex = "a"; //true kiedy napis sklada sie z dokladnie jednego a
		//String regex = "[abc]"; //true kiedy napis sklada sie z dokladnie jednej litery: a, b lub c
		//String regex = "[^abc]"; //true kiedy napis ma dokladnie jedna litere i nie jesto a, b lub c
		//String regex = "[a-z]"; //true kiedy masz jedna litere mala liter czyli od a do z
		//String regex = "[A-Z]"; //true kiedy jedna duza litera
		//String regex = "[0-9]" //true kiedy jedna cyfra
		//String regex = "[a-z&[^abc]]"; //true kiedy jedna mala litera ale ani a, ani b, ani c
		//String regex = "\\d"; //to samo co [0-9]
		//String regex = "\\w"; //to samo co [a-zA-Z_0-9] czyli jedna litera mala lub duza
		//String regex = "."; //dowolny jeden znak jakikolwiek
		//String regex = "\\."; //kropka
		
		//https://docs.oracle.com/javase/tutorial/essential/regex/
		
		String regex = "[a-z]?"; //jeden znak - mala litera lub zero znakow
		//String regex = "[a-z]*"; //zero lub wiecej wystepiaen malej litery
		//String regex = "[a-z]+"; //co najmniej jedno wystapienie malej lietry
		//String regex = "[a-z]{3}"; //mala litera ma wystapic dokladnie 3 razy
		//String regex = "[a-z]{2,}"; //mala litera moze wystapic 2 lub wiecej razy
		//String regex = "[a-z]{3, 6}"; //mala lietra ma wystapic od 3 do 6 razy
		
		//String regex = "(ala|ola|ewa)"; //ma byc dokladnie albo ala, albo ola albo ewa
		//String regex = "(ala){3}"; //dokladnie 3 razy ma wystapic ala
		
		//zad1
		//napis zawiera imie i nazwisko
		//imie ma zaczynaci sie z duzej litery i miec w sobie same male litery, nazwisko taki
		//sam warunek jak imie, imie i nazwisko maja byc oddzielone spacja np
		//Lukasz Magiera
		//String regex = "[A-Z][a-z]+ [A-Z][a-z]+";
		
		//adres zamieszkania
		//ul. Bobkowa xxx 32-100 Wawa Polska
		//String regex = "ul\\. [A-Z][a-z]+ [1-9][0-9]{0,2} [0-9]{2}-[0-9]{3} [A-Z][a-z]+ [A-Z][a-z]+";
		
		Scanner sc = new Scanner(System.in);
		String s = "";
		
		do
		{
			System.out.println("Podaj napis");
			s = sc.nextLine();
		}while(!s.matches(regex)); //matches to metoda ktora zwraca true kiedy napis pasuje do wyrazenia regulanrego

		//String[] tab = s.split(" ");
		System.out.println("END");
		
		
		//dlaczego w java piszemy \\d a nie \d?
		//\ w java oczekuje ze dasz po nim znak specjalny np n czyli masz \n co oznacza nowa linie
		//innym znakiem specjalnym jest \t czyli tabulator
		//kiedy chcesz zeby \ byl traktowany jak typowy \ musisz zapisac \\
		
		//w klasie String (i nie tylko) jest kilka miesjc gdzie mozna zastosowac wyrazenia regularne
		String ss = "siedzi malpa w malpim i je banana";
		//ss = ss.replaceAll("[abc]", "*");
		//System.out.println(ss);
		
		String[] tab = ss.split("mal");
		System.out.println(Arrays.toString(tab));
		
		
		
	}

}
