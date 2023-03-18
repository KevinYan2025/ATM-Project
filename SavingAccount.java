
public class SavingAccount extends Account{
	float savingBalance=0;
	public SavingAccount() {
	}
	public SavingAccount(float balance, int id, int pin) {
		super(id,pin);
		this.savingBalance=balance;
	}
	public float getBalance() {
		return savingBalance;
	}
	public void setBalance(float balance) {
		this.savingBalance = balance;
	}
	public void savingDeposite(int amount) {
		savingBalance +=amount;
	}
	public void savingWithDraw(int amount) {
		savingBalance -=amount;
	}

}
