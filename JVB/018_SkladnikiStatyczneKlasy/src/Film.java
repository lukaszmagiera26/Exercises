
public class Film {
	private String tytul;
	private String gatunek;
	private double cena;
	private static double znizka;
	
	public Film() {
		// TODO Auto-generated constructor stub
	}
	
	public Film(String tytul, String gatunek, double cena) {
		super();
		this.tytul = tytul;
		this.gatunek = gatunek;
		this.cena = cena;
	}
	public String getTytul() {
		return tytul;
	}
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public String getGatunek() {
		return gatunek;
	}
	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	//napiszemy wlasna metode niestatyczna ktora zwraca cene filmu
	//po uwzglednieniu znizki
	public double cenaPoZnizce()
	{
		return cena * znizka; //zmienne statyczne jak i metody statyczne mozesz
		//uzywac w metodach niestatycznej
	}
	
	//metody statyczne operuja TYLKO i wylacznie na zmiennych statycznych
	//wynika to z charakteru metody stayycznej, metody statyczne podobnie jak i
	//zmienne statyczne sa tworzone na dlugo przed tym jak utworzysz jakikolwiek obiekt klasy
	//w zwiazku moze dojsc do sytuacji ze bedziesz chcial skorzystac z metody statycznej
	//zanim jeszcze utworzysz jakikolwiek obiekt klasy, wiec do ktorego obiektu mialbys
	//sie odwolac gdybys mogl w metodzie statycznej uzyc zmiennej cena?
	public static double getZnizka() {
		//cena = 0; //nie mozesz odwolac sie do zmiennej niestatycznej
		//w metodzie statycznej
		return znizka;
	}
	public static void setZnizka(double znizka) {
		Film.znizka = znizka;
	}

	@Override
	public String toString() {
		return "Film [tytul=" + tytul + ", gatunek=" + gatunek + ", cena=" + cena + "]";
	}
	
	//metody statyczne czesto uzywamy do ogolnych operacji na obiekcie lub obiektach
	//klasy
	//napiszmy metode ktora z tablicy filmow zwraca film o najwiekszej cenie
	public static Film filmOMaxCenie(Film[] filmy)
	{
		if (filmy == null)
		{
			return null;
		}
		else if (filmy.length == 1)
		{
			return filmy[0];
		}
		else
		{
			Film maxFilm = filmy[0];
			for (int i = 1; i < filmy.length; i++) {
				//warunek ? zwraca_gdy_prawdziwy : zwraca_gdy_falszywy
				maxFilm = maxFilm.getCena() > filmy[i].getCena() ? maxFilm : filmy[i];
			}
			return maxFilm;
		}
	}
	
	
}
