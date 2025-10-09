package Task4;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FillaeserProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileIo fileIo = new FileIo();
        String filIndhold = null;


       while(filIndhold == null) {
           System.out.println("indtast filnavn: ");
           String filnavn = scanner.nextLine();

           try {
               filIndhold = fileIo.laesFilIndhold(filnavn);

           } catch (FileNotFoundException e){
               System.out.println("Fil er ikke fundet, prøv igen.");
           }
       }

        System.out.println("\nFilens indhold:\n" + filIndhold);

    }
}
