package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int rounds = 3;
    public static void getEngine(String greeting, String[] questions, String[] results) {

        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name? ");

        Scanner name = new Scanner(System.in);
        var userName = name.next();

        System.out.println("Hello, " + userName + "!\n" + greeting);

        for (var i = 0; i < rounds; i++) {

            System.out.println(questions[i]);

            Scanner answer = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userAnswer = answer.next();

            if (results[i].equals(userAnswer)) {
                System.out.println("Correct!");
            } else if (!results[i].equals(userAnswer)) {
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was " + "'"
                        + results[i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
