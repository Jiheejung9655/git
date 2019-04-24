package silsub.test.model.vo;

public class Happy extends Duck {
	public Happy() {}
	public Happy(String name,int hp,int grow) {
		super(name,hp,grow);
	}
	
public void cry(){
	System.out.println( "ㅠㅠㅠ");
}
 
	public void walk() {
		System.out.println( "피로도  hp 25 하락");
		super.setHp(super.getHp()-25);
		super.setGrow(super.getGrow()+25);
		if(super.getHp() <=0) {
			System.out.println( "걷기 운동으로 경험치가 "+super.getGrow()+"만큼 상승합니다.");
		}
			System.out.println(+super.getGrow()+"만큼 상승");
		 
	}
	public void swim() {
		System.out.println( "피로도  hp 50 증가");
		super.setHp(super.getHp()-50);
		super.setGrow(super.getGrow()+50);
		 if(super.getHp() <=0)
			System.out.println("수영으로 경험치가 "+super.getGrow()+"만큼 상승");
		 
	}
}
















 