package mooc.fi;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class WordsInput {

	public static void main(String [] args) {
		
		ArrayList<String> words = new ArrayList<>();
		Scanner reader = new Scanner(System.in);
		while(true){
		
			
			System.out.println("Enter the word to be added: ");
			String getword = reader.nextLine();
			
			if (getword.isEmpty()) {
				System.out.println("exiting..");
				break;
		}
			else {
				words.add(getword);
			}
			
		}
		//Collections.reverse(words);
		Collections.sort(words);
		System.out.println("Words in sorted order: ");
		for (String word : words) {
			System.out.println(word);
		}
		reader.close();
	}
}
