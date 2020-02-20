package mooc.fi;

import java.util.Scanner;

public class GradeDistributionMain {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	  Scanner scanner = new Scanner(System.in);
	  
	  doSomething(scanner);
	  
	  GradeDistribution grades = new GradeDistribution();
	  
	  grades.readGrades(doSomething(scanner));
	  
	  
	  
	  
	  }
    
	  
	  
	  public static Scanner doSomething(Scanner scanner) { 
	      
	      String riw = scanner.nextLine();
	    return scanner; 
	      
	      }
	 
	  
	 
}
