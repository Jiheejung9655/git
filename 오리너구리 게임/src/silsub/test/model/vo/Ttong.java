package silsub.test.model.vo;

public class Ttong extends Duck {
	public Ttong() {}
	public Ttong(String name,int grow,int hp){
		super(name,hp,grow);
	}
	@Override
	public void cry() {
		System.out.println("������~");
	}
 
	public void wash() {
		System.out.println( "�Ĵ���....hp 10 ����");
		super.setHp(super.getHp()-10);
		super.setGrow(super.getGrow()+10);
		if(super.getHp() <=0) {
			System.out.println("�Ĵ� ��~~����ġ�� "+super.getGrow()+"��ŭ ���");
		}
	}
 
	public void ttong() {
		System.out.println("�뺯 ���� ��....hp 30 ����");
		super.setHp(super.getHp()-30);
		super.setGrow(super.getGrow()+30);
		if(super.getHp() <=0) {
		System.out.println("�뺯 ���� ��.����ġ�� "+super.getGrow()+"��ŭ ���");
	}
	}
}
