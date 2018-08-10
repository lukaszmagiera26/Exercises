//klasa Worker dzieki extends Person automatycznie uzyskuje pola i metody z klasy
//Person oprocz konstruktorow
public class Worker extends Person{
	private String specialization;
	private double salary;
	
	//klasa pochodna nie dziedziczy konstruktorow
	//ale klasa pochodna moze z konstruktorow klasy bazowej korzystac
	public Worker() {
		//zeby wykorzystac konstrukor z klasy bazowej musisz w pierwszym
		//wierszu konstruktora napisac super - slowo kluczowe ktore odnosi sie
		//do klasy bazowej a w naszym przypadku do konstuktora klasy bazowej
		super(); //wywolales konstruktor bezargumentowy klasy bazowej
	}
	
	//tak naprawde zawsze podczas tworzenia obiktu klasy pochodnej wywolywany
	//jest konstruktor klasy bazowej, od Ciebie zalezy jaki to bedzie konstruktor
	//czy to bedzie konstruktor bezargumntowy czy argumentowy a jezeli nie 
	//napiszesz nic to DOMYSLNIE BEDZIE WYWOLANY KONSTRUKTOR BEZARGUMENTOWY
	
	public Worker(String name, String surname, int age, String specialization, double salary) {
		super(name, surname, age); //wywolujemy konstruktor klasy bazowej argumntowy
		this.specialization = specialization;
		this.salary = salary;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//w klasie pochodnej mozesz na nowo napisac sobie nowa wersje metody z klasy
	//bazowej - przeciazenie / override
	
	@Override //nie jest obowiazkowe bo override i tak nastapi
	//natomiast jego brak moze spowodowac ze kiedy zrobisz literowke
	//to bedziesz dwie metody
	public void planDnia()
	{                        
		System.out.println("1. POBUDKA");
		System.out.println("2. PRACA");
		System.out.println("3. OBIAD");
		System.out.println("4. PRACA");
		System.out.println("5. SEN");
		
		//jezeli z jakiegos powodu chcesz odwolac sie do metody z klasy bazowej
		//a masz taka sama w klasie pochodnej to uzyj
		//super.planDnia();
	}
	
	//moge co najwyzej przeslonic metode statyczna
	public static void metodaStatyczna()
	{
		System.out.println("WORKER");
	}
	
	@Override
	public String toString() {
		//super.toString()
		return name + " " + getSurname() + " " + getAge() + " " + specialization + " " + salary;
	}
	
}
