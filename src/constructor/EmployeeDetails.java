package constructor;

public class EmployeeDetails extends WorkerDetails { //child class
	
	private void test() {
		System.out.println("Employee card number is 89");

	}
	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.test();
		e.workerName();
	}

}
