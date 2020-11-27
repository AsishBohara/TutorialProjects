package day28;

public/*abstract*/  interface InterfaceDemo1 {

	
	//complier will write public and abstract if we have not written
	//void m1();
	//public void m2();
	//abstract void m3();
	public abstract void m4();//by default
	
	
	//compiler will write missing public static final
	//int a1 = 5;
	//public int a2 = 5;
	//static int a3 = 5;
	//final int a4 = 5;
	//static final int a5 = 5;
	//public final int a6 = 5;
	//public static int a7 = 5;
	public static final int a8 = 5;// by default
}
