package mooc.fi;

import java.util.ArrayList;

public class Phonebook {

    
    private ArrayList<Person> people = new ArrayList<Person>();
    
    public Phonebook() {
	this.people.clear();
    }
    
    public void add(String name, String number) {
	Person buffer = new Person(name,number);
	this.people.add(buffer);
	}
	
    
    public void printAll() {
	for(Person printDetails : this.people) {
	  printDetails.toString();
	}
    }
    
    public String searchNumber(String name) {
	
	for(Person person:this.people) {
	    if(person.getName().equals(name)) {
		return person.getNumber();
	    }

	}
	return "number not known";
	}
    

    
}
