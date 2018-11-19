package mooc.week1;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Scanner;

public class EX20Usernames {
	public static void main(String arg[]) {
		
		Scanner reader = new Scanner(System.in);
		
		String userName;
		String password;
		
		System.out.println("Type you Username");
		userName = reader.nextLine();
		System.out.println("Type your Password");
		password = reader.nextLine();
		
		if ((userName.equalsIgnoreCase("alex") && password.equals("mightducks")) || (userName.equalsIgnoreCase("emily") && password.equals("cat"))){
		System.out.println("You are now logged into the system");
			}
		else {
		System.out.println("Your username or password is invalid");
		}

	}
}
