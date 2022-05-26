package srp;

public class NotificationService {
	
	public void sendOTP(String medium) {
		if(medium.equals("email")) {
			//send notification through mail
		}
		
		else if(medium.equals("mobile")) {
			//send notification through mobile
		}
	}
}
