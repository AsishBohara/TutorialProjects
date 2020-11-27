package day12;

public class WithoutStatic {

	
		public void sayHello() {
			System.out.println("hello from Nepal.");
		}
		
		public void sayHi() {
			System.out.println("hi from USA");
		}
		public void greet() {
			System.out.println("Good Morning from Nepal");
		}
	
			public static void main(String[] args) {
			WithoutStatic obj = new WithoutStatic();
			obj.sayHello();
			obj.sayHi();
			obj.greet();
			
		

			}
		
}






