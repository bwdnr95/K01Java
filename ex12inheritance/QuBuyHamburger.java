package ex12inheritance;

class Burger{
	private String burgerName;
	private int price;
	private String patty;
	private String source;
	private String vegetable;
	//Source> Constructor using Field로 생성자 생성
	public Burger(String burgerName, int price, String patty, String source, String vegetable) {
		super();
		this.burgerName = burgerName;
		this.price = price;
		this.patty = patty;
		this.source = source;
		this.vegetable = vegetable;
	}
	//Source>Generate Getter and Setter 에서 Getter로 생성
	public int getPrice() {
		return price;
	}
	public void showBurger() {
		System.out.println("버거명 : "+burgerName);
		System.out.println("가격 : "+getPrice());
		System.out.printf("식재료 : %s, %s, %s",patty,source,vegetable);
	}
}

class HamburgerPrice {
	Burger burger;
	
	final int COKE = 1000;
	final int POTATO = 1500;
	int sidePrice= COKE+POTATO;
	int totalPrice;
	public HamburgerPrice(Burger burger) {
		this.burger=burger;
	}
	
	public void pricePlus() {
		totalPrice = burger.getPrice()+sidePrice;
		System.out.println(totalPrice);
	}
	public void showPrice() {
		burger.showBurger();
		System.out.println();
		System.out.printf("결제금액 :");
		pricePlus();
		System.out.println("=====================");
	}
	
}

class SetPrice extends HamburgerPrice {
	
	int setPrice;
	public SetPrice(Burger burger) {
		super(burger);
	}
	@Override
	public void pricePlus() {
		
		setPrice=super.sidePrice-500;
		totalPrice=burger.getPrice()+setPrice;
		System.out.println(totalPrice);
	}
	@Override
	public void showPrice() {
		burger.showBurger();
		System.out.println();
		System.out.printf("결제금액 :");
		pricePlus();
		System.out.println("=====================");

	}
}

public class QuBuyHamburger {

	public static void main(String[] args) {
		
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상추");
				
		HamburgerPrice price1 = new HamburgerPrice(burger1); 
		price1.showPrice();	
				
		HamburgerPrice price2 = new SetPrice(burger2); 
		price2.showPrice();	

	}

}
