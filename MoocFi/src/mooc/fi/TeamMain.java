package mooc.fi;

public class TeamMain {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Team barcelona = new Team("FC Barcelona");
	System.out.println("Team:" + barcelona.getName());
	
	Player brian = new Player("Brian");
	//System.out.println("Player: " + brian);
	
	Player pekka = new Player("Pekka",20);
	//System.out.println("Player: " + pekka);
	
	barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        barcelona.printPlayers();
	
    }

}
