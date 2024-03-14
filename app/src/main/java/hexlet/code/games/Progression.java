package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int LENGTH = 10;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_FIRST_NUMBER = 10;
    private static final int MAX_NUMBER_PROGRESSION = 20;
    private static int missingNumber;

    public static void playProgression() {

        var greeting = "What number is missing in the progression?";
        String[] questions = new String[Engine.ROUNDS];
        String[] results = new String[Engine.ROUNDS];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            int[] numbers = getNumbers();
            questions[i] = getQuestion(numbers);
            results[i] = getResult(numbers);
        }
        Engine.getEngine(greeting, questions, results);
    }

    public static int[] getNumbers() {
        int[] numbers = new int[LENGTH];
        // от [1 до 10]
        numbers[0] = Utils.getRandomInt(MIN_NUMBER, MAX_FIRST_NUMBER);
        // находим число прогрессии (разность между одним элементом и предыдущим), от [1 до 20]
        int progressionNumber = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER_PROGRESSION);

        for (var i = 1; i < LENGTH; i++) {
            numbers[i] = numbers[i - 1] + progressionNumber;
        }
        return numbers;
    }

    public static String getQuestion(int[] numbers) {
        // находим номер отсутствующего элемента от [0 до 10)
        missingNumber = Utils.getRandomInt(0, LENGTH - 1);
        var question = new StringBuilder("Question: ");

        for (var i = 0; i < LENGTH; i++) {

            if (i == missingNumber) {
                question.append(".. ");
            } else {
                question.append(numbers[i] + " ");
            }
        }
        var questionString = question.toString();
        return questionString;
    }

    public static String getResult(int[] numbers) {
        int result = 0;

        for (var i = 0; i < LENGTH; i++) {
            if (i == missingNumber) {
                result = numbers[i];
            }
        }
        var resultString = String.valueOf(result);
        return resultString;
    }
}
