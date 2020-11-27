package day7;

public class TypeCastingDemo2 {

	public static void main(String[] args) {

		byte b = 122;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;

		System.out.println(b);// result 122
		System.out.println(s);// result 122
		System.out.println(i);// result 122
		System.out.println(l);// result 122
		System.out.println(f);// result 122.0
		System.out.println(d);// result 122,0

	}

}
