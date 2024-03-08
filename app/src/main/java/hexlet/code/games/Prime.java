package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final int ROUNDS = 3;
    private static final int RANGE_OF_NUMBERS = 100;

    public static void playPrime() {

        var greeting = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[ROUNDS];
        String[] results = new String[ROUNDS];

        for (var i = 0; i < ROUNDS; i++) {

            int number = getNumber();
            questions[i] = "Question: " + number;
            results[i] = getResult(number);
        }
        Engine.getEngine(greeting, questions, results);
    }

    public static int getNumber() {
        // от [1 до 100]
        int number = (int) (Math.random() * RANGE_OF_NUMBERS + 1);
        return number;
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
