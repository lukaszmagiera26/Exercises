package abstractClasses;


import java.time.*;


public  class Employee extends Person{
		
		private double salary;
		private LocalDate hireDay;
		
		public Employee(String n, double salary, int year, int month, int day){
			super(n);
			this.salary = salary;
			hireDay = LocalDate.of(year, month, day);
		
		}
		
		public double getSalary(){
			return salary;
		}

		public LocalDate getHireDay(){
			return hireDay;
		}
		
		public String getDescription(){
			return String.format("pracownik zarabiajacy %.2f zl", salary);
		}
		
		public void raiseSalary(double byPersent)
		{
			double raise = salary * byPersent / 100;
			salary += raise;
		}
		
		
		
	
	
	
	

}
