package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static String greeting = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playPrime() {

        String[] questions = new String[Engine.ROUNDS];
        String[] results = new String[Engine.ROUNDS];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.getRandom(MIN_NUMBER, MAX_NUMBER); // [1, 100]
            questions[i] = "Question: " + number;

            var result = getResult(number);
            results[i] = result == true ? "yes" : "no";
        }
        Engine.run(greeting, questions, results);
    }

    public static boolean getResult(int number) {
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
        return simpleNumber;
    }
}
