import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> initialActions = new ArrayList<>();
        initialActions.add("Start Game");
        initialActions.add("Resume Game");
        initialActions.add("pause Game");
        initialActions.add("End Game");

        GameMenu menu = new GameMenu(initialActions);  // pass list to constructor

      // menu.displayMenu();

       String userChoice = menu.promptUser();  // returns a String
        int action = Integer.parseInt(userChoice);  // convert String to int
        doAction(action);  // call the new method


   
   }

   public static void doAction(int action){
    if (action == 1){
        System.out.print("starting game");
    } else if( action == 2){
         System.out.print("Resuming Game");
    }else if(action == 3){
         System.out.print("Pausing game");
    } else if(action == 4){
         System.out.print("Ending game");
     } else {
         System.out.print("invalid choice");
    }

 }

}

