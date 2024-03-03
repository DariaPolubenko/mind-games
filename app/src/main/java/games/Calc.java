package games;

import hexlet.code.Engine;

public class Calc {
    public static void getCalc() {

        var greeting = "What is the result of the expression?";

        String[] operations = {"+", "-", "*"};

        int[][] numbers = new int[3][2];
        String[] questions = new String[3];

        int[] results = new int[3];
        String[] resultStrings = new String[3];


        for (var i = 0; i < 3; i++) {

            int minElement = 0;
            int maxElement = 2;
            int randomOperation = minElement + (int) (Math.random() * (maxElement - minElement + 1));
            var operation = operations[randomOperation];

            if (operation.equals("*")) {
                numbers[i][0] = (int) (Math.random() * 10);
                numbers[i][1] = (int) (Math.random() * 100);
            } else {
                numbers[i][0] = (int) (Math.random() * 100);
                numbers[i][1] = (int) (Math.random() * 100);
            }

            questions[i] = ("Question: " + numbers[i][0] + " " + operation + " " + numbers[i][1]);

            switch (operation) {
                case "+":
                    results[i] = numbers[i][0] + numbers[i][1];
                    break;

                case "-":
                    results[i] = numbers[i][0] - numbers[i][1];
                    break;
                case "*":
                    results[i] = numbers[i][0] * numbers[i][1];
                    break;
            }

            resultStrings[i] = String.valueOf(results[i]);
        }
        Engine.getEngine(greeting, questions, resultStrings);
    }
}
