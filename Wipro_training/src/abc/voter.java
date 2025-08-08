package abc;
import java.util.Scanner;

public class voter {
	private String Name;
	private String Voterid;
	private boolean HasVoted ;
	 
    public void SetName(String n) {
        Name = n;
    }

    public void SetVoterId(String id) {
        Voterid = id;
    }

    public String GetName() {
        return Name;
    }

    public String GetVoterId() {
        return Voterid;
    }

    public void Vote() {
    	Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            if (!HasVoted) {
                System.out.println("Do you want to vote? (yes/no)");
                String input = sc.nextLine();
                if (input.toLowerCase().startsWith("y")) {
                    HasVoted = true;
                    System.out.println("Successfully voted " + Name );
                    break;
                } else {
                    System.out.println("your vote is not casted");
                }
            } else {
                System.out.println("You have already voted.");
                break;
            }
        }
    }
}
