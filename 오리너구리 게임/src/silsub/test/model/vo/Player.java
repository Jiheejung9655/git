package silsub.test.model.vo;

public class Player {
	private String name;
	private int grow =0;
 
	
	public Player() {}
	public Player(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getGrow() {
		return grow;
	}
	public void setGrow(int grow) {
		this.grow = grow;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return  name +"���� ���� ����ġ��"+grow+"�Դϴ�.";
	}
	 
	

}
