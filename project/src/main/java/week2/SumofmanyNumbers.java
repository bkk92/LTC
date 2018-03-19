package week2;
import java.util.Scanner;

public class SumofmanyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			int read = Integer.parseInt(reader.nextLine());
			if (read==0) {
				break;
			}
			sum+=read;
			System.out.println("Sum of numbers:" + sum);
		}
		System.out.println("Sum in the end:" + sum);
		reader.close();

	}

}
