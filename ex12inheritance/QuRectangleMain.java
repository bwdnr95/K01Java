package ex12inheritance;

class Rectangle {
	public int garo;
	private int sero;
	
	public Rectangle(int garo) {
		this.garo=garo;
	}
	public Rectangle(int garo, int sero) {
		this.garo=garo;
		this.sero=sero;
	}
	//직사각형의 넓이를 출력
	public void ShowArealInfo() {
		System.out.println("직사각형 면적 : "+garo*sero);
	}
	
}
class Square extends Rectangle{
	/*
	 멤버변수
	 	:해당 클래스의 경우는 부모클래스가 이미 가로, 세로에 
	 	멤버변수를 정의하였으므로 자식쪽에서는 멤버변수의 확장은
	 	필요없다.
	 */
	/*
	자식의 생성자 : 정사각형은 가로,세로의 길이가 동일하므로 인자값
	1개로 부모의 멤버 변수 2개를 초기화 할 수 있도록 super()를 
	정의하면 된다.
	 */
	
	public Square(int real) {
		super(real,real);
		
	}
	/*
	 자식 객체를 통해 넓이를 구할 때는 정사각형의 넓이가 나와야 하므로
	 오버라이딩으로 정의해야 한다. 오버라이딩 된 메소드는 상속관계에서
	 항상 최하위의 메소드가 호출되게 된다.
	 */
	public void ShowArealInfo() {
		System.out.println("정사각형 면적 : "+garo*garo);
	}
	
	
}
public class QuRectangleMain {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(4, 3);
       	rec.ShowArealInfo();
 
       	Square sqr = new Square(7);
       	sqr.ShowArealInfo();


	}

}
