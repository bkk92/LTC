package mooc.fi;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRecurringWords {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>();
		Scanner reader = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter the word: ");
			String word = reader.nextLine();
			
			if (words.contains(word)) {
				System.out.println("The word "+word+" is repeated twice");
				break;
			}
			else {
			
				words.add(word);
			}
			
		}
		
		reader.close();
		

	}

}
