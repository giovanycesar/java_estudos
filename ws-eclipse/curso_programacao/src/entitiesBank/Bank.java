package entitiesBank;

public class Bank {

	private int number;
	private String holder;
	private double balance;

	public Bank() {
	}

	public Bank(int number, String holder, double inicialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(inicialDeposit);
	}
	
	public Bank(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {

		balance += amount;

	}

	public void withdraw(double amount) {

		balance = (balance - amount) - 5;

	}

	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", getBalance());
	}

}
