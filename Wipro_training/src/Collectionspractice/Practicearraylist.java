package Collectionspractice;
import java.util.ArrayList;
public class Practicearraylist {

			public static void main(String[] args) {
				ArrayList<String> students = new ArrayList<>();
				students.add("aishvarya");
				students.add("abc");
				students.add("cde");
				System.out.println("Student at index 1: " + students.get(1));
				System.out.println("all students");
				for (String student : students) {
		            System.out.println(student);
		        }
			}


}
	

