package mooc.fi;

public class LibraryInfoSystemBooks {

    private String title;
    private String publisher;
    private int year;


    public LibraryInfoSystemBooks(String title, String publisher, int year) {

	this.title = title;
	this.publisher = publisher;
	this.year = year;
    }


    public String title() {
	return this.title;
    }


    public String publisher() {
	return this.publisher;
    }


    public int year() {
	return this.year;
    }


    @Override
    public String toString() {
	return "LibraryInfoSystemBooks [title=" + title + ", publisher=" + publisher + ", year=" + year + "]";
    }


    




}