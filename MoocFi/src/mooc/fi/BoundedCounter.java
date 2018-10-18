package mooc.fi;

public class BoundedCounter {

    private int value;
    private int upperlimit;

    public BoundedCounter(int upperlimit) {

	this.value = 0;
	if (upperlimit > 0) {

	    this.upperlimit = upperlimit;
	}

	else {

	    System.out.println("Upperlimit cannot be less than 0");
	}

    }

    public void next() {

	if (this.value >= this.upperlimit) {
	    this.value = 0;
	} else {

	    this.value++;
	}

    }

    public String toString() {

	if (this.value < 10) {

	    return "0" + this.value;
	} else {
	    return "" + this.value;
	}

    }

    public int getValue() {
	return this.value;
    }

    public void setValue(int val) {
	this.value = val;
    }

}
