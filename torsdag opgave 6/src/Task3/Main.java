package Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean fileFound = false;

        while (!fileFound) { // --- keeps going until a valid file name is found.
            System.out.println("Enter file name");
            String input = scan.nextLine();

            try { // --- prints only if the file does exists
                Scanner file = new Scanner(new File("data/"+input+".txt")); //--- take the input and adds the txt and path.
                fileFound = true;
                System.out.println("File opened succesfully: ");
                while(file.hasNextLine()){
                    String line = file.nextLine();
                    System.out.println(line);
                }
                file.close();
            } catch (FileNotFoundException e) { // --- tries to catch if the file exists ---
                System.out.println("File not found, Please try again");
            }

        }

    }


}
