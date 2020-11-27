package day14;

import java.util.Scanner;

public class Question26 {
	

	public static void main(String[] args) {
		int a= 7 % 3;
		int b= 7/ 3;
  System.out.println(a);
  System.out.println(b);
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number: ");
	int originalNumber = input.nextInt();//456
	
	
	int reverseNumber = 0;//initializing from zero
	// temp is temporary
	System.out.println("Original number is: " + originalNumber);
	while(originalNumber!=0) { //original number is not equal to zero
		int temp = originalNumber % 10;//remainder//6//5//4
		reverseNumber = reverseNumber * 10 + temp;//6//65//654
		originalNumber = originalNumber / 10;//quotient45//4//0
	}
	System.out.println("Reversed number is: "+ reverseNumber);
	
		
	}

	}

//while loop run when condition True
//Dowhile loop run ones on false than true
