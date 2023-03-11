package practice;

import java.util.Scanner;

public class Neon_prog {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();

		int sq = n * n;
		int sum = 0;
		while (sq != 0) {
			int rem = sq % 10;
			sum = sum + rem;
			sq = sq / 10;
		}
		if (n == sum)
			System.out.println("neon");
		else
			System.out.println("not neon");
	}
}
