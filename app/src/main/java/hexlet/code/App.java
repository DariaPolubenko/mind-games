package hexlet.code;

import games.Calc;
import games.Even;
import games.GCD;
import games.Prime;
import games.Progression;

import java.util.Scanner;

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
            case "1":
                Cli.getName();
                break;
            case "2":
                Even.getEven();
                break;
            case "3":
                Calc.getCalc();
                break;
            case "4":
                GCD.getGCD();
                break;
            case "5":
                Progression.getProgression();
                break;
            case "6":
                Prime.getPrime();
                break;
            default:
                break;
        }
    }
}

