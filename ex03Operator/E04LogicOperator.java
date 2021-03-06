package ex03Operator;

public class E04LogicOperator {

	public static void main(String[] args) {
		
		/*
		 논리연산자
		 	
		 	&& : 논리And, 양쪽 모두가 true 일때만 true를 반환하고,
		 		나머지는 false를 반환하는 연산자
		 	
		 	|| : 논리 Or. 한쪽만 true이면 true를 반환하고, 양쪽 모두
		 		false일 때만 false를 반환하는 연산자
		 	! : 논리Not. 반대의 논리를 반환하는 연산자.
		 */
		int num1=10, num2=20;
		
		boolean result1 = (num1==100 && num2==20);//f and t => false
		boolean result2 = (num1<12 || num2>30);// t or f => true
		
		System.out.println("result1의결과:"+ result1);
		System.out.println("result2의결과:"+ result2);
		
		//num1과 num2가 다를 때 true를 반환한다. 따라서 if블럭이 실행된다.
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 다르다");
		
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}
	}

}
