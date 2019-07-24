package mooc.fi;

import java.util.ArrayList;

public class Team {
    
    private String teamName;
    private int maxSize;
    private ArrayList<Player> teamPlayers = new ArrayList<Player>(); 
    
    public Team(String teamName) {
	this.teamName = teamName;
	
    }
    
    public String getName() {
	return this.teamName;
	
    }
    
    public void addPlayer(Player player) {
	
	if (teamPlayers.size()<=this.maxSize) {
	    this.teamPlayers.add(player);    
	}
	else {
	    System.out.println();
	}
	
    }
    
    public void printPlayers() {
	
	for(Player thisplayer :this.teamPlayers) {
	    System.out.println("Player: " + thisplayer);
	}
    }
    
    public void setMaxSize(int maxSize) {
	this.maxSize = maxSize;
    }
    
    public int getMaxSize() {
	return this.maxSize;
    }
    
    public int goals() {
	int goals=0;
	for (Player i:this.teamPlayers) {
	    goals+=i.goals();
	}
	return goals;
	
    }
    

}
