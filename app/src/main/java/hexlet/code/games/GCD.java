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

            var firstNumber = 0;
            var secondNumber = 0;
            do {
                var commonMultiplier = Utils.getRandomNumber(MIN_NUMBER + 1, MAX_NUMBER); // от [2 до 10]
                firstNumber = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER) * commonMultiplier;
                secondNumber = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER) * commonMultiplier;
            } while (firstNumber == secondNumber);

            data[i][0] = "Question: " + firstNumber + " " + secondNumber;

            var answer = findGCD(firstNumber, secondNumber);
            data[i][1] = String.valueOf(answer);
        }
        Engine.run(greeting, data);
    }

    public static int findGCD(int first, int second) {

        while (first != 0 && second != 0) {
            if (first > second) {
                first = first % second;
            } else {
                second = second % first;
            }
        }
        var result = first + second;
        return result;
    }
}
