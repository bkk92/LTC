package mooc.fi;

public class LyyraCardMain {

    public static void main(String[] args) {

	LyyraCard pekka = new LyyraCard(20, "Peeka");
	LyyraCard brain = new LyyraCard(30, "Brain");
	brain.payEconomical();
	pekka.payGourmet();
	System.out.println(pekka);
	System.out.println(brain);

	pekka.loadMoney(20);
	brain.payGourmet();
	System.out.println(pekka);
	System.out.println(brain);

	pekka.payEconomical();
	pekka.payEconomical();

	brain.loadMoney(50);
	System.out.println(pekka);
	System.out.println(brain);

    }

}
