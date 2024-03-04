package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void getCalc() {

        var greeting = "What is the result of the expression?";

        final int length = 3;
        String[] questions = new String[length];
        String[] resultStrings = new String[length];

        final int rounds = 3;
        for (var i = 0; i < rounds; i++) {

            final int numberOfDigits = 2;
            int[] numbers = new int[numberOfDigits];
            String[] operations = {"+", "-", "*"};
            int result = 0;

            final int minElement = 0;
            final int maxElement = 2;
            int randomOperation = minElement + (int) (Math.random() * (maxElement - minElement + 1));
            var operation = operations[randomOperation];

            final int rangeOfNumbers1 = 100;
            final int rangeOfNumbers2 = 10;

            if (operation.equals("*")) {
                numbers[0] = (int) (Math.random() * rangeOfNumbers2);
                numbers[1] = (int) (Math.random() * rangeOfNumbers1);
            } else {
                numbers[0] = (int) (Math.random() * rangeOfNumbers1);
                numbers[1] = (int) (Math.random() * rangeOfNumbers1);
            }

            questions[i] = "Question: " + numbers[0] + " " + operation + " " + numbers[1];

            switch (operation) {
                case "+":
                    result = numbers[0] + numbers[1];
                    break;
                case "-":
                    result = numbers[0] - numbers[1];
                    break;
                case "*":
                    result = numbers[0] * numbers[1];
                    break;
                default:
                    System.out.println("Error");
            }

            resultStrings[i] = String.valueOf(result);
        }

        Engine.getEngine(greeting, questions, resultStrings);
    }
}
