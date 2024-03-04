package games;

import hexlet.code.Engine;

public class Even {
    public static void getEven() {

        var greeting = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[3];
        String[] results = new String[3];

        for (var i = 0; i < 3; i++) {

            var number = (int) (Math.random() * 100);
            questions[i] = "Question: " + number;

            int even = number % 2;
            results[i] = even == 0 ? "yes" : "no";
        }

        Engine.getEngine(greeting, questions, results);
    }
}
