package games;

import hexlet.code.Engine;

public class Progression {
    public static void getProgression() {

        var greeting = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[3];
        String[] results = new String[3];

        for (var i = 0; i < 3; i++) {

            // находим длину прогресии и создаем массив для прогрессии
            int minLength = 6;
            int maxLength = 10;
            int length = (int) (Math.random() * (maxLength - minLength) + minLength);

            int[] numbers = new int[length];

            // присваиваем массиву первый рандомный номер от 1 до 100
            int minFirst = 1;
            int maxFirst = 100;
            int firstNumber = (int) (Math.random() * (maxFirst - minFirst) + minFirst);
            numbers[0] = firstNumber;

            // находим число прогрессии (разность между одним элементом и предыдущим)
            int minProgression = 1;
            int maxProgression = 20;
            int progressionNumber = (int) (Math.random() * (maxProgression - minProgression ) + minProgression);

            // находим номер отсутствующего элемента
            int maxMissing = length - 1;
            int missingNumber = (int) (Math.random() * maxMissing);

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