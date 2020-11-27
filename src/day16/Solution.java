package day16;

public class Solution {

	public 	int findFactorial(int n) {
	int fact = 1;
	for(int i = 1; i <= n; i++) {
		fact = fact * i;
		
		
	}
	return fact;

}
	public boolean isPrimeNumber(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= n /2; i++) {//prime number is 	divided by 1 or byitself
			if (n % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
}
