package tns1;

public class Typecasting {
	public static void main(String[] args) {
		//implicit
		char a='s';
		int i =a;
		System.out.println(i);
		
		int e=324;
		double f=e;
		System.out.println(f);
		
		
		//explicit
		long l=241435521;
		double d=(double) l;
		System.out.println(d);
		
		byte s=122;
		short w=(short) s;
		System.out.println(w);
	}

}
