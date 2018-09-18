
public class Kwadrat extends Figura{
	public Kwadrat(){}
	
	public Kwadrat(double a)
	{
		super(a);
	}
	
	@Override
	public double pole() {
		return getA() * getA();
	}
	
	@Override
	public double obwod() {
		return 4 * getA();
	}
	
	@Override
	public String toString() {
		return "Kwadrat: a = " + getA();
	}
}
