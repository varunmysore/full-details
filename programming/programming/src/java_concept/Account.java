package java_concept;

public class Account {
	private double balance = 100000;

	public double getbalance() {
		return this.balance;
	}

	public void withdraw(double x) {
		this.balance = this.balance - x;
		
	}

	public void deposit(double y) {
		this.balance = this.balance + y;
		
	}
}
