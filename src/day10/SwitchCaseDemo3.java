package day10;

import java.util.Scanner;

public class SwitchCaseDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String choice = input .next();
		switch(choice) {// start
		
	case "add":
	System.out.println("this is addition");
	break;
	
	case "sub":
	System.out.println("this is subtraction");
	break;
	
	case "mul":
	System.out.println("this is multiplication");
	break;
	
	case "div":
	System.out.println("this is division");
	break;
	
	default:
	System.out.println("wrong choice");
	break;

	
	}//end
	}

}
