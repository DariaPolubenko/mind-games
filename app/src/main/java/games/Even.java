package games;

import hexlet.code.Engine;

public class Even {
    public static void getEven() {

        var greeting = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        int[] numbers = new int[3];
        String[] questions = new String[3];
        String[] results = new String[3];

        for (var i = 0; i < 3; i++) {

            numbers[i] = (int) (Math.random() * 100);
            questions[i] = ("Question: " + numbers[i]);

            int even = numbers[i] % 2;
            if (even == 0) {
                results[i] = "yes";
            } else {
                results[i] = "no";
            }
        }

        Engine.getEngine(greeting, questions, results);
    }
}
