package constructor;

public class WorkerDetails { //parent class 
	public void workerName() {
		System.out.println("Worker name is Ram");
	}
	
	public WorkerDetails() { //constructor
		System.out.println("Company Address is Chennai");
	}
	
	public WorkerDetails(long a) {
		System.out.println("Worker ID is BYUMK"+a);
	}
	public static void main(String[] args) {
		WorkerDetails w = new WorkerDetails();
		w.workerName();
		
		WorkerDetails w1 = new WorkerDetails(5687);
	}
}
