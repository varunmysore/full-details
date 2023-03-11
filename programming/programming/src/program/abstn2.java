package program;

public class abstn2 extends abstn {

	public double getBalance() {

		return this.amount;
	}

	public void withdraw(double x) {

		this.amount = this.amount - x;
	}

}
