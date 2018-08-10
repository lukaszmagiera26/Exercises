
public class Silnik {
	private double spalanie;

	public Silnik(){}
	
	public Silnik(double spalanie) {
		super();
		this.spalanie = spalanie;
	}

	public double getSpalanie() {
		return spalanie;
	}

	public void setSpalanie(double spalanie) {
		this.spalanie = spalanie;
	}

	@Override
	public String toString() {
		return "Silnik [spalanie=" + spalanie + "]";
	}
	
	
}
