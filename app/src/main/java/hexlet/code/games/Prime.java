package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void getPrime() {

        var greeting = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        final int length = 3;
        String[] questions = new String[length];
        String[] results = new String[length];

        final int rounds = 3;

        for (var i = 0; i < rounds; i++) {

            final int rangeOfNumbers = 100;
            int number;
            do {
                number = (int) (Math.random() * rangeOfNumbers);
            } while (number == 0);

            questions[i] = "Question: " + number;

            boolean simpleNumber = true;
            int splitter = 2;
            final int oneNumberOfSimple = 3;
            final int twoNumberOfSimple = 5;
            final int threeNumberOfSimple = 7;
            final int maxSplitter = 7;

            while ((number > oneNumberOfSimple && number != twoNumberOfSimple && number != threeNumberOfSimple)
                    && (splitter < maxSplitter)) {
                if (number % splitter != 0) {
                    simpleNumber = true;
                    splitter += 1;
                } else {
                    simpleNumber = false;
                    break;
                }
            }

            results[i] = simpleNumber ? "yes" : "no";
        }

        Engine.getEngine(greeting, questions, results);
    }
}
