package day5;

import javax.swing.JOptionPane;

public class SumDemo2 {

	public static void main(String[] args) {

		String a = JOptionPane.showInputDialog("Enter a: ");// "5"
		String b = JOptionPane.showInputDialog("Enter b: ");// "6"
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		int sum = aa + bb;
		JOptionPane.showInputDialog(null, "sum is: " + sum);

		// public static void main(String[] args) {
		// String a ="5";
		// String b ="6";
		System.out.println("sum is: " + sum);

		// result for this will be 56 it donot sum but coincide, but not 11 using string

		// public static void main(String[] args) {
		// String a ="5";
		// String b ="6";
		// int sum = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println("sum is: " + sum);

		// result now it gives sum 11

		// result for this will be 56 it donot sum but coincide, but not 11 using
		// stringx
	}

}
