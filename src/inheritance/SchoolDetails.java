package inheritance;

public class SchoolDetails {
	
	public void schoolName() {
		System.out.println("School name is XYZ");
	}
	public void schoolAdress() {
		int a = 600011;
		System.out.println("School Adress is Chennai-"+a);
	}
	public static void main(String[] args) {
		SchoolDetails s = new SchoolDetails();
		s.schoolName();
		s.schoolAdress();
	}

}
