package games;

import hexlet.code.Engine;

public class GCD {
    public static void getGCD() {

        var greeting = "Find the greatest common divisor of given numbers.";

            int[][] numbers = new int[3][2];
            String[] questions = new String[3];
            String[] results = new String[3];

            for (var i = 0; i < 3; i++) {
                do {
                    numbers[i][0] = (int) (Math.random() * 100);
                    numbers[i][1] = (int) (Math.random() * 100);
                } while ((numbers[i][0] == 0) && (numbers[i][1] == 0)
                        && (numbers[i][0] > 30 || numbers[i][1] > 50));


                questions[i] = ("Question: " + numbers[i][0] + " " + numbers[i][1]);

                while (numbers[i][0] != 0 && numbers[i][1] != 0) {
                    if (numbers[i][0] > numbers[i][1]) {
                        numbers[i][0] = numbers[i][0] % numbers[i][1];
                    } else {
                        numbers[i][1] = numbers[i][1] % numbers[i][0];
                    }
                }

                var result = numbers[i][0] + numbers[i][1];
                results[i] = String.valueOf(result);
            }

            Engine.getEngine(greeting, questions, results);
    }
}
