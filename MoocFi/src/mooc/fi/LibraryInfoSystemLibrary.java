package mooc.fi;

import java.util.ArrayList;

public class LibraryInfoSystemLibrary {

    private ArrayList<LibraryInfoSystemBooks> myLibrary;
    
    public LibraryInfoSystemLibrary() {
	this.myLibrary = new ArrayList<LibraryInfoSystemBooks>();
    }
    
    
    public void addBook(LibraryInfoSystemBooks newBook) {
	
	myLibrary.add(newBook);

    }
    
    public void printBooks() {
	
	for(LibraryInfoSystemBooks printbook:this.myLibrary) {
	    System.out.println(printbook);
	}
    }
    
    public ArrayList<LibraryInfoSystemBooks> searchByTitle(String title){
	ArrayList<LibraryInfoSystemBooks> found = new ArrayList<LibraryInfoSystemBooks>();
	
	for(LibraryInfoSystemBooks findTitle : this.myLibrary) {
	    
	    if(StringUtils.included(findTitle.title(),title)) {   //findTitle.title().contains(title)
		
		found.add(findTitle);
	    }
	    
	}
	return found;
    }
    
    public ArrayList<LibraryInfoSystemBooks> searchByPublisher(String publisher){
	ArrayList<LibraryInfoSystemBooks> found1 = new ArrayList<LibraryInfoSystemBooks>();
	
	for(LibraryInfoSystemBooks findPublisher : this.myLibrary) {
	    if(findPublisher.publisher().contains(publisher)) {
		found1.add(findPublisher);
	    }
	}
	return found1;
    }
    
    public ArrayList<LibraryInfoSystemBooks> searchByYear(int year){
	ArrayList<LibraryInfoSystemBooks> found2 = new ArrayList<LibraryInfoSystemBooks>();
	
	for(LibraryInfoSystemBooks findYear : this.myLibrary) {
	    if(findYear.year()==year) {
		found2.add(findYear);
	    }
	}
	return found2;
    }
}
