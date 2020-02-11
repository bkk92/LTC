package mooc.fi;

import java.util.Arrays;

public class ReverseCopyArray {

    
    public static int[] copy(int[] array) {
	
	int[] copied = new int[array.length];
	for(int i=0; i<array.length;i++) {
	    copied[i] = array[i];
	}
	return copied;
    }
    
    public static int[] reverse(int[] array) {
	int[] reverse = new int[array.length];
	int j =0;
	for(int i = array.length -1; i>=0 ; i--,j++) {
	 reverse[j] = array[i];
	 System.out.println(i +"  "+ j);
	}
	//ArrayUtils.reverse(array);
	//reverse = array;
	return reverse;
	
    }
    
    
//    public void print(int upto) {
//	for (int i = 0 ; i <= upto ; i++) {
//	    printMultiplicationTable(i,upto);
//	    System.out.println();
//	}
//	    
//	}
//	
//	public void printMultiplicationTable(int howManyTimes, int multiple) {
//	    
//	    for(int i =0;i<=howManyTimes;i++) {
//		System.out.println(i*multiple+" ");
//	    }
//	    
//	}
    
    
    
    public static void main(String[] args) {
	int[] original = {1,2,3,4};
	int[] copied = copy(original);
	int[] reverse = reverse(original);
	
	copied[0] = 99;
	
	System.out.println("Original:" + Arrays.toString(original));
	System.out.println("Copied:" + Arrays.toString(copied));
	System.out.println("Reversed:" + Arrays.toString(reverse));
	
	
	
	
//	for(int i = 1; i <= 10; i++) {
//
//	    for(int j = 1; j <= 10; j++) {
//	        System.out.print(i * j + " ");
//	    }
//
//	    System.out.println();
//	}
    }
}
