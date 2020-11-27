package day4;

import java.util.Scanner;

public class SumDemo2 {

	public static void main(String[] args) {

		// Scanner is library class of java
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int a = input.nextInt();
		System.out.println("Enter number2: ");
		int b = input.nextInt();
		System.out.println("sum of " + (a + b));
		System.out.println("sub of " + (a - b));
		System.out.println("mul of " + (a * b));
		System.out.println("div of " + (a / b));

		input.close();

		// double average =(double) sum/2;
		// System.out.println("average is: "+average);

	}

}
