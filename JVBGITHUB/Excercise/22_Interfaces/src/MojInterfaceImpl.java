
public class MojInterfaceImpl implements MojInterface{

	@Override
	public void aMethod() {
		System.out.println("Metoda abstrakcyjna w klasie");
		
	}

	//mozesz przeciazac metody domyslne
	@Override
	public void dMethod() {
		//tak jak ponizej mozesz odwolac sie do metody domyslnej z 
		//interfejsu
		//MojInterface.super.dMethod();
		
		System.out.println("Metoda domyslna w klasie");
	}
	
	//przesloniecie
	static void sMethod()
	{
		System.out.println("Metoda statyczna w klasie");
	}
}
