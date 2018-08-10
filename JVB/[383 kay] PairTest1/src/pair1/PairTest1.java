package pair1;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
* @version 1.01 2012-01-26
* @author Cay Horstmann
*/
public class PairTest1
{
public static void main(String[] args)
{
String[] words = { "Ala", "ma", "kota", "i", "psa" };
Pair<String> mm = ArrayAlg.minmax(words);
System.out.println("min = " + mm.getFirst());
System.out.println("max = " + mm.getSecond());
}
}
class ArrayAlg
{
/**
* Pobiera najmniejsz¹ i najwiêksz¹ wartoœæ z tablicy ³añcuchów
* @param a tablica ³añcuchów
* @return z³o¿ona z najmniejszej i najwiêkszej wartoœci lub null, jeœli tablica „a” jest null b¹dŸ pusta
*/
public static Pair<String> minmax(String[] a)
{
if (a == null || a.length == 0) return null;
String min = a[0];
String max = a[0];
for (int i = 1; i < a.length; i++)


{
if (min.compareTo(a[i]) > 0) min = a[i];
if (max.compareTo(a[i]) < 0) max = a[i];
System.out.println(a[i]);
System.out.println("0" + min);
}

return new Pair<>(min, max);
}

}