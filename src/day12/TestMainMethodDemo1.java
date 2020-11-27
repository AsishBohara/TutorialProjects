package day12;

import java.util.Scanner;

public class TestMainMethodDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter choice: ");
		String choice = input.next();
		
		input.close();
		
		switch (choice) {
		case"hello":
			Method.sayHello();
			break;
		case "hi":
		Method.sayHi();
		break;
		case "greet":
			Method.greet();
			break;
		
		default:
			System.out.println("wrong choice");
			break;
			
			
		}

	}

}
