package ex12inheritance;

class Point{
	int xDot,yDot;
	
	public Point(int x,int y) {
		xDot=x;
		yDot=y;
	}
	public void showPointInfo() {
		System.out.println("[x좌표:"+xDot+",y좌표:"+yDot+"]");
	}
}
class Circle{
	
	int radian;
	Point center;
	public Circle(int xDot,int yDot,int radian) {
		center= new Point(xDot,yDot);//중심점을 표현하는 객체
		this.radian=radian;//반지름
	}
	//원의 정보를 출력하는 멤버메소드
	public void showCircleInfo() {
		/*
		 반지름은 멤버변수를 통해 즉시 출력하고, 중심점은 point객체의
		 멤버메소드를 호출하여 출력한다.
		 */
		System.out.println("반지름 :"+radian);
		center.showPointInfo();
	}
	
	
}

class Ring {
	//멤버변수
	Circle innerCircle;
	Circle outerCircle;
	//생성자
	/*
	 링 클래스에서는 원이 2개 있어야 하므로 아래와 같이
	 Circle객체를 2개 생성한다.
	 */
	public Ring(int a, int b, int c, int d, int e, int f) {
		//멤버변수가 객체이므로 해당 객체를 생성해야 한다.
		innerCircle = new Circle(a,b,c);//중심점(x,y), 반지름(r)
		outerCircle = new Circle(d,e,f);
	}
	//링을 표현하는 멤버메소드
	public void showRingInfo() {
		/*
		 상속관계가 아니므로 각각의 멤버변수를 통해 멤버메소드(Circle 객체)를
		 호출해야 한다.
		 */
		System.out.println("안쪽원의 정보");
		innerCircle.showCircleInfo();
		System.out.println("바깥원의 정보");
		outerCircle.showCircleInfo();
	}
}
public class QuRingMake {

	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();

	}

}
