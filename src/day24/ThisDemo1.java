package day24;

public class ThisDemo1 {
	//instance variable
		private String name;
		private int age;
		
		public void assignvalue(String name, int age) {//local variable
			this.name = name;// without this default null and 0 will print since local variable and instance variable name is same than chuuttau na thi lagainxa
			this.age = age;
		}
		public void display() {
			System.out.println("name is: "+name);
			System.out.println("age is: "+age);
			
		}
		
		public static void main(String[] args) {
			ThisDemo1 ob1 = new ThisDemo1();
			ob1.assignvalue("ram", 2);
			
			ob1.display();

		}
}