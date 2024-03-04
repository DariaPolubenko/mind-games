package games;

import hexlet.code.Engine;

public class Progression {
    public static void getProgression() {

        var greeting = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[3];
        String[] results = new String[3];

        for (var i = 0; i < 3; i++) {

            int length = 8;
            int[] numbers = new int[length];

            // присваиваем массиву первое рандомное число
            int firstNumber = (int) (Math.random() * 10);
            numbers[0] = firstNumber;

            // находим число прогрессии (разность между одним элементом и предыдущим)
            int minProgression = 1;
            int maxProgression = 20;
            int progressionNumber = (int) (Math.random() * (maxProgression - minProgression ) + minProgression);

            // находим номер отсутствующего элемента
            int maxMissing = length - 1;
            int missingNumber = (int) (Math.random() * maxMissing);

            var question = new StringBuilder("Question:");
            int result = 0;

            if (missingNumber == 0) {
                result = numbers[0];
                question.append(" ..");
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