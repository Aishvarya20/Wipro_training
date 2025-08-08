package avv;

class Message {
    void send(String msg) {
        System.out.println("General Message: " + msg);
    }
}

class EmailMessage extends Message {

    void send(String msg) {
        System.out.println("Sending Email: " + msg);
    }
}

class PushNotification extends Message {
    void send(String msg) {
        System.out.println("Push Notification Sent: " + msg);
    }
}