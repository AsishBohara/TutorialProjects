
//TOPIC : STRING


package day32;


public class StringDemo4 {

	public static void main(String[] args) {
String s1 = "Good";
System.out.println(s1);
s1.concat("Morning");//it gives Good only
System.out.println(s1);



s1 = s1.concat("Morning");//now it concat to GoodMorning
System.out.println(s1);	
	

// or
//String s2 = s1.concat("Morning");//now it concat to GoodMorning
//System.out.println(s2);		
	
	}
	
	//interview question
	//Why String is  called as immutable class?
    // What is difference between String, String Builder and String Buffer?
}
