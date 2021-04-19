package ex06array;

public class QuTwoDimArray {
	
	public static void addOneArr(int[] arr, int add) {
		
		for(int i=0;i<arr.length;i++) {
			arr[i]+=add;
		}
	}
	
	public static void addTwoArr(int[][] arr, int add)
	{
		for(int j=0 ; j<arr.length; j++) {
			for(int l=0;l<arr[j].length;l++) {
				arr[j][l]+=add;
			}
		}
	}
	

	public static void main(String[] args) {
		
		int[][] arr= {
				{1,2,3,4},
				{5,6,7},
				{8,9}
		};
		arrPrint(arr);
		addTwoArr(arr,2);
		arrPrint(arr);
	}
	
	static void arrPrint(int[][] arr) {
		int print[][] = arr;
		for(int a=0;a<print.length;a++) {
			System.out.print("{");
			for(int b=0;b<print[a].length;b++) {
				System.out.print(print[a][b]);
				if(b+1==print[a].length) break;
				System.out.print(",");
			}System.out.print("}");
			System.out.print(",");
			System.out.println();
		}
		
	}

}
