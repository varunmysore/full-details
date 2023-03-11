package practiceofprograms;

public class driver {
public static void main(String[] args) {
	engine e = new engine(150,50);
	bike b1 = new bike("ktm",e);
	bike b2 = new bike("ducati",e);
	System.out.println(b1.e.cc);
	System.out.println(b1.e.mileage);
}
}
