package JavaBasic.controlflow;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class IfElseStetement {
    public static void main(String[] args) {
        String validEmail = "Dara";
        String validPassword= "pass1234";
        System.out.println("========== Register ===========");
        System.out.print("[+] Input email   :");
        String email = new Scanner(System.in).nextLine();
        System.out.print("[+] Input password   :");
        String password = new Scanner(System.in).nextLine();

//        if(email.equals(validEmail) || password.length() ==8){
//            System.out.println("Login success");
//        }else {
//            System.out.println("Login failed");
//        }


//        System.out.println("====================  System Login =========");
//        System.out.print("[+] Input your email  :");
//        String email = new Scanner(System.in).nextLine();
//        System.out.print("[+] Input your password :");
//        if (email.equals(validEmail) && password.length() == 8) {
//
//            if (email.equals(validEmail) && password.equals(validPassword)) {
//                System.out.println("Login success");
//            } else {
//                System.out.println("Invalid email or password !");
//            }
//        } else {
//            System.out.println("email or password is error please try again");
//        }

    }

}
