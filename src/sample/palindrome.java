package sample;

import java.util.Scanner;

public class palindrome {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a name ");
		
		String value = s.next();
		
		String rev = "";
		
		for (int i = value.length()-1; i>=0; i--) {
			
			rev = rev + value.charAt(i);		
			
		}
		System.out.println(rev);
		
		if (value.equals(rev)) {
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
