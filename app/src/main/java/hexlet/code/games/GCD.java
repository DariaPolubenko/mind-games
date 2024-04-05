package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;
    private static String greeting = "Find the greatest common divisor of given numbers.";

    public static void playGCD() {

        String[][] data = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            var commonMultiplier = Utils.getRandomNumber(MIN_NUMBER + 1, MAX_NUMBER); // от [2 до 10]
            var firstNumber = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER) * commonMultiplier;
            var secondNumber = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER) * commonMultiplier;

            data[i][0] = "Question: " + firstNumber + " " + secondNumber;

            var answer = findGCD(firstNumber, secondNumber);
            data[i][1] = String.valueOf(answer);
        }
        Engine.run(greeting, data);
    }

    public static int findGCD(int first, int second) {
        return second == 0 ? first : findGCD(second, first % second);
    }
}
