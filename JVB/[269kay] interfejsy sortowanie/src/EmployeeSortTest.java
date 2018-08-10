import java.lang.reflect.Array;
import java.util.Arrays;

public class EmployeeSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Artur", 2000, 2001, 2, 5);
		staff[1] = new Employee("Marek", 6000, 2002, 4, 22);
		staff[2] = new Employee("Wojtek", 4000, 2004, 4, 7);
		
		
		
		Arrays.sort(staff);
		
		for (Employee e : staff){
			System.out.println(" name " + e.getName() + " salary " + e.getSalary());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
