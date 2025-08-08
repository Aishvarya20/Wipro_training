package avv;

public class Animal {
	void display() {
		System.out.println("This is an animal.");
    }
}
class Bird extends Animal {
    void sound() {
        System.out.println("Bird chirps.");
    }
}
class Mammal extends Animal {
    void sound() {
        System.out.println("Mammal ");
    }
}


