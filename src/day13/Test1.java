package day13;

public class Test1 {

	public static void main(String[] args) {
	Demo1 ob = new Demo1();
	ob.sayHello();
	System.out.println(ob.nonStaticVar);
	
	Demo1.sayHi();
	System.out.println(Demo1.staticVar);

	}

}
