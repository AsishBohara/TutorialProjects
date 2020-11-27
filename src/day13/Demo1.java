package day13;

public class Demo1 {

	String nonStaticVar = "this is non-static";
	static String staticVar = "this is static variable";
	
	//non-static method
	public void sayHello() {
		System.out.println("hello from Nepal.");

	}
	//static methd
	public static void sayHi() {
		System.out.println("hi from usa");
	}
	public void main(String[] args) {
		Demo1 ob = new Demo1();
		ob.sayHello();
		System.out.println(ob. nonStaticVar);//non static call garnu paryo vane
	
		
		sayHi();
		Demo1.sayHi();//best practice
		System.out.println(Demo1.staticVar);// static varible call garnu 
	}
}
