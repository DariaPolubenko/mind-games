package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int ROUNDS = 3;
    private static final int LENGHT = 10;
    private static final int RANGE_OF_FIRST_NUMBERS = 10;
    private static final int MIN_PROGRESSION = 1;
    private static final int MAX_PROGRESSION = 20;
    private static int missing_number;

    public static void playProgression() {

        var greeting = "What number is missing in the progression?";
        String[] questions = new String[ROUNDS];
        String[] results = new String[ROUNDS];

        for (var i = 0; i < ROUNDS; i++) {

            int[] numbers = getNumbers();
            questions[i] = getQuestion(numbers);
            results[i] = getResult(numbers);
        }
        Engine.getEngine(greeting, questions, results);
    }

    public static int[] getNumbers() {
        int[] numbers = new int[LENGHT];
        // от [1 до 10]
        numbers[0] = (int) (Math.random() * RANGE_OF_FIRST_NUMBERS + 1);
        // находим число прогрессии (разность между одним элементом и предыдущим), от [1 до 20]
        int progressionNumber = (int) (Math.random() * (MAX_PROGRESSION - MIN_PROGRESSION + 1) + MIN_PROGRESSION);

        for (var i = 1; i < LENGHT; i++) {
            numbers[i] = numbers[i - 1] + progressionNumber;
        }
        return numbers;
    }

    public static String getQuestion(int[] numbers) {
        // находим номер отсутствующего элемента от [0 до 10)
        missing_number = (int) (Math.random() * LENGHT);
        var question = new StringBuilder("Question: ");

        for (var i = 0; i < LENGHT; i++) {

            if (i == missing_number) {
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

        for (var i = 0; i < LENGHT; i++) {
            if (i == missing_number) {
                result = numbers[i];
            }
        }

        var resultString = String.valueOf(result);
        return resultString;
    }
}
