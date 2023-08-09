package inheritance;

public class WorkerDetials extends CollegeDetails {
	
	public void workerName() {
		System.out.println("Worker name is Siva");
	}
	public void workerId() {
		int a = 5894;
		System.out.println("Worker ID is "+a+"CE");
	}
	public static void main(String[] args) {
		WorkerDetials w = new WorkerDetials();
		w.workerName();
		w.workerId();
		w.clgName();
		w.clgAdress();
		w.schoolName();
		w.schoolAdress();

}}
