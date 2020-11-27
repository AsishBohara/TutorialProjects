package day24;

//'this' is a keyword and is an implicit reference variable of current type
//and current object and is available inside non- static method and constructor of class.if you try to d in static it gives error

public class ThisDemo3 {
	
	//instance variable
	int a = 5;
	
	//shadowing is the concept of hiding instance variable by local variable of
	//non-static methd or constructor of a class
	
	public void show() {
		System.out.println("this is:" + this);
		System.out.println(this.a);//5 this.a
		//local variable
		int a= 6;
		System.out.println(a);//6
		System.out.println(this.a);
		int sum =a + this.a;
		System.out.println("sum is: " + sum);
	}

	public static void main(String[] args) {
		ThisDemo3 ob1 = new ThisDemo3();
		System.out.println("ob1 is: "+ ob1);
	    ob1.show();
	
	System.out.println("========");
	ThisDemo3 ob2 = new ThisDemo3();
	System.out.println("ob2 is: "+ ob2);
	ob2.show();
  
}
}