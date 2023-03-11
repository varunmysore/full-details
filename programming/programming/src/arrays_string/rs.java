package arrays_string;
public class rs {
	public static void main(String[] args)
	{
		int[] a = { 1, 2, 3, 4, 5 };
		for (int n = 2; n >0; n--) 
		{
			int temp = a[a.length-1];
			for (int i = a.length-2; i >=0; i--) 
			{
				a[i+1] = a[i];
			}
			a[0] = temp;
		}
		for (int b : a)
			System.out.println(b);
	}
}
