package day9;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter number");
		int n = input.nextInt();
		
		if(n < 0) { //true vayo vani matra kaam garxa.number less than 0 vanek negative ho
			System.out.println("you have entered negative number.");
		}
		
		System.out.println("more code");
		System.out.println("exit");
		input.close();
	}

}
