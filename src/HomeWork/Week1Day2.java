package HomeWork;


import java.util.Scanner;



public class Week1Day2 {
    public static void main(String[] args) {

        System.out.println("============Register===========");

        System.out.print("Enter your email: ");
        String email = new Scanner(System.in).nextLine();


        System.out.print("Enter your password : ");
        String password = new Scanner(System.in).nextLine();


            if (email.equalsIgnoreCase("sen@gmail.com") && (password.length() == 8)) {
                System.out.println("Y======= Login =======");
                System.out.print("[+] Insert your email :");
                String idEmail = new Scanner(System.in).next();
                if (idEmail.startsWith("sen@gmail.com")) {
                    System.out.println(" login success");
                } else {
                    System.out.println("Email and Password Error! Please try again.");
                }


            } else if (password.length() == 8 || (email.equalsIgnoreCase("sen@gmail.com"))) {
                System.out.println("Y======= Login =======");
                System.out.print("[+] Insert your email :");
                String idPassword = new Scanner(System.in).next();
                if (idPassword.startsWith("pass1234")) {
                    System.out.println(" login success");
                } else {
                    System.out.println("Email and Password Error! Please try again.");
                }

            }
        }
    }

