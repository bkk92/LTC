package mooc.fi;

import java.util.ArrayList;

public class LotteryNumbersMain {

    public static void main(String[] args) {

	LotteryNumbers lotteryNumbers = new LotteryNumbers();

	System.out.println("Lottery numbers");

	lotteryNumbers.drawNumbers();
	ArrayList<Integer> numbers = lotteryNumbers.numbers();

	for (int number : numbers) {
	    System.out.println(number + "");
	}

    }

}
