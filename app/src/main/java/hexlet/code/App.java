package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");

        Scanner choice = new Scanner(System.in);
        String userChoice = choice.next();
        System.out.println("Your choice: " + userChoice + "\n");
        
        switch (userChoice) {
            case "0":
                System.out.println("Good bye!");
                break;
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.playEven();
                break;
            case "3":
                Calc.playCalc();
                break;
            case "4":
                GCD.playGCD();
                break;
            case "5":
                Progression.playProgression();
                break;
            case "6":
                Prime.playPrime();
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }
    }
}
