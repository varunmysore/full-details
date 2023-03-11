package practice;

public class Automorphic {
	public static void main(String[] args) {
		int num = 5;
		int sq = num * num;
		boolean flag = true;
		while (num != 0) {
			if (num % 10 != sq % 10)
				flag = false;

			num /= 10;
			sq /= 10;

		}
		if (flag)
			System.out.println("AM");
		else
			System.out.println("NAM");
	}

}
