package week1;

import java.util.Scanner;

public class EX18GradesandPoints {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
	
		System.out.println("Type the points[0-60]: ");
		int points = Integer.parseInt(reader.nextLine());
		
		if (points <= 0 && points < 30) {
			System.out.println("Grade : Failed");
		}
		else if (points >= 30 && points <= 34) {
			System.out.println("Grade : 1");
		}
		else if (points>=35 && points <=39){
			System.out.println("Grade : 2");
		}
		else if (points>=40 && points <=44){
			System.out.println("Grade : 3");
		}
		else if (points>=45 && points <=49){
			System.out.println("Grade : 4");
		}
		else if (points>=50 && points <=60){
			System.out.println("Grade : 5");
		}
		else {
			System.out.println("Please enter number between 0 - 60");
		}
		reader.close();
	}
}
