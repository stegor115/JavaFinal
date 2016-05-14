
public class CustomerArray {
	private Customer[] myArray;
	private int index;
	private double allPayments = 0.0;
	
	public CustomerArray(int max){
		myArray = new Customer[max];
		index = 0;
	} //end method
	
	public void insert(String name, String address, String town, String zipcode, String currentDate, String dueDate, double balance, double amountDue){
		myArray[index] = new Customer(name, address, town, zipcode, currentDate, dueDate, balance, amountDue);
		index++;
	} //end method
	
	public void displayBills(){
		for(int i=0; i<index; i++){
			myArray[i].displayBill();
		} //end for
	}//end method
	
	public void mailList(){
		for(int i=0; i<index; i++){
			myArray[i].displayMail();
		}//end for
	}//end method
	
	public void search(int id){
		for(int i = 0; i<index; i++){
			if(i == id){
				myArray[i].displayBill();
				break;
				//For some reason this causes the loop to do a invalid input once
				//but then it works the second time
			}//end if
		}//end for
	} //end method
	
	public void delete(int id){
		for(int i=0; i<index; i++){
			if(i == id){
				System.out.println("Deleting " + myArray[i].getName());
				myArray[i] = myArray[i+1];
				index--;
				break;
			} //end if
		} //end for
		System.out.println("Deleted");
	} //end method, IT WORKS :) but it does that weird thing that search does too
	
	public void payments(){
		double totalAmount = 0.0;
		for(int i = 0; i<index; i++){
			totalAmount = totalAmount + myArray[i].getAmountDue();
		} //end for
		// Wasn't exactly sure what the goal was, so I provided the amount due, plus payments added.
		System.out.println("Outstanding Balances: $" + totalAmount);
		System.out.println("Total Payments: $" + allPayments);
	} //end method
	
	public void makePayment(int id, double payment){
		for(int i = 0; i<index; i++){
			if(i == id){
				double newBalance = 0;
				double newAmountDue = 0;
				System.out.println("Adding payment of $" + payment);
				System.out.println("Old Balance: $" + myArray[i].getBalance());
				//Change stuff here
				newBalance = myArray[i].getBalance() + payment;
				newAmountDue = myArray[i].getAmountDue() - payment;
				myArray[i] = new Customer(myArray[i].getName(), myArray[i].getAddress(), myArray[i].getTown(), myArray[i].getZipcode(), myArray[i].getDate(), myArray[i].getDueDate(), newBalance, newAmountDue);
				System.out.println("New Balance: $" + myArray[i].getBalance());
				allPayments = allPayments + payment;
			} //end if
		} //end for
	} //end method
}//end class
