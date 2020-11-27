package day24;

//'this' is a keyword and is an implicit reference variable of current type
//and current object and is available inside non- static method and constructor of class.if you try to d in static it gives error
public class ThisDemo2 {
	// instance variable
	private String name;
	private int age;

	// constructor method
	public ThisDemo2(String name, int age) {// local variable
		this.name = name;// without this default null and 0 will print since local variable and instance
							// variable name is same than chuuttau na thi lagainxa
		this.age = age;
	}

	public void display() {
		
		System.out.println("name is: " + name);
		System.out.println("age is: " + age);

	}

	public static void main(String[] args) {
		ThisDemo2 ob1 = new ThisDemo2("shyam", 33);
		ob1.display();
	}

}

