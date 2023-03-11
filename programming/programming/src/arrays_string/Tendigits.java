package arrays_string;
import java.util.Scanner;
public class Tendigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		String s = sc.next();
		boolean flag = true;
		int count = 1;
		while (flag) 
		{
			if (count <= 3) 
			{
				if (s.length() == 10)
				{
					System.out.println("thank you");
					flag = false;
				} else {
					System.out.println("try again");
					count++;
					s = sc.next();
				}
			} 
			else 
			{
				System.out.println("attempt exceeded,try after sometime");

				flag = false;
			}
		}

	}
}
