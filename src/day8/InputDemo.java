package day8;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Float ");
		float f = input.nextFloat();
		System.out.println("Enter any character: ");
		char c = input.next().charAt(0);
		System.out.println("Enter byte: ");
		byte b = input.nextByte();
		System.out.println("Enter short number: ");
		short s = input.nextShort();
		System.out.println("Enter long number: ");
		long l = input.nextLong();
		System.out.println("Enter boolean value: ");
		boolean bb = input.nextBoolean();

		System.out.println("float value is: " + f);
		System.out.println("short value is: " + s);
		System.out.println("byte value is: " + b);
		System.out.println("char value is: " + c);
		System.out.println("long value is: " + l);
		System.out.println("boolean value is: " + bb);
		input.close();
	}

}
