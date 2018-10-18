package mooc.fi;

public class LyyraCard {

    private double balance;
    private String cardUser;

    public LyyraCard(double balanceAtStart, String name) {

	this.balance = balanceAtStart;
	this.cardUser = name;
    }

    public String toString() {
	return this.cardUser + " card has " + this.balance + " Euros";
    }

    public void payEconomical() {

	if (this.balance >= 2.50) {

	    this.balance -= 2.50;
	    System.out.println("Successfully Charged for Eccomical");
	} else {
	    System.out.println("Insufficient Balance for Economical..");
	}
    }

    public void payGourmet() {

	if (this.balance >= 4.00) {

	    this.balance -= 4.00;
	    System.out.println("Successfully Charged for Gourmet");
	} else {
	    System.out.println("Insufficient Balance for Gourmet..");
	}

    }

    public void loadMoney(double amount) {

	final double extra;

	if (amount < 0) {
	    System.out.println("Negative charge cant be processed");

	}

	else if ((amount + this.balance) >= 150) {

	    extra = (amount + this.balance) - 150;

	    this.balance = 150;
	    System.out.println("Successfully loaded " + this.balance + " in the card");
	    System.out.println("Balance " + extra + " will be returned");

	} else if (amount > 150) {
	    extra = amount - 150;
	    this.balance = 150;
	    System.out.println("Successfully loaded " + this.balance + " in the card");
	    System.out.println("Balance " + extra + " will be returned");

	} else {

	    this.balance += amount;
	    System.out.println("Successfully loaded " + this.balance + " in the card");

	}

    }

}
