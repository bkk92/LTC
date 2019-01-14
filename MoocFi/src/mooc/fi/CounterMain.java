package mooc.fi;

public class CounterMain {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Counter countandcheck = new Counter(50, true);
	Counter countonly = new Counter(40);
	Counter countcheck = new Counter(true);
	Counter count = new Counter();

	// countandcheck.value();
	System.out.println(
		"Current value of Counter = " + countandcheck.value() + " and check = " + countandcheck.checkValue());
	countandcheck.increase(20);
	System.out.println(countandcheck.value());

	count.decrease(5);
	System.out.println(count.value());

	// countonly.value();
	/*
	 * System.out .println("Current value of Counter = " + countonly.value() +
	 * " and check = " + countonly.checkValue());
	 * 
	 * // countcheck.value(); System.out.println( "Current value of Counter = " +
	 * countcheck.value() + " and check = " + countcheck.checkValue());
	 * 
	 * // countcheck.value(); System.out.println("Current value of Counter = " +
	 * count.value() + " and check = " + count.checkValue());
	 */
    }

}
