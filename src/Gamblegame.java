
import java.util.*;

public class Gamblegame {

    public static void main(String[] args) {
        boolean runGame = true;

        Scanner scan = new Scanner(System.in);

        String input = "";
        String[] commandos = {"hoger", "lager", "exit"};
        double getalStart = 0;
        double getalfind = 0;
        int lifes = 5;
        int score = 0;
        System.out.println("Welkom bij hoger of lager,je hebt 5 levens en je moet proberen om zoveel mogelijk punten te behalen!");
        while (runGame == true) // (rungame)
        {

            getalStart = Math.ceil(Math.random() * 10); // Getal van 1 tot 10

            System.out.println("Getal is: " + getalStart);


// Input controleren

            boolean geldigeInput = false;

            while (geldigeInput == false) {
                input = scan.nextLine();
                input = input.toLowerCase();

                for (int i = 0; i < commandos.length; i++) {
                    if (input.equals(commandos[i])) {
// input is geldig
                        geldigeInput = true;

                        break;
                    }
                }
            }

// Input evalueren
            getalfind = Math.ceil(Math.random() * 10); // Getal van 1 tot 10

            boolean win = false;
            if (input.equals(commandos[0])) //hoger
            {
                if (getalfind > getalStart) {
// Win
                    win = true;
                }
            } else if (input.equals(commandos[1])) // lager
            {
                if (getalfind < getalStart) {
                    win = true;
                }
            } else {
// Exit
                runGame = false;
                continue;
            }

// Eindresultaat tonen
            System.out.println("Getal start getal was: " + getalStart);
            System.out.println("Getal eind getal is: " + getalfind);

            if (getalfind != getalStart) {
                if (win) {
                    System.out.println("Je hebt gewonnen! 1 punt erbij.");
                    score++;
                    System.out.println("Je hebt nu " + score + " punt(en)");

// Win
                } else {
                    System.out.println("Je hebt verloren! Probeer het nog een keer.");
                    lifes--;
                    System.out.println("Je hebt nog " + lifes + " levens!");

// Lose
                }
            }
            if (lifes == 0) {
                System.out.println("Je hebt verloren helaas.");
                System.out.println("Jouw score is: " + score);

                break;
            }
        }


    }
}
