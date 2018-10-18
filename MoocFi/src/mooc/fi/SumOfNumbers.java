package mooc.fi;

public class SumOfNumbers {

	public static int sum(int number1, int number2,int number3) {
		return number1+number2+number3;
	}
	
	public static double avg() {
		int avg1 = sum(3,4,5)/3;
		return (double)avg1;
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("sum = "+ sum(4,2,5));
		System.out.println(avg());
	}

}
