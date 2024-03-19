package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static String greeting = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playEven() {

        String[][] data = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            var number = Utils.getRandom(MIN_NUMBER, MAX_NUMBER);
            data[i][0] = "Question: " + number;

            var result = getResult(number);
            data[i][1] = result ? "yes" : "no";
        }
        Engine.run(greeting, data);
    }

    public static boolean getResult(int number) {
        var result = (number % 2) == 0;
        return result;
    }

}
