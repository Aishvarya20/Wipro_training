package abc;
import java.util.Scanner;

public class chatbot {
	String[] questions = {"hi" , "hello","how are you"};
	String[]answers = {"hey there", " Im fine " , " hi"};
	void reply(String msg) {
		for(int i = 0; i<questions.length;i++) {
			System.out.println(answers[i]);
			return;
		}
	}
	  System.out.println("Sorry i dont understand"); 
	  
}
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	chatbot ch = new chatbot();
	
	
}