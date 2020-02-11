package mooc.fi;

public class ArraysToStars {
    
    
    public static void printArrayAsStars(int[] array) {
	int j=0;
	for(int i:array) {
	    while(j<i) {
		System.out.println("*");
	    }
	}
	
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int[] array = {5,1,3,4,2};
	printArrayAsStars(array);


    }

}
