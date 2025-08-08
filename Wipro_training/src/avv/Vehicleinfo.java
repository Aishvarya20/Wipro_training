package avv;
import java.util.Scanner;

public class Vehicleinfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.print("Choose a vehicle type (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            car c = new car();
            c.display();
            c.run();
        } else if (choice == 2) {
            Bike b = new Bike();
            b.display();
            b.move();
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }


}