package srp;

public class BankingService {
	
	public void deposit(long amount) {
		//deposite amount
	}
	
	public void withdraw(long amount) {
		//withdraw amount
	}
	
	public void printPassBook() {
		//printing the passbook
	}
	
	public void getLoanInterestInfo(String loanType) {
		if(loanType.equals("homeloan")) {
			//do something
		}
		
		else if(loanType.equals("personal")) {
			//do something
		}
		
		if(loanType.equals("car")) {
			//do something
		}
	}
	
	public void sendOTP(String medium) {
		if(medium.equals("email")) {
			//send notification through mail
		}
		
		else if(medium.equals("mobile")) {
			//send notification through mobile
		}
	}
}
