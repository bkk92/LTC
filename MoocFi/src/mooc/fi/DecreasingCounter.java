package mooc.fi;

public class DecreasingCounter {

    private int value;
    private int original_value;

    public DecreasingCounter(int valueAtStart) {
	this.value = valueAtStart;
	this.original_value = this.value;

    }

    public void printValue() {
	System.out.println("value: " + this.value);

    }

    public void decrease() {
	if (this.value > 0) {
	    this.value--;
	}

    }

    public void reset() {
	this.value = 0;
    }

    public int setInitial() {

	this.value = this.original_value;
	return this.value;
    }

}
