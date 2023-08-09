package conditional;

import java.util.Scanner;

public class demo {
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your mark");
	
		
		
		int mark = s.nextInt();
		int mark1 = s.nextInt();
		int mark2 = s.nextInt();
		int mark3 = s.nextInt();
		int mark4 = s.nextInt();
		
		
	if(mark<35) {
		System.out.println("fail");
	}
	
	else if (mark>=35 & mark<=45) {
		System.out.println("D grade");	
	}
	
	else if (mark>=45 & mark<=55) {
		System.out.println("C grade");
	}
	
	else if (mark>=55 & mark<=65) {
		System.out.println("C+ grade");
	}
	
	else if (mark>=65 & mark<=75) {
		System.out.println("B grade");
	}
	
	else if (mark>=85 & mark<=95) {
		System.out.println("B+ grade");
	}
	
	else if (mark>=95 & mark<=98) {
		System.out.println("A grade");
	}
	
	else if (mark>=98 & mark<=100) {
		System.out.println("A+ grade");
	}	
  }
}

