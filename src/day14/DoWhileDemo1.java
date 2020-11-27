package day14;

public class DoWhileDemo1 {

	public void printTable(int n) {
	for(int i =1; i <= 10; i++) {
		int t = n * 1;
		System.out.println(n+ "*" + i + "= " + t);
	}

	}
public void findNthSum(int n) {
	int sum =0;
	for (int i = 1; i <= n; i++) {
		sum = sum + 1;
	}
System.out.println("Sum of nth number is:" + sum);
}
public void reverseNumber(int originalNumber) {
	int reverseNumber = 0;

	System.out.println("Original number is:" + originalNumber);
    while (originalNumber != 0) {
    	int temp = originalNumber % 10;
    	reverseNumber = reverseNumber * 10 + temp;
    	originalNumber = originalNumber / 10;
    	
    }
    System.out.println("Reversed number is: " + reverseNumber);

    	
    }
}


