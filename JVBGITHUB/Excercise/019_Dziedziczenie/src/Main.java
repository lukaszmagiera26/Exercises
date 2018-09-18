
public class Main {

	public static void personPresentation(Person p)
	{
		p.planDnia();
		Person.metodaStatyczna();
		
		 //z racji tego ze metoda statyczna nie moze byc
		//override ZAWSZE siegnie do metody z klasy ktora podales jako argument
		//w naglowku metody, racej tez uzywaj odniesienia do metody statycznej
		//za pomoca klasy
	}
	public static void main(String[] args) {
		Person p = new Person("Jan", "Kowalski", 34);
		personPresentation(p);
		
		Worker w = new Worker("Tomek", "Noga", 22, "stolarz", 4000);
		personPresentation(w); //wszedzie tam gdzie mozesz uzyc obiekt klasy
		//Person to i jestes w stanie uzyc obiekt klasy pochodnej u nas Worker
		//POLIMORFIZMM: jedna metoda moze zostac wiele razy z wielomia roznymi
		//klasami dzieki dziedziczeniu
		//teraz kiedy jako argument przekazujesz obikt klasy Worker 
		//metoda personPresentation wywola metode planDnia ale ta wersje z klasy
		//Worker czyli pod uage ta klase ktorej obiekt jest aktualnie 
		//wywolywany
		
		//przesloniecie - kiedy wywolasz w to masz metode z Worker a jak p
		//to masz metode z Person
		//p.metodaStatyczna();
		//w.metodaStatyczna();
		
		System.out.println(p.toString());
		System.out.println(w.toString());
		

	}

}
