package games;

import hexlet.code.Engine;

public class Even {
    public static String getEven() {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 1; i <= 3; i++) {

            var random = (int) (Math.random() * 100);
            int even = random % 2;

            var result ="";
            if (even == 0) {
                result = "yes";
            } else {
                result = "no";
            }

            System.out.println("Question: " + random);

            var output = Engine.getEngine(result);

            if (!output) {
                return "Let's try again, ";
            }
        }
        return "Congratulations, ";
    }
}
