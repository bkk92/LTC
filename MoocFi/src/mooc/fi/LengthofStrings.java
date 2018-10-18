package mooc.fi;

import java.util.ArrayList;
import java.util.Scanner;

public class LengthofStrings {
	
	public static ArrayList<Integer> lengths(ArrayList<String> list){
		
		ArrayList<Integer> length = new ArrayList<>();
		
		for(String word : list) {
			length.add(word.length());
		}
		return length;
	}

	
	public static void main(String args[]) {
		
		
		ArrayList<String> words = new ArrayList<String>();
		System.out.println("Enter the words whose length is to be found");
		Scanner reader = new Scanner(System.in);
		while(true) {
			String word = reader.nextLine();
			if (word.isEmpty()) {
				System.out.println("exiting");
				break;
			}
			else {
				words.add(word);
			}
			
		}
		
		System.out.println("Words in list are" + words);
		
		ArrayList<Integer> lengths = lengths(words);
		
		System.out.println("Lengths of the words in list" + lengths);
		reader.close();
		
	}
}
