
public class MenagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menager boss = new Menager("Karol Parol", 5000, 2000, 12, 11);
		
		boss.setBonus(2000);
		
		Employee[] staff = new Employee[3];
		
		staff[0] = boss;
		staff[1] = new Employee("Henryk Kwiatek", 4000, 2002, 02, 05);
		staff[2] = new Employee("Artur Kwiatkowski", 3000, 2003, 04, 07);
		
		for (Employee e : staff)
		System.out.println("name = " + e.getName() + "   salary = " + e.getSalary() + "     Data zatrudnienia " + e.getHireDay());
		
		
	}

}
