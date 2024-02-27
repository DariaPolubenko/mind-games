package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {

        Scanner choice = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "0 - Exit");

        int userChoice = choice.nextInt();
        System.out.println("Your choice: " + userChoice + "\n");
        //userChoice.close();

        if (userChoice == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getName();
        }
    }
}
