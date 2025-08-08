package Collectionspractice;
import java.util.ArrayList;
import java.util.LinkedList;

public class Practice_arraylist {

	public static void main(String[] args) {
//		ArrayList<String> fruitslist = new ArrayList<>();
//		fruitslist.add("apple");
//		fruitslist.add("mango");
//		fruitslist.add("orange");
//		fruitslist.add("blueberry");
//		
//		for(String fruits : fruitslist) {
//			System.out.println("fruits are :" + fruits );
//		}
//		fruitslist.remove("apple");
//		 System.out.println("\nAfter removing 'apple':");
//	        for (String fruit : fruitslist) {
//	            System.out.println("Fruit is: " + fruit);
//	        }
//	    }
//
//
//}
		LinkedList<String> colourslist = new LinkedList<>();
		colourslist.add("white");
		colourslist.add("purple");
		colourslist.add("saffron");
		colourslist.add("yellow");
		
		for(String colours :colourslist ) {
			System.out.println("colours are :" + colours );
		}
		colourslist.remove("white");
		System.out.println("\n after removing white");
		for(String colours : colourslist ) {
			System.out.println("colour  is: " + colours);
		}
	}
}
		
		
