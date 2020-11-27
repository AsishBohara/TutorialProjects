package day28;

import day29polymerphism.AccessModifierDemo;

public class AccessModifierDemoChildOtherPack extends AccessModifierDemo {

	public static void main(String[] args) {

		AccessModifierDemo ob = new AccessModifierDemo();
		//ob.privateMethod();
		//ob.defaultMethod();
		//ob.protectedMethod();
		ob.publicMethod();
		
		AccessModifierDemoChildOtherPack obj = new AccessModifierDemoChildOtherPack();
		obj.protectedMethod();
	}

}
//child ko object bata call hunxa parent ko bata hudaina