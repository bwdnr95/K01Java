package ex08class;

class ChildProperty {
	String name;
	int property;
	
	public ChildProperty(int a) {
		property = a;
	}
	void obtainBead(String name, int b) {
		this.name=name;
		int plus = b;
		property+= plus;
	}
}

class Triangle {
	int bottom;
	int height;
	int area;
	
	void init(int a, int b) {
		 bottom = a;
		 height = b;
		
	}
	void setBottom(int c) {
		bottom = c;
	}
	void setHeight(int d) {
		height = d;
	}
	double getArea() {
		 area= (bottom*height)/2;
		 return area;
	}
	
}
public class QuTriangle {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());

	}

}
