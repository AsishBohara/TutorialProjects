package day27;


	//1.we can not inherit(extends) final class

	public /*final*/ class FinalClassDemo{
		
		//2. in if we use final on variabl, then it become constant
		final int a =5;
		
		//. we cannot overide final method
		
		public/* final*/ void greet() {
			System.out.println("hello,good morning...");
			
		}
		//4. we can not use final keyword on constructor
			public /*final*/ FinalClassDemo() {
		
		
}
}