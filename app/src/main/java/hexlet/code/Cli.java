package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner name = new Scanner(System.in);

        System.out.print("May I have your name? \n");
        String userName = name.next();

        return userName;
    }
}
