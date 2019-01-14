package mooc.fi;

public class Counter {

    private int counterValue;
    private boolean counterCheck;

    public Counter(int startingValue, boolean check) {
	this.counterValue = startingValue;
	this.counterCheck = check;
    }

    public Counter(int startingValue) {
	this.counterValue = startingValue;
    }

    public Counter(boolean check) {
	this.counterCheck = check;
    }

    public Counter() {
	this.counterValue = 0;
	this.counterCheck = false;

    }

    public int value() {
	return this.counterValue;
    }

    public boolean checkValue() {
	return this.counterCheck;
    }

    public void increase() {
	System.out.println("Increasing counter value by 1");
	this.counterValue++;
    }

    public void decrease() {
	if (this.counterCheck == true && this.counterValue >= 0) {
	    System.out.println("Decreasing counter value by 1");
	    this.counterValue--;
	} else {
	    System.out.println("Cannot decrement counter to less than 0");
	}
    }

    public int increase(int increaseAmount) {

	if (increaseAmount < 0) {
	    System.out.println("Amount less than 0, counter will not be updated");
	} else {
	    this.counterValue += increaseAmount;
	}
	return this.counterValue;
    }

    public int decrease(int decreaseAmount) {

	if (this.counterCheck && (this.counterValue - decreaseAmount) < 0) {
	    System.out.println("Amount less than 0, counter will not be updated");
	} else {
	    this.counterValue -= decreaseAmount;
	}
	return this.counterValue;
    }
}