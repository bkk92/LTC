package mooc.fi;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
	this.numbers = new ArrayList<Integer>();

    }

    public ArrayList<Integer> numbers() {
	return this.numbers;

    }

    public void drawNumbers() {
	Random random;
	random = new Random();
	int winningNumber = 5;
	int maxRange = 10;

	for (int i = 0; i < 7; i++) {
	    int nextNumber = random.nextInt(maxRange);
	    /*
	     * if (!this.numbers.contains(nextNumber)) { this.numbers.add(nextNumber); }
	     * else
	     */
	    while (numbers.contains(nextNumber)) {
		nextNumber = random.nextInt(maxRange);

	    }
	    this.numbers.add(nextNumber);
	    // i--;

	}
	System.out.println("Size of numbers generated :" + numbers.size());
	if (!containsNumber(winningNumber)) {
	    System.out.println("You did not win");
	} else {
	    System.out.println("You win");
	}

    }

    public boolean containsNumber(int number) {
	if (!this.numbers.contains(number)) {
	    return false;
	}
	return true;
    }

}
