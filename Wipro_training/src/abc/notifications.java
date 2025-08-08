package abc;

abstract class notifications {
    abstract void send(String msg);
}


class Email extends notifications {
    void send(String msg) {
        System.out.println("Sending Email: " + msg);
    }
}


class SMS extends notifications {
    void send(String msg) {
        System.out.println("Sending SMS: " + msg);
    }
}


class WhatsApp extends notifications {
    void send(String msg) {
        System.out.println("WhatsApp message sent: " + msg);
    }
}


class Telegram extends notifications {
    void send(String msg) {
        System.out.println("Telegram message sent: " + msg);
    }
}
