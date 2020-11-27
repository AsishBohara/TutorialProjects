package day31;

public class StringDemo2 {

	// how to compare two strings
	public static void main(String[] args) {

		String s1 = "Nepal";
		String s2 = "Nepal";

		String s3 = new String("Nepal");
		String s4 = new String("Nepal");

		// worst way to compare String in java
		System.out.println(s1 == s2);// true
		System.out.println(s1 == s3);// false
		System.out.println(s3 == s4);// false

		// best way to compare string in java
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s3.equals(s4));// true
		String s5 = "nepal";
		System.out.println(s5.equalsIgnoreCase(s3));// true

	}

}
