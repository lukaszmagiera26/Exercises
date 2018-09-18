package abstractClasses;


public  class PersonTest {

	public static void main(String[] args) {
		
		Person[] people = new Person[2];
		
		people[0] = new Employee("Henryk Kwitek", 5000, 1998, 10, 1);
		people[1] = new Student("Maria Mrozowska", "Informatyka");
		
		
		for (Person p : people) {
			System.out.println(p.getName() + " " + p.getDescription());
		}
		
		
		
	}

}
