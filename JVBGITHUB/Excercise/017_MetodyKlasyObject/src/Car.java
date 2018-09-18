
public class Car {
	private String name;
	private String color;
	private double price;
	private int milleage;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String color, double price, int milleage) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.milleage = milleage;
	}

	//alt + shift + s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMilleage() {
		return milleage;
	}
	public void setMilleage(int milleage) {
		this.milleage = milleage;
	}

	//zajmuja sie operacja hashowania
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + milleage;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	//metoda equals sluzyla do porownywania obiektow
	//w java unikamy porownywania obiektow za pomoca == bo to zawse prowadzi do porownania 
	//obszarow pamieci a nie obiektow w sensie ich zawartosci
	@Override
	public boolean equals(Object obj) {
		//na poczatek sprawdzamy czy lewa strona nie jest rowna prawej stronie 
		//pod katem tego samego obszaru
		if (this == obj)
			return true; //jezeli sa rowne to zwracamy true bo po co porownywac dalej
		if (obj == null) //jezeli obiekt po prawej jest null to nie ma sensu porownywac
			//bo this nie moze byc null wiec mamy false
			return false;
		//z racji tego ze po prawej stronie jako argument masz Object
		//mozesz miec sytuacje ze w argumencie nie dostaniesz obiektu Car
		//a jakis inny bo Object przyjmie wszystko, dlatego
		//wato sprawdzic czy mamy do czynienia z ta sama klasa
		if (getClass() != obj.getClass())
			return false; //jezeli nie mamy po prawej stronie obiektu klasy Car to false
		Car other = (Car) obj; //w tym momencie mamy juz pewnosc ze jako argument
		//przyszedl do nas niepusty obiekt klasy Car, dlatego go rzutujemy na Car
		//zeby moc odwolywac sie do skladnikow klasy Car
		//ponizej masz juz klasyczne porownywanie poszczegolnych pol
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (milleage != other.milleage)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + ", milleage=" + milleage + "]";
	}
	
	//przeladujemy metode equals - nacisnij alt + shift + s i wybierz metode equals
	
	
	
}
