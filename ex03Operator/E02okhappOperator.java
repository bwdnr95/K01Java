package ex03Operator;

public class E02okhappOperator {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("덧셈:"+(num1+num2));
		System.out.println("뺄셈:"+(num1-num2));
		System.out.println("곱셈:"+(num1*num2));
		System.out.println("나눗셈(몫):"+(num1/num2));
		System.out.println("나눗셈(나머지):"+(num1%num2));
		
		int result = 3*2+5%2-6/3*5;
		System.out.println("결과는?"+ result);
		
		
		double e= 3.1;
		e += 2.1;
		e *=2;
		e = e +e;
		System.out.println("e의 결과값"+e);
		
		int n= 5;
		// n= n* 2.7; => 에러발생 연산의 결과가 double인데 
		//	좌측항이 int이므로 대입불가함.
		//n = n * 2.7;
		
		n = (int)(n * 2.7);//명시적 형 변환 후 int형 변수에 대입함.
		System.out.println("n의 결과값:" + n);
		
		n *= 2.7;/*
			정상실행된다. 복합대입연산자의 문법 구조상 기존 자료형을
			그대료 유지하는 특성을 가지고 있다. 따라서 결과는 정수인
			35가 되고, 소수이하는 자동으로 버려진다.
		*/
		System.out.println("n의 결과값:"+ n);
	}

}
