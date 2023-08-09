package scanner;

import java.util.Scanner;  // Scanner is a Pre-defined class

public class ScannerDemo {
	public static void main(String[] args) {
		System.out.println("Enter your age?");
		
		Scanner s = new Scanner(System.in);
		
		
		int nextInt = s.nextInt();
		//Return Type ---> CRTL+2, L
		
		System.out.println(" Your age is: "+nextInt);
//		Scanner s1 = new Scanner(System.in);
		
		
//System.out.println("Enter your name?");
//		String nextLine = s.nextLine();
//		System.out.println("Your name is "+nextLine);
//		Scanner s2 = new Scanner(System.in);

		
		double nextDouble = s.nextDouble();
		System.out.println("Your CGPA is "+nextDouble );
//		Scanner s3 = new Scanner(System.in);

		
		long nextLong = s.nextLong();
		System.out.println("Your pincode is "+nextLong);
//		Scanner s4 = new Scanner(System.in);

		
		
	}

}
