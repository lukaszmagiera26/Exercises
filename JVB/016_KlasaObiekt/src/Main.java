
public class Main {

	public static void main(String[] args) {
		// tutaj utworzymy OBIEKT klasy, czyli konkretny egzemplarz ktory ma juz konkretne imie,
		//nazwisko itd, nowe obiekty tworzymy ZAWSZE za pomoca new
		Person p2 = new Person(); //po new piszesz Person(), jest to tzw konstruktor ale
		//o nim dopiero bedziemy mowic, jest to konstruktor bezargumentowy
		System.out.println("P2 -> " + p2.getName() + " " + p2.getSurname());
		
		Person p1 = new Person("Antek", "Bocian", 32, 66.6);
		
		//nie moge tak jak ponizej bo pola skladowe sa private
		//p1.name = "Adam";
		//p1.age = 10;
		
		/*p1.setName("KAZIK");
		p1.setSurname("Nowak");
		p1.setAge(-20);
		p1.setWeight(55.5);*/
		
		if(p1.isAdult())
		{
			System.out.println("Person is adult");
		}
		
		System.out.println(p1.getName() + " " + p1.getSurname());

	}

}
