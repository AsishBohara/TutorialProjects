package day29polymerphism;

public class AccessModifierDemo {

	String defaultVar = "this is default variable";
	public String publicVar = "this is public variable";
	private String privateVar = "Tthis is private variable";
	protected String protectedVar = "this is protected variable";

	void defaultMethod() {
		System.out.println("this is default method..");

	}

	public void publicMethod() {
		System.out.println("this is public method");

	}

	private void privateMethod() {
		System.out.println("this is private method..");

	}

	protected void protectedMethod() {
		System.out.println("this is protected method..");

	}

	public AccessModifierDemo() {
		System.out.println("this is public level access constructor");
	}

	AccessModifierDemo(int a) {
		System.out.println("this is default level access constructor");
	}

	protected AccessModifierDemo(String s) {
		System.out.println("this is protected level access constructor");

	}

	private AccessModifierDemo(double d) {
		System.out.println("this is private level access constructor");
	}
public static void main(String[] args) {
	AccessModifierDemo ob = new AccessModifierDemo(4.5);
	ob.privateMethod();
	ob.defaultMethod();
	ob.protectedMethod();
	ob.publicMethod();
}


}

