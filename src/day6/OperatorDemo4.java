package day6;

public class OperatorDemo4 {

	public static void main(String[] args) {
		// 5. Logical Operator &&(and) ||(or) !(not)

		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		System.out.println(true || true);// true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false

		int a = 5;
		int b = 6;
		int c = 7;
		if ((a > b) && (a > c)) {
			System.out.println("a is greatest one");
		} else {
			System.out.println("kkkk");// result kkkk , since its false

			int x = 15;
			int y = 6;
			int z = 7;
			if ((x > y) && (x > z)) {
				System.out.println("a is greatest one");
			} else {
				System.out.println("kkkk");// result "a is greatest one"

				int m = 5;
				int n = 6;
				int o = 4;
				if ((m > n) || (m > o)) {
					System.out.println("a is greatest one");
				} else {
					System.out.println("kkkk");// result "a is greatest one"
			
				}

			}

		}

	}

}
