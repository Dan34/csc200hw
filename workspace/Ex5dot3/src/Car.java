
public class Car {
	private Color color;
	private int horsepower;
	private double engine; // it needs decimals
	private String make;
	
	public Car(Color color){
		this.color = color;
		this.horsepower = 140;
		this.engine = 1.8;
		this.make = "Toyota Corolla";
	}
	public Car(Color color, int horsepower){
		this.horsepower = horsepower;
		this.color = color;
		this.engine = 1.8;
		this.make = "Toyota Corolla";
	}
	public Car(Color color, int horsepower, double engine){
		this.color = color;
		this.horsepower = horsepower;
		this.engine = engine;
		this.make = "Toyota Corolla";
	}
	public Car(Color color, int horsepower, double engine, String make){
		this.color = color;
		this.horsepower = horsepower;
		this.engine = engine;
		this.make = make;
	}
	public String getMake(){
		return this.make;
	}
	public double getEngine(){
		return this.engine;
	}
	public int getHorse(){
		return this.horsepower;
	}
	public Color getColor(){
		return this.color;
	}
	public void setMake(String make){
		this.make = make;
	}
	public void setEngine(double engine){
		this.engine = engine;
	}
	public void setHorse(int horse){
		this.horsepower = horse;
	}
	public void setColor(Color color){
		this.color = color;
	}
	public String toString(){
		String colour = "";
		switch (this.color){ // color isn't a string
		case Red: colour = "red";
		break;
		case Blue: colour = "blue";
		break;
		case Silver: colour = "silver";
		break;
		case Black: colour = "black";
		break;
		case White: colour = "white";
		break;
		default: colour = "white";
		break;
		}
		return "This "+colour+" "+this.make+" has "+this.horsepower+" horsepower and an engine size of "+this.engine+" liters.";
	}
}
