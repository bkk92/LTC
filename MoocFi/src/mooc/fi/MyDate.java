package mooc.fi;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

      //Commented for doing Exercise 92 - remove comment if running Exercise 91.    
//    public void advance() {
//	if(this.day<30) {
//	    this.day++;
//	}
//	else {
//	    this.day=1;
//	    
//	    if(this.month<12) {
//		this.month++;
//	    }
//	    else {
//		this.month = 1;
//		this.year ++;
//	    }
//	}
//    }
//    
//    public void advance(int numberofDays) {
//	for(int i = 0; i<numberofDays; i++) {
//	    this.advance();
//	}
//	
//    }
//    
//    public MyDate afterNumberofDays(int days) {
//	MyDate newMydate = new MyDate(this.day,this.month,this.year);
//	
//	newMydate.advance(days);
//	
//	return newMydate;
//    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }

        // years and months the same, we'll compare the days
        if ( this.year == compared.year && this.month == compared.month &&
                this.day < compared.day ) {
            return true;
        }

        return false;
    }
    
    
    public int differenceInYears(MyDate comparedDate) {
	
	int years=0;
	years = Math.abs(this.year - comparedDate.year);
	
	return years;
	
	
    }





















}



