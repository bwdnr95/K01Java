package ex18lambda;

/*
 람다식으로 구현하기
 */
interface IKosmo3{
	
	void studyLambda(String str);
}

public class Ex03Lambda {
	
	public static void main(String[] args) {
		//2번 예제의 익명클래스를 람다식으로 표현하면 아래와 같다.
		IKosmo3 kosmo1 = (String str) ->{
			System.out.println(str+"을 드디어 써보네요");
		};
		kosmo1.studyLambda("람다식");
		
		IKosmo3 kosmo2 = str -> System.out.println(str+"완전 간단..!!");
		kosmo2.studyLambda("람다식");
	}
}
