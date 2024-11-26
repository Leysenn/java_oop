package JavaBasic.switchcase;

import java.util.Scanner;

public class ExampleSwitch_case {
    public static void main(String[] args) {


                System.out.println("""
                1. Start
                2. Stop 
                3. Exit""");
                System.out.println("-".repeat(20));
                System.out.print("[+] Insert option: ");
                int opt = new Scanner(System.in).nextInt();
                if(opt<0){
                    System.out.println("[!] Invalid option 😭");
                }else {
                    switch (opt) {
                        case 1 -> System.out.println("Input Email :");
                        case 2 -> System.out.println("This is option 2");
                        case 3 -> System.out.println("This is option 3");
                        default -> System.out.println("No option :(");
                    }
                }
    }
}
