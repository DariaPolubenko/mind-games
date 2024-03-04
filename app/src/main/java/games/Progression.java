package games;

import hexlet.code.Engine;

public class Progression {
    public static void getProgression() {

        var greeting = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[3];
        String[] results = new String[3];

        for (var i = 0; i < 3; i++) {

            // находим длину прогресии и создаем массив для прогрессии
            int minLength = 5;
            int maxLength = 10;
            int length = minLength + (int) (Math.random() * (maxLength - minLength + 1));

            int[] numbers = new int[length];

            // присваиваем массиву первый рандомный номер от 1 до 100
            int minFirst = 1;
            int maxFirst = 100;
            int firstNumber = minFirst + (int) (Math.random() * (maxFirst - minFirst + 1));
            numbers[0] = firstNumber;

            // находим число прогрессии (разность между одним элементом и предыдущим)
            int minProgression = 1;
            int maxProgression = 20;
            int progressionNumber = minProgression + (int) (Math.random() * (maxProgression - minProgression + 1));

            // находим номер отсутствующего элемента
            int minMissing = 0;
            int maxMissing = length - 1;
            int missingNumber = minMissing + (int) (Math.random() * (maxMissing - minMissing + 1));

            var question = new StringBuilder("Question: ");
            int result = 0;

            if (missingNumber == 0) {
                result = numbers[0];
                question.append("..");
            }

            for (var j = 1; j < length; j++) {
                numbers[j] = numbers[j - 1] + progressionNumber;

                if (j == missingNumber) {
                    result = numbers[j];
                    question.append("..");
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