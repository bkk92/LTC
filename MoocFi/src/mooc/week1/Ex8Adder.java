package mooc.week1;
import java.util.Scanner;

public class Ex8Adder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader =new Scanner(System.in);
		Scanner reader1 = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int firstNumber = Integer.parseInt(reader.nextLine());
		System.out.println("Enter the 2nd number");
		int  secondNumber = Integer.parseInt(reader1.nextLine());
		
		System.out.println("Addition of given numbers "+ (firstNumber + secondNumber));
		reader.close();
		reader1.close();
	}

}
