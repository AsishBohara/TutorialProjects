package day29polymerphism;

public class AccessModifierDemoChild {

	public static void main(String[] args) {
		AccessModifierDemo ob = new AccessModifierDemo(5);
		//ob.privateMethod();same package in child except private we are able to call all method
		ob.defaultMethod();
		ob.protectedMethod();
		ob.publicMethod();
	}

}
