

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee {
	private String name;
	private double salary;
	private Date hireDay;

	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

public boolean equals(Object otherObject)
{
// Sprawdzenie, czy obiekty s¹ identyczne
if (this == otherObject) return true;
// Musi zwróciæ false, jeœli jawny parametr jest null
if (otherObject == null) return false;
// Jeœli klasy nie zgadzaj¹ siê, nie mog¹ byæ jednakowe

if (getClass() != otherObject.getClass()) return false;
//Teraz wiadomo, ¿e otherObject jest typu Employee i nie jest null
Employee other = (Employee) otherObject;
//Sprawdzenie, czy pola maj¹ identyczne wartoœci
return Objects.equals(name, other.name) && salary == other.salary &&
Objects.equals(hireDay, other.hireDay);
}

	public int hashCode() {
		return Objects.hash(name, salary, hireDay);
	}

public String toString()
{
return getClass().getName() + "[name=" + name + ",salary=" + salary +
",hireDay=" + hireDay
+ "]";
}
}