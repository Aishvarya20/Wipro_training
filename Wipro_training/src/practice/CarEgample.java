package practice;

public interface CarEgample {
	void start();
	void stop();
}

class Car implements CarEgample {
    public void start() {
        System.out.println("Car starting...");
    }

    public void stop() {
        System.out.println("Car stopping...");
    }



public static void main(String[] args) {
    CarEgample myCar = new Car();  
    myCar.start();              
    myCar.stop();              
}
}