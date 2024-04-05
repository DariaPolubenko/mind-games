package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 100;
    private static String greeting = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playPrime() {

        String[][] data = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            int number = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER); // [1, 100]
            data[i][0] = "Question: " + number;

            var answer = isPrime(number);
            data[i][1] = answer ? "yes" : "no";
        }
        Engine.run(greeting, data);
    }

    public static boolean isPrime(int number) {
        if (number == 1 || number == 0) {
            return false;
        }

        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                    return false;
            }
        }
        return true;
    }
}
