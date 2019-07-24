package mooc.fi;

public class MyDateMain {

    public static void main(String[] args) {

	// Commented for Exercise 92, remove comment if running Exercise 91
//	MyDate day = new MyDate(25, 2, 2011);
//	    MyDate newDate = day.afterNumberofDays(7);
//	    for (int i = 1; i <= 7; ++i) {
//	        System.out.println("Friday after  " + i + " weeks is " + newDate);
//	        newDate = newDate.afterNumberofDays(7);
//	    }
//	    System.out.println("This week's Friday is " + day);
//	    System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberofDays(790));
	    
	        MyDate first = new MyDate(24, 12, 2009);
	        MyDate second = new MyDate(1, 1, 2011);
	        MyDate third = new MyDate(25, 12, 2010);

	        System.out.println( second + " and " + first + " difference in years: " + second.differenceInYears(first) );

	        System.out.println( third + " and " + first + " difference in years: " + third.differenceInYears(first) );

	        System.out.println( second + " and " + third + " difference in years: " + second.differenceInYears(third) );
	    }

    }
