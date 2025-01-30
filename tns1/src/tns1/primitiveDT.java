package tns1;

public class primitiveDT {
	public static void main(String[] args) {
		byte byteMin=-128;
		byte byteMax=127;
		System.out.println("min range of byte "+byteMin);
		System.out.println("Max range of byte "+byteMax);

		short shortMax=32767;
		short shortMin=-32768;
		System.out.println("min range of short "+shortMin);
		System.out.println("Max range of short "+shortMax);

		int intMax=2147483647;
		int intMin=-2147483648;
		System.out.println("min range of short "+intMax);
		System.out.println("Max range of short "+intMin);
		
		long longMin=-9223372036854775808L;
		long longMax=9223372036854775807L;
		System.out.println("min range of short "+longMin);
		System.out.println("Max range of short "+longMax);
	}

}
