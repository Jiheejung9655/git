package silsub.test.controller;
import java.util.Scanner;

import silsub.test.model.vo.*;
public class Manager {
	Scanner sc =new Scanner(System.in);
	Food f = new Food();
	Happy h =new Happy();
	Ttong t =new Ttong();

	public void startPlay(String name) {
		Player p =new Player(name);
		System.out.println(p.getName()+"�Բ��� �����ϼ̽��ϴ�.");
		System.out.println(p);

		do{System.out.println("========�������ּ���=======");
		System.out.println("1.�� �ֱ�");
		System.out.println("2.� ��Ű��");
		System.out.println("3.ȭ��� ������");
		System.out.println("4.���α׷� ����");

		int num1 =sc.nextInt();
		switch(num1) {
		case 1 :startPlay1(name);break;
		case 2 :startPlay2(name);break;
		case 3 :startPlay3(name);break;
		case 4 :return;
		default: 
		}
		}while(true);
	}

	public void startPlay1(String name) {
		Player p =new Player(name);
		do{
			System.out.println("========�������ּ���=======");
			System.out.println("���� ����� ��ǰǰ���?");
		System.out.println("1.��");
		System.out.println("2.������");
		System.out.println("3.������");
		System.out.println("4.�ػ깰");
		System.out.println("5.�ǵ��ư���");

		int num2 =sc.nextInt();
		switch(num2) {
		case 1 :f.water(); 
		Duck f1 =new Food("��",10,10);
		f1.cry();
		for(int i=f1.getHp(); i>0; i+=10) {
			if(f1 instanceof Food) {
				((Food)f1).water();break;
			}break;
		}
		p.setGrow(p.getGrow()+f1.getGrow());

		System.out.println(p);
		break;
		case 2 :f.sellfish();
		Duck f2 =new Food("������",20,20);
		f2.cry();
		for(int i=f2.getHp(); i>0; i+=20) {
			if(f2 instanceof Food) {
				((Food)f2).sellfish();break;
			}break;
		}
		p.setGrow(p.getGrow()+f2.getGrow());

		System.out.println(p);
		 
		break;
		case 3 :f.earthworm();
		Duck f3 =new Food("������",30,20);
		f3.cry();
		for(int i=f3.getHp(); i>0; i+=30) {
			if(f3 instanceof Food) {
				((Food)f3).earthworm();break;
			}break;
		}
		p.setGrow(p.getGrow()+f3.getGrow());

		System.out.println(p);
		break;
		case 4 :f.seafood();
		Duck f4 =new Food("�ػ깰",30,30);
		f4.cry();
		for(int i=f4.getHp(); i>0; i+=30) {
			if(f4 instanceof Food) {
				((Food)f4).seafood();break;
			}break;
		}
		p.setGrow(p.getGrow()+f4.getGrow());

		System.out.println(p);
		break;
		
		case 5:return;
		default: break;
		}
		}while(true);
	}

	
	public void startPlay2(String name) {
		Player p =new Player(name);
		do{System.out.println("========�������ּ���=======");
			System.out.println("� ����� �Ͻǰǰ���?");
		System.out.println("1.�ȱ�");
		System.out.println("2.�����ϱ�");
		System.out.println("3.�ǵ��ư���");
		
		int num3 =sc.nextInt();
		switch(num3) {
		case 1 :h.walk();
		Duck h1 =new Happy("�ȱ�",25,25);
		h1.cry();
		for(int i=h1.getHp(); i>0; i-=25) {
			if(h1 instanceof Food) {
				((Happy)h1).walk();break;
			}break;
		}
		p.setGrow(p.getGrow()+h1.getGrow());

		System.out.println(p);
		 
		break;
		case 2 :h.swim();
		Duck h2 =new Happy("����",50,50);
		h2.cry();
		for(int i=h2.getHp(); i>0; i -=50) {
			if(h2 instanceof Happy) {
				((Happy)h2).swim();break;
			}break;
		}
		p.setGrow(p.getGrow()+h2.getGrow());

		System.out.println(p);
		break;
		case 3 :return;
		default:break;
		}
		}while(true);
	}

	public void startPlay3(String name) {
		Player p =new Player(name);
		do{System.out.println("========�������ּ���=======");
			System.out.println("ȭ��ǿ��� ������ �Ͻǰǰ���");
		System.out.println("1.�ı�");
		System.out.println("2.�뺯����");
		System.out.println("3.�ǵ��ư���");
		int num4 =sc.nextInt();

		switch(num4) {
		case 1 :t.wash();
		Duck t1 =new Ttong("�ı�",10,10);
		t1.cry();
		for(int i=t1.getHp(); i>0; i-=10) {
			if(t1 instanceof Food) {
				((Ttong)t1).wash();break;
			}break;
		}
		p.setGrow(p.getGrow()+t1.getGrow());

		System.out.println(p);
		break;
		case 2 :t.ttong();
		Duck t2 =new Ttong("�뺯",20,10);
		t2.cry();
		for(int i=t2.getHp(); i>0; i-=20) {
			if(t2 instanceof Food) {
				((Ttong)t2).ttong();break;
			}break;
		}
		p.setGrow(p.getGrow()+t2.getGrow());

		System.out.println(p);
		break;
		case 3 :return;
		default:break;
		}
		}while(true);
	}
}
 