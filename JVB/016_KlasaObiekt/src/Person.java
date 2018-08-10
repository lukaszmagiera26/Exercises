import java.util.Scanner;

//klasa okresla co ma w sobie dany byt, jest to szablon ktory mowi co ma kazda osoba
//czyli w naszym przypadku klasa Person okresla co ma w sobie kazda osoba
public class Person {
	//4 zmienne ponizej to tzw pola skladowe klasy
	//sluza do szczegolowego opisu obiektu czyli u nas pojedynczej osoby
	private String name;
	private String surname;
	private int age;
	private double weight;
	//private - skladnik widoczny TYLKO w klasie w ktorej zostal utworzony
	//public - skladnik widoczny wszedzie w klasie i poza klasa
	//pola skladowe ukrywamy zeby zastosowac sie do praw enkapsulacji
	
	
	//konstruktor
	//jest to specjalna metoda, ktora ma taka sama nazwe jak klasa
	//ktora nic nie zwraca nawet void i najczesciej jest public
	//i jej zadaniem jest inicjalizowanie wartosciami poczatkowymi
	//pol skladowych klasy
	public Person(String name, String surname, int age, double weight)
	{
		//tutaj bezposrednio przypisujesz wartosci argumntow konstruktoa
		//do pol skladowych - omijasz walidacje ktora przygotowalismy w setterach
		//owszem jezeli takeiej nie masz to mozesz ja pominac i pisac jak ponizej
		//ale jak napisales settery z walidacja to wtedy dobrze by bylo zebys ta walidacje
		//uwzglednil rowniez w konstruktorze
		/*
		this.name = name;
		this.age = age;
		this.surname = surname;
		this.weight = weight;
		*/
		
		setName(name);
		setSurname(surname);
		setAge(age);
		setWeight(weight);
	}
	
	//kiedy w programie nie zrobisz zadnego konstruktora, to nastepuje
	//wygenerowanie domyslnie
	//konstruktora bezargumentowego - sam kompilator o to dba nie musisz nic robic
	//przypisuje wtedy wartosci domyslne do pol skladowych klasy takie jak 0, null
	//ale kiedy wygenerujesz chociaz jeden konstruktor "wlasnorecznie" to 
	//kompilator sie 
	//wycofuje i nie robi juz zadnego konstruktora wiec bezarguentowy rowniez
	//musisz zrobic sam
	public Person()
	{
		//nie musisz nic w nim robic, wtedy zachowuje sie jak domyslnie generowany
		//czyli
		//przypisze do pol wartosci defaultowe patrz 0 i nulle, ale mozesz zrobic
		//rowniez
		//kazdy sposob inicjlazacji np pobierac dane od usera
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj imie");
		setName(sc.nextLine());
		System.out.println("Podaj nazwisko");
		setSurname(sc.nextLine());
		System.out.println("Podaj wiek");
		setAge(Integer.parseInt(sc.nextLine()));
		System.out.println("Podaj wage");
		setWeight(Double.parseDouble(sc.nextLine()));
	}
	
	//dostepem do pol skladowych zajmuja sie metody get i set
	//tzw akcesory
	//dobrze jest dla kazdego pola takie napisac / wygenerowac
	//uzyj albo skrot alt + shift + s albo prawym przyciskiem myszki -> Source 
	//i wybierz
	//genrowanie setterow i gettero
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//this pozwala sie odwolac do pola skladowego klasy i odroznic je 
		//od argumentu settera
		
		//mozesz za pomoca setterow walidowac zmienne ktore przychodza do klasy
		//np chcemy zeby name byl zawsze z duzych liter
		if (name.matches("[A-Z]+"))
		{
			this.name = name;
		}
		else
		{
			System.out.println("Error - field name");
			this.name = "JACEK";
		}
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age > 0)
		{
			this.age = age;
		}
		else
		{
			System.out.println("Error - field age");
			this.age = 10;
		}
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//napiszemy metode skladowa ktora sprawdza czy osoba jest pelnoletnia
	public boolean isAdult()
	{
		//tutaj nie musisz sie martwic ze wiek np jest ujemny bo dzieki setterowi masz 
		//mozliwosc przewalidowac wiek i sprawic zeby zawsze mial poprawna wartosc 
		//czyli w naszym przypadku dodatnia
		return age >= 18;
	}

}
