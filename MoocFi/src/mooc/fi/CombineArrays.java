package mooc.fi;

import java.util.ArrayList;

public class CombineArrays {
	
	public static void combine(ArrayList<Integer> first,ArrayList<Integer> second) {
		
			first.addAll(second);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(2);
		list1.add(3);
		list1.add(6);
		list2.add(9);
		list2.add(6);
		list2.add(7);
		
		combine(list1,list2);
		
		System.out.println(list1);
	}

}
