package day8;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// scanner helps to take input from user to make more interactive
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = input.nextLine();// ek vanda badti ko lagi nextline lekhinxa
		System.out.println("Enter Natinality: ");
		String Nationality = input.next();
		System.out.println("Enter age:");
		int age = input.nextInt();

		System.out.println("============");
		System.out.println("Name is: " + name);
		System.out.println("Nationality is: " + Nationality);
		System.out.println("Age is:" + age);
		System.out.println("=================");
		input.close();

	}

}
