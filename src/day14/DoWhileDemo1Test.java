package day14;

import java.util.Scanner;

public class DoWhileDemo1Test {

	public static void main(String[] args) {
		DoWhileDemo1 obj = new DoWhileDemo1();
		Scanner input = new Scanner(System.in);
		
		String decision = " ";
		
		do {
			
			System.out.println("Enter choice: table| sum| reverse");
			String choice = input.next();
			
		switch (choice) {
		case "table":
			System.out.println("Enter number to find table: ");
			int n = input.nextInt();
			obj.printTable(n);
			break;
			
		case "sum":
			System.out.println("Enter number to find nth sum: ");
			n = input.nextInt();
			obj.findNthSum(n);
			break;
			
			
		case "reverse":
			System.out.println("Enter number to reversal");
			int originalNumber = input.nextInt();
			obj.reverseNumber(originalNumber);
			break;
			
			default:
				System.out.println("wrong choice!!!");
				break;
		}
		
		System.out.println("do you want t continue? enter yes| no");
		decision = input.next();
		
	} while(decision.equalsIgnoreCase("yes"));

System.out.println("bye byee!!! Happy coding ");
	}
}

	
	



