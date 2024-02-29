package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static boolean getEngine(String result) {

        //System.out.println(question);
        Scanner answer = new Scanner(System.in);
        System.out.print("Your answer: ");
        String userAnswer = answer.next();

        if (result.equals(userAnswer)) {
            System.out.println("Correct!");
        } else if (!result.equals(userAnswer)) {
            System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'.");
            return false;
        }
        return true;
    }
}
