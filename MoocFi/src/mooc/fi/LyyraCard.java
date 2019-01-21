package mooc.fi;

public class LyyraCard {

    private double balance;
    private String cardUser;

    public LyyraCard(double balanceAtStart, String name) {

	this.setBalance(balanceAtStart);
	this.cardUser = name;
	System.out.println("IM HERE1");
    }
    
    public LyyraCard(double balance) {
        this.setBalance(balance);
        System.out.println("This is where you are");
    }
    
    public double balance() {
    	return this.getBalance();
    }
    

//    public String toString() {
//	return this.cardUser + " card has " + this.balance + " Euros";
//    }

//    public void payEconomical() {
//
//	if (this.balance >= 2.50) {
//
//	    this.balance -= 2.50;
//	    System.out.println("Successfully Charged for Eccomical");
//	} else {
//	    System.out.println("Insufficient Balance for Economical..");
//	}
//    }
//
//    public void payGourmet() {
//
//	if (this.balance >= 4.00) {
//
//	    this.balance -= 4.00;
//	    System.out.println("Successfully Charged for Gourmet");
//	} else {
//	    System.out.println("Insufficient Balance for Gourmet..");
//	}
//
//    }

    public void loadMoney(double amount) {

	final double extra;

	if (amount < 0) {
	    System.out.println("Negative charge cant be processed");

	}

	else if ((amount + this.getBalance()) >= 150) {

	    extra = (amount + this.getBalance()) - 150;

	    this.setBalance(150);
	    System.out.println("Successfully loaded " + this.getBalance() + " in the card");
	    System.out.println("Balance " + extra + " will be returned");

	} else if (amount > 150) {
	    extra = amount - 150;
	    this.setBalance(150);
	    System.out.println("Successfully loaded " + this.getBalance() + " in the card");
	    System.out.println("Balance " + extra + " will be returned");

	} else {

	    this.setBalance(this.getBalance() + amount);
	    System.out.println("Successfully loaded " + this.getBalance() + " in the card");

	}

    }
    
    
    public boolean pay(double amount) {
    
    	if (this.getBalance() >= amount) {
    		this.setBalance(this.getBalance() - amount);
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
