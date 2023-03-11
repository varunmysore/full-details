package arrays_string;

import java.util.Scanner;

public class Recurssion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = factorial(num);
		System.out.println(res);
	}

	static int fact = 1;

	private static int factorial(int num) {

		if (num > 0) {
			fact = fact * num;
			num--;
			factorial(num);
		}
		return fact;
	}
}
