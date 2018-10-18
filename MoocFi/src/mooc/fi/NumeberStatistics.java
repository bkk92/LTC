package mooc.fi;

import java.util.ArrayList;

public class NumeberStatistics {

    private int amountofNumbers;
    private int i = 0;

    public NumeberStatistics() {
	this.amountofNumbers = 0;
    }

    public void addNumber(int number) {
	ArrayList<Integer> addList = new ArrayList<Integer>();
	addList.add(number);
	i++;
    }

    public int amountofNumbers() {

	return this.amountofNumbers;
    }
}
