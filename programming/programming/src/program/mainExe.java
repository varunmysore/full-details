package program;

public class mainExe {
public static void main(String[] args) {

	abstn2 ob = new abstn2();
	System.out.println(ob.getBalance());
	ob.withdraw(5000);
	System.out.println(ob.getBalance());
}
}
