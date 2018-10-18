package mooc.fi;

public class MultiplierMain {

    public static void main(String[] args) {

	Multiplier threeMultiplier = new Multiplier(3);
	System.out.println("threeMultiplier.multiple(2): " + threeMultiplier.multiply(2));

	Multiplier fourMultiplier = new Multiplier(4);
	System.out.println("fourMultiplier.multiple(3): " + fourMultiplier.multiply(3));

	Multiplier fiveMultiplier = new Multiplier(5);
	System.out.println("fiveMultiplier.multiple(5): " + fiveMultiplier.multiply(5));

    }

}
