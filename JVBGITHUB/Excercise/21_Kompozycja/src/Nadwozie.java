
public class Nadwozie {
	private String kolor;

	public Nadwozie(){}
	
	public Nadwozie(String kolor) {
		super();
		this.kolor = kolor;
	}

	public String getKolor() {
		return kolor;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}

	@Override
	public String toString() {
		return "Nadwozie [kolor=" + kolor + "]";
	}
	
	
	
}
