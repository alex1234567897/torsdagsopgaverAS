import java.util.ArrayList;
import java.util.List;

public class Team{
	
	// --- privat instances ---
	private String teamName;
	private List<String> players;
	private int teamRank;

	// --- Team Names ---
	public Team(String name){
		teamName = name;
		this.players = new ArrayList<>();
	}

	public String getTeamName(){
		return teamName;  // returns teams name
	}

	public void setTeamName(String name){
		teamName = name;
	}


	// --- Team Ranks ---

	public Team(int rank){
		teamRank = rank;
	}

	public int getTeamRank(){
		return teamRank; // Returns team rank
	}

	public void setTeamRank(int rank){
		teamRank = rank;
	}

	// --- method to manage players ---
	public void addPlayer(String playerName){
		players.add(playerName);
	}
	public void deletePlayer(String playerName){
		players.remove(playerName);
	}
	public List<String> getPlayers(){
		return new ArrayList<>(players); // returns player names
	}
	public String toString(){
		return "Team Name: " + teamName+ ", Rank: "+ teamRank + ", Players " + players; 
	}

}