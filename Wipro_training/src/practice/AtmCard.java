package practice;
import java.util.Scanner;

class PinException extends Exception {
    public PinException(String message) {
        super(message);
    }
}
public class AtmCard {
 private String pin = "2001";  

 public void startATM() throws PinException {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter PIN: ");
     String input = sc.nextLine();

     if (!input.equals(pin)) {
         sc.close();
         throw new PinException(" Wrong PIN ");
     }
     System.out.println("Correct PIN, Access granted.");
     sc.close();  
 }
 public static void main(String[] args) {
     AtmCard atm = new AtmCard();
     try {
     atm.startATM();  
     }
     catch (PinException e) 
     {
         System.out.println("Error: " + e.getMessage());
     } 
     finally 
     {
         System.out.println("Transaction logged.");
     }
 }
}