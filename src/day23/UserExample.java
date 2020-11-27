package day23;

import java.util.Scanner;

// using scanner
public class UserExample {
	private String username;
	private String password;

	public UserExample(String u, String p) {
		username = u;
		password = p;
		System.out.println("Constructor called");
	}

	public void display() {
		System.out.println("Username is:" + username);
		System.out.println("Password is:" + password);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter username:");
		String username = input.next();
		System.out.println("Enter pasword:");
		String password = input.next();
		UserExample user1 = new UserExample(username, password);
		user1.display();

	}


}

