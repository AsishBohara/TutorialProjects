package day9;

public class ElseIfDemo {

	// we can take n no. of elseif and at last else

	public static void main(String[] args) {

		int marks = 35;
		if (marks < 0 || marks >= 101) {
			System.out.println("Invalid marks");

		} else if (marks >= 80 && marks <= 100) {
			System.out.println("distinction");

		} else if (marks >= 60 && marks <= 79) {
			System.out.println("first");
		} else if (marks >= 40 && marks <= 59) {
			System.out.println("second");
		} else {
			System.out.println("fail");
		}

		System.out.println("more codes");
		System.out.println("exit");

	}

}
