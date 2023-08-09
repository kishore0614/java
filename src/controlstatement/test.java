package controlstatement;

public class test {
	
	public static void main(String[] args) {
		
		long []a = new long [7];
       
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		a[5] = 600;
		a[6] = 700;		
		
		a[1] = 800;
		
		
		System.out.println(a[1]);
		System.out.println(a[6]);
		System.out.println(a[2]);
		System.out.println(a[5]);
		
	
		
		for (int l = 2; l < a.length; l++) {
		System.out.println(a[l]);	
		}

	}}
	
	


		

	

	

