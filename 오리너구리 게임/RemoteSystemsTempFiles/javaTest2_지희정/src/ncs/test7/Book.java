package ncs.test7;
public class Book {
	private String category;
	private String bookName;
	private double bookPrice;
	private double bookDiscountRate;
	
	public Book() {}
	public Book(String category,String bookName,double bookPrice,double bookDiscountRate) {
		this.category=category;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		this.bookDiscountRate=bookDiscountRate ;
	}
	public String getcategory() {
		return category;
	}public String getbookName() {
		return bookName;
	}public double getbookPrice() {
		return bookPrice;
	}public double getbookDiscountRate() {
		return bookDiscountRate;
	}
	
	public void setcategory(String category) {
		this.category=category;
	}
	public void setgetbookName(String bookName) {
		this.bookName=bookName;
	}
	public void setbookPrice(double bookPrice) {
		this.bookPrice=bookPrice;
	}
	public void setbookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate=bookDiscountRate;
	}
	
	
	
	
	
	
	
	
}
