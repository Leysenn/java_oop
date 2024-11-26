package JavaBasic.controlflow;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("=======New System=====");
        System.out.println("[+] Insert number :");
        int number = new Scanner(System.in).nextInt();
        if(number%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
    }
}
