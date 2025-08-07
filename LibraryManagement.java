package LibrarySystem_pac;
import java.util.*;
public class LibraryManagement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Library library = new Library();
		while (true) {
			System.out.println("\n==== Library Management Menu ====");
            System.out.println("1. Add Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch(choice) {
	            case 1:
	            	System.out.println("Enter the title book:");
	            	String title = sc.nextLine();
	            	System.out.println("Enter author of the title book:");
	            	String author = sc.nextLine();
	            	library.addBook(new Book(title,author));
	            	break;
            	
	            case 2:
	            	library.showAllBook();
	            	break;
	            case 3:
	            	System.out.println("Enter the title of the book for issue:");
	            	String issueTitle = sc.nextLine();
	            	library.isIssueBook(issueTitle);
	            	break;
	            case 4:
	            	System.out.println("Enter the title to return the book:");
	            	String returnTitle = sc.nextLine();
	            	library.returnBook(returnTitle);
	            	break;
	            case 5:
	            	System.out.println("Exiting Library Management System.");
	            	return;
            	default:
            		System.out.println("Invalid choice. Try again.");
            }

		}
	}
}
