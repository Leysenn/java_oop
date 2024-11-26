package JavaBasic;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("[+] Enter your name:");
        String name = new Scanner(System.in).nextLine();

        System.out.print("[+] Inset your age:");
        int age = new Scanner(System.in).nextInt();

        System.out.print("[+] Insert your Email:");
        String email = new Scanner(System.in).next();


        System.out.println("This is your name : "+ name);
        System.out.println("This is your age :" + age);
        System.out.println("This is Your Email:"+email);
    }

}
