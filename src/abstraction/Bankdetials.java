package abstraction;

public class Bankdetials implements ICICI,Axis,SBI {

	@Override
	public void bankName() {
		System.out.println("ICICI");		
	}

	@Override
	public void bankAddress() {
		System.out.println("Chennai");
	}

	@Override
	public void loanElligibility() {
		System.out.println("Elligibility");
		
	}

	@Override
	public void cibilScore() {
		System.out.println("Cibil Score is 648");
		
	}

	@Override
	public void accountCode() {
		System.out.println("Account Code is 123");		
	}

	@Override
	public void accountStatus() {
		System.out.println("Active");
		
	}
	public static void main(String[] args) {
		Bankdetials b= new Bankdetials ();
		b.bankName();
		b.bankAddress();
		b.loanElligibility();
		b.cibilScore();
		b.accountCode();
		b.accountStatus();
	}}
