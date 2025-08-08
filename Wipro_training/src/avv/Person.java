package avv;

public class Person {
		void display() {
			System.out.println("Hi iam person");
	    }
	}
	class Teacher extends Person {
	    void role() {
	        System.out.println("Hi , Iam teaching");
	    }
	}
	class Student extends Person {
	    void learn() {
	        System.out.println("Hi , iam learning ");
	    }
	}
