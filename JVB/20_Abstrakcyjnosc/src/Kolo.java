
public class Kolo extends Figura {
	
	public Kolo(){}
	public Kolo(double a)
	{
		super(a);
	}
	
	@Override
	public String toString() {
		return "Kolo: a = " + getA();
	}
	
	@Override
	public double pole() {
		return Math.PI * getA() * getA();
	}
	
	@Override
	public double obwod() {
		return 2 * Math.PI * getA();
	}
}
