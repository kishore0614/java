package inheritance;

public class CollegeDetails extends SchoolDetails  {

	public void clgName() {
		System.out.println("College name is UVW");
	}
	public void clgAdress() {
		double d = 56.23;
		System.out.println("College Adress is " + d + "," +" Chennai");
	}
	public static void main(String[] args) {
		CollegeDetails c = new CollegeDetails();
		c.clgName();
		c.clgAdress();
		c.schoolName();
		c.schoolAdress();
	}

}


