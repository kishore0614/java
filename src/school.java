
public class school { //Class Name
	
	public void schName() { //Method Name
		int a = 123456;
		long l = 20;
		short s = 2;
		double d = 10.45;
		char c = 'r';
		boolean b = false;
		String s1 = "Welocome to java";
		System.out.println("School Name ABC0 "+a+l+c);
		System.out.println(s+a);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(s1);
	}
	public void schAddress() {
		System.out.println("School Adress is Chennai");
	}
	public static void main(String[] args) { //Main method 
		//ClassName object = new ClassName();
		school s = new school();
		s.schName();
		s.schAddress();
		
	}}