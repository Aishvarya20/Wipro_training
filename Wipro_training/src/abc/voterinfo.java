package abc;
import java.util.Scanner;

public class voterinfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        voter v = new voter(); 

        System.out.print("Enter your name: ");
        v.SetName(sc.nextLine());

        System.out.print("Enter your Voter ID: ");
        v.SetVoterId(sc.nextLine());

        System.out.print("Do you want to vote? (yes/no): ");
        String input = sc.nextLine();

        if (input.toLowerCase().startsWith("y")) {
            v.Vote();
        } else {
            System.out.println("Okay, you can vote next time.");
        }

        sc.close();
    }
}
