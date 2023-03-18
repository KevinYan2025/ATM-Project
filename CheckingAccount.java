
public class CheckingAccount extends Account{
	float checkingBalance=0;
	public CheckingAccount() {
	}
	public CheckingAccount(float balance, int id, int pin) {
		super(id,pin);
		this.checkingBalance=balance;
	}
	public float getBalance() {
		return checkingBalance;
	}
	public void setBalance(float balance) {
		this.checkingBalance = balance;
	}
	public void checkingDeposite(int amount) {
		checkingBalance +=amount;
	}
	public void checkingWithDraw(int amount) {
		checkingBalance -=amount;
	}
	

}
