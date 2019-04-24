package silsub.test.model.vo;
public class Duck  {
	protected String name;
	protected int grow ;
	protected int hp;
	
	public Duck() {}
	public Duck(String name,int grow,int hp) {
	 
		this.name=name;
		this.grow=grow;
		this.hp=hp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrow() {
		return grow;
	}
	public void setGrow(int grow) {
		this.grow = grow;
	}
		
	public void cry() {}
 
 
}
