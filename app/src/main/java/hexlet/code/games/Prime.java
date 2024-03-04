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

            int number;
            final int rangeOfNumbers = 100;
            do {
                number = (int) (Math.random() * rangeOfNumbers);
            } while (number == 0);

            questions[i] = "Question: " + number;

            boolean simpleNumber = true;
            if (number > 2) {
                for (var j = 2; j < number; j++) {
                    if (number % j == 0) {
                        simpleNumber = false;
                        break;
                    }
                }
            }

            results[i] = simpleNumber ? "yes" : "no";
        }

        Engine.getEngine(greeting, questions, results);
    }
}
