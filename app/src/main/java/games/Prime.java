package games;

import hexlet.code.Engine;

public class Prime {
    public static void getPrime() {

        var greeting = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[3];
        String[] results = new String[3];

        for (var i = 0; i < 3; i++) {

            int number;
            do {
                number = (int) (Math.random() * 100);
            } while (number == 0);

            questions[i] = "Question: " + number;

            boolean simpleNumber = true;
            var splitter = 2;

            while ((number > 3 && number != 5 && number != 7) && (splitter < 8)) {
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
