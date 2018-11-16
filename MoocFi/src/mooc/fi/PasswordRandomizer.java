package mooc.fi;

import java.util.Random;

public class PasswordRandomizer {
    private Random random;
    private int passwordLength;

    public PasswordRandomizer(int passwordLength) {
	random = new Random(passwordLength);
	this.passwordLength = passwordLength;
    }

    public String createPassword() {

	char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	char[] result = new char[this.passwordLength];
	for (int i = 0; i < this.passwordLength; i++) {
	    result[i] = charArray[random.nextInt(this.passwordLength - 1)];
	}

	return new String(result);
    }

}
