package day24;

public class ThisDemo {
//instance variable
	private String name;
	private int age;
	
	public void assignvalue(String n, int a) {//local variable
		name = n;
		age = a;
	}
	public void display() {
		System.out.println("name is: "+name);
		System.out.println("age is: "+age);
		
	}
	
	public static void main(String[] args) {
		ThisDemo ob1 = new ThisDemo();
		ob1.assignvalue("ram", 2);
		
		ob1.display();
	}
	

}
