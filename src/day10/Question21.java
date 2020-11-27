package day10;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice + _ * /");
		char choice = input.next().charAt(0);
		
		

		int a = 0, b = 0, result = 0;
		if (choice == '+' || choice == '-' || choice == '*' || choice == '/')
			;
		System.out.println("Enter number1: ");
		a = input.nextInt();
		System.out.println("Enter number2: ");
		b = input.nextInt();

		switch (choice) {
		case '+':
			result = a + b;
			System.out.println("Sum is:" + result);
			break;

		case '-':
			result = a - b;
			System.out.println("Sum is:" + result);
			break;

		case '*':
			System.out.println("this is multiplication");
			break;

		case '/':
			result = a / b;
			System.out.println("Sum is:" + result);
			break;

		default:
			System.out.println("wrong choice");
			break;
			
			
		

		}// end

	}

}
