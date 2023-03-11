package composition;

public class garbage {

	int a=10;
	int b=20;
	protected void finalize(){
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		garbage ob = new garbage();
		ob=new garbage();
		
		System.gc();
	}
}
