package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int rounds = 3;
    private static final int rangeOfNumbers = 100;
    private static final int parityСheck = 2;


    public static void playEven() {

        var greeting = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[rounds];
        String[] results = new String[rounds];

        for (var i = 0; i < rounds; i++) {

            var number = getNumber();
            questions[i] = "Question: " + number;
            results[i] = getResult(number);
        }

        Engine.getEngine(greeting, questions, results);
    }

    public static int getNumber() {
        // от [1 до 100]
        var number = (int) (Math.random() * rangeOfNumbers + 1);
        return number;
    }

    public static String getResult(int number) {
        var even = number % parityСheck;
        var result = even == 0 ? "yes" : "no";

        return result;
    }

}
