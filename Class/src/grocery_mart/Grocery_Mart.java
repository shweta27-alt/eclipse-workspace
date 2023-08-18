package grocery_mart;

public class Grocery_Mart {
	private String Customer_name;
	private String Customer_ID;
	private String phone_no;
	private double balance;
	private String address;
	
	public Grocery_Mart() {
		this("DefName","DefID","DefNo",300.00,"Defadd");
		System.out.println("default constructor is called");
	}
	
	public Grocery_Mart(String Customer_name,String Customer_ID,String phone_no,double balance,String address) {
		this.Customer_name= Customer_name;
		this.Customer_ID = Customer_ID ;
		this.phone_no= phone_no;
		this.balance= balance;
		this.address=address;
		System.out.println("constructor is called");
	}
	
	public Grocery_Mart(String custName, String custID,String custPhNO) {
		this(custName,custID,custPhNO,200,"Sydney");
	}
	
	public void setname(String Customer_name) {
		this.Customer_name = Customer_name;
		}
	
	public String getname() {
		return this.Customer_name;
	}
	public void setID(String Customer_ID) {
		this.Customer_ID = Customer_ID;
	}
	
	public String getID() {
		return this.Customer_ID;
	}
	
	public void setphoneno(String phone_no) {
		this.phone_no = phone_no;
	}
	
	public String getphoneno() {
		return this.phone_no;
	}
	
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public double getbalance() {
		return this.balance;
	}
	
	public void setaddress(String address) {
		this.address = address;
	}
	
	public String getaddress() {
		return this.address;
	}
	
	public void shop(double amount) {
		if(balance >=amount) {
			double rembal = balance-amount;
			System.out.println("thank you for shopping . your balance amount is:" + rembal);
			balance = rembal;
		}else {
			double lowamount = amount-balance;
			System.out.println("Insufficient balance: Add more money: "+ lowamount);
		}
	}
	
	public void rechargeAcc(double recharge) {
		balance = balance + recharge;
		System.out.println("thank you for recharging. Your balance is:"+ balance);
	}
	}	

























