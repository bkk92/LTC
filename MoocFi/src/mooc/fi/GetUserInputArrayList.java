package mooc.fi;

import java.util.ArrayList;
import java.util.Scanner;

public class GetUserInputArrayList {

    public static void createList(ArrayList<String> list, Scanner reader) {
	Integer flag = 0;
	while (!flag.equals(-1)) {

	    String text = reader.nextLine();

	    if (text.isEmpty()) {
		flag = -1;
		System.out.println("Exiting userinput");
		break;
	    } else {
		list.add(text);
	    }
	}
    }

}
