
public class Customer {
	private String name;
	private String streetAddress;
	private String townAddress;
	private String zipcode;
	private String currentDate = "test date";
	private String dueDate = "test end date";
	private double balance;
	private double amountDue;
	
	public Customer(String strName, String strAddress, String strTownAddress, String strZipcode, String strCurrentDate, String strDueDate, double douBalance, double douAmountDue){
		name = strName;
		streetAddress = strAddress;
		townAddress = strTownAddress;
		zipcode = strZipcode;
		currentDate = strCurrentDate;
		dueDate = strDueDate;
		balance = douBalance;
		amountDue = douAmountDue;
	} //end constructor
	
	public void displayBill(){
		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Address: " + streetAddress);
		System.out.println(townAddress + ", " + zipcode);
		System.out.println("Date: " + currentDate);
		System.out.println("Balance : $" + balance);
		System.out.println("Amount Due: $" + amountDue);
		System.out.println("Due Date: " + dueDate);
	} //end method
	
	public void displayMail(){
		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Address: " + streetAddress);
		System.out.println(townAddress + ", " + zipcode);
	} //end method
	
	public String getAddress(){
		return streetAddress;
	} //end method
	
	public String getTown(){
		return townAddress;
	} //end method
	
	public String getZipcode(){
		return zipcode;
	} //end method
	
	public String getDate(){
		return currentDate;
	} //end method
	
	public String getDueDate(){
		return dueDate;
	} //end method
	
	public double getBalance(){
		return balance;
	} //end method
	
	public double getAmountDue(){
		return amountDue;
	}
	
	public String getName(){
		return name;
	}
}
