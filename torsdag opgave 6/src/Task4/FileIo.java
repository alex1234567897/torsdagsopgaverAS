package Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIo {

    public String laesFilIndhold(String filnavn) throws FileNotFoundException {

        Scanner file = new Scanner(new File("data/"+filnavn+".txt"));
        StringBuilder indhold = new StringBuilder();
        while(file.hasNextLine()){
            indhold.append(file.nextLine()).append("\n");
        }
        file.close();
        return indhold.toString();
    }

}
