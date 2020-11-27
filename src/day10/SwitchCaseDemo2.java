package day10;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char choice = input.next().charAt(0);
		switch(choice) {// start
		
	case '+':
	System.out.println("this is addition");
	break;
	
	case '-':
	System.out.println("this is subtraction");
	break;
	
	case '*':
	System.out.println("this is multiplication");
	break;
	
	case '/':
	System.out.println("this is division");
	break;
	
	default:
	System.out.println("wrong choice");
	break;

	
	}//end

	}
}
