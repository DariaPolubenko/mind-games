package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int NUMBER_OF_DIGITS = 2;
    private static final int MIN_ELEMENT = 0;
    private  static final int MAX_ELEMENT = 2;
    private  static final int MAX_NUMBER1 = 10;
    private  static final int MAX_NUMBER2 = 100;


    public static void playCalc() {

        var greeting = "What is the result of the expression?";
        String[] questions = new String[Engine.ROUNDS];
        String[] results = new String[Engine.ROUNDS];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            var operation = getOperation();
            int[] numbers = getNumbers(operation);

            questions[i] = "Question: " + numbers[0] + " " + operation + " " + numbers[1];
            results[i] = getResult(numbers, operation);
        }
        Engine.getEngine(greeting, questions, results);
    }

    public static String getOperation() {

        String[] operations = {"+", "-", "*"};
        int randomOperation = Utils.getRandomInt(MIN_ELEMENT, MAX_ELEMENT);

        return operations[randomOperation];
    }

    public static int[] getNumbers(String operation) {

        int[] numbers = new int[NUMBER_OF_DIGITS];

        if (operation.equals("*")) {
            numbers[0] = Utils.getRandomInt(1, MAX_NUMBER1);
            numbers[1] = Utils.getRandomInt(1, MAX_NUMBER2);
        } else {
            numbers[0] = Utils.getRandomInt(1, MAX_NUMBER2);
            numbers[1] = Utils.getRandomInt(1, MAX_NUMBER2);
        }
        return numbers;
    }

    public static String getResult(int[] numbers, String operation) {
        int result = 0;

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
                break;
        }
        var resultString = String.valueOf(result);

        return resultString;
    }
}
