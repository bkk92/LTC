package mooc.fi;

public class ProductMain {

    public static void main(String args[]) {

	Product banana = new Product("Banana", 1.1, 13);
	Product apple = new Product("Apple", 1.8, 16);
	Product orange = new Product("Orange", 3.3, 30);

	banana.printProduct();
	apple.printProduct();
	orange.printProduct();

    }

}
