package mooc.fi;

import java.util.Random;

public class PasswordRandomizer {
    private Random random;
    private int passwordLength;

    public PasswordRandomizer(int passwordLength) {
	random = new Random(this.passwordLength);
	this.passwordLength = passwordLength;
    }

    public String createPassword() {

	StringBuilder bld = new StringBuilder();
	char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	char[] result = new char[this.passwordLength];
	for (int i = 0; i < this.passwordLength; i++) {
	    // result[i] = charArray[random.nextInt(this.passwordLength) + 1];
	    bld.append(charArray[random.nextInt(this.passwordLength) + 1]);
	}

	// return new String(result);
	return bld.toString();
    }

}
