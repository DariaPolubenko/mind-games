package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void getProgression() {

        var greeting = "What number is missing in the progression?";
        final int lenght = 3;
        String[] questions = new String[lenght];
        String[] results = new String[lenght];

        final int rounds = 3;
        for (var i = 0; i < rounds; i++) {

            final int length = 10;
            int[] numbers = new int[length];

            final int rangeOfFirstNumbers = 10;
            int firstNumber = (int) (Math.random() * rangeOfFirstNumbers);
            numbers[0] = firstNumber;

            // находим число прогрессии (разность между одним элементом и предыдущим)
            final int minProgression = 1;
            final int maxProgression = 20;
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
