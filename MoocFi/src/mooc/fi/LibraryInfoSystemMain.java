package mooc.fi;

import java.util.ArrayList;

public class LibraryInfoSystemMain {

    public static void main(String args[]) {
	
	
	LibraryInfoSystemLibrary library = new LibraryInfoSystemLibrary(); 
	
	
	library.addBook(new LibraryInfoSystemBooks("Cheese Problems Solved", "Woodhead Publishing", 2007));
	library.addBook(new LibraryInfoSystemBooks("NHL Hockey", "Stanley Kupp", 1952));

	library.addBook(new LibraryInfoSystemBooks("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
	library.addBook(new LibraryInfoSystemBooks("Battle Axes", "Tom A. Hawk", 1851));

	//library.printBooks();
	
	ArrayList<LibraryInfoSystemBooks> result = library.searchByTitle("CHEESE");
	for(LibraryInfoSystemBooks book: result) {
	    System.out.println(book);
	}
	System.out.println("--------------------");
	for(LibraryInfoSystemBooks book : library.searchByPublisher("Penguin Group  ")){
	    System.out.println(book);
	    
	}
	System.out.println("--------------------");
	
	for (LibraryInfoSystemBooks book: library.searchByYear(1851)) {
	    System.out.println(book);
	}

	
	
	
    }
}
