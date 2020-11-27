package day7;

public class TypeCastingDemo1 {

	public static void main(String[] args) {
		// implicit conversion as below
		// byte => short => int => long => float =>double ( note: there may be conflict
		// on int & char but flw is same)

		// exlicit conversion (i.e mean forcefully done by us, just as coming backward
		// formation)

		//

		// implicit conversion
		// by java cmplier
		byte b1 = 127;
		int i1 = b1;
		System.out.println(b1);// result 127
		System.out.println(i1);// result 127

		// explicit conversion
		// by java programmer i.e hami
		int i2 = 127;
		byte b2 = (byte) i2;
		System.out.println(i2);// result 127
		System.out.println(b2);// result 127

		int i3 = 200;
		byte b3 = (byte) i3;
		System.out.println(i3);// result 127
		System.out.println(b3);// result throws garbase value -56

		double d = 300.56;
		int i = (int) d;
		System.out.println(d);// result 300.56
		System.out.println(i);// result 300 i.e case sensitive by soing forcly,(.56) is loss as it gives only
								// 300

		// no type conversion in case of boolen. not even forcefully, i.e nt type
		// casting in boolean)

	}

}
