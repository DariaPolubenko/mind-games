package games;

import hexlet.code.Engine;

public class GCD {
    public static String getGCD() {

        System.out.println("Find the greatest common divisor of given numbers.");

        for (var i = 1; i <= 3; i++) {

            int firstNumber;
            int secondNumber;

            do {
                firstNumber = (int) (Math.random() * 100);
                secondNumber = (int) (Math.random() * 100);
            } while ((firstNumber == 0) && (secondNumber == 0));

            System.out.println("Question: " + firstNumber + " " + secondNumber);


            while (firstNumber != 0 && secondNumber != 0) {
                if (firstNumber > secondNumber) {
                        firstNumber = firstNumber % secondNumber;
                } else {
                    secondNumber = secondNumber % firstNumber;
                }
            }

            var result = firstNumber + secondNumber;

            var resultString = String.valueOf(result);
            var output = Engine.getEngine(resultString);

            if (!output) {
                return "Let's try again, ";
            }

        }

        return "Congratulations, ";

    }
}
