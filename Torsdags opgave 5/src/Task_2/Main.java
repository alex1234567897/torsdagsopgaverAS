package Task_2;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Cafe myCafe = new Cafe();
        myCafe.loadMenuData();

        for (String coffee : myCafe.getCoffeeMenu()){
            System.out.println(coffee);
        }
    }

}
