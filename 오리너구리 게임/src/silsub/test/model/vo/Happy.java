package silsub.test.model.vo;

public class Happy extends Duck {
	public Happy() {}
	public Happy(String name,int hp,int grow) {
		super(name,hp,grow);
	}
	
public void cry(){
	System.out.println( "�ФФ�");
}
 
	public void walk() {
		System.out.println( "�Ƿε�  hp 25 �϶�");
		super.setHp(super.getHp()-25);
		super.setGrow(super.getGrow()+25);
		if(super.getHp() <=0) {
			System.out.println( "�ȱ� ����� ����ġ�� "+super.getGrow()+"��ŭ ����մϴ�.");
		}
			System.out.println(+super.getGrow()+"��ŭ ���");
		 
	}
	public void swim() {
		System.out.println( "�Ƿε�  hp 50 ����");
		super.setHp(super.getHp()-50);
		super.setGrow(super.getGrow()+50);
		 if(super.getHp() <=0)
			System.out.println("�������� ����ġ�� "+super.getGrow()+"��ŭ ���");
		 
	}
}
















 