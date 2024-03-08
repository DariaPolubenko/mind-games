package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int rounds = 3;
    private static final int length = 10;
    private static final int rangeOfFirstNumbers = 10;
    private static final int minProgression = 1;
    private static final int maxProgression = 20;
    private static int missingNumber;

    public static void playProgression() {

        var greeting = "What number is missing in the progression?";
        String[] questions = new String[rounds];
        String[] results = new String[rounds];

        for (var i = 0; i < rounds; i++) {

            int[] numbers = getNumbers();
            questions[i] = getQuestion(numbers);
            results[i] = getResult(numbers);
        }

        Engine.getEngine(greeting, questions, results);
    }

    public static int[] getNumbers() {
        int[] numbers = new int[length];
        // от [1 до 10]
        numbers[0] = (int) (Math.random() * rangeOfFirstNumbers + 1);
        // находим число прогрессии (разность между одним элементом и предыдущим), от [1 до 20]
        int progressionNumber = (int) (Math.random() * (maxProgression - minProgression + 1) + minProgression);

        for (var i = 1; i < length; i++) {
            numbers[i] = numbers[i - 1] + progressionNumber;
        }
        return numbers;
    }

    public static String getQuestion(int[] numbers) {
        // находим номер отсутствующего элемента от [0 до 10)
        missingNumber = (int) (Math.random() * length);
        var question = new StringBuilder("Question: ");

        for (var i = 0; i < length; i++) {

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

        for (var i = 0; i < length; i++) {
            if (i == missingNumber) {
                result = numbers[i];
            }
        }

        var resultString = String.valueOf(result);
        return resultString;
    }
}
