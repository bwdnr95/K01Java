package ex08class;

class Child1Property {
	
	int property;
	public Child1Property(int property) {
		this.property=property;
	}
	void obtainBead(Child1Property child,int obtainBead) {
		this.property+=obtainBead;
		child.property-=obtainBead;
	}
	void showProperty() {
		System.out.println(this.property);
	}
}

public class QuMarbles {

	public static void main(String[] args) {
		Child1Property child1 = new Child1Property(20);
		Child1Property child2 = new Child1Property(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();

	}

}
