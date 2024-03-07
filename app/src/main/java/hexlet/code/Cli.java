package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetings() {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name? ");

        Scanner name = new Scanner(System.in);
        var userName = name.next();

        System.out.println("Hello, " + userName + "!");
    }
}
