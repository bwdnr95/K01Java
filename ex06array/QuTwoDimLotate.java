package ex06array;

public class QuTwoDimLotate {

	static int[][] addArr(int[][] arr){
		int[][] newArr = arr;
		int sum=0;
		for(int i=0;i<newArr.length;i++) {
			for(int j=0;j<newArr[i].length;j++) {
				sum++;
				newArr[i][j]=sum;
			}
		}
		return newArr;
	}
	public static void main(String[] args) {
		
		int [][]arr = new int[3][3];
		 int [][]hello;
		hello=addArr(arr);
		System.out.println("메소드 호출전");
		newPrint(hello);
		changePrint(hello);
		System.out.println("메소드 호출 후");
		newPrint(hello);
	}

	public static void newPrint(int[][] a) {
		
		int[][] newprint= a;
		for(int i=0; i<newprint.length; i++) {
			for(int j=0;j<newprint[i].length;j++) {
				System.out.print(newprint[i][j]+" ");
			}System.out.println();
		}
		
	}
	static void changePrint(int[][] change) {
		int[] temp;
		for(int i=0;i<change.length;i++) {
				temp=change[change.length-1-i];
				change[change.length-1-i]=change[i];
				change[i]=temp;
				
		}
	}
	
}
