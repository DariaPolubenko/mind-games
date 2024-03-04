package games;

import hexlet.code.Engine;

public class Even {
    public static void getEven() {

        var greeting = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        final int length = 3;
        String[] questions = new String[length];
        String[] results = new String[length];

        final int rounds = 3;
        for (var i = 0; i < rounds; i++) {

            final int rangeOfNumbers = 100;
            var number = (int) (Math.random() * rangeOfNumbers);
            questions[i] = "Question: " + number;

            final int integrityTest = 2;
            int even = number % integrityTest;
            results[i] = even == 0 ? "yes" : "no";
        }

        Engine.getEngine(greeting, questions, results);
    }
}
