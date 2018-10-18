package mooc.fi;

import java.util.ArrayList;
import java.util.List;

public class Variance {
	
	public static double var(ArrayList<Integer> list) {
		
		double avg = average(list);
		double var = 0.0;
		for (int i : list) {
		var = var + ((i-avg)*(i-avg));
		}
		var = var/(list.size()-1);
		return var;
	}
	
	public static double average(List<Integer> list) {
		double sum =0;
		
		for(int i : list) {
			sum= sum + i;
		}
		
		return sum/list.size();
		
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);
	    average(list);
	
	    System.out.println("The variance is: "+var(list));


	}

}
