
//slowo kluczowe final dla klasy oznacza ze nie wolne po niej
//dziedziczyc

//klasa abstrakcyjna to taka ktora ma w sobie co najmniej jedna
//metode abstrakcyjna, nie wolno od tej klasy tworzyc obiektow
public abstract /*final*/ class Figura {
	private double a;

	public Figura(){}
	
	public Figura(double a) {
		super();
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Figura: a = " + a;
	}
	
	//metody oznaczonej slowem kluczowym final nie wolno przeciazac
	public abstract/*final*/ double pole();
	public abstract double obwod();
	
	
}
