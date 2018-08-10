
public class Samochod {
	private String model;
	private Silnik silnik;
	private Nadwozie nadwozie;
	
	public Samochod(){}
	
	public Samochod(String model, Silnik silnik, Nadwozie nadwozie) {
		super();
		this.model = model;
		this.silnik = silnik;
		this.nadwozie = nadwozie;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Silnik getSilnik() {
		return silnik;
	}
	public void setSilnik(Silnik silnik) {
		this.silnik = silnik;
	}
	public Nadwozie getNadwozie() {
		return nadwozie;
	}
	public void setNadwozie(Nadwozie nadwozie) {
		this.nadwozie = nadwozie;
	}

	@Override
	public String toString() {
		return "Samochod [model=" + model + ", silnik=" + silnik + ", nadwozie=" + nadwozie + "]";
	}
	
	
	
	
}
