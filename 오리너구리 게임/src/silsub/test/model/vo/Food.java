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
		System.out.println("���� ���ż� hp 10 ���");
		super.setHp(super.getHp()+10);
		super.setGrow(super.getGrow()+10);
		if(super.getHp() <=10) {
		System.out.println("����ġ�� "+super.getGrow()+"��ŭ ����մϴ�.");
	}
		
	}
		 		
	public void sellfish() {
		System.out.println( "�������� �Ծ� �ູ�� ���� ��ϴ�~~~~!^____^ hp 20 ���");
		super.setHp(super.getHp()+20);
		super.setGrow(super.getGrow()+20);
		if(super.getHp() <=20) {
			System.out.println("����ġ�� "+super.getGrow()+"��ŭ ����մϴ�.");
		}
	 

	}
	
	public void earthworm() {
		System.out.println("�����̸� �Ծ� �ູ�� ���� ��ϴ�~~~~!^____^ hp 30 ���");
		super.setHp(super.getHp()+30);
		super.setGrow(super.getGrow()+30);
		if(super.getHp() <=30) {
			System.out.println("����ġ�� "+super.getGrow()+"��ŭ ����մϴ�.");
		}
		
	}
	
	public void seafood() {
		System.out.println("�ػ깰�� �Ծ� �ູ�� ���� ��ϴ�~~~~!^____^ hp 30 ���");
		super.setHp(super.getHp()+30);
		super.setGrow(super.getGrow()+30);
		if(super.getHp() <=30) {
			System.out.println("����ġ�� "+super.getGrow()+"��ŭ ����մϴ�.");
		}
	}

}