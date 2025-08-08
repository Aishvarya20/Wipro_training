package avv;
import java.util.Scanner;

public class animalinfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("1. Bird");
        System.out.println("2. Mammal");
        System.out.print("Choose an animal (1-3): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            Bird b = new Bird();
            b.sound();
        } else if (choice == 2) {
            Mammal m = new Mammal();
            m.sound();
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
	}
