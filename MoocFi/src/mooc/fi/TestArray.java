package mooc.fi;

import java.util.Scanner;

public class TestArray {
    
    
    
  //Return array value
	
  	public static String[] giveStringTable() {
  	
  	    String[] tchrs = new String[3];
  	    tchrs[0] = "Bonus";
  	    tchrs[1] = "Ihq";
  	    tchrs[2] = "Lennon";
  	    
  	    return tchrs;
  	}
    
    public static void main(String[] args) {
  
	int cells = 99;
	int [] array = new int[cells];
	
	if(array.length == cells) {
	    System.out.println("The length of array is" + cells);
	}
	else {
	    System.out.println("Something unreal happened. The length of the array is something else than" + cells);
	}
	
	System.out.println("How many values?");
	
	Scanner reader = new Scanner(System.in);
	int amountOfValues = Integer.parseInt(reader.nextLine());
	int values[] = new int[amountOfValues];
	
	System.out.println("Enter the values:");
	for(int i =0; i<amountOfValues; i++){
	    values[i] = Integer.parseInt(reader.nextLine());    
	}
	
	System.out.println("Values again");
	for(int i =0; i<amountOfValues ; i++) {
	    System.out.println(values[i]);
	}
	reader.close();    
	
	String[] teachers = giveStringTable();
	
	for(String teacher : teachers) {
	    System.out.println(teacher);
	}
    }
    
    

}
