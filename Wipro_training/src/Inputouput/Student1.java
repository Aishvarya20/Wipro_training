package Inputoutput;
import java.io.*;

class Student1 implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
    String name;

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
    public static void main(String[] args) {
        try {
            Student1 s = new Student1(101, "Aishvarya");

            FileOutputStream fileOut = new FileOutputStream("student.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(s); 
            out.close();
            fileOut.close();

            System.out.println("Student object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e);
        }

        try {
            FileInputStream fileIn = new FileInputStream("student.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Student1 deserializedStudent = (Student1) in.readObject(); 
            in.close();
            fileIn.close();

            System.out.println("Deserialized Student: " + deserializedStudent);
        } catch (IOException e) {
            System.out.println("Error during deserialization: " + e);
        }
    }
}
