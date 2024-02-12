import java.util.ArrayList;
public class book {
	private String title , author;
	private int isbn;
	private static ArrayList<book> book_col = new ArrayList<book> ();
	book(String title , String author , int isbn) 
	{
	    this.title = title;
        this.author = author;
        this.isbn = isbn;		
	}
	
	// Set every method for access in main class
	public String get_name() 
	{
	    return this.title;
	}
	public String get_author() 
	{
        return this.author;		
	}
	public int get_isbn() 
	{
	    return this.isbn;	
	}
	
	// Update method if we want to need update 
	public void set_name(String title) {
	    this.title = title;	
	}
	public void set_author(String author) 
	{
	   this.author = author;	
	}
	public void set_isbn(int isbn) 
	{
	   this.isbn = isbn;	
	}
	
	// Add Delete and List Shown
	public static void add(book x) 
	{
	   	book_col.add(x);
	}
	public static void remove(book x) 
	{
	    book_col.remove(x);	
	}
	public static ArrayList<book> get_book() {
	    return book_col;	
	}
	
	
}