package day10;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your chioce");
		int choice = input .nextInt();// can give any name for choice (i.e input , option etc)
		
		switch(choice) {// start
		
		case 1:
		System.out.println("this is addition");
		break; // asle chioice vaisake paxi bahire nikal xa
		
		case 2:
		System.out.println("this is subtraction");
		break;
		
		case 3:
		System.out.println("this is multiplication");
		break;
		
		case 4:
		System.out.println("this is division");
		break;
		
		case 5:
		System.out.println("wrong choice");
		break;
		
		
	
	}//bahira 

}
}
