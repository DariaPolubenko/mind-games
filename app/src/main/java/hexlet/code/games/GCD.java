package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final int rounds = 3;
    private static final int lenght = rounds;
    private static final int numberOfDigits = 2;
    private static final int minNumber = 2;
    private static final int maxNumber = 10;


    public static void playGCD() {

        var greeting = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[lenght];
        String[] results = new String[lenght];

        for (var i = 0; i < rounds; i++) {

            int[] numbers = getNumbers(numberOfDigits);
            questions[i] = "Question: " + numbers[0] + " " + numbers[1];
            results[i] = getResult(numbers);
        }
        Engine.getEngine(greeting, questions, results);
    }

    public static int[] getNumbers(int numberOfDigits) {
        int[] numbers = new int[numberOfDigits];

        do {
            // от [1 до 10]
            numbers[0] = (int) (Math.random() * maxNumber + 1);
            numbers[1] = (int) (Math.random() * maxNumber + 1);
        } while (numbers[0] == numbers[1]);

        // от [2 до 10]
        int multiplier =  (int) (Math.random() * (maxNumber - minNumber + 1) + minNumber);

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
