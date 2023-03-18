import java.util.*;
public class HomePage {
	static Scanner input=new Scanner(System.in);
	static Account account=new Account();
	static CheckingAccount checkingAccount=new CheckingAccount();
	static SavingAccount savingAccount=new SavingAccount();
	public HomePage() {
		
	}
	public static void login() {
		try {
		System.out.println("Enter you UserName: ");
		int id=input.nextInt();
		System.out.println("Enter yout passcode: ");
		int pin=input.nextInt();
		verifyLogin(id,pin);
		}catch(Exception e) {
			System.out.println("OOP something went wrong!!");
		}
	}
	public static void verifyLogin(int id,int pin) {
		if(id==account.getId() && pin == account.getPin()) {
			accountOption();
		}else {
			System.out.println("Fail to login, please try again!!");
			login();
		}
	}
	public static void accountOption() {
		System.out.println("Please choose the following number option:\n1.Checking Account\n2.Saving Account\n3.exit");
		int optionInput=input.nextInt();
		if(optionInput==3) {
			login();
		}
		option(optionInput);
	}
	public static void option(int n) {
		if(n==1) {
		System.out.println("---Checking Account----Please choose the following number option:\n1.deposite\n2.withdraw\n3.Balance\n4.exit");
		int checkingOption=input.nextInt();
		switch(checkingOption) {
		case 1:
		System.out.println("---Checking Account----Please enter the amount you want to deposite to your checking account:");
		int checkingDeposite=input.nextInt();
		checkingAccount.checkingDeposite(checkingDeposite);
		System.out.println("---Checking Account----Your successfully made $"+checkingDeposite+" deposite to your checking Account\nYour checking Account new balance is "+checkingAccount.getBalance());
		break;
		case 2:
		System.out.println("---Checking Account----Please enter the amount you want to withdraw from your checking account:");
		int checkingWithdraw=input.nextInt();
		checkingAccount.checkingWithDraw(checkingWithdraw);
		System.out.println("---Checking Account----Your successfully withdraw $"+checkingWithdraw+" from your checking Account \nYour checking Account new balance is "+checkingAccount.getBalance());
		break;
		case 3:
		System.out.println("\n---Checking Account----Your new balance is "+checkingAccount.getBalance());
		break;
		default:
		option(n);
		}
		accountOption();
		}else if(n==2) {
			
			System.out.println("---Saving Account----Please choose the following number option:\n1.deposite\n2.withdraw\n3.Balance\n4.exit");
			int savingOption=input.nextInt();
			switch(savingOption) {
			case 1:
			System.out.println("---Saving Account----Please enter the amount you want to deposite to your saving account:");
			int savingDeposite=input.nextInt();
			savingAccount.savingDeposite(savingDeposite);
			System.out.println("---Saving Account----Your successfully made $"+savingDeposite+" deposite to your Saving Account Your saving account new balance is "+savingAccount.getBalance());
			break;
			case 2:
			System.out.println("---Saving Account----Please enter the amount you want to withdraw from your saving account:");
			int savingWithdraw=input.nextInt();
			savingAccount.savingWithDraw(savingWithdraw);
			System.out.println("---Saving Account----Your successfully withdraw $"+savingWithdraw+" from your Saving Account \nYour saving account new balance is "+savingAccount.getBalance());
			break;
			case 3:
			System.out.println("\n---Saving Account----Your new balance is "+savingAccount.getBalance());
			break;
			default:
			option(n);
			}	
			accountOption();
		}else{
			accountOption();
		}
	}
	}