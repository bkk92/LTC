package mooc.fi;

public class MenuMain {

    public static void main(String[] args) {

	Menu menulist = new Menu();

	menulist.addMeal("Pizza");
	menulist.addMeal("Burgur");
	menulist.addMeal("Chips");
	menulist.printMenu();

	menulist.clearMenu();

	System.out.println("Menu after clearMenu fn is run:");
	menulist.printMenu();

    }

}
