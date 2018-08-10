import java.util.*;
/**
* Program demonstruj¹cy u¿ycie mapy z kluczami typu String i wartoœciami typu Employee
* @version 1.11 2012-01-26
* @author Cay Horstmann
*/
public class MapTest
{
public static void main(String[] args)
{
Map<String, Employee> staff = new HashMap<>();
staff.put("144-25-5464", new Employee("Anna Kowalska"));
staff.put("567-24-2546", new Employee("Henryk Kwiatek"));
staff.put("157-62-7935", new Employee("Marcin Nowak"));
staff.put("456-62-5527", new Employee("Franciszek Frankowski"));
// wydruk wszystkich pozycji
System.out.println(staff);
// usuniêcie wartoœci
staff.remove("567-24-2546");
// podmienienie pozycji
staff.put("456-62-5527", new Employee("Weronika Kowalska"));


//wyszukanie wartoœci
System.out.println(staff.get("157-62-7935"));
//iteracja przez wszystkie pozycje
for (Map.Entry<String, Employee> entry : staff.entrySet())
{
String key = entry.getKey();
Employee value = entry.getValue();
System.out.println("key=" + key + ", value=" + value);
}
}
}





