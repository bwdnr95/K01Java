package ex08class;

class CalculatorEx {
	//멤버변수 : 사칙연산의 횟수를 카운트 함
	int countAdd;
	int countMin;
	int countMul;
	int countDiv;
	
	//사칙연산을 수행하는 메소드
	int add(int a, int b) {
		countAdd++;
		int addOne = a+b;
		return addOne;
	}
	double min(double c, double d) {
		countMin++;
		double minOne = c-d;
		return minOne;
	}
	double mul(double e, double f) {
		countMul++;
		double mulOne = e*f;
		return mulOne;
	}
	int div(int g, int h) {
		countDiv++;
		int divOne = g/h;
		return divOne;
	}
	void showOpCount() {
		System.out.println("덧셈횟수:"+countAdd);
		System.out.println("뺄셈횟수:"+countMin);
		System.out.println("곱셈횟수:"+countMul);
		System.out.println("나눗셈횟수:"+countDiv);
	}
	void init() {
		countAdd =0;
		countMin =0;
		countMul =0;
		countDiv =0;
	}
	
}
public class QuSimpleCalculator {

	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();

	}

}
