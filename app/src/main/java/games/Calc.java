package games;

import hexlet.code.Engine;

public class Calc {
    public static void getCalc() {

        var greeting = "What is the result of the expression?";
        String[] questions = new String[3];
        String[] resultStrings = new String[3];

        for (var i = 0; i < 3; i++) {

            int[] numbers = new int[2];
            String[] operations = {"+", "-", "*"};
            int result = 0;

            int minElement = 0;
            int maxElement = 2;
            int randomOperation = minElement + (int) (Math.random() * (maxElement - minElement + 1));
            var operation = operations[randomOperation];

            if (operation.equals("*")) {
                numbers[0] = (int) (Math.random() * 10);
                numbers[1] = (int) (Math.random() * 100);
            } else {
                numbers[0] = (int) (Math.random() * 100);
                numbers[1] = (int) (Math.random() * 100);
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
            }

            resultStrings[i] = String.valueOf(result);
        }

        Engine.getEngine(greeting, questions, resultStrings);
    }
}
