package ncs.test5;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int count=0;
		double sum =0;
		double avg=0;
		while(count <3) {
			System.out.println(count +"의 학생");
		System.out.println("과목1의 점수를 입력하세요");
		double num1=sc.nextDouble();
		System.out.println("과목2의 점수를 입력하세요");
		double num2=sc.nextDouble();
		System.out.println("과목3의 점수를 입력하세요");
		double num3=sc.nextDouble();
		sum= num1+num2+num3;
		avg =sum/3;
		count ++;
		
		System.out.println( count+" "+sum+" "+avg);
		}
		System.out.println("index 과목1 과목2 과목3 총점 평균");
		
		
		
//	System.out.println( count+num1+num2+num3+sum+avg);
		
	
	}
}
