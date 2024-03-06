package test04;

public class Product {
	//기본생성자
	private String name;
	private int price;
	private int quantity;
	
	// 아무런 인자를 받지 않는 생성자
	// 기본적으로 필드들을 초기화할 수 있음
	

	//초기값을 받는 생성자
	public Product(String name, int price, int quantity ) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}	
	
	public int total() {
		return price * quantity;
	}
	
	
	public void information(int price, String name, int quantity, int gettet) {
		
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price + (" 원"));
		System.out.println("수량 : " + quantity + (" 개"));
		System.out.println("총 구매 가격 : " + total() + " 원");
					
	}
	
	

}
