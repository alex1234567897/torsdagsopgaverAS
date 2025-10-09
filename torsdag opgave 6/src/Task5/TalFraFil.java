package Task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TalFraFil {
    public static void main(String[] args) {
        int[] talArray = new int[5];

        try {
            File fil = new File("data/tal.txt");
            Scanner scanner = new Scanner(fil);

            int i = 0;
            while (scanner.hasNext()) {
                String linje = scanner.next();
                talArray[i] = Integer.parseInt(linje);
                i++;
            }
            scanner.close();

            System.out.println("tallene i Arrayet");
            for(int tal : talArray){
                System.out.println(tal);
            }


        } catch (FileNotFoundException e){
            System.out.println("Fil ikke fundet.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("For mange tal i filen! Arrayet kan kun rumme 5 tal");
        } catch (NumberFormatException e){
            System.out.println("filen indholder et element, der ikke er et tal");
        }
        // Læs tal fra fil "tal.txt" med Scanner
        // Gem tallene i talArray
        // Håndter følgende exceptions med separate catch-blokke:
        // - FileNotFoundException
        // - ArrayIndexOutOfBoundsException (hvis filen har for mange tal)
        // - NumberFormatException (hvis filen indeholder ikke-tal)
    }
}
