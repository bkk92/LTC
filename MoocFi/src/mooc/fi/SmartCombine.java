package mooc.fi;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartCombine {

    public static void smartCombine(ArrayList<String> list1, ArrayList<String> list2) {

	boolean join = true;
	for (int i = 0; i < list2.size(); i++) {
	    if (list1.contains(list2.get(i))) {
		System.out.println("Number is available in list1, unable to join");
		join = false;
		break;
	    } else {
		list1.add(list2.get(i));
	    }

	}
	if (join) {
	    System.out.println(list1);
	}
    }

    public static void main(String[] args) {

	ArrayList<String> list1 = new ArrayList<String>();
	ArrayList<String> list2 = new ArrayList<String>();

	Scanner reader = new Scanner(System.in);
	System.out.println("Enter words in arraylist 1:");

	GetUserInputArrayList.createList(list1, reader);

	System.out.println("Enter words in arraylist 2:");
	GetUserInputArrayList.createList(list2, reader);

	CombineArraysUtil.printList(list1, "List1");
	CombineArraysUtil.printList(list2, "List2");

	smartCombine(list1, list2);
	reader.close();

    }

    // private static void printList(ArrayList<String> list, String listName) {
    // System.out.println(listName);
    // for (String word : list) {
    // System.out.println(word);
    // }
    // }

}
