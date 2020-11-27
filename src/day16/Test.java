package day16;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Solution obj = new Solution();// object created for solution class
        Scanner input = new Scanner(System.in);
	    String decision = "";

		do {
			System.out.println("Enter your choice: factorial|prime");
			String choice = input.next();
			
			switch (choice) {
			case "factorial":
				System.out.println("Enter number to find factorial: ");
				int n = input.nextInt();
				int fact = obj.findFactorial(n);
				System.out.println("Factorial of " + n + " is: " + fact);
				break;
			case "prime":
				System.out.println("Enter number to find prime: ");
				n = input.nextInt();
				boolean isPrime = obj.isPrimeNumber(n);

				if (isPrime) {
					System.out.println(n + "is a prime number. ");
				} else {
					System.out.println(n + "is not a prime number.");
				}
				break;

			default:
				break;
			}
			System.out.println("do you want to continue?");
			decision = input.next();
			
		} while (decision.equalsIgnoreCase("yes"));
		
		System.out.println("Happy coding!!!");
		input.close();
	}

}

