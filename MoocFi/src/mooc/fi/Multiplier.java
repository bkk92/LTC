package mooc.fi;

public class Multiplier {

    private int number_this;
    private int othernumber_this;

    public Multiplier(int number) {
	this.number_this = number;
    }

    public int multiply(int otherNumber) {
	this.othernumber_this = otherNumber;
	this.othernumber_this = this.number_this * othernumber_this;
	return othernumber_this;
    }

}
