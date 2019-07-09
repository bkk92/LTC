package mooc.fi;

public class ClockMain {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Clock clock = new Clock(00,00,59);
	
	int i = 0;
	while(i<20) {
	    System.out.println(clock);
	    clock.tick();
	    i++;
	    
	}
    }

}
