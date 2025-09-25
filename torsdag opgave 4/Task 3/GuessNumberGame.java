import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Velkomsthilsen og navn
        System.out.print("Hej! Hvad hedder du? ");
        String name = input.nextLine();
        System.out.println("Velkommen, " + name + "! Jeg har tænkt på et tal mellem 1 og 100.");
        System.out.println("Kan du gætte det? Du har maks. 10 forsøg!");

        // Generér tilfældigt tal mellem 1 og 100
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1; // 1-100
        int attempts = 0;
        boolean guessed = false;

        // Brugeren får op til 10 forsøg
        while (attempts < 10 && !guessed) {
            System.out.print("Indtast dit gæt: ");
            int guess;

            // Tjek for gyldig input (int)
            if (!input.hasNextInt()) {
                System.out.println("Ugyldigt input! Indtast et heltal.");
                input.next(); // spring over forkert input
                continue;
            }

            guess = input.nextInt();
            attempts++;

            if (guess == secretNumber) {
                guessed = true;
                System.out.println("Tillykke " + name + "! Du gættede rigtigt på " + attempts + " forsøg.");
            } else if (guess < secretNumber) {
                System.out.println("For lavt! Prøv et højere tal.");
            } else {
                System.out.println("For højt! Prøv et lavere tal.");
            }
        }

        // Hvis brugeren ikke gættede på 10 forsøg
        if (!guessed) {
            System.out.println("Øv, du har brugt alle 10 forsøg. Tallet var " + secretNumber + ".");
        }

        System.out.println("Tak fordi du spillede, " + name + "!");
        input.close();
    }
}