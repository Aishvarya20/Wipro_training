package abc;
import java.util.Scanner;

public class Attedance_tracking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        String[] status = new String[3];

        System.out.println("Enter names of 3 students:");
        for (int i = 0; i < 3; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println("Mark attendance (Present/Absent):");
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + ": ");
            status[i] = sc.nextLine();
        }

        System.out.println("\nAttendance Record:");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + " - " + status[i]);
        }

	}

}
