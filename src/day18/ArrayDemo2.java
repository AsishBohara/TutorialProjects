package day18;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = input.nextInt();

		// to take input element in an array
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) { // arr length is size
			System.out.println(" Enter element: ");
			arr[i] = input.nextInt();
		}

		// to print element of an array
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];

		}
		System.out.println("sum of an array element is:" + sum);
		input.close();

	}
}
