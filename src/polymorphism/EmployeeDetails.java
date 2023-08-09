package polymorphism;

public class EmployeeDetails extends CollegeDetails{
	@Override
	public void collegeName() {
		System.out.println("Worker name is Siva");
		super.collegeName();
	}
	@Override
	public void collegeName(long a) {
		System.out.println("College ID number -" +a+"GRSA");
		super.collegeName(a);
	}
	@Override
	public void collegeName(long a, String s) {
		System.out.println("Company Adress is "+s+", "+a);
		super.collegeName(a, s);
	}
	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.collegeName();
		e.collegeName(5874);
		e.collegeName(600015, "Chennai");
	}

}
