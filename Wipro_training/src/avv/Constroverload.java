package avv;

public class Constroverload {
	Constroverload() {
	        System.out.println("Default constructor");
	    }

	Constroverload(String name) {
	        System.out.println("Name: " + name);
	    }

	Constroverload(String name, int age) {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	    public static void main(String[] args) {
	        new  Constroverload();                        
	        new  Constroverload("Aishvarya");             
	        new  Constroverload("Aishvarya", 22);         
	    }
	}
	
