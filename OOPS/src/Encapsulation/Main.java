package Encapsulation;

public class Main {
	public static void main(String[] args) {
//		ATM atm1 = new  ATM();
//		atm1.CustName = "Shweta";
//		atm1.MobileNo = 23456;
//		atm1.AccBalance = 550;
//		
//		System.out.println("Customer name is:"+ atm1.CustName);
//		atm1.AccBalance=1000;
//		System.out.println("Acc Balance:" +atm1.AccBalance);
//		
//		atm1.withdraw(990);
//		atm1.AccBalance=1000;
//		atm1.withdraw(1000);
		
	    NewATM atm2 = new NewATM ("mohit",12345,1000);
	    atm2.withdraw(900);
	}

}
