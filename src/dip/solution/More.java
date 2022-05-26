package dip.solution;


public class More {
	
	private BankCard bankCard;
	
	public More(BankCard bankCard) {
		this.bankCard=bankCard;
	}
	
	public void doPurchase(long amount) {
		bankCard.doTransaction(amount);
	}
	
	public static void main(String args[]) {
		BankCard bankCard=new DebitCard();
		More more=new More(bankCard);
		more.doPurchase(16);
	}
}
