
//TOPIC : STRING
package day32;



public class StringDemo3 {

	public static void main(String[] args) {
		String s1 = "Good Evening";
		System.out.println(s1);
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(0, 4));// end index -1 so add 1
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.indexOf('d'));
		System.out.println(s1.charAt(6));
		char[] ch = s1.toCharArray();
		System.out.println(ch[5]);
		System.out.println(s1.contains("Good"));
		System.out.println(s1.contains("Bad"));
		System.out.println(s1.contains("n"));
		System.out.println(s1.contains("z"));
		System.out.println(s1.replace("Evening", "Morning"));
		System.out.println(s1.replace("G", "M"));
		System.out.println(s1.concat("Hello,"));
		System.out.println("Hello, ".concat(s1));

		String s2 = " Santosh Lal Karna ";
		System.out.println(s2);
		System.out.println(s2.trim());// removing space
		byte[] bb = s1.getBytes();
		System.out.println(bb.toString());
	}

}
