//w interfejsie wszystkie skladniki moga byc tylko i wylacznie
//public - nie ma sensu pisac public zatem skoro i tak jest on domyslny

//w interfejsie mamy 3 rodzaje metod:
//abstrakcyjne
//domyslne 
//statyczne
public interface MojInterface {
	void aMethod(); //nie musisz pisac abstract bo jest domyslnie
	
	//metoda domyslna to taka, ktora ma cialo juz w interfejsie
	//oraz mozesz ja przeciazyc w klasie ktora interfejs implementuje
	default void dMethod()
	{
		System.out.println("Metoda domyslna");
	}
	
	//metoda statyczna to taka, ktora ma cialo juz w interfejsie
	//ale jej nie wolno przeciazac w klasie ktora interfejs implementuje
	static void sMethod()
	{
		System.out.println("Metoda statyczna");
	}
	
	//interfejs moze zawierac rowniez zmienne ale te zmienne
	//moga byc tylko final static
	int VALUE = 10;
}
