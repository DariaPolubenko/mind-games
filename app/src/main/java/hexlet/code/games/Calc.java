package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int ROUNDS = 3;
    private static final int NUMBER_OF_DIGITS = 2;
    private static final int MIN_ELEMENT = 0;
    private  static final int MAX_ELEMENT = 2;
    private  static final int RANGE_OF_NUMBERS1 = 10;
    private  static final int RANGE_OF_NUMBERS2 = 100;


    public static void playCalc() {

        var greeting = "What is the result of the expression?";
        String[] questions = new String[ROUNDS];
        String[] results = new String[ROUNDS];

        for (var i = 0; i < ROUNDS; i++) {

            var operation = getOperation();
            int[] numbers = getNumbers(operation);

            questions[i] = "Question: " + numbers[0] + " " + operation + " " + numbers[1];
            results[i] = getResult(numbers, operation);
        }
        Engine.getEngine(greeting, questions, results);
    }

    public static String getOperation() {

        String[] operations = {"+", "-", "*"};
        // присваиваем знечение от [0 до 2]
        int randomOperation =  (int) (Math.random() * (MAX_ELEMENT - MIN_ELEMENT + 1) + MIN_ELEMENT);

        return operations[randomOperation];
    }

    public static int[] getNumbers(String operation) {

        int[] numbers = new int[NUMBER_OF_DIGITS];

        if (operation.equals("*")) {
            // присваиваем numbers[0] значения от [1 до 10]
            numbers[0] = (int) (Math.random() * RANGE_OF_NUMBERS1 + 1);
            numbers[1] = (int) (Math.random() * RANGE_OF_NUMBERS2 + 1);
        } else {
            // присваиваем numbers[0] значения от [1 до 100]
            numbers[0] = (int) (Math.random() * RANGE_OF_NUMBERS2 + 1);
            numbers[1] = (int) (Math.random() * RANGE_OF_NUMBERS2 + 1);
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
