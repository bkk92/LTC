package mooc.fi;

public class Student {

	private String name;
	private String studentNumber;
	
	public Student(String Sname,String Snumber){
	this.name=Sname;
	this.studentNumber=Snumber;
	
	}

	public String getName() {
		return name;
	}

	public String getStudentNumber() {
		return studentNumber;
	}
	
	public String toString() {
		return this.name+" "+"("+this.studentNumber+")";
	}
	
}
