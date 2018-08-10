
public class Prostokat extends Kwadrat{
	private double b;

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Prostokat(){}
	public Prostokat(double a, double b) {
		super(a);
		this.b = b;
	}
	
	@Override
	public double pole() {
		return getA() * b;
	}
	
	@Override
	public double obwod() {
		return 2 * (getA() + b);
	}
	
	@Override
	public String toString() {
		return "Prostokat: a = " + getA() + " b = " + b;
	}
}
