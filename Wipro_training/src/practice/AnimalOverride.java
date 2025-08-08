package practice;

class AnimalOverride {
    void show() {
        System.out.println("inside first method");
    }
}

class Dog extends AnimalOverride {
    void show() {
        System.out.println("inside second method");
    }
}