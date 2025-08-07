package LibrarySystem_pac;
import java.util.*;
public class Library {
	List<Book> books = new ArrayList<>();
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added successfully :"+book);
	}
	public void showAllBook() {
		if(books.isEmpty()) {
			System.out.println("No books in library.");
		}
		else {
			for(Book book:books) {
				System.out.println(book);
			}
		}
	}
	public void isIssueBook(String title) {
		for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.isIssued();
                System.out.println("Book issued: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not available for issue.");
		
	}
	
	public void returnBook(String title) {
		for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found or already returned.");
		
	}
	
	
	
}
