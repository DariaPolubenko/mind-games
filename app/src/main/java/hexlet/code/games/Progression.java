package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    private static final int MIN_NUMBER1 = 1;
    private static final int MIN_NUMBER2 = 5;
    private static final int MAX_FIRST_NUMBER = 10;
    private static final int MAX_NUMBER_PROGRESSION = 20;
    private static String greeting = "What number is missing in the progression?";

    public static void playProgression() {

        String[][] data = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            var lengthOfProgression = Utils.getRandomNumber(MIN_NUMBER2, MAX_FIRST_NUMBER); // от [5 до 10]
            var firstNumberOfProgression = Utils.getRandomNumber(MIN_NUMBER1, MAX_FIRST_NUMBER); // от [1 до 10]
            var progressionStep = Utils.getRandomNumber(MIN_NUMBER1, MAX_NUMBER_PROGRESSION); // от [1 до 20]

            int[] progression = getProgression(lengthOfProgression, firstNumberOfProgression, progressionStep);

            var missingNumber = Utils.getRandomNumber(0, lengthOfProgression - 1); // от [0 до длина массива)
            var answer = progression[missingNumber];
            data[i][1] = String.valueOf(answer);

            var question = getQuestion(progression, missingNumber);
            data[i][0] = "Question: " + question;
        }
        Engine.run(greeting, data);
    }

    public static int[] getProgression(int length, int firstNumber, int step) {
        int[] numbers = new int[length];
        numbers[0] = firstNumber;

        for (var i = 1; i < length; i++) {
            numbers[i] = numbers[i - 1] + step;
        }
        return numbers;
    }

    public static String getQuestion(int[] progression, int missingNumber) {
        String[] progressionString = Arrays.stream(progression)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        progressionString[missingNumber] = "..";
        var question = String.join(" ", progressionString);
        return question;
    }
}
