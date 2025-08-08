package avv;
public class messageinfo {
    public static void main(String[] args) {
    	
    	EmailMessage em  = new EmailMessage();
    	PushNotification pn = new PushNotification();
    	em.send("You have got mail!");
        pn.send("Your account logged in.");
    }
}