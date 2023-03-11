package java_concept;

public class Motorcycle extends Vehicle{
	String modelname;
	
	public Motorcycle(int cc,int mileage,String modelname) {
		super(cc,mileage);
		this.modelname=modelname;	
	}
public static void main(String[] args) {
	Motorcycle bike = new Motorcycle(150,40,"pulsar");
	System.out.println(bike.cc);
	System.out.println(bike.mileage);
	System.out.println(bike.modelname);
}
}
