package Day2_1;

public class account {

	int accNo;

	String ownerName;

	double balance;

	public void setAccNo(int a) {
		accNo = a;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setOwnerName(String s) {
		ownerName = s;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setBalance(double b) {
		balance = b;
	}

	public Double getBalance() {
		return balance;
	}

	public static void main(String args[]) {

		account a = new account();

		// for account number
		a.setAccNo(34);
		System.out.println("Account number :" + a.getAccNo());

		// for owner name
		a.setOwnerName("lokesh");
		System.out.println("Account number :" + a.getOwnerName());

		// for balance
		a.setBalance(69000);
		System.out.println("Account number :" + a.getBalance());
	}// end main..
}// end class..