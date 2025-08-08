package abc;

public class Vehicleinfo {

	public static void main(String[] args) {
		Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.startEngine();  
        myBike.startEngine(); 
    }
}