package test05;

public class BookArrayTest {

	public static void main(String[] args) {
		Book bArray [] = new Book[3];
		
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		bArray[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		bArray[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);

		
		for (int i = 0; i < bArray.length; i++) {
			Book b = bArray[i];
			System.out.printf("%s, %s, %d원, %s, %.0f%% 할인\n", b.getTitle(), b.getAuthor(), b.getPrice(), b.getPublisher(), b.getDiscountRate() * 100);
			System.out.println("할인된 가격 : " + (b.getPrice() - (int)(b.getDiscountRate())) + "원");
		}
		
		
	}

}
