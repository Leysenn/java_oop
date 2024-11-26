package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnException {
    public static void main(String[] args) {

            try {
                System.out.println("[+] Insert your name: ");
                String name = new Scanner(System.in).next();
                String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                for (String n : numbers) {
                    if (name.contains(n)) {
                        throw new Exception("[!] Name must be no number.");

                    }
                }
                System.out.println(name);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }

    }
}
