package day17;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number to find fibnacci: ");
		int n = input.nextInt();
		
		int first = 1;
		int second =1;
		
		System.out.println(first + " ");// first surai mai print gareko and aru loop vitra
		for (int i = 1; i <= n; i++) {
		System.out.println(second+" ");	
		int temp = first + second; // doing sum and after that swapping method
		first = second;
		second = temp;
		
		input.close();
		}
	}

}
