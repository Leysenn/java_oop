package JavaBasic.loop;

import java.util.Scanner;

public class PracticeLoop {
    public static void main(String[] args) {


        String validEmail = "sen@gmail.com";
        String validPassword = "pass1234";

//        // Input email and password
//        System.out.print("Enter email: ");
//        String email = new Scanner(System.in).nextLine();
//        System.out.print("Enter password: ");
//        String password = new Scanner(System.in).nextLine();

        System.out.println("""
                        
                1. Input Email : 
                2. Input Password :
                3. Update user
                4. Delete user 
                5. Exit
                        """);
        System.out.println("=".repeat(20));
        System.out.print("{+] Insert option  :");
        int opt = new Scanner(System.in).nextInt();
        while (true) {
            if (opt < 0) {
                System.out.println("[!] Invalid option");
                System.out.print("[+] Insert option:");
                opt = new Scanner(System.in).nextInt();
                System.out.print("Enter email: ");
                String email = new Scanner(System.in).nextLine();
                System.out.print("Enter password: ");
                String password = new Scanner(System.in).nextLine();
                if (email.equals(validEmail) && password.length() == 8) {
                    // Check if email and password match valid credentials
                    if (email.equals(validEmail) && password.equals(validPassword)) {
                        System.out.println("Login success");
                    } else {
                        System.out.println("Invalid email or password !");
                    }
                } else {
                    System.out.println("email or password is error please try again");
                    break;
                }
            }
        }
    }
}