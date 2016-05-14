//Stephen Gordon

import java.util.Scanner;
public class CustomerMain {
	public static void main(String[] args){
		int arrayIndex = 100;
		CustomerArray happyArray = new CustomerArray(arrayIndex);
		
		String userInput;
		int idInput = -1;
		String newName;
		String newAddress;
		String newTown;
		String newZipcode;
		double payment = 0.0;
		double newAmount = 0.0;
		Scanner scan = new Scanner(System.in);
		
		int day = 0;
		int month = 0;
		int year;
		String currentDate;
		String dueDate;
		
		//Enter date
		while(day < 1 || day > 31){
			System.out.println("Please enter the day: (DD)");
			day = scan.nextInt();
			if(day < 1 || day > 31){
				System.out.println("Invalid day, try again");
			} //end if
		} //end while
		while(month < 1 || month > 12){
			System.out.println("Please enter the month: (MM)");
			month= scan.nextInt();
			if(month < 1 || month > 12){
				System.out.println("Invalid month, try again");
			}//end if
		} //end while
		System.out.println("Please enter the year: (YYYY)");
		year = scan.nextInt();
		
		currentDate = month + "/" + day + "/" + year;
		dueDate = (month+1) + "/" + day + "/" + year;
		if(month == 12){dueDate = (month=1) + "/" + day + "/" + year;}
		happyArray.insert("Bingo Bob", "123 Seasame Street", "New York City", "012345", currentDate, dueDate, 1000, 0);
		happyArray.insert("Jimmy Mirus", " 2 Maple Street", "Treeville", "47418", currentDate, dueDate, 500, 500);
		happyArray.insert("Yippie Yay", "21 Elm Street", "Orange", "00123", currentDate, dueDate, 0, 1000);

		
			for(;;){ //infinite loop, must break out of it
				System.out.println();
				System.out.println("Menu");
				System.out.println("--------------------------------------");
				System.out.println("1 - Add Customer");
				System.out.println("2 - Delete Customer");
				System.out.println("3 - Print All Bills");
				System.out.println("4 - Print Mailing List");
				System.out.println("5 - Print Customer Bill");
				System.out.println("6 - Add Payment");
				System.out.println("7 - Calculate Total Payments/Outstanding");
				System.out.println("--------------------------------------");
				System.out.println();
				System.out.println("Please select an action by typing its corresponding number or quit");
				userInput = scan.nextLine();
				userInput = userInput.toLowerCase();
				
				if(userInput.equals("quit")){
					break;
				} //end if
				
	
				switch(userInput){
					case("1"):
						System.out.println("Please enter Customer Name");
						newName = scan.nextLine();
						System.out.println("Please enter a Street Address");
						newAddress = scan.nextLine();
						System.out.println("Please enter your Town/City");
						newTown = scan.nextLine();
						System.out.println("Please enter your Zipcode");
						newZipcode = scan.nextLine();
						happyArray.insert(newName, newAddress, newTown, newZipcode, currentDate, dueDate, 1000, 0);
						System.out.println("Added!");
						System.out.println();
						break;
					case("2"):
						System.out.println("Please enter Customer ID Number to delete");
						idInput =scan.nextInt();
						happyArray.delete(idInput);
						break;
					case("3"):
						happyArray.displayBills();
						break;
					case("4"):
						happyArray.mailList();
						break;
					case("5"): 
						System.out.println("Please enter Customer ID Number");
						idInput =scan.nextInt();
						happyArray.search(idInput);
						idInput = -1;
						break;
					case("6"):
						System.out.println("Please enter Customer ID Number making the payment");
						idInput = scan.nextInt();
						System.out.println("Please enter payment amount");
						payment = scan.nextDouble();
						happyArray.makePayment(idInput, payment);
						break;
					case("7"):
						happyArray.payments();
						break;
					default: 
						System.out.println("Invalid input");
						System.out.println();
						break;
				} //end switch
			} //end infinite for
			System.out.println();
			System.out.println("Thank you");
	}
}