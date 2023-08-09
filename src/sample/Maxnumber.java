package sample;

public class Maxnumber {
	
	public static void main(String[] args) {
		
		int a[] = {2,5,6,8,3,7};
		
		int temp = 0;
		
		for (int i = 0; i < a.length; i++) {
			 //i=0; 0<6 i=0
			 //i=1; 1<6 i=1
			 //i=2; 2<6 i=2
			 //i=3; 3<6 i=3
			 //i=4; 4<6 i=4
			 //i=5; 5<6 i=5
		
			if (a[i]>temp) {
				//a[0] 2>0
				//a[1] 2>5
				//a[2] 5>6
				//a[3] 6>8
				//a[4] 8>3
				//a[5] 8>7
				temp = a[i];
			}
		}
		System.out.println(temp);
	}
}
