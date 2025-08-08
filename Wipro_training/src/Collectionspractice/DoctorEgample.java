package Collectionspractice;
import java.util.HashSet;
public class DoctorEgample {
    private String name;
    private int age;
    private int id;
    private String disease;

    public DoctorEgample(String name, int age, int id, String disease) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.disease = disease;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DoctorEgample) {
            DoctorEgample other = (DoctorEgample) obj;
            return this.id == other.id;
        }
        return false;
    }


    public int hashCode() {
        return Integer.hashCode(id);
    }

    public String toString() {
        return "Dr. " + name + "  Age: " + age + "  ID: " + id + "  Disease: " + disease;
    }

    public static void main(String[] args) {
        HashSet<DoctorEgample> doctors = new HashSet<>();

        DoctorEgample d1 = new DoctorEgample("Aishvarya", 22, 500, "cough");
        DoctorEgample d2 = new DoctorEgample("likitha", 21, 201, "Cold");
        DoctorEgample d3 = new DoctorEgample("meena", 20, 700, "Fever"); 

        doctors.add(d1);
        doctors.add(d2);
        doctors.add(d3); 

        for (DoctorEgample doc : doctors) {
            System.out.println(doc);
        }
    }
}
