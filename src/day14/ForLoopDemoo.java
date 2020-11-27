package day14;

import java.util.Scanner;

public class ForLoopDemoo {
//question 23
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();//6
		
		int sum = 0;
		for (int i =1; i<=n; i++) {
			sum = sum +i;
	
		System.out.println("sum of nth number is: " +sum);
		input.close();
		
	}
	}
	
}
		
		
		//for(initialization; condition; update(increment/decrement)) {

	


//Looping
//1. for loop
//2. while loop
//3.do-while loop
//4. for-each