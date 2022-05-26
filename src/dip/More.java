package dip;

public class More {
	
	private DebitCard debitCard;
	
	public More(DebitCard debitCard) {
		this.debitCard=debitCard;
	}
	
	public void doPurchase(long amount) {
		debitCard.doTransaction(amount);
	}
	
	public static void main(String args[]) {
		CreditCard creditCad=new CreditCard();
		DebitCard debitCard=new DebitCard();
		More more=new More(debitCard);
		more.doPurchase(16);
	}
}

