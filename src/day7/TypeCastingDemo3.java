package day7;

public class TypeCastingDemo3 {

	public static void main(String[] args) {
		// explict conversion i.e done forcefully by programmer (by us)

		double d = 123.45;
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;
		short s = (short) i;
		byte b = (byte) s;
		System.out.println(d);// result 123.45
		System.out.println(f);// result 123.45
		System.out.println(l);// result 123 value vary
		System.out.println(i);// result 123 value vary
		System.out.println(s);// result 123 valur vary
		System.out.println(b);// result 123 vary

		// result vary is case sensitive suppose in bank's loosing $.45,prgrammer shoul
		// avoid this

	}

}
