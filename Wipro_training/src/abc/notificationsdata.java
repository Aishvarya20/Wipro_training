package abc;

import java.util.Scanner;

public class notificationsdata {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Notification Type:");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. WhatsApp");
        System.out.println("4. Telegram");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your message: ");
        String msg = sc.nextLine();

        notifications n = null;
        if (choice == 1) {
            n = new Email();
        } else if (choice == 2) {
            n = new SMS();
        } else if (choice == 3) {
            n = new WhatsApp();
        } else if (choice == 4) {
            n = new Telegram();
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        n.send(msg);
        sc.close();
    }
}
