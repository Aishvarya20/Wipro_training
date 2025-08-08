package abc;
public class books {
	String Title;
	int pages;
	String Author;
	int Price;
	
	void display() {
		System.out.println("Title of the book:" + Title);
		System.out.println("Pages of the book:"+ pages);
		System.out.println("Author of the book:"+ Author );
		System.out.println("Price of the book:" + Price);
	}
	void checkcost() {
		if(Price>500) {
			System.out.println("book is expensive");
			}
		else {
			System.out.println("book is Affordable");
		}
	}
	
public static void main(String[] args) {
		books b =new books();
		b.Title= " The Secret";
		b.pages= 250;
		b.Author="Rhonda Byrne";
		b.Price=250;
		
		b.display();
		b.checkcost();
		
		
		
	}

}
