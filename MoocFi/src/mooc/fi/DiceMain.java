package mooc.fi;

import java.util.Scanner;

public class DiceMain {

    public static void main(String[] args) {

	Dice dice = new Dice(6);

	int i = 0; // number of times to roll the dice.
	System.out.println("enter number of times to roll the dice: ");
	Scanner reader = new Scanner(System.in);
	int rollCount = Integer.parseInt(reader.nextLine());

	while (i < rollCount) {
	    System.out.println(dice.roll());
	    i++;

	}
	reader.close();

    }

}
