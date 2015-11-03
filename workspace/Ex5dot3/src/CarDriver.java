
public class CarDriver {
	public static void main(String[]args){
		Car toyota = new Car(Color.Silver); // this car is a corolla with 140 horsepower and 1.8L engine size
		Car ferrari = new Car(Color.Red, 600, 3.9, "Ferrari 488 GTB");
		Car brick = new Car(Color.White, 500, 2.0, "Scion Hako");
		System.out.println(toyota.toString());
		System.out.println(ferrari.toString());
		System.out.println(brick.toString());
		brick.setMake("Scion Hako");
		brick.setColor(Color.Red);
		brick.setEngine(2.0);
		brick.setHorse(700);
		System.out.println("Paint it red and boost the engine!");
		System.out.print(brick.toString());
	}
}
