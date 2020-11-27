package day6;

public class OperatorDemo1 {

	public static void main(String[] args) {

		// 1. Artithmetic Operators + - / * %
		// precedence (priority) + -(low priority) * / % (high priority) {% (modulus)
		// means it shows remaining of divide, e.g 7/2 it come 3 and % shows value 1)
		// Associativity: Left to Right

		int a = 4 + 5 - 4 / 2 - 7 % 2 + 3 * 2;
		System.out.println(a);
		// result is 12 since first it take high with left to right and low with left to
		// right

		// 2. Assignment Operator = += -= /= %=
		// Associativity: Right to Left

		int x = 5;
		System.out.println(x);
		// result is 5. now, if we want to increase value of x by 2 then,we do;

		x += 2;// x = x + 2;(both gives the same result when people became handy then they use
				// first one as shown x += 2 (short hand)

	}

}
