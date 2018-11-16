package mooc.fi;

import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
	random = new Random();
	this.numberOfSides = numberOfSides;

    }

    public int roll() {
	return this.random.nextInt(this.numberOfSides);

    }

}
