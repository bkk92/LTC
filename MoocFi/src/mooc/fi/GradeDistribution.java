package mooc.fi;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeDistribution {

    private int[] gradeArray;
    
    public GradeDistribution(String input) {
	
	this.gradeArray = new int[6];
	
    }
    
    
    public void setToZero() {
	
	for(int i=0;i<this.gradeArray.length;i++) {
	    this.gradeArray[i]=0;
	}
	
    }

    public void getGrades(String input) {
	// TODO Auto-generated method stub
	
	while(true) {
	    
	    int grade = Integer.parseInt(input);
	    
	    if(grade==-1) {
		System.out.println("Exiting program due to exit condition met(input=-1)");
	    }
	    
	    
	}
	
	
    }
    
    
}
