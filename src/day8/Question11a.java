package day8;

import java.util.Scanner;

public class Question11a {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		System.out.println("Before swapping a is: " + a);
		System.out.println("Before swapping b is: " + b);

		int temp = a;// 5
		a = b; // 6
		b = temp;// 5

		System.out.println("after swapping a: " + a);
		System.out.println("after swapping b: " + b);
        input.close();
	}

}
