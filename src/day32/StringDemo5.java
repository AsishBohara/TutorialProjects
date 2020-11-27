//TOPIC: STRING BUILDER

package day32;

public class StringDemo5 {

	public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Good");
    System.out.println(sb);
	sb.append(" Morning"); //append is same as concat i.e too join words
	System.out.println(sb);
	sb.insert(0, "Hello, ");
	System.out.println(sb);
	sb.delete(0, 7);
	System.out.println(sb);
	sb.reverse(); //there is no reverse in string method
	System.out.println(sb);
	
	
	}

}
