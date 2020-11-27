package day19;

public class ArrayMultiDimension5 {

	public static void main(String[] args) {
		final int ROW = 3;
		final int COLUMN = 3;
		
		int[][]arr= new int[ROW][COLUMN];
		
		arr[0][0] =10;
		arr[0][1] =10;
		arr[0][2] =10;
		
		arr[1][0] =10;
		arr[1][1] =10;
		arr[1][2] =10;
		
		arr[2][0] =10;
		arr[2][1] =10;
		arr[2][2] =10;
		
		
		
		
		for(int i = 0; i < ROW; i++) {
		for(int j = 0; j < COLUMN; j++) {
			System.out.print(arr[i][j] + "");
		}
		System.out.println();
			
		}


	}

}
//multi dimension

//int[][] arr =new int[size of row][size of coumn]
	//	int[][]arr = new int [3][3];
