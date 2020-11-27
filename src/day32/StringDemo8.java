
//TOPIC: STRING TOKENIZER
package day32;

import java.util.StringTokenizer;

public class StringDemo8 {

	public static void main(String[] args) {

		String lines = "Hello, I am Santosh Lal Karna, I am Java Developer, I am wrking at dryice, Nepal,I also teach java part time. I am part time teacher at Vastika inc., USA";
		StringTokenizer st = new StringTokenizer(lines);// no delimiter given so default is done with space itself
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
			System.out.println("========");
			st = new StringTokenizer(lines, ",");// delimiter "," is given so, split in basis of coma
			while (st.hasMoreTokens()) {
				System.out.println(st.nextToken());

			}
		}
	

}