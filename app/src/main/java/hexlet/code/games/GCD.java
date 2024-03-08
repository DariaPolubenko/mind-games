package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final int ROUNDS = 3;
    private static final int NUMBER_OF_DIGITS = 2;
    private static final int MIN_NUMBER = 2;
    private static final int MAX_NUMBER = 10;


    public static void playGCD() {

        var greeting = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[ROUNDS];
        String[] results = new String[ROUNDS];

        for (var i = 0; i < ROUNDS; i++) {

            int[] numbers = getNumbers();
            questions[i] = "Question: " + numbers[0] + " " + numbers[1];
            results[i] = getResult(numbers);
        }
        Engine.getEngine(greeting, questions, results);
    }

    public static int[] getNumbers() {
        int[] numbers = new int[NUMBER_OF_DIGITS];

        do {
            // от [1 до 10]
            numbers[0] = (int) (Math.random() * MAX_NUMBER + 1);
            numbers[1] = (int) (Math.random() * MAX_NUMBER + 1);
        } while (numbers[0] == numbers[1]);

        // от [2 до 10]
        int multiplier =  (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);

        numbers[0] *= multiplier;
        numbers[1] *= multiplier;

        return numbers;
    }

    public static String getResult(int[] numbers) {

        while (numbers[0] != 0 && numbers[1] != 0) {
            if (numbers[0] > numbers[1]) {
                numbers[0] = numbers[0] % numbers[1];
            } else {
                numbers[1] = numbers[1] % numbers[0];
            }
        }
        var result = numbers[0] + numbers[1];
        var resultString = String.valueOf(result);

        return resultString;
    }

}
