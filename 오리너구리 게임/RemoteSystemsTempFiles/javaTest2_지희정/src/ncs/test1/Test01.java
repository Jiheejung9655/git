package ncs.test1;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			 
			int a =sc.nextInt();
			int b =sc.nextInt();
			int c =sc.nextInt();
			int d =sc.nextInt();
			int e =sc.nextInt();
			
			System.out.println("5���� ������ �Է��ϼ���");
			String s =sc.nextLine();
			
			for(int i=10; i<100; i++ ) {
				if(i<10 || i>100) {
					System.out.println("�ٽ� �Է��ϼ���");
				}
			}
			int num1 =(a+b)/2;
			int num2= (int) (num1 * 0.6);
			int num3 =(c+d)/2;
			int num4= (int)(num3 *02);
			e= (int) 0.2;
			int avg =(num2+num4+e)/5;
			
			if(num2+num4+e >=90) {
				System.out.println("Gold Class ������:"+avg);
			}else if( num2+num4+e >=80) {
				System.out.println("Silver Class ������:"+avg);
			}else if( num2+num4+e >=70) {
				System.out.println("Bronze  Class ������:"+avg);
			}
			else if( num2+num4+e <70) {
				System.out.println("Normal  Class ������:"+avg);
			}
	}
	}
