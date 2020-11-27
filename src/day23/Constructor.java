package day23;

public class Constructor {
	
	private String name;
	private int roll;
	
	public Constructor(String n, int r) {//constructor
		name = n;
		roll = r;
	System.out.println("Constructor called");
	}
	
	public void displayInfo() {
		System.out.println("Name is:" + name);
		System.out.println("Roll is:" + roll);
	}

	
	public static void main(String[] args) {
		Constructor obj1 = new Constructor("Ram", 32);
		obj1.displayInfo();
	
		System.out.println("=======");

		Constructor obj2 = new Constructor("shyam", 24);
		obj2.displayInfo();
		
	}

}
	
	//Constructor : is a special method which has following properties;
   

//1. It's name is same as class name
//2. It has no return type
//3. we can not  even use 'void' keyword
//4. It can have any access modifier
//5. It is mainly used to initialize member's data
//6. It runs only once for each object

		
		
	


