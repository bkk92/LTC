package mooc.fi;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {

	this.meals = new ArrayList<String>();

    }

    public void addMeal(String meal) {

	if (!this.meals.contains(meal)) {
	    this.meals.add(meal);
	} else {
	    System.out.println("Item Already exists in menu");
	}

    }

    public void printMenu() {

	for (String menuItem : this.meals) {
	    System.out.println(menuItem);

	}
    }

    public void clearMenu() {
	Scanner reader = new Scanner(System.in);
	System.out.println("Do you want to clear the Menu(Y/N): ");
	String answer = reader.nextLine();
	if (answer.equals("Y")) {
	    this.meals.clear();
	    System.out.println("Menu Cleared...");
	} else {
	    System.out.println("Menu is not cleared...");
	}

    }

}
