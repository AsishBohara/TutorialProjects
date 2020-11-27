package day9;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();

		if (n >= 0 && n <= 128) {
			char c = (char) n;
			System.out.println("corresponding ASCII code is:" + c);
		} else {
			System.out.println("you have entered invalid number");
			input.close();
		}

	}

}
