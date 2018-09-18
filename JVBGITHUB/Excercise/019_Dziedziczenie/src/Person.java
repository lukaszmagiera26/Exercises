//kiedy napiszesz final to znaczy ze nie chcesz zeby Twoja klasa byla
//dziedziczona, czyli nie wolno robic extends po klasie Person
public /*final*/ class Person {
	//kiedy oznaczasz pola jako private to sa one niewidoczne poza klasa
	//rowniez klasy pochodne nie maja do nich dostepu
	protected String name; //protected daje nieograniczony doste do zmiennej name
	//w tym przypadku dla klas pochodnych i wszystkich ktore sa w tej samej paczce 
	//co Person
	protected String surname; 
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		this.age = age;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, String surname, int age) {

		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	//final przy metodzie oznacza ze nie mozesz tej metody przeladowac w klasie
	//pochodnej
	public /*final*/ void planDnia()
	{
		System.out.println("1. POBUDKA");
		System.out.println("2. LENIUCHOWANIE");
		System.out.println("3. SEN");
	}
	
	//METODY STATYCZNE NIE SA PRZECIAZALNE CZYLI NIE MOZESZ DLA NICH
	//ZROBIC override
	public static void metodaStatyczna()
	{
		System.out.println("PERSON");
	}
	@Override
	public String toString() {
		return name + " " + surname + " " + age;
	}
	
	
	

}
