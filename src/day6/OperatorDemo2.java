package day6;

public class OperatorDemo2 {

	public static void main(String[] args) {
		// 3. Increment / decrement Operator
		// ++ --
		// post (a++ a--) pre (++a --a)

		int i = 4;
		System.out.println(i);
		i++; // i+=1; result 5,if you want to increase by one only then you can do i++
		System.out.println(i);

		// post example
		int a = 7;
		System.out.println(a);// 7
		System.out.println(a++);// 7 (since in this it operates and gives 7 and on next sysout it print)
		System.out.println(a);// 8

		// pre example
		int b = 7;
		System.out.println(b);// 7
		System.out.println(++b);// 8 (since in this it first adds and gives 8 and also 8 on next sysout it
								// print)
		System.out.println(b);// 8

		int m = 5;
		int n = ++m;
		System.out.println(m);// 6 first m value will be assigned and on second it will print increase value
		System.out.println(n);// 6
		System.out.println(n);// 6

		int t = 5;
		int r = t++;
		System.out.println(t);// 6 first m value will be assigned and on second it will print increase value
		System.out.println(r);// 5
		System.out.println(t);// 6

		int x = 7;
		x = (x++) + (++x) + x + 1; // result 26, 7+9+9+1 = 26
		System.out.println(x);
	}

}
