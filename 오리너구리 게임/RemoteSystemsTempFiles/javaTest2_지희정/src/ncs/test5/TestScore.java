package ncs.test5;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int count=0;
		double sum =0;
		double avg=0;
		while(count <3) {
			System.out.println(count +"�� �л�");
		System.out.println("����1�� ������ �Է��ϼ���");
		double num1=sc.nextDouble();
		System.out.println("����2�� ������ �Է��ϼ���");
		double num2=sc.nextDouble();
		System.out.println("����3�� ������ �Է��ϼ���");
		double num3=sc.nextDouble();
		sum= num1+num2+num3;
		avg =sum/3;
		count ++;
		
		System.out.println( count+" "+sum+" "+avg);
		}
		System.out.println("index ����1 ����2 ����3 ���� ���");
		
		
		
//	System.out.println( count+num1+num2+num3+sum+avg);
		
	
	}
}
