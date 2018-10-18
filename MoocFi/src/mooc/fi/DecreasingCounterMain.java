package mooc.fi;

public class DecreasingCounterMain {

    public static void main(String[] args) {

	DecreasingCounter counter = new DecreasingCounter(50);

	counter.printValue();

	counter.decrease();
	counter.printValue();

	counter.decrease();
	counter.printValue();

	counter.reset();
	counter.printValue();

	counter.setInitial();
	counter.printValue();

    }

}
