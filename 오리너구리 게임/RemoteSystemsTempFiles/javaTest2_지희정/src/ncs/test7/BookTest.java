package ncs.test7;

public class BookTest {

	public static void main(String[] args) {
		Book bookArray [] =new Book[5];

		bookArray[0] = new Book("IT", "SQL Plus", 50000, 5 );
		bookArray[1] = new Book("IT", "Java 2.0", 40000, 3  );
		bookArray[2] = new Book("IT", "JSP Servlet", 60000, 6 );
		bookArray[3] = new Book("IT","Nobel davincicode", 30000, 10  );
		bookArray[4] = new Book("IT","Nobel cloven hoof", 50000, 15);
		int sum =0;

		for(int i=0; i<bookArray.length; i++) {
			
		System.out.println(bookArray[i].getbookName()+","+bookArray[i].getbookName()+","+bookArray[i].getbookPrice()+","
		+bookArray[i].getbookDiscountRate());
		 sum += bookArray[i].getbookPrice();
		}System.out.println("책 가격의 합:"+sum);

	}
}
