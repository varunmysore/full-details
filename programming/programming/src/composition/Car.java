package composition;

public class Car {
	String modelname;
	String colour;
	int price;
	engine x;

	public Car(String modelname,String colour,int price,engine x){
		this.modelname=modelname;
		this.colour=colour;
		this.price=price;
		this.x=x;
	}
}
