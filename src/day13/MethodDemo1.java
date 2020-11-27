package day13;

public class MethodDemo1 {

	// <access mdifier> void <method name>(){

		public void sayHello() {
			System.out.println("hello from Kathmandu.");

		}

		// <access modifier> void <method name>(any numbers of arguments){
		public void printInfo(String name, int age, String address) {
			System.out.println("Name is: " + name);
			System.out.println("Age is: " + age);
			System.out.println("Address is: " + address);
		}

	   public static void main(String[] args) {
	    MethodDemo1 ob = new MethodDemo1();
	    ob.sayHello();
	  
	  String n = "ram";
	  int a = 22;
	  String addr ="Kathmandu";
	  ob.printInfo(n, a, addr);
	  
	   }
	   
}