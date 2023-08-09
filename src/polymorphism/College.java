package polymorphism;

public class College {
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
			College c = new College();
			c.collegeName();
			c.collegeName(929);
			c.collegeName(600042, "Chennai, Tamil nadu");
			c.collegeName("New Students ", 100);
		
				
		}

}
