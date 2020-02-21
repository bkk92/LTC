package mooc.fi;

import java.util.Scanner;

public class GradeDistributionMain {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	  Scanner input = new Scanner(System.in);
	  
	 // doSomething(scanner);
	  
	  GradeDistribution grades = new GradeDistribution(readData(input));
	  
	  grades.getGrades(readData(input));
	  
	  
	  
	  
	  }
    
	  
	  public static String readData(Scanner scanner) { 
	      
	      String input = scanner.nextLine();
	    return input; 
	      
	      }
	 
	  
	 
}
