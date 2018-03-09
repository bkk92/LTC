package week1;

import java.util.Scanner;

public class Ex9divider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner div= new Scanner(System.in);
		System.out.println("Enter first number");
		float firstNumber = Integer.parseInt(div.nextLine());
		System.out.println("Enter second number");
		float secondNumber = Integer.parseInt(div.nextLine());
		
		System.out.println("Quotient after division of the two numbers: "+ (firstNumber/secondNumber));
		System.out.println("\nRemainder after division of the two numbers: "+ (firstNumber%secondNumber));
		
		div.close();
	}

}
