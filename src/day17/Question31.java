package day17;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter number: ");
		int n = input.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
			System.out.println(j +" ");
		}
		
	System.out.println();
	}
	
		input.close();

}
}
