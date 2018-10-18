package mooc.fi;
import java.util.ArrayList;

public class ArrayListOps {

	public static void main(String [] args) {
		ArrayList<String> teachers = new ArrayList<String>();
		
		teachers.add("Anthony");
		teachers.add("Barto");
		teachers.add("Paul");
		teachers.add("John");
	    teachers.add("Martin");
	    teachers.add("Matt");
		
		System.out.println("The number of teachers "+ teachers.size());
		System.out.println("First teacher on list"+ teachers.get(0));
		System.out.println("Third teacher on list"+ teachers.get(3));
		
		teachers.remove("Anthony");
		
		if (teachers.contains("Paul")) {
			System.out.println("Paul is on the teachers list");
		}
		else {
			System.out.println("Paul is not on teachers list");
		}
		
		for (String teacher : teachers) {
			System.out.println(teacher);
		}
		
	}
}
