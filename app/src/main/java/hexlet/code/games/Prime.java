package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static void playPrime() {

        var greeting = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[Engine.ROUNDS];
        String[] results = new String[Engine.ROUNDS];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            int number = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER); // [1, 100]
            questions[i] = "Question: " + number;
            results[i] = getResult(number);
        }
        Engine.getEngine(greeting, questions, results);
    }

    public static String getResult(int number) {
        boolean simpleNumber = true;

        if (number == 1) {
            simpleNumber = false;
        } else if (number > 2) {
            for (var j = 2; j < number; j++) {
                if (number % j == 0) {
                    simpleNumber = false;
                    break;
                }
            }
        }
        return simpleNumber ? "yes" : "no";
    }
}
