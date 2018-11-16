package mooc.fi;

public class PasswordRandomizerMain {

    public static void main(String[] args) {

	PasswordRandomizer randomizer = new PasswordRandomizer(40);
	System.out.println("Password: " + randomizer.createPassword());
	System.out.println("Password: " + randomizer.createPassword());
	System.out.println("Password: " + randomizer.createPassword());
	System.out.println("Password: " + randomizer.createPassword());

    }

}
