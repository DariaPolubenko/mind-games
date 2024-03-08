package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int rounds = 3;
    private static final int numberOfDigits = 2;
    private static final int minElement = 0;
    private  static final int maxElement = 2;
    private  static final int rangeOfNumbers1 = 10;
    private  static final int rangeOfNumbers2 = 100;


    public static void playCalc() {

        var greeting = "What is the result of the expression?";
        String[] questions = new String[rounds];
        String[] results = new String[rounds];

        for (var i = 0; i < rounds; i++) {

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
        int randomOperation =  (int) (Math.random() * (maxElement - minElement + 1) + minElement);

        return operations[randomOperation];
    }

    public static int[] getNumbers(String operation) {

        int[] numbers = new int[numberOfDigits];

        if (operation.equals("*")) {
            // присваиваем numbers[0] значения от [1 до 10]
            numbers[0] = (int) (Math.random() * rangeOfNumbers1 + 1);
            numbers[1] = (int) (Math.random() * rangeOfNumbers2 + 1);
        } else {
            // присваиваем numbers[0] значения от [1 до 100]
            numbers[0] = (int) (Math.random() * rangeOfNumbers2 + 1);
            numbers[1] = (int) (Math.random() * rangeOfNumbers2 + 1);
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
