
public class CloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
			Employee orginal = new Employee("Jan W. Kowalski", 50000);
			orginal.setHireDay(2000,1,1);
			Employee copy = orginal.clone();
			copy.raiseSalary(10);
			copy.setHireDay(2002, 12, 31);
			System.out.println("orginal= " + orginal);
			System.out.println("copy= " + copy);
			
			
			
		}
		
		catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
