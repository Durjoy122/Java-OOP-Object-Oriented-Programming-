import java.util.ArrayList;
public class main {
    public static void main(String[] args) 
	{
		book info = new book("The Metamorphosis" , "Kafka" , 123);
		book info1 = new book("Colck work Orange" , "Anthony Burgess", 456);
		book info2 = new book("Abonil" , "Jafar Iqbal", 478);
		book.add(info);
		book.add(info1);
		book.add(info2);
		ArrayList<book> book_collection = book.get_book();
		for(book b : book_collection) {
		    System.out.println("Book name: " + b.get_name() + "\nAuthor: " + b.get_author() + "\nISBN: " + b.get_isbn());	
			System.out.println();
		}
		book.remove(info2);
		info1.set_isbn(457);
		System.out.println("After removing book\n");
		for(book b : book_collection) {
		    System.out.println("Book name: " + b.get_name() + "\nAuthor: " + b.get_author() + "\nISBN: " + b.get_isbn());	
			System.out.println();
		}
	}
}