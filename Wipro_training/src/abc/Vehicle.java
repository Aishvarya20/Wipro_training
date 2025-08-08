package abc;

abstract class Vehicle {
    abstract void startEngine(); 
}


class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started.");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike engine started ");
    }
}