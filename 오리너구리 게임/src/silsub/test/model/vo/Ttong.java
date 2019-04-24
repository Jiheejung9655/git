package silsub.test.model.vo;

public class Ttong extends Duck {
	public Ttong() {}
	public Ttong(String name,int grow,int hp){
		super(name,hp,grow);
	}
	@Override
	public void cry() {
		System.out.println("룰루랄라~");
	}
 
	public void wash() {
		System.out.println( "씻는중....hp 10 감소");
		super.setHp(super.getHp()-10);
		super.setGrow(super.getGrow()+10);
		if(super.getHp() <=0) {
			System.out.println("씻는 중~~경험치가 "+super.getGrow()+"만큼 상승");
		}
	}
 
	public void ttong() {
		System.out.println("용변 보는 중....hp 30 감소");
		super.setHp(super.getHp()-30);
		super.setGrow(super.getGrow()+30);
		if(super.getHp() <=0) {
		System.out.println("용변 보는 중.경험치가 "+super.getGrow()+"만큼 상승");
	}
	}
}
