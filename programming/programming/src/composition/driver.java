package composition;

public class driver {
public static void main(String[] args) {
	engine e = new engine(1500, 15);
	Car c1 = new Car("alto", "red", 500000, e);
	Car c2 = new Car("santro", "blue", 600000, e);
	Car c3 = new Car("swift", "white", 700000, e);
	
	System.out.println(c1.colour);
	System.out.println(c1.modelname);
	System.out.println(c1.price);
	System.out.println(c1.x.cc);
	System.out.println(c1.x.mileage);
}
}
