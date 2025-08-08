package abc;

import java.util.Scanner;

public class Carinfo {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        Car_data car = new Car_data();

		        System.out.print("Enter Car Name: ");
		        String name = sc.nextLine();
		        car.setName(name);

		        System.out.print("Enter Car Speed (km/h): ");
		        int speed = sc.nextInt();
		        car.setspeed(speed);

		        sc.nextLine();
		        System.out.print("Enter Engine Status (ON/OFF): ");
		        String engine = sc.nextLine();
		        car.setengineStatus(engine);

		        System.out.print("Enter Fuel Level (%): ");
		        int fuel = sc.nextInt();
		        car.setfuellevel(fuel);


		        System.out.println("\nCar Info");
		        System.out.println("Car Name: " + car.getname());
		        System.out.println("Speed: " + car.getspeed() + " km/h");
		        System.out.println("Engine Status: " + car.getenginestatus());
		        System.out.println("Fuel Level: " + car.getfuellevel() + "%");

		        sc.close();
		    }
	

	}


