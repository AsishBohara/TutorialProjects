package day10;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side a: ");
		int sideA = input.nextInt();
		System.out.println("Enter side b: ");
		int sideB = input.nextInt();
		System.out.println("Enter side c: ");
		int sideC = input.nextInt();
		
		if((sideA + sideB < sideC)|| (sideA + sideC < sideB) || (sideC + sideB < sideA)){
	      System.out.println("invalid Triangle");
		
		}else if (sideA ==0||sideB == 0||sideC == 0) {
			System.out.println("invalid Triangle");
		 
		}else if ((sideA == sideB) && (sideA == sideC)){
		System.out.println("equalateral Triangle");
		
	}else if ((sideA == sideB)|| (sideB== sideC)||(sideA == sideC)){
		System.out.println("isoceles Triangle");
		
		}else {
			System.out.println("Scalene Triangle");
			input.close();
			
	}
		
	}
}	


