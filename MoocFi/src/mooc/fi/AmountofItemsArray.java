package mooc.fi;

import java.util.ArrayList;

import java.util.Scanner;

public class AmountofItemsArray {
	
	public static int countItems(ArrayList<String> count)
	{
		return count.size();
	}
	
	public static ArrayList<String> removeLast(ArrayList<String> list) {
		list.remove(list.size()-1);
		return list;
	}


	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		
		Scanner reader = new Scanner(System.in);
		String word;
		while(true) {
			System.out.println("Enter the word to be added");
			word = reader.nextLine();
			if(word.isEmpty()) {
				System.out.println("Exiting");
				break;
			}
			else {
				words.add(word);
			}
			
			
		}
		//System.out.println(countItems(words));
		
		System.out.println("words before removing last value: ");
		for( String index : words) {
			System.out.println(index);	
		}
		ArrayList<String> newwords = removeLast(words);
		
		System.out.println("words after removing last value");
		for( String index : newwords) {
			System.out.println(index);	
		}
		reader.close();
	}
	
}
