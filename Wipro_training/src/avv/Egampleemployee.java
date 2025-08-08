package avv;

public class Egampleemployee {
	int id;
    String name;
    int salary;
    Egampleemployee(int id, String name,int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void show() {
        System.out.println(id + " " + name + " " + salary);
    }


}
