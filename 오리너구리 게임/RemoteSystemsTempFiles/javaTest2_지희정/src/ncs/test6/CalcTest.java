package ncs.test6;
import java.util.Scanner;
import ncs.test6.Calculate;
public class CalcTest {
	public static void main(String[] args) {
		Calculate calc = new Calculate();
		Scanner sc =new Scanner (System.in);
		 
		for(int i=1; i<=10; i++) {
			for(int j=0; j<=10; j++) {
			System.out.println("정수 (1~9)입력하세요");
			i=sc.nextInt();
			System.out.println("정수 (1~9)입력하세요");
			j=sc.nextInt();
			
		}
		}System.out.println("합"+sum);
			System.out.println("차"+subtract);
			System.out.println("곱"+multiply);
			System.out.println("나누기"+divide );
			
			
	}

}
