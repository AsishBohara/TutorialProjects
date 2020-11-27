package day21;

public class StudentTest {

	public static void main(String[] args) {
	StudentCons obj1 =new StudentCons();
	obj1.setName("ram");//set
	obj1.setRoll(20);//set
	
	System.out.println(obj1.getName());//get
	System.out.println(obj1.getRoll());//get
	
	System.out.println("==========");
	StudentCons obj2 =new StudentCons();
	obj2.setName("shyam");//set
	obj2.setRoll(20);//set
	
	System.out.println(obj2.getName());//get
	System.out.println(obj2.getRoll());//get
	
	}
	

}
