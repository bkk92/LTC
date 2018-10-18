package mooc.fi;

import java.util.ArrayList;

public final class CombineArraysUtil {

    public static void printList(ArrayList<String> list, String listName) {
	System.out.println(listName);
	for (String word : list) {
	    System.out.println(word);
	}
    }
}
