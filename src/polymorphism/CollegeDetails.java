package polymorphism;

public class CollegeDetails { 
	
	public void collegeName() {
	System.out.println("College name is XYZ");
	}
	public void collegeName(long a) {
		System.out.println("College code is "+a);
	}
	public void collegeName(long a, String s) {
		System.out.println("College Address - " +s+", "+a);
	}
	public void collegeName(String h , long b) {
		System.out.println("College Admission for "+h+" - "+b);
	}
	public static void main(String[] args) {
		CollegeDetails c = new EmployeeDetails(); //Up Casting
//		c.collegeName();
		c.collegeName(589);
		c.collegeName(600052, "Chennai, Tamil nadu");
		c.collegeName("New Students ", 200);
	
			
	}
}
