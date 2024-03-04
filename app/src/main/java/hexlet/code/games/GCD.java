package games;

import hexlet.code.Engine;

public class GCD {
    public static void getGCD() {

        var greeting = "Find the greatest common divisor of given numbers.";

        final int lenght = 3;
        String[] questions = new String[lenght];
        String[] results = new String[lenght];

        final int rounds = 3;
        for (var i = 0; i < rounds; i++) {

            final int numberOfDigits = 2;
            int[] numbers = new int[numberOfDigits];

            final int minNumber = 1;
            final int maxNumber = 10;
            int multiplier = minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));

            do {
                numbers[0] = minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));
                numbers[1] = minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));
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
