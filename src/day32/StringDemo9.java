
//TOPICS: Differences in split using String and String Tokenizer.

package day32;

import java.util.StringTokenizer;

public class StringDemo9 {

	public static void main(String[] args) {

		
		String lines = "Hello, I am Santosh Lal Karna,, I am Java Developer,, I am wrking at dryice,, Nepal,,I also teach java part time. I am part time teacher at Vastika inc.,, USA";

		
		//String Method
		//result we can see it counts 12, that is it has taken unwanted comma also a string but string Tokenzier remove unwanted comma.
        
		String[] words = lines.split(",");
        System.out.println(words.length);//takes out number of words
        for(String w : words) {
        	System.out.println(w);
        }
		
		
		//String Tokenizer Methods
        
		StringTokenizer st = new StringTokenizer(lines, ",");
		System.out.println(st.countTokens());//takes out number of word
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
