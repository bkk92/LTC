package mooc.fi;

public class Product {

    private double price;
    private double amount;
    private String name;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {

	this.name = nameAtStart;
	this.price = priceAtStart;
	this.amount = amountAtStart;

    }

    public void printProduct() {

	System.out.println("Name:" + this.name + " ,price:" + this.price + " ,amount:" + this.amount);
    }

}
