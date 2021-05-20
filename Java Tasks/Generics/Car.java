package Generics;

public class Car {
	public  String carColor;
	public  String carName;
	public  int carPrice;
	
	public Car(String carColor, String carName, int carPrice) {
		this.carColor = carColor;
		this.carName = carName;
		this.carPrice = carPrice;
	}
	@Override
	public String toString() {
		return "Car carColor=" + carColor + ", carName=" + carName + ", carPrice=" + carPrice;
	}
}