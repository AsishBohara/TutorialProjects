package day23;

//how and why to make constructor

public class User {

	private String username;
	private String password;

	public User(String u, String p) {
		username = u;
		password = p;
		System.out.println("Constructor called");
	}

	public void display() {
		System.out.println("Username is:" + username);
		System.out.println("password is:" + password);
	}

	public static void main(String[] args) {
        	User user1 = new User("uu@aa1", "pp@pq2");
            user1.display();
         }

}