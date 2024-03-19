package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int NUMBER_OF_DIGITS = 2;
    private static final int MIN_ELEMENT = 0;
    private  static final int MAX_ELEMENT = 2;
    private  static final int MAX_NUMBER1 = 10;
    private  static final int MAX_NUMBER2 = 100;
    private static String greeting = "What is the result of the expression?";
    private static String[] operations = {"+", "-", "*"};

    public static void playCalc() {

        String[][] data = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            var operation = operations[Utils.getRandom(MIN_ELEMENT, MAX_ELEMENT)];
            int[] numbers = getNumbers(operation);

            var firstNumber = numbers[0];
            var secondNumber = numbers[1];

            data[i][0] = "Question: " + firstNumber + " " + operation + " " + secondNumber;

            var result = getResult(firstNumber, secondNumber, operation);
            data[i][1] = String.valueOf(result);
        }
        Engine.run(greeting, data);
    }

    public static int[] getNumbers(String operation) {

        int[] numbers = new int[NUMBER_OF_DIGITS];

        if (operation.equals("*")) {
            numbers[0] = Utils.getRandom(1, MAX_NUMBER1);
            numbers[1] = Utils.getRandom(1, MAX_NUMBER2);
        } else {
            numbers[0] = Utils.getRandom(1, MAX_NUMBER2);
            numbers[1] = Utils.getRandom(1, MAX_NUMBER2);
        }
        return numbers;
    }

    public static int getResult(int firstNumber, int secondNumber, String operation) {
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
