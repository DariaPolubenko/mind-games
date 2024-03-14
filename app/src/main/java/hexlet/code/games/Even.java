package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int RANGE_OF_NUMBERS = 100;
    private static final int PARITY_CHECK = 2;


    public static void playEven() {

        var greeting = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[Engine.ROUNDS];
        String[] results = new String[Engine.ROUNDS];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            var number = getNumber();
            questions[i] = "Question: " + number;
            results[i] = getResult(number);
        }
        Engine.getEngine(greeting, questions, results);
    }

    public static int getNumber() {
        // от [1 до 100]
        var number = (int) (Math.random() * RANGE_OF_NUMBERS + 1);
        return number;
    }

    public static String getResult(int number) {
        var even = number % PARITY_CHECK;
        var result = even == 0 ? "yes" : "no";

        return result;
    }

}
