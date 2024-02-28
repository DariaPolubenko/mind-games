package hexlet.code;

import java.util.Scanner;

public class Even {
    public static String getEven() {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 1; i <= 3; i++) {

            var randomDouble = Math.random() * 100;
            var randomInt = (int) randomDouble;
            System.out.println("Question: " + randomInt);

            Scanner answer = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userAnswer = answer.next();

            boolean even = randomInt % 2 == 0;


            if ((even && userAnswer.equals("yes")) || (!even && userAnswer.equals("no"))) {
                System.out.print("Correct!\n");
            } else if (even && userAnswer.equals("no")) {
                System.out.print("'no' is wrong answer ;(. Correct answer was 'yes'.\n");
                return "Let's try again, ";
            } else if (!even && userAnswer.equals("yes")) {
                System.out.print("'yes' is wrong answer ;(. Correct answer was 'no'.\n");
                return "Let's try again, ";
            } else {
                return "Incorrect answer, ";
            }
        }

        return "Congratulations, ";
    }
}
