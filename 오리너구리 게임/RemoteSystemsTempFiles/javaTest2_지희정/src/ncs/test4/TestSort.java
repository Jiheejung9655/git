package ncs.test4;
public class TestSort {
	public static void main(String[] args) {
		int Array[]=new int [10];
		int num =(int)(Math.random()*100)+51;
		for(int i=0; i<num; i++ ) {
				Array[i] +=num;
			System.out.print (Array[i]);
			int temp=0;
			for(int j=0; j<Array[i]; i++) {
			for(int a=j+1; a<Array[i]; j++) {
				if(Array[j]> Array[a]) {
					temp =Array[i];
					Array[i]=Array[a];
					Array[a]=temp;
					
				} 
				System.out.println(Array[a]);
				System.out.println(Array[j]);
			}
			}
		}
		
		}
}
 
