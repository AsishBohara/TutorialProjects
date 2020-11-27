//TOPIC: String SPLIT METHOD

package day32;

public class StringDemo7 {

	public static void main(String[] args) {
		String lines = "Hello, I am Santosh Lal Karna, I am Java Developer, I am wrking at dryice, Nepal,I also teach java part time. I am part time teacher at Vastika inc., USA";
        String[] words = lines.split(" ");
        for(String w : words) {
        	System.out.println(w);
        }
        
        System.out.println("=======");
        words = lines.split(",");
        for(String w: words) {
        	System.out.println(w);
        }
	}

}
