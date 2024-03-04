package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void getEngine(String greeting, String[] questions, String[] results) {

        System.out.println(greeting);

        for (var i = 0; i < 3; i++) {

            System.out.println(questions[i]);

            Scanner answer = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userAnswer = answer.next();

            if (results[i].equals(userAnswer)) {
                System.out.println("Correct!");
            } else if (!results[i].equals(userAnswer)) {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + results[i] + "'.");
                System.out.println("Let's try again, " + Cli.userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.userName + "!");
        return;
    }
}
