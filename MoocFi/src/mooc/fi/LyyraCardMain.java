package mooc.fi;

public class LyyraCardMain {

	public static void main(String[] args) {

	LyyraCard pekka = new LyyraCard(20, "Peeka");
	LyyraCard brain = new LyyraCard(30, "Brain");
	
	

//	brain.payEconomical();
//	pekka.payGourmet();
//	System.out.println(pekka);
//	System.out.println(brain);
//
//	pekka.loadMoney(20);
//	brain.payGourmet();
//	System.out.println(pekka);
//	System.out.println(brain);
//
//	pekka.payEconomical();
//	pekka.payEconomical();
//
//	brain.loadMoney(50);
//	System.out.println(pekka);
//	System.out.println(brain);
	
	System.out.println("Money on the card of Peeka"+ pekka.balance());
	boolean succeeded = pekka.pay(10); 
	System.out.println("Money taken: " + succeeded);
	System.out.println("money on card after processing " + pekka.balance());
	
	succeeded = pekka.pay(21);
	System.out.println("Money taken: " + succeeded);
	System.out.println("Money on the card "+ pekka.balance());

    }

}
