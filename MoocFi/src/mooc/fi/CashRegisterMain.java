package mooc.fi;

public class CashRegisterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		CashRegister unicafeExactum = new CashRegister();

//        double theChange = unicafeExactum.payEconomical(10);
//        System.out.println("the change was " + theChange );
////
////        theChange = unicafeExactum.payEconomical(5);
////        System.out.println("the change was "  + theChange );
////
////        theChange = unicafeExactum.payGourmet(4);
////        System.out.println("the change was "  + theChange );
////
////        System.out.println( unicafeExactum );
//        
//        LyyraCard cardOfJim = new LyyraCard(7);
//
//        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//        succeeded = unicafeExactum.payGourmet(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//        succeeded = unicafeExactum.payEconomical(cardOfJim);
//        System.out.println("payment success: " + succeeded);

        CashRegister unicafeExactum = new CashRegister();
        
        System.out.println( unicafeExactum );
        
        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 200);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );

	}

}
