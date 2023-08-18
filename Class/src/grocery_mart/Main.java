package grocery_mart;

import demo.Cellphone;

public class Main {
	public static void main(String[] args) {
        Grocery_Mart myAccount = new Grocery_Mart("shweta","#1233","8850555867",500.39,"kalyan");
//		Grocery_Mart myAccount = new Grocery_Mart();
		Grocery_Mart shweAccount = new Grocery_Mart();
		
//		myAccount.setname("shweta");
//		myAccount.setID("#1233");
//		myAccount.setbalance(500.39);
//		myAccount.setphoneno("8850555867");
//		myAccount.setaddress("kalyan");
		
//		myAccount.shop(498.39);
//		myAccount.shop(100);
//		
//		myAccount.rechargeAcc(700);
//		myAccount.shop(600);
		
		System.out.println(myAccount.getbalance());
		System.out.println(shweAccount.getphoneno());
		
		Grocery_Mart newAcc = new Grocery_Mart("NewCust", "7233","3665456");
    	System.out.println(newAcc.getname());
		System.out.println(newAcc.getbalance());
		
		
		
	}
}
