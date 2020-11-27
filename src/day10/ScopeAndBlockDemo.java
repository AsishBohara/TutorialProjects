package day10;

public class ScopeAndBlockDemo {// class block
	// instance (non statics) variables
	int a = 5;

	// statci variable
	static int x = 6;

	public void sayHello() {// user defined method block
		// local variable
		String message = "hello from Nepal";
		System.out.println(message);
	}

	public static void main(String[] args) {// library defined method block

		// local variable

		boolean flag = true;
		for (int i = 0; i <= 5; i++) {

			int a = 5;
			if (a > 6) {
				System.out.println(a);
				int x = 7;
			}

		}
	}

}

//{} block