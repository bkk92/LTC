package week2;

import java.util.Scanner;

public class Sumof3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int sum = 0;
		        int read = 0;

		        Scanner reader = new Scanner(System.in);
		        while(read < 3){
		            System.out.println("Enter number("+read+") to be added:");
		            sum+= Integer.parseInt(reader.nextLine());
		            read++;
		        }
		        System.out.println("Sum :"+sum);
		        reader.close();

		   }
	
}
