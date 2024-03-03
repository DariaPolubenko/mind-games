package games;

import hexlet.code.Engine;

public class Progression {
    public static void getProgression() {

        var greeting = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[3];
        String[] results = new String[3];

        for (var i = 0; i < 3; i++) {

            // находим длину прогресии
            int minLength = 5;
            int maxLength = 10;
            int length = minLength + (int) (Math.random() * (maxLength - minLength + 1));

            // создаем массив для прогрессии и присваиваем ему первый рандомный номер
            int[] numbers = new int[length];
            int firstNumber = (int) (Math.random() * 100);
            numbers[0] = firstNumber;

            // находим число прогрессии (разность между одним элементом и предыдущим)
            int progressionNumber = (int) (Math.random() * 100);

            // находим номер отсутствующего элемента
            int minMissing = 0;
            int maxMissing = length - 1;
            int missingNumber = minMissing + (int) (Math.random() * (maxMissing - minMissing + 1));

            var question = new StringBuilder("Question: ");
            int result = 0;

            if (missingNumber == 0) {
                result = numbers[0];
                question.append(" .. ");
            }

            for (var j = 1; j < length; j++) {
                numbers[j] = numbers[j - 1] + progressionNumber;

                if (j == missingNumber) {
                    result = numbers[j];
                    question.append(" .. ");
                } else {
                    question.append(" " + numbers[j] + " ");
                }
            }

            results[i] = String.valueOf(result);
            questions[i] = question.toString();
        }

        Engine.getEngine(greeting, questions, results);
    }
}
