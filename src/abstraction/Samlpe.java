package abstraction;

public class Samlpe extends PersonalDetails {

	@Override
	public void loanElligiblity() {
		System.out.println("Elligible");
		
	}

	@Override
	public void cibilScore() {
        System.out.println("Cibil Score s 9877");
		
	}

	public static void main(String[] args) {
		Samlpe s = new Samlpe();
		s.loanElligiblity();
		s.cibilScore();
		s.name();
		s.address();
		
	}
}
