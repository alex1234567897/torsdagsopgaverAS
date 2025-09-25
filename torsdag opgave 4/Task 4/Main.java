import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> initialActions = new ArrayList<>();
        initialActions.add("Start Game");
        initialActions.add("Resume Game");
        initialActions.add("Pause Game");
        initialActions.add("End Game");

        GameMenu menu = new GameMenu(initialActions);  // pass list to constructor

       menu.displayMenu();
   }
}