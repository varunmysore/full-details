package java_concept;

public class Account_driver {
public static void main(String[] args) {
	Account ob = new Account();
	System.out.println(ob.getbalance());
	ob.deposit(20000);
	System.out.println(ob.getbalance());
	ob.withdraw(40000);
	System.out.println(ob.getbalance());
}
}
