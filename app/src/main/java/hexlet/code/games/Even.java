package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static String greeting = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playEven() {

        String[] questions = new String[Engine.ROUNDS];
        String[] results = new String[Engine.ROUNDS];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            var number = Utils.getRandom(MIN_NUMBER, MAX_NUMBER);
            questions[i] = "Question: " + number;

            var result = getResult(number);
            results[i] = result ? "yes" : "no";
        }
        Engine.run(greeting, questions, results);
    }

    public static boolean getResult(int number) {
        var result = (number % 2) == 0;
        return result;
    }

}
