package ex06array;

import java.util.Scanner;

/*
 길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아
  순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터
 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)
실행결과]
1번째 정수를 입력하세요:2
2번째 정수를 입력하세요:4
3번째 정수를 입력하세요:5
4번째 정수를 입력하세요:3
5번째 정수를 입력하세요:2
6번째 정수를 입력하세요:9
7번째 정수를 입력하세요:7
8번째 정수를 입력하세요:8
9번째 정수를 입력하세요:5
10번째 정수를 입력하세요:1
순서대로입력된결과
2 4 5 3 2 9 7 8 5 1 
홀수/짝수 구분입력결과
5 3 9 7 5 1 8 2 4 2

 */
public class QuFillArray {
	public static int[] getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1번째 정수를 입력하세요.:");
		int a = scanner.nextInt();
		System.out.println("2번째 정수를 입력하세요.:");
		int b = scanner.nextInt();
		System.out.println("3번째 정수를 입력하세요.:");
		int c = scanner.nextInt();
		System.out.println("4번째 정수를 입력하세요.:");
		int d = scanner.nextInt();
		System.out.println("5번째 정수를 입력하세요.:");
		int e = scanner.nextInt();
		System.out.println("6번째 정수를 입력하세요.:");
		int f = scanner.nextInt();
		System.out.println("7번째 정수를 입력하세요.:");
		int g = scanner.nextInt();
		System.out.println("8번째 정수를 입력하세요.:");
		int h = scanner.nextInt();
		System.out.println("9번째 정수를 입력하세요.:");
		int i = scanner.nextInt();
		System.out.println("10번째 정수를 입력하세요.:");
		int j = scanner.nextInt();
		int[] arr = {a,b,c,d,e,f,g,h,i,j};
		return arr;
	}

	public static void main(String[] args) {
		
		int[] newarr = getNumber();
		for(int i= 0; i<newarr.length ;i++) {
			System.out.print(newarr[i]+" ");
		}System.out.println();
		System.out.println("홀수/짝수 구분입력결과");
		for(int j=0; j<newarr.length;j++) {
			if(newarr[j]%2 == 1) 
				System.out.printf("%-2d",newarr[j]);
		}
		for(int j=0; j<newarr.length;j++) {
			if(newarr[j]%2 == 0) 
				System.out.printf("%-2d",newarr[j]);
		}
	}
	

}
