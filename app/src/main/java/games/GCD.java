package games;

import hexlet.code.Engine;

public class GCD {
    public static void getGCD() {

        var greeting = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[3];
        String[] results = new String[3];

        for (var i = 0; i < 3; i++) {

            int[] numbers = new int[2];

            int minMultiplier = 1;
            int maxMultiplier = 10;
            int multiplier = minMultiplier + (int) (Math.random() * (maxMultiplier - minMultiplier + 1));

            do {
                numbers[0] = minMultiplier + (int) (Math.random() * (maxMultiplier - minMultiplier + 1));
                numbers[1] = minMultiplier + (int) (Math.random() * (maxMultiplier - minMultiplier + 1));
            } while (numbers[0] == numbers[1]);

            numbers[0] = numbers[0] * multiplier;
            numbers[1] = numbers[1] * multiplier;

            questions[i] = "Question: " + numbers[0] + " " + numbers[1];

            while (numbers[0] != 0 && numbers[1] != 0) {
                    if (numbers[0] > numbers[1]) {
                        numbers[0] = numbers[0] % numbers[1];
                    } else {
                        numbers[1] = numbers[1] % numbers[0];
                    }
                }

                var result = numbers[0] + numbers[1];
                results[i] = String.valueOf(result);
            }

            Engine.getEngine(greeting, questions, results);
    }
}
