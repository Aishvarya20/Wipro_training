package avv;
import java.util.Scanner;

public class Studentmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter marks for Subj 1: ");
        String a1 = sc.nextLine();
        System.out.println("Enter marks for Subj 2: ");
        String a2 = sc.nextLine();
        System.out.println("Enter marks for Subj 3: ");
        String a3 = sc.nextLine();
        Integer mark1 = Integer.valueOf(a1);
        Integer mark2 = Integer.valueOf(a2);
        Integer mark3 = Integer.valueOf(a3);
        int total = mark1 + mark2 + mark3;
        double avg = total / 3.0;
        System.out.println("\n Result");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + avg);
        sc.close();
    }
}
