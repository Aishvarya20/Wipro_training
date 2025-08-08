package practice;

public class dogeg {
void bark() {
	System.out.println("dog is barking");
}
}
class puppy extends dogeg{
void cute() {
	System.out.println("puppy is barking");
	}

public static void main(String[] args) {
	dogeg d = new dogeg();
	puppy p = new puppy();
	d.bark();
}
}
