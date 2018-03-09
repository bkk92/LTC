import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner reader = new Scanner(System.in);
    	
    	System.out.println("Top ten players based on Goal");
    	NHLStatistics.sortByGoals();
    	NHLStatistics.top(10);
    	
    	System.out.println("\nTop 25 players based on penalty amounts");
    	NHLStatistics.sortByPenalties();
    	NHLStatistics.top(25);
    	
    	System.out.println("\nStatistics for Sidney Crosby");
    	NHLStatistics.searchByPlayer("Sidney Crosby");
    	
    	System.out.println("\nStatistics for PHI");
    	NHLStatistics.teamStatistics("PHI");
    	
    	System.out.println("\nPlayers in ANA ordered by points");
    	NHLStatistics.sortByPoints();
    	NHLStatistics.teamStatistics("ANA");
    
    	reader.close();
    	
    }
}
