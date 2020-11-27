package day17;

public class Demo1 {

	public String sayHello() {
		return "Hello, ";
	}

	public void greet() {
		String m = sayHello();
		System.out.println(m + " Good Morning");

	}

   
   public static void display() {
    Demo1 obj = new Demo1();
    obj.greet();
   
  }

     public static void main(String[] args) {
	display();
	 Demo1.display();
}
     
     }
