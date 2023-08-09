package variables;

public class VariablesDemo {
	
	long c = 123; 
	static {
		System.out.println("Student name is Alex");
	}
	
	static long b = 59875 ;  //static variable
	
	 public void idNumber() {
		System.out.println("Alex Id card number is GHJKI"+b);

	}
	
	public void demo() {
		long a = 75;      //local variable
		a++;           //increment
		System.out.println("Alex number is "+a);
		
	}
	public static void main(String[] args) {
		VariablesDemo v = new VariablesDemo();
		v.demo();
		v.idNumber();
		
		
		System.out.println(v.c);
		
	}}