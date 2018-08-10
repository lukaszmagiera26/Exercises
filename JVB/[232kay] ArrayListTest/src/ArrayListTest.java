import java.util.ArrayList;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Employee> staff = new ArrayList <>();
		
		
		staff.add(new Employee("Artur", 4000, 2005, 3, 6));
		staff.add(new Employee("Artur", 4000, 2005, 3, 6));
		
		for (Employee e : staff){
			e.raiseSalary(10);
			
		}
		
		for (Employee e : staff){
			System.out.println(" name " + e.getName() + " salary " + e.getSalary());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
