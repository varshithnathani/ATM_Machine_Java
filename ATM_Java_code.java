import java.util.*;
class ATMTrail
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome To Varshith ATM \n\n\nPlease Swipe your card ");

		// Giving Pin and Balance to trail the code
		int pin = 1234;
		double balance = 10000.0;
		String UserName = "Nathani Varshith";

		// Taking user input to validate the pin number provided by the user
		Scanner SC = new Scanner(System.in);
		System.out.println("Please Enter your ATM Pin: ");
		int Vpin = SC.nextInt();
		// Validating the user using pin
		if (pin == Vpin){
			// Giving the ATM Menu
			System.out.println("Please select the ATM Options Mr. "+UserName);
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. ChangePin");
			System.out.println("5. EXIT");
			int OptionSelection = SC.nextInt();

			switch(OptionSelection){
				case 1: 
					System.out.println(balance);
					break;
				case 2:
					System.out.println("Please Enter the Amount to Deposit: ");
				    double DepositMoney = SC.nextDouble();
					balance = balance + DepositMoney;
					System.out.println("Total Amount: "+balance);
					break;
				case 3:
					System.out.println("Please Enter the Amount to WithDraw: ");
				    double WithdrawMoney = SC.nextDouble();
					if(WithdrawMoney < balance){
						balance = balance - WithdrawMoney;
						System.out.println("Available Balance: "+balance);
					}
					else{

						System.out.println("Insufficient Money");
						System.out.println("Available Balance: "+ balance);
					}
					break;
				case 4:
					System.out.println("Please Enter the PIN: ");
				    int newPin = SC.nextInt();
					pin = newPin;
					System.out.println("You PIN have changed Successful");
					break;
				case 5:
					System.out.println("Thankyou");
					break;
				default:
					System.out.println("Please select the above list properly");
				}
		}
		else{
			System.out.println("Please check the PIN");
		}
	}
} 
