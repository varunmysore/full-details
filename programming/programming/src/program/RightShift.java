package program;

public class RightShift {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5,6,7 };
		for (int n = 3; n > 0; n--) 
		{
			int temp = a[a.length - 1];
			for (int i = a.length - 2; i >= 0; i--) 
			{
				a[i + 1] = a[i];
			}
			a[0] = temp;
		}
		for(int b:a)
			System.out.println(b);
	}
}
