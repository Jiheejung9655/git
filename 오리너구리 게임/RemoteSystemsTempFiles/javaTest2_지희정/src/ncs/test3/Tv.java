package ncs.test3;

public class Tv {
	private String name;
	private String description;
	private int price;

	public Tv( ) {}
	public  Tv(String name,String description,int price) {
		this.name =name;
		this.description =description;
		this.price=price;
	}

	public String toString() {
		return  name+ price+ description;
	}

}
