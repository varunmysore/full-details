package practice;

public class Natural {

	public static void main(String[] args) {
		long prod = 1;
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			sum=sum+i;
			prod = prod * i;
		}
		System.out.println(sum);
		System.out.println(prod);
	}

}
