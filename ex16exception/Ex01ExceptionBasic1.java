package ex16exception;

/*
예외처리방법1
	: 예외가 발생된 함수에서 호출했던 지점으로 예외를 던지고,
	메인함수에서도 프로그램ㄹ 외부로 예외를 던진다. 즉 예외를
	내부에서 처리하지않고무시하겠다는 의미이다
*/

import java.io.IOException;

public class Ex01ExceptionBasic1 {

	public static void main(String[] args)  {
		
		/*
		 Syntax에러(구문에러)
		 	: 실행자체가 안되는 코드로 오류를 수정해야만 
		 	정상적으로 실행된다. 즉 코드에 문법적인 오류가
		 	발생되었음을 의미한다.
		 */
//		Int num = 10;
//		if(true) ;
//		{}
//		else
//		{}
		
		int number = 10;
		if(true) {
			System.out.println("참이다");
		}
		else {
			System.out.println("거짓이다.");
			
		}
		/*
		 외부자원을 사용할 때 발생되는 예외
		 처리방법1] main()함수 밖으로 예외를 던진다 .이것을
		 "예외던지기"라고 표현하고, 내부에서 예외를 처리하지 않고
		 무시하겠다는 의미이다.
		 이런경우 main() throws IOException 이와 같은 형태로
		 작성하면 된다.
		 */
		System.out.println("문자 하나를 입력하세요 : ");
		/*
		 처리방법2] 예외가 발생한 지점을 try~catch문으로 
		 직접 예외를 처리한다. 
		 */
		try {
			int iChar = System.in.read();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
