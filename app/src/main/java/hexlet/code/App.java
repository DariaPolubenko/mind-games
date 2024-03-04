package hexlet.code;

import games.Even;
import games.Calc;
import games.GCD;
import games.Progression;
import games.Prime;

import java.util.Scanner;

class App {
    public static void main(String[] args) {

        Scanner choice = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");

        int userChoice = choice.nextInt();
        System.out.println("Your choice: " + userChoice + "\n");

        if (userChoice > 0) {
            System.out.println("Welcome to the Brain Games!");

            var userName = Cli.getName();
            System.out.println("Hello, " + userName + "!");

            switch (userChoice) {
                case 1:
                    break;
                case 2:
                    Even.getEven();
                    break;
                case 3:
                    Calc.getCalc();
                    break;
                case 4:
                    GCD.getGCD();
                    break;
                case 5:
                    Progression.getProgression();
                    break;
                default:
                    Prime.getPrime();
                    break;
            }
        }
    }
}

