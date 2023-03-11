package practice;

public class Prime1_100 {
	public static void main(String[] args) {

		for (int a = 1; a <= 100; a++) 
		{
			int count = 0;
			for (int i = 2; i <= a / 2; i++) 
			{
				if (a % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0)
				System.out.println(a);
		}
	}
}
