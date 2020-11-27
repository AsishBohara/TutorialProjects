package day29polymerphism;

public class Calculator {

	
	
	public void sum() {
		int a = 5;
		int b = 6;
		int add = a+b;
		System.out.println("sum is: " + add);
	}
	
	public void sum(int a, int b) {
		int add = a + b;
		System.out.println("sum is : " + add);
	}	
		
		
		public void sum(double a, int b) {
		int add = (int)a + b;
		System.out.println("sum is : " + add);
		}
		
		
		public void sum(int a, double b) {
			double add = a + b;
			System.out.println("sum of a and b is : " + add);
		
		
		
}
		public void sum(double a, double b) {
			double add = a + b;
			System.out.println("sum ofma and b is(double) : " + add);
		
		
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.sum();
		
				
	}			
				
}				
				
				
				
				
				
				
				
				
				
				
				
	
