package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static void run(String greeting, String[][] data) {

        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name? ");

        Scanner name = new Scanner(System.in);
        var userName = name.next();
        System.out.println("Hello, " + userName + "!\n" + greeting);

        for (var i = 0; i < ROUNDS; i++) {

            System.out.println(data[i][0]);

            Scanner answer = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userAnswer = answer.next();

            if (!data[i][1].equals(userAnswer)) {
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was " + "'"
                        + data[i][1] + "'.");

                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
