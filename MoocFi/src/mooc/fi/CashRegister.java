package mooc.fi;

public class CashRegister {
	private double cashInRegister;
	private int economicalSold;
	private int gourmetSold;
	private double sum;
	
	public CashRegister() {
		cashInRegister = 1000;
	}

	public double payEconomical(double cashGiven) {
		if (cashGiven >= 2.50) {
			this.cashInRegister+= 2.50;
			economicalSold++;
			return cashGiven - 2.50;
			
		}
		else {
			System.out.println("Money insufficient");
			return cashGiven;
			
		}
	}
	
	public double payGourmet(double cashGiven) {
		if (cashGiven >= 4.00) {
			this.cashInRegister+= 2.50;
			gourmetSold++;
			return cashGiven - 4.00;
			
		}
		else {
			System.out.println("Money insufficient");
			return cashGiven;
			
		}
	}
	 public String toString() {
	        return "money in register "+this.cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
	    }
	
	 public boolean payEconomical(LyyraCard card) {
		if( card.balance() > 2.50) {
			economicalSold++;
			return card.pay(2.50);
				
		}
		else {
			return false;
			}
	 }
	 
	 
	 public boolean payGourmet(LyyraCard card) {
		 if( card.balance() > 4.00) {
				gourmetSold++;	
				return card.pay(4.00);
			}
			else {
				return false;
				}
	    }
	 
	    public void loadMoneyToCard(LyyraCard card, double sum) {

	    	final double extra;
	    	this.sum= sum;

	    	if (this.sum < 0) {
	    	    System.out.println("Negative charge cant be processed");

	    	}

	    	else if ((this.sum + card.balance()) <= 150) {

	    	    extra = (this.sum + card.balance()) - 150;

	    	    ///this.sum = 150;
	    	    System.out.println("Successfully loaded " + this.sum + " in the card");
	    	    System.out.println("Balance " + extra + " will be returned");
	    	    this.cashInRegister+=this.sum;
	    	    card.setBalance(card.balance() + extra);

	    	} else if (this.sum > 150) {
	    	    extra = this.sum - 150;
	    	   // card.balance() = 150;
	    	    System.out.println("Successfully loaded max of 150 in the card");
	    	    System.out.println("Balance " + extra + " will be returned");
	    	    this.cashInRegister+=150;
	    	    card.setBalance(card.balance() + extra);

	    	}

	        }
	 
}
