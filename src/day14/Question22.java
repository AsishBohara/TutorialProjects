package day14;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter number: ");
			int n = input.nextInt();
			
			int sum = 0;
			for (int i =1; i<=10; i++) {
				int t = n * i;
				System.out.println(n+ "*" +i +"=" + t);
			}
			input.close();

	}

}
