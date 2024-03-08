package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int lenght = 3;
    private static final int rounds = 3;
    private static final int length = 10;
    private static final int rangeOfFirstNumbers = 10;
    private static final int minProgression = 1;
    private static final int maxProgression = 20;


    public static void playProgression() {

        var greeting = "What number is missing in the progression?";

        String[] questions = new String[lenght];
        String[] results = new String[lenght];

        for (var i = 0; i < rounds; i++) {

            int[] numbers = new int[length];

            int firstNumber = (int) (Math.random() * rangeOfFirstNumbers);
            numbers[0] = firstNumber;

            // находим число прогрессии (разность между одним элементом и предыдущим)
            int progressionNumber = (int) (Math.random() * (maxProgression - minProgression) + minProgression);

            // находим номер отсутствующего элемента
            int maxMissing = length - 1;
            int missingNumber = (int) (Math.random() * maxMissing);

            var question = new StringBuilder("Question: ");
            int result = 0;



            if (missingNumber == 0) {
                result = numbers[0];
                question.append(".. ");
            }

            for (var j = 1; j < length; j++) {
                numbers[j] = numbers[j - 1] + progressionNumber;

                if (j == missingNumber) {
                    result = numbers[j];
                    question.append(".. ");
                } else {
                    question.append(numbers[j] + " ");
                }
            }

            results[i] = String.valueOf(result);
            questions[i] = question.toString();
        }

        Engine.getEngine(greeting, questions, results);
    }
}
