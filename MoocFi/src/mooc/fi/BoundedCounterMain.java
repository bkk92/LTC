package mooc.fi;

import java.util.Scanner;

public class BoundedCounterMain {

    public static void main(String[] args) throws InterruptedException {

	// BoundedCounter counter = new BoundedCounter(10);
	// System.out.println("Value at start: " + counter);

	BoundedCounter minutes = new BoundedCounter(59);
	BoundedCounter seconds = new BoundedCounter(59);
	BoundedCounter hours = new BoundedCounter(23);

	Scanner reader = new Scanner(System.in);

	System.out.println("Enter seconds: ");
	int s = reader.nextInt();

	System.out.println("Enter minutes: ");
	int m = reader.nextInt();

	System.out.println("Enter hours: ");
	int h = reader.nextInt();

	seconds.setValue(s);
	minutes.setValue(m);
	hours.setValue(h);

	if (seconds.getValue() == 0) {
	    minutes.next();
	}

	else if (minutes.getValue() == 0) {

	    hours.next();
	}

	else if ((minutes.getValue() == 0 && seconds.getValue() == 0)) {
	    seconds.next();
	    minutes.next();

	}

	while (true) {

	    System.out.print(hours + ":" + minutes + ":" + seconds);
	    System.out.print("\033[H\033[2J");
	    System.out.flush();
	    // System.out.print("\b\b\b\b\b\b\b");
	    Thread.sleep(1000);
	    seconds.next();

	}

    }

}
