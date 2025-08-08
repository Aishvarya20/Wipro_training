package practice;

public class aclass {
    String carName;
    int modelNo;
    int carSpeed;

    void drive() {
        System.out.println("I'm driving");
    }

    void listenMusic() {
        System.out.println("I'm listening to music");
    }

public static void main(String[] args) {
        aclass car = new aclass();
        car.drive();
        car.listenMusic();
}
}
