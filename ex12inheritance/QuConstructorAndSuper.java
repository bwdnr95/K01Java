package ex12inheritance;
class Car
{
   	int gasoline;
   	public Car(int gasoline) {
   		this.gasoline=gasoline;
   	}
}
class HybridCar extends Car
{
   	int electric;
   	public HybridCar(int gasoline,int electric) {
   		super(gasoline);
   		this.electric=electric;
   	}
}
class HybridWaterCar extends HybridCar
{
       	int water;
       	//생성자는 클래스명과 동일한 반환타입이 없는 public 타입으로(특별한 기능이 없는 한)
       	//생성해야한다.
       	/*
       	 하위클래스의 생성자에서는 부모클래스의 객체를 항상 먼저
       	 생성해야 하므로 super()를 통해 부모의 생성자를 먼저
       	 호출한 후 자신의 멤버변수를 초기화 해야 한다.
       	 */
       	public HybridWaterCar(int gasoline,int electric,int water) {
       		//부모객체를 초기화 하기 위한 super()가 항상 먼저 기술 되야 한다.
   		super(gasoline,electric);
   		//만약 super와 water가 순서가 바뀌면 무조건 에러가 난다.
   		this.water=water;
//       this.gasoline= gasoline;
//  	this.electric=electric;
//       this.water=water;
       	}
       	public void showNowGauge()
       	{
         	System.out.println("남은가솔린:"+gasoline);
         	System.out.println("남은전기량:"+electric);
         	System.out.println("남은워터량:"+water);
       	}
}

public class QuConstructorAndSuper {

	public static void main(String[] args) {
		/*
		 하위클래스를 통해 객체를 생성할 때는 항상 부모쪽 멤버변수까지 
		 초기화 할 수 있도록 인자를 전달받아야 한다.
		 */
		
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();

	}

}
