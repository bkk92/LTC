package mooc.week1;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class TryingFunctions {

	private static Scanner reader;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		onetoHundred();
		hundredtoOne();
		evenNumbers();
		wholeNumbers();
		upperLower();
	}

	private static void onetoHundred() {
		int i = 1;
		while(i<=100) {
			System.out.println(i++);
		}
		System.out.println("end of loop for countup\n");
	}
	
	
	private static void hundredtoOne() {
		int i = 100;
		while(i>0) {
			System.out.println(i--);
		}
		System.out.println("end of loop for coutdown\n");
	}
	
	private static void evenNumbers() {
		int i = 2;
		
		while(i<100) {
			if(i%2==0) {
			System.out.println(i);
			}
			i++;
		}
		System.out.println("end of loop for even nos.");
	}
	
	private static void wholeNumbers() {
		int userInput;
		int start = 1;
		
		/*
		 * InputStreamReader r = new InputStreamReader(System.in);
		 * BufferedReader reader = new BufferedReader(r);
		 * 
		 * should be like above, but concatenated below:
		 * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 * EDIT: back to scanner class
		*/
		reader = new Scanner(System.in);
		System.out.println("Enter number upto which to print");
		userInput = Integer.parseInt(reader.nextLine());
		while(start <= userInput) {
			System.out.println(start++);
		}
		System.out.println("end of loop for \"upto numbers\"");
	
		
	}
	
	private static void upperLower() {
		reader = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int first = Integer.parseInt(reader.nextLine());
		System.out.println("Enter the last number:");
		int last = Integer.parseInt(reader.nextLine());
		
		while(first!=(last+1)) {
			if(first > last) {
				System.out.println("");
			}
			else{
			System.out.println(first++);
		}
	}
	}
}