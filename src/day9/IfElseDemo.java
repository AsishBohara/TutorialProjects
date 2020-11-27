package day9;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {

		// Question no. 16

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find even or odd");
		int n = input.nextInt();

		if (n % 2 == 0) { // true) any no. divisible is even we use modules for such case
			System.out.println(n + "is an even number.");
		} else { // false
			System.out.println(n + " is an odd number.");

		}
		System.out.println("more codes");
		System.out.println("exit");
		input.close();
	}

}
