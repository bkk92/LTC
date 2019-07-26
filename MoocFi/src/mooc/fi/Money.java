package mooc.fi;

public class Money {

    private final int euros;
    private final int cents;
    
    public Money(int euros, int cents) {
	if(cents > 99) {
	    euros+= cents / 100;
	    cents%= 100;
	}
	
	this.euros=euros;
	this.cents=cents;
    }
    
    public int euros() {
	return euros;	
    }
    public int cents() {
	return cents;
    }
    
    public String toString() {
	String zero = "";
	if(cents<=10) {
	    zero = "0";
	}
	
	return euros +"."+ zero+cents+"e";
    }
    
    
    public Money plus(Money added) {
	
//	Money buffer = new Money(this.euros+added.euros,this.cents+added.cents);
//	return buffer;
	int cents1= this.cents+added.cents;
	int euros1= this.euros+added.euros;
	
	return new Money(euros1,cents1);
	
	
	
	
    }
   
    public boolean less(Money compared) {
	
	
	if(this.euros < compared.euros) {
	    return true;
	}
	if(this.cents < compared.cents) {
	    return true;
	}
	return false;
    }
    
    
    public Money minus(Money decremented) {

	int eurosM= this.euros - decremented.euros;
	int centsM = this.cents - decremented.cents;
	if(eurosM<0 && centsM < 0) {
	    return new Money(0,0);
	}
	if (centsM<0) {
	    return new Money(eurosM-1,0);
	}
	if (eurosM<0) {
	    return new Money(0,centsM);
	}
	return new Money(eurosM,centsM);
    }
    
}

