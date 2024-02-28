package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {

        Scanner choice = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit");

        int userChoice = choice.nextInt();
        System.out.println("Your choice: " + userChoice + "\n");
        //userChoice.close();

        if (userChoice >= 1) {
            System.out.println("Welcome to the Brain Games!");
            var userName = Cli.getName();
            System.out.println("Hello, " + userName + "!");

                switch (userChoice) {
                    case 2:
                        var resultEven = Even.getEven();
                        System.out.println(resultEven + userName);
                        break;
                    case 3:
                        var resultCalc = Calc.getCalc();
                        System.out.println(resultCalc + userName);
                        break;
                }
        }
    }
}
