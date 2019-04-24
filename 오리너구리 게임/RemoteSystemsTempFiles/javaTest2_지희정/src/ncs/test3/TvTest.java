package ncs.test3;

public class TvTest {

	public static void main(String[] args) {
		Tv [] tvArray  =new Tv[3];
				Tv t= new Tv();
		tvArray[0]= new Tv("InFINIA","LED TV",1500000);
		tvArray[1]= new Tv("XCANVAS","LCD TV",1000000);
		tvArray[2]= new Tv("CINEMA","3D TV",2000000);

		for(int i=0; i<tvArray.length; i++) {
			System.out.println(tvArray[i]);

		Tv max=tvArray[i];
		Tv min =tvArray[i];
		for(int j=0; j<tvArray.length; j++) {	

			if(max < tvArray[i]) {
				max =tvArray[j];

			}if(min> tv [j]) {
				min=tvArray[j];}
		}
		System.out.println("가격이 가장 비싼 제품:"+max);
		System.out.println("가격이 가장 저렴한 제품:"+min);

		}
	}
}




