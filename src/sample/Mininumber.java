package sample;

public class Mininumber {
	
	
	public static void main(String[] args) {
		
		int a[] = {10,5,6,4,7,9};
		
		int temp = a[0]; 
		
		for (int i = 0; i <a.length; i++) {
			 //i=0; 0<6 i=0
			 //i=1; 1<6 i=1
			 //i=2; 2<6 i=2
			 //i=3; 3<6 i=3
			 //i=4; 4<6 i=4
			 //i=5; 5<6 i=5
			 
			if (temp>a[i])  {
				//5>a[0] // 5>5
				//5>a[1] // 5>6
				//5>a[2] // 5>4
				//4>a[3] // 4>8
				//4>a[4] // 4>7
				//4>a[5] // 4>9
				temp = a[i];
			}
			
		}
		System.out.println(temp);

	}

}
