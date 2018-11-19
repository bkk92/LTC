package mooc.week1;

import java.util.Scanner;

public class EX22Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		String secretMessage = "jryy qbar!!";
		String response;
        String password = "carrot"; // Use carrot as password when running tests.
        
        A:while(true) {
        
        	System.out.println("Enter password");
        	String userPassword = reader.nextLine();
        	
        	if (!(userPassword.equals(password)))
        	{
        		System.out.println("Wrong!");
        		continue;
        	}
        	else {
        		System.out.println("Right!!");
        		System.out.println("\nThe secert message is "+secretMessage);
        		
        		System.out.println("\nDo you want to decrypt the message?(Yes/No)");
        		response = reader.nextLine();
        		if (response.equalsIgnoreCase("Yes")) {
        			System.out.println(rot13(secretMessage));
        		}
        		else if (response.equalsIgnoreCase("No")) {
        			System.out.println("\nBye");
        			break A;
        		}
        	}
        	reader.close();
        }
        
        

	}
	
	public static String rot13(String input) {
		   StringBuilder sb = new StringBuilder();
		   for (int i = 0; i < input.length(); i++) {
		       char c = input.charAt(i);
		       if       (c >= 'a' && c <= 'm') c += 13;
		       else if  (c >= 'A' && c <= 'M') c += 13;
		       else if  (c >= 'n' && c <= 'z') c -= 13;
		       else if  (c >= 'N' && c <= 'Z') c -= 13;
		       sb.append(c);
		   }
		   return sb.toString();
		}

}
