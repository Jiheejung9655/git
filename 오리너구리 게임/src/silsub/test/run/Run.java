package silsub.test.run;
import java.util.Scanner;
import silsub.test.controller.Manager;
import silsub.test.model.vo.Duck;

public class Run  {

	public static void main(String[] args) {
		Manager m =new Manager();
		Scanner sc =new Scanner(System.in);
 
		System.out.println("�����ʱ����� �̸��� �����ּ���:");
		String name =sc.nextLine();
		m.startPlay(name);
		
		
	}

}
