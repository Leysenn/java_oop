package JavaBasic.controlflow;

import java.util.Scanner;

public class NestedStatement {
    public static void main(String[] args) {
        System.out.println("================ New System ========");
        System.out.println("[+ ] Insert your gender :");
        Character gender = new Scanner(System.in).next().charAt(0);

        if(gender.toString().equalsIgnoreCase("m")){
            System.out.println("You're male");
            System.out.println("[+] Insert your male ID card :");
            String idCard = new Scanner(System.in).next();
            if(idCard.startsWith("001")){
                System.out.println("Male login success");
            }
        } else if (gender.toString().equalsIgnoreCase("f")) {
            System.out.println("you're female");
            System.out.println("[+] Insert your female ID card :");
            String  idCard = new Scanner(System.in).next();
            if(idCard.startsWith("sen@gmail.com")){
                System.out.println("female login success");
            }

        }else {
            System.out.println("You're not human");
        }
    }
}
