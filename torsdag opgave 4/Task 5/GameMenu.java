import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{

	private ArrayList<String> actions;

	public GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}

	/*public void displayMenu(){
		for(String action : actions){
			System.out.println(action);
		}
	}*/
	
	public String promptUser(){
		System.out.println("type a number to choose an action");

		for(int i = 0; i< actions.size(); i++){
			System.out.println((i+1)+". "+ actions.get(i));
		}

		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();

		System.out.println("You selected "+choice);

		return choice;
	}
}