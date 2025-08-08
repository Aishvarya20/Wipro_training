package avv;
import java.util.HashMap;
import java.util.Scanner;

public class Scoreboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> scoreboard = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter score for " + studentName + ": ");
            String scoreInput = scanner.nextLine();
            Integer studentScore = Integer.valueOf(scoreInput);

            scoreboard.put(studentName, studentScore);
        }

        System.out.println("Scoreboard:");
        for (String name : scoreboard.keySet()) {
            System.out.println(name + " : " + scoreboard.get(name));
        }
        scanner.close();
    }
}