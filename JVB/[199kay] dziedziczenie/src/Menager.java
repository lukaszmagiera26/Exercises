
public class Menager extends Employee {
	
	
	private double bonus;
	
	public Menager(String n, double s, int year, int month, int day){
		
		super(n, s, year, month, day);
		bonus = 0;
	}

	
	public double getSalary(){
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	
	public void setBonus(double b){
		bonus = b;
		
	};
	
	
	
	

}
