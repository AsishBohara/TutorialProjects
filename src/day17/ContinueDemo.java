package day17;

public class ContinueDemo {

	public static void main(String[] args) {
		for (int i =1; i <= 5; i++) {
			if(i == 3) {
				continue;//bahira jadaina mathi loop bata start gardinxa
			}
			System.out.println(i);
		}
		System.out.println("end");
	}

}
