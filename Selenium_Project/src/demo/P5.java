package demo;

public class P5 {

	public static void main(String[] args) {
		int a = 10;
		try {
		int b = a / 0;
		}
		catch (Exception e) {
		System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}

		int p = 10;
		try {
		int q = p / 0;
		}
		catch (Exception e) {
		System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}
		
		
		
		
		
	}

}
