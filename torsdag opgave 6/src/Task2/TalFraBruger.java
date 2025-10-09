package Task2;

import java.util.Scanner;

public class TalFraBruger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean valid = false;
        int nuværendeÅr = 2025;

        while(!valid) {
            System.out.println("Indtast dit fødselsår:");
            String input = scanner.nextLine();
            try {
                int i = Integer.parseInt(input);
                valid = true;
                int alder =nuværendeÅr - i;
                System.out.println("Du er " +alder+ " år gammel");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, Please Input Numbers");

            }
        }


        // Brug Integer.parseInt til at konvertere input til int
        // Beregn brugerens alder (antag at nuværende år er 2025)
        // Print alderen
    }
}
