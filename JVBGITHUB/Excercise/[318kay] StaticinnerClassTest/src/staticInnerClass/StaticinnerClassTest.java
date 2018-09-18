package staticInnerClass;
import java.util.Random;

import staticInnerClass.ArrayAlg.Pair;

public class StaticinnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double[] d = new double[20];
	
		for (int i = 0; i < d.length; i++) 
			d[i] =  Math.random() ;
		
		ArrayAlg.Pair p = ArrayAlg.maxmin(d);
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
		
}
}




class ArrayAlg{
	
	public static class Pair{
		
		private double first;
		private double second;
		
		public Pair(double f, double s){
			first = f;
			second = s;
		}
		
		public double getFirst(){
			return first;
			
		}
		
		public double getSecond(){
			return second;
		}
	}
		
		
		
		public static Pair maxmin(double[] values){
			double min = Double.POSITIVE_INFINITY ;
			double max = Double.NEGATIVE_INFINITY ;
			for( double v : values){
				System.out.println("o "+ min);
				System.out.println("s "+ max);
				if(min > v)  min = v ;
				if(max < v)  max = v ;
				
			}
			return new Pair(min, max);
		}



	
		
	}
	
	
	
	
	
	
