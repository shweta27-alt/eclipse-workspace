package Encapsulation;

public class NewATM {
	private String CustName;
	private double MobileNo;
	private double AccBalance;
	public NewATM(String custName, double mobileNo, double accBalance) {
		CustName = custName;
		MobileNo = mobileNo;
		AccBalance = accBalance;
	}

	
	public void withdraw(double amount) {
		if(AccBalance < amount) {
			System.out.println("insufficient balance");
		}else {
			AccBalance = AccBalance-amount;
			System.out.println("thanks for withdrawing : Remaining balance is: "+ AccBalance);
		}
		
	}
	
}

