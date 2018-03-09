import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        while(true) {
        
        	System.out.println("Enter desired temperature");
            double temp = Double.parseDouble(reader.nextLine());
            
            if (temp <= -30 || temp>=40) {
            	System.out.println("ERROR: Please enter a value above -30C and below 40C");
            	continue;
            	}
            Graph.addNumber(temp);
           
            System.out.println("Do you want to enter more?(Yes/No)");
            String response = reader.nextLine();
            if(response.equalsIgnoreCase("yes")) {
            	continue;
            	}
            else
            {
            	System.out.println("\nBye");
            	break;
            }
            
        }
        reader.close();

        /* Graph is used as follows:
        Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);
         Remove or comment out these lines above before trying to run the tests.*/
    }
}
