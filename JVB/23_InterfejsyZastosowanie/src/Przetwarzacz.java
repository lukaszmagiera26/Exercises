//zastosujemy typy generyczne ktore pozwola nam
//na dynamiczne podawanie typu, kiedy juz bedziesz interfejs wywolywal

@FunctionalInterface
public interface Przetwarzacz<T> {
	void przetwarzaj(T t);
}
