package JavaBasic.loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        while (true){
            String email;
            String  pass;
            while (true){
                System.out.print("[+] Insert email :");
                email = new Scanner(System.in).nextLine();
                if(!email.contains("@gmail")){
                    System.out.println("[!] Invalid email ");
                }else {
                    System.out.println("[+] Insert password :");
                    pass = new Scanner(System.in).nextLine();
                    if(pass.length()<8){
                        System.out.println("[!] Not a strong password");
                    }else {
                        break;
                    }
                }
            }
            while (true){
                System.out.println("=".repeat(30));
                System.out.println("[+] Login:");
                System.out.print("[+] Insert email :");
                String loginEmail= new Scanner(System.in).nextLine();
                System.out.print("[+] Insert password: ");
                String loingPass = new Scanner(System.in).nextLine();
                if (loginEmail.equalsIgnoreCase(email) && loingPass.equals(pass)){
                    System.out.println("[+] Login successfully");
                    break;
                }else {
                    System.out.println("[!] Login Failed");
                }

            }
        }
    }
}
