package mooc.fi;
import java.util.*;

public class StringOperations {
	
	public static int calculateCharacters(String text) {
	
		return text.length(); 
	}
	
	public static char firstCharacter(String text) {
		
		return text.charAt(0);
	}
	
	public static char lastCharacter(String text) {
		
		return text.charAt(text.length()-1);
	}
	
	public static void printNameasChar(String text) {
		if(text.length()<3) {
			System.out.println("Not applicable");
		}
		else {
			for(int i=0;i<text.length();i++) {
				System.out.println(text.charAt(i));
			}
		}
		
	}

	public static String reverse(String text) {
	
		StringBuilder bld = new StringBuilder();
		for (int i= text.length()-1; i>=0; i--) {
		bld.append(text.charAt(i));	
		}
		return bld.toString();
	}
	
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		/*System.out.println("Enter Name: ");
		String name = reader.nextLine();
		
		System.out.println("Number of characters in name = "+ calculateCharacters(name));
		System.out.println("First Character: "+ firstCharacter(name));
		System.out.println("Last Character:" + lastCharacter(name));
		printNameasChar(name);
		
		String endpart = name.substring(3);
		System.out.println("endpart: "+endpart);
		int index = name.indexOf(endpart);
		System.out.println("index of endpart in name string: " + index);*/
		
		/*System.out.println("Enter length of first part");
		int firstpartl =  Integer.parseInt(reader.nextLine());
		System.out.println("Enter length of last part");
		int lastpartl =  Integer.parseInt(reader.nextLine());
		
		String firstpart = name.substring(0,firstpartl);
		String lastpart = name.substring(name.length()-lastpartl);
		System.out.println("First part of string: "+firstpart);
		System.out.println("Last part of string: "+lastpart);
		
		/* Find first and last part.
		System.out.println("Enter first word: ");
		String first = reader.nextLine();
		System.out.println("Enter second word: ");
		String second = reader.nextLine();
		
		if((first.indexOf(second))!=-1){
			System.out.println(second + " is present in " + first);
		}
		else {
			System.out.println(second + " is not present in " + first);
		}*/
		
		/*Reverse a string
		System.out.println("Type in your text: ");
		String text = reader.nextLine();
		System.out.println("Text in reverse: " + reverse(text));
		*/
		reader.close();

	}

}
