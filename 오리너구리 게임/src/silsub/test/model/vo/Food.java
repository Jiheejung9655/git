package silsub.test.model.vo;
public class Food extends Duck{
	public Food() {}
	public Food(String name,int hp,int grow) {
		super(name,hp,grow);
	
	}
	@Override
	public void cry() {
		System.out.println(" >_____<");
	}
	
	public void water() {
		System.out.println("¹°À» ¸¶¼Å¼­ hp 10 »ó½Â");
		super.setHp(super.getHp()+10);
		super.setGrow(super.getGrow()+10);
		if(super.getHp() <=10) {
		System.out.println("°æÇèÄ¡°¡ "+super.getGrow()+"¸¸Å­ »ó½ÂÇÕ´Ï´Ù.");
	}
		
	}
		 		
	public void sellfish() {
		System.out.println( "°©°¢·ù¸¦ ¸Ô¾î Çàº¹ÇØ ÃãÀ» Ãä´Ï´Ù~~~~!^____^ hp 20 »ó½Â");
		super.setHp(super.getHp()+20);
		super.setGrow(super.getGrow()+20);
		if(super.getHp() <=20) {
			System.out.println("°æÇèÄ¡°¡ "+super.getGrow()+"¸¸Å­ »ó½ÂÇÕ´Ï´Ù.");
		}
	 

	}
	
	public void earthworm() {
		System.out.println("Áö··ÀÌ¸¦ ¸Ô¾î Çàº¹ÇØ ÃãÀ» Ãä´Ï´Ù~~~~!^____^ hp 30 »ó½Â");
		super.setHp(super.getHp()+30);
		super.setGrow(super.getGrow()+30);
		if(super.getHp() <=30) {
			System.out.println("°æÇèÄ¡°¡ "+super.getGrow()+"¸¸Å­ »ó½ÂÇÕ´Ï´Ù.");
		}
		
	}
	
	public void seafood() {
		System.out.println("ÇØ»ê¹°À» ¸Ô¾î Çàº¹ÇØ ÃãÀ» Ãä´Ï´Ù~~~~!^____^ hp 30 »ó½Â");
		super.setHp(super.getHp()+30);
		super.setGrow(super.getGrow()+30);
		if(super.getHp() <=30) {
			System.out.println("°æÇèÄ¡°¡ "+super.getGrow()+"¸¸Å­ »ó½ÂÇÕ´Ï´Ù.");
		}
	}

}