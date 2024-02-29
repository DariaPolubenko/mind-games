package games;

import hexlet.code.Engine;


public class Calc {
    public static String getCalc() {

        System.out.println("What is the result of the expression?");

        for (var i = 1; i <= 3; i++) {
            var firstNumber = (int) (Math.random() * 100);
            var secondNumber = (int) (Math.random() * 100);

            char[] operations = {'+', '-', '*'};
            int minId = 0;
            int maxId = 2;
            int randomOperation = minId + (int) (Math.random() * (maxId - minId + 1));

            var operation = operations[randomOperation];
            System.out.println("Question: " + firstNumber + " " + operation + " " + secondNumber);

            int result = 0;
            switch (operation) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;

                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
            }
            var resultString = String.valueOf(result);
            var output = Engine.getEngine(resultString);

            if (!output) {
                return "Let's try again, ";
            }
        }
        return "Congratulations, ";
    }
}
