
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declared Variables with assigned Values
		double itemPrice = 45835.56;
		double walletAmount = 452675.52;
		int numberOfFriends = 400;
		int ageYears = 55;
		String firstName = "Richard";
		char middleInitial = 'M';
		String lastName = "Nixon";
		
		double itemPrice2 = 100.00;
		double walletAmount2 = 500.32;	
		int numberOfFriends2 = 1000;
		int ageYears2 = 30;
		String firstName2 = "David";
		char middleInitial2 = 'W';
		String lastName2 = "Boggess";	
		
		// Declared Variables with no initial assigned Values
		double remainingBalance;
		double friendsPerYear;
		String fullName;
		
		double remainingBalance2;
		double friendsPerYear2;
		String fullName2;
		
		// Operations to determine Values for Variables
		remainingBalance = walletAmount - itemPrice;
		friendsPerYear = numberOfFriends/ageYears; 
		fullName = firstName + " " + middleInitial + " " + lastName;
		
		remainingBalance2 = walletAmount2 - itemPrice2;
		friendsPerYear2 = numberOfFriends2/ageYears2;
		fullName2 = firstName2 + " " + middleInitial2 + " " + lastName2;
		
		
		// Print functions to display Variables and associated Values		
		System.out.println("Price of Item:" + " " + "$" + itemPrice);		
		System.out.println("Amount in Wallet:" + " " + "$" + walletAmount);
		System.out.println("Number of Friends:" + " " + numberOfFriends);
		System.out.println("Person's Age:" + " " + ageYears);
		System.out.println("Person's First Name:" + " " + firstName);
		System.out.println("Person's Middle Initial:" + " " + middleInitial);
		System.out.println("Person's Last Name:" + " " + lastName);
		System.out.println();
		System.out.println("Balance Left in Wallet after Purchase:"+ " " + "$" + remainingBalance);
		System.out.println("Average Friends Made per Year:" + " " + friendsPerYear);
		System.out.println("Person's Full Name:" + " " + fullName);
		System.out.println();
		System.out.println();
		System.out.println("Price of Item Two:" + " " + "$" + itemPrice2);		
		System.out.println("Amount in Wallet Two:" + " " + "$" + walletAmount2);
		System.out.println("Number of Friends Two:" + " " + numberOfFriends2);
		System.out.println("Second Person's Age:" + " " + ageYears2);
		System.out.println("Second Person's First Name:" + " " + firstName2);
		System.out.println("Second Person's Middle Initial:" + " " + middleInitial2);
		System.out.println("Second Person's Last Name:" + " " + lastName2);
		System.out.println();
		System.out.println("Second Person's Balance Left in Wallet after Purchase:"+ " " + "$" + remainingBalance2);
		System.out.println("Second Person's Average Friends Made per Year:" + " " + friendsPerYear2);
		System.out.println("Second Person's Full Name:" + " " + fullName2);
		
		
	}

}
