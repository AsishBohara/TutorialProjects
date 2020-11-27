package day8;

import java.util.Scanner;

public class Question11b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		System.out.println("Before swapping a is: " + a);
		System.out.println("Before swapping b is: " + b);

		a = a + b;// 11
		b = a - b; // 5
		a = a - b;// 6

		System.out.println("after swapping a: " + a);
		System.out.println("after swapping b: " + b);
		input.close();

	}

}
