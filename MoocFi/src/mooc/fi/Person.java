package mooc.fi;

public class Person {

    private String name;
    private String number; 
    
    
    public Person(String name,String number) {
	
	this.name= name;
	this.number= number;
    }
    

    public String toString() {
	
	return this.name + " " + this.number;
    }
    
    
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void changeNumber(String newNumber) {
	this.number=newNumber;
	
    }
    
    
    
    
}
