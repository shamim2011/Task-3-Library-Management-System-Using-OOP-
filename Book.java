package LibrarySystem_pac;
import java.util.*;
public class Book {
	String title;
	String auther;
	boolean isIssued;
	public Book(String title, String auther) {
		super();
		this.title = title;
		this.auther = auther;
		this.isIssued = false;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuther() {
		return auther;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public boolean isIssued() {
		return isIssued;
	}
	
	
	public void isIssuedBook() {
		isIssued = true;
	}
	public void returnBook() {
		isIssued = false;
	}
	@Override
	public String toString() {
		return "Book [title =" + title + ", auther by =" + auther + ", "+(isIssued?"isIssued":"Available");
	}
	
}
