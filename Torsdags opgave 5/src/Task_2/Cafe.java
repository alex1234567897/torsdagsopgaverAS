package Task_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    // --- Array for Coffees---
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public ArrayList<String> getCoffeeMenu(){
        return coffeeMenu;
    }

    public void loadMenuData(){
        try {
            File file = new File("data/coffees.txt");
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()){
                String coffeeName  = scan.nextLine();
                coffeeMenu.add(coffeeName);
            }
            scan.close();

        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }


    }
}
