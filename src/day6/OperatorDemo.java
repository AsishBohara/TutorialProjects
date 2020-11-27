package day6;

public class OperatorDemo {

	public static void main(String[] args) {
		// 6. Conditional (Ternary) Operator ?:

		int a = 5;
		int b = 6;
		if (a > b) {
			System.out.println("a is greater than b.");
		} else {
			System.out.println("b is greater than a.");
		}
		String r = (a > b) ? "a is greater than b." : "b is greater than a.";
		System.out.println(r);

		boolean rr = (a > b) ? true : false;
		System.out.println(rr);

	}

}
