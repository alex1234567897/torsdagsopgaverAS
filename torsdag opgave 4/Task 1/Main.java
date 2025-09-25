public class Main{
	
	public static void main(String[] args){

		// --- Teams ---
		Team team1 = new Team("sharks");
		team1.setTeamRank(5);
		team1.addPlayer("lars");
		team1.addPlayer("yvonne");

		Team team2 = new Team("Eagles");
		team2.setTeamRank(4);
		team2.addPlayer("peter");
		team2.addPlayer("højløse");

		Team team3 = new Team("Hawks");
		team3.setTeamRank(3);
		team3.addPlayer("retep");
		team3.addPlayer("esøljøh");

		Team team4 = new Team("Wolfs");
		team4.setTeamRank(2);
		team4.addPlayer("Stiles");
		team4.addPlayer("Lupin");

		Team team5 = new Team("Flødeskum");
		team5.setTeamRank(1);
		team5.addPlayer("Jhonny");
		team5.addPlayer("Sins");


		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team4);
		System.out.println(team5);
	}

}