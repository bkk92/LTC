package mooc.fi;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student student = new Student(null, null);
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner reader = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Enter student name");
			String name = reader.nextLine();
			if(name.isEmpty()) {
				System.out.println("Exiting");
				break;
			}
			
			System.out.println("Enter student number");
			String studentNumber = reader.nextLine();
			list.add(new Student(name,studentNumber));
		}
		
//		for (Student info:list) {
//			System.out.println(info);
//		}
		
		System.out.println("Give search term:");
		String term = reader.nextLine();
		for (Student search:list) {
			if(search.getName().contains(term)) {
				System.out.println(search);
			}
		}
	
		reader.close();
		
//		System.out.println("name: "+peeka.getName());
//		System.out.println("name: "+peeka.getStudentNumber());
//		System.out.println(peeka);
	}

}
