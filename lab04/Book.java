
package hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	
	private List<String> authors = new ArrayList<String>();

	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> author) {
		this.authors = author;
	}
	
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.println("Author already on the list!");
			return;
		}
		authors.add(authorName);
		System.out.println("Author " + authorName + " added to the list!");
		return;
	}
	
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("The author: " + authorName + " removed!");
			return;
		}
		System.out.println("The author: " + authorName + " is not in the lsit!");
		return;
	}
		
	public Book(int id, String title, String category, float cost, List<String> author) {
		super(title, category, cost, id);
		this.authors = author;
	}
	public Book(int id, String title, String category, float cost) {
		super(title, category, cost, id);
	}
	
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Book Information:\n");
	    sb.append("Title: ").append(getTitle()).append("\n");
	    sb.append("Category: ").append(getCategory()).append("\n");
	    sb.append("Cost: ").append(getCost()).append("\n");
	    sb.append("Authors: ").append(getAuthors()).append("\n");
	    return sb.toString();
	}

}
