package day18;

public class Array {

	public static void main(String[] args) {
   int [] arr = new int[3];//array declaration and initialization
   
   System.out.println(arr);//gives object id
  
   //Here, prints default value
   System.out.println(arr.length);//size of an array
   
   //Here, prints default value by types as string it gives null
   System.out.println(arr[0]);
   System.out.println(arr[1]);
   System.out.println(arr[2]);
  // System.out.println(arr[3]); it gives error
   //assiging value
   arr[0] =44;
	arr[1] =45;
	arr[2] =22;
	
	//Here, prints default value by types as string it gives null
	 System.out.println(arr[0]);
	   System.out.println(arr[1]);
	   System.out.println(arr[2]);


}
	
	
}
//array: is a group  of same data type of element
//arranged in a sequential manner
//<data type>[]<array name> = new <data type>[size of an array];
//int[]arr = narr[ew int[3];  example