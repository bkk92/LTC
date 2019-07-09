package mooc.fi;

import java.util.ArrayList;

public class Team {
    
    private String teamName;
    private ArrayList<Player> teamPlayers = new ArrayList<Player>(); 
    
    public Team(String teamName) {
	this.teamName = teamName;
	
    }
    
    public String getName() {
	return this.teamName;
	
    }
    
    public void addPlayer(Player player) {
	this.teamPlayers.add(player);
	
    }
    
    public void printPlayers() {
	
	for(Player thisplayer :this.teamPlayers) {
	    System.out.println("Player: " + thisplayer);
	}
    }
    

}
