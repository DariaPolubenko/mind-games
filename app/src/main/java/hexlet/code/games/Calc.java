package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MIN_ELEMENT = 0;
    private  static final int MAX_ELEMENT = 2;
    private  static final int MAX_NUMBER1 = 10;
    private  static final int MAX_NUMBER2 = 100;
    private static String greeting = "What is the result of the expression?";
    private static String[] operations = {"+", "-", "*"};

    public static void playCalc() {

        String[][] data = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            var operation = operations[Utils.getRandomNumber(MIN_ELEMENT, MAX_ELEMENT)];
            int[] numbers = getNumbers(operation);

            var firstNumber = numbers[0];
            var secondNumber = numbers[1];

            data[i][0] = "Question: " + firstNumber + " " + operation + " " + secondNumber;

            int answer = calculate(firstNumber, secondNumber, operation);
            data[i][1] = String.valueOf(answer);
        }
        Engine.run(greeting, data);
    }

    public static int[] getNumbers(String operation) {

        int[] numbers = new int[2];

        if (operation.equals("*")) {
            numbers[0] = Utils.getRandomNumber(1, MAX_NUMBER1); // [1, 10]
            numbers[1] = Utils.getRandomNumber(1, MAX_NUMBER2); // [1, 100]
            return numbers;
        }
        numbers[0] = Utils.getRandomNumber(1, MAX_NUMBER2); // [1, 100]
        numbers[1] = Utils.getRandomNumber(1, MAX_NUMBER2); // [1, 100]
        return numbers;
    }

    public static int calculate(int firstNumber, int secondNumber, String operation) {
        int result = 0;

        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Error");
                break;
        }
        return result;
    }
}
